package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactDetail
  extends StObject
     with Element {
  
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * If there is no named individual, the telecom information is for the organization as a whole.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The contact details for the individual (if a name was provided) or the organization.
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}
object ContactDetail {
  
  inline def apply(): ContactDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContactDetail] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTelecom(value: js.Array[ContactPoint]): Self = StObject.set(x, "telecom", value.asInstanceOf[js.Any])
    
    inline def setTelecomUndefined: Self = StObject.set(x, "telecom", js.undefined)
    
    inline def setTelecomVarargs(value: ContactPoint*): Self = StObject.set(x, "telecom", js.Array(value*))
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
