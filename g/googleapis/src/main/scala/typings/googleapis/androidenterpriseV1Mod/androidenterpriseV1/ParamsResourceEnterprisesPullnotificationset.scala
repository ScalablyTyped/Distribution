package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEnterprisesPullnotificationset
  extends StObject
     with StandardParameters {
  
  /**
    * The request mode for pulling notifications. Specifying waitForNotifications will cause the request to block and wait until one or more notifications are present, or return an empty notification list if no notifications are present after some time. Speciying returnImmediately will cause the request to immediately return the pending notifications, or an empty list if no notifications are present. If omitted, defaults to waitForNotifications.
    */
  var requestMode: js.UndefOr[String] = js.undefined
}
object ParamsResourceEnterprisesPullnotificationset {
  
  inline def apply(): ParamsResourceEnterprisesPullnotificationset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesPullnotificationset]
  }
  
  extension [Self <: ParamsResourceEnterprisesPullnotificationset](x: Self) {
    
    inline def setRequestMode(value: String): Self = StObject.set(x, "requestMode", value.asInstanceOf[js.Any])
    
    inline def setRequestModeUndefined: Self = StObject.set(x, "requestMode", js.undefined)
  }
}
