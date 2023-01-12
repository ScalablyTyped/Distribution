package typings.fhir.r2Mod

import typings.fhir.fhirStrings.refer
import typings.fhir.fhirStrings.replace
import typings.fhir.fhirStrings.seealso
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatientLink
  extends StObject
     with BackboneElement {
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * The other patient resource that the link refers to.
    */
  var other: Reference
  
  /**
    * The type of link between this patient resource and another patient resource.
    */
  var `type`: replace | refer | seealso
}
object PatientLink {
  
  inline def apply(other: Reference, `type`: replace | refer | seealso): PatientLink = {
    val __obj = js.Dynamic.literal(other = other.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatientLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PatientLink] (val x: Self) extends AnyVal {
    
    inline def setOther(value: Reference): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setType(value: replace | refer | seealso): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
