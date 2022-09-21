package typings.fhir.r3Mod

import typings.fhir.fhirStrings.author
import typings.fhir.fhirStrings.editor
import typings.fhir.fhirStrings.endorser
import typings.fhir.fhirStrings.reviewer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Contributor
  extends StObject
     with Element {
  
  var _name: js.UndefOr[Element] = js.undefined
  
  var _type: js.UndefOr[Element] = js.undefined
  
  /**
    * Contact details to assist a user in finding and communicating with the contributor.
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * The name of the individual or organization responsible for the contribution.
    */
  var name: String
  
  /**
    * The type of contributor.
    */
  var `type`: author | editor | reviewer | endorser
}
object Contributor {
  
  inline def apply(name: String, `type`: author | editor | reviewer | endorser): Contributor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contributor]
  }
  
  extension [Self <: Contributor](x: Self) {
    
    inline def setContact(value: js.Array[ContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    inline def setContactVarargs(value: ContactDetail*): Self = StObject.set(x, "contact", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: author | editor | reviewer | endorser): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    inline def set_type(value: Element): Self = StObject.set(x, "_type", value.asInstanceOf[js.Any])
    
    inline def set_typeUndefined: Self = StObject.set(x, "_type", js.undefined)
  }
}
