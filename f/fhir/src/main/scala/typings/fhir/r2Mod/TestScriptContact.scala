package typings.fhir.r2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestScriptContact
  extends StObject
     with BackboneElement {
  
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * The name of an individual to contact regarding the Test Script.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Contact details for individual (if a name was provided) or the publisher.
    */
  var telecom: js.UndefOr[js.Array[ContactPoint]] = js.undefined
}
object TestScriptContact {
  
  inline def apply(): TestScriptContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestScriptContact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestScriptContact] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTelecom(value: js.Array[ContactPoint]): Self = StObject.set(x, "telecom", value.asInstanceOf[js.Any])
    
    inline def setTelecomUndefined: Self = StObject.set(x, "telecom", js.undefined)
    
    inline def setTelecomVarargs(value: ContactPoint*): Self = StObject.set(x, "telecom", js.Array(value*))
    
    inline def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    inline def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
  }
}
