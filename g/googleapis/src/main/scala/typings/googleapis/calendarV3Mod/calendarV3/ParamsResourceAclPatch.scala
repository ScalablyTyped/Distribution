package typings.googleapis.calendarV3Mod.calendarV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAclPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Calendar identifier. To retrieve calendar IDs call the calendarList.list method. If you want to access the primary calendar of the currently logged in user, use the "primary" keyword.
    */
  var calendarId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAclRule] = js.undefined
  
  /**
    * ACL rule identifier.
    */
  var ruleId: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to send notifications about the calendar sharing change. Note that there are no notifications on access removal. Optional. The default is True.
    */
  var sendNotifications: js.UndefOr[Boolean] = js.undefined
}
object ParamsResourceAclPatch {
  
  inline def apply(): ParamsResourceAclPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAclPatch]
  }
  
  extension [Self <: ParamsResourceAclPatch](x: Self) {
    
    inline def setCalendarId(value: String): Self = StObject.set(x, "calendarId", value.asInstanceOf[js.Any])
    
    inline def setCalendarIdUndefined: Self = StObject.set(x, "calendarId", js.undefined)
    
    inline def setRequestBody(value: SchemaAclRule): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    inline def setRuleIdUndefined: Self = StObject.set(x, "ruleId", js.undefined)
    
    inline def setSendNotifications(value: Boolean): Self = StObject.set(x, "sendNotifications", value.asInstanceOf[js.Any])
    
    inline def setSendNotificationsUndefined: Self = StObject.set(x, "sendNotifications", js.undefined)
  }
}
