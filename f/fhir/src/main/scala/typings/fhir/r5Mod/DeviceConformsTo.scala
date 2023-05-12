package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceConformsTo
  extends StObject
     with BackboneElement {
  
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * Describes the type of the standard, specification, or formal guidance.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Code that identifies the specific standard, specification, protocol, formal guidance, regulation, legislation, or certification scheme to which the device adheres.
    */
  var specification: CodeableConcept
  
  /**
    * Identifies the specific form or variant of the standard, specification, or formal guidance. This may be a 'version number', release, document edition, publication year, or other label.
    */
  var version: js.UndefOr[String] = js.undefined
}
object DeviceConformsTo {
  
  inline def apply(specification: CodeableConcept): DeviceConformsTo = {
    val __obj = js.Dynamic.literal(specification = specification.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceConformsTo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceConformsTo] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setSpecification(value: CodeableConcept): Self = StObject.set(x, "specification", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
