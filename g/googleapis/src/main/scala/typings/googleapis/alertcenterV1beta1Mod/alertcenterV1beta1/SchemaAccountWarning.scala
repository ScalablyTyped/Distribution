package typings.googleapis.alertcenterV1beta1Mod.alertcenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountWarning extends StObject {
  
  /**
    * Required. The email of the user that this event belongs to.
    */
  var email: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Details of the login action associated with the warning event. This is only available for: * Suspicious login * Suspicious login (less secure app) * Suspicious programmatic login * User suspended (suspicious activity)
    */
  var loginDetails: js.UndefOr[SchemaLoginDetails] = js.undefined
}
object SchemaAccountWarning {
  
  inline def apply(): SchemaAccountWarning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountWarning]
  }
  
  extension [Self <: SchemaAccountWarning](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailNull: Self = StObject.set(x, "email", null)
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setLoginDetails(value: SchemaLoginDetails): Self = StObject.set(x, "loginDetails", value.asInstanceOf[js.Any])
    
    inline def setLoginDetailsUndefined: Self = StObject.set(x, "loginDetails", js.undefined)
  }
}
