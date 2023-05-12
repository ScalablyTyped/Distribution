package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceDefinitionConformsTo
  extends StObject
     with BackboneElement {
  
  var _version: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * Describes the type of the standard, specification, or formal guidance.
    */
  var category: js.UndefOr[CodeableConcept] = js.undefined
  
  /**
    * Standard, regulation, certification, or guidance website, document, or other publication, or similar, supporting the conformance.
    */
  var source: js.UndefOr[js.Array[RelatedArtifact]] = js.undefined
  
  /**
    * Code that identifies the specific standard, specification, protocol, formal guidance, regulation, legislation, or certification scheme to which the device adheres.
    */
  var specification: CodeableConcept
  
  /**
    * Identifies the specific form or variant of the standard, specification, or formal guidance. This may be a 'version number', release, document edition, publication year, or other label.
    */
  var version: js.UndefOr[js.Array[String]] = js.undefined
}
object DeviceDefinitionConformsTo {
  
  inline def apply(specification: CodeableConcept): DeviceDefinitionConformsTo = {
    val __obj = js.Dynamic.literal(specification = specification.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceDefinitionConformsTo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceDefinitionConformsTo] (val x: Self) extends AnyVal {
    
    inline def setCategory(value: CodeableConcept): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setSource(value: js.Array[RelatedArtifact]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSourceVarargs(value: RelatedArtifact*): Self = StObject.set(x, "source", js.Array(value*))
    
    inline def setSpecification(value: CodeableConcept): Self = StObject.set(x, "specification", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: js.Array[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersionVarargs(value: String*): Self = StObject.set(x, "version", js.Array(value*))
    
    inline def set_version(value: js.Array[Element]): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    inline def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
    
    inline def set_versionVarargs(value: Element*): Self = StObject.set(x, "_version", js.Array(value*))
  }
}
