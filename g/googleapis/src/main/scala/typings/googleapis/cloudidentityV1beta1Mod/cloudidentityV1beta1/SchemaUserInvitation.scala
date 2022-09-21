package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserInvitation extends StObject {
  
  /**
    * Number of invitation emails sent to the user.
    */
  var mailsSentCount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Shall be of the form `customers/{customer\}/userinvitations/{user_email_address\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * State of the `UserInvitation`.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time when the `UserInvitation` was last updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaUserInvitation {
  
  inline def apply(): SchemaUserInvitation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserInvitation]
  }
  
  extension [Self <: SchemaUserInvitation](x: Self) {
    
    inline def setMailsSentCount(value: String): Self = StObject.set(x, "mailsSentCount", value.asInstanceOf[js.Any])
    
    inline def setMailsSentCountNull: Self = StObject.set(x, "mailsSentCount", null)
    
    inline def setMailsSentCountUndefined: Self = StObject.set(x, "mailsSentCount", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
