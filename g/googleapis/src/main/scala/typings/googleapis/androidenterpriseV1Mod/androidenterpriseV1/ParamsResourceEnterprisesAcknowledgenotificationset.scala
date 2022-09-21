package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceEnterprisesAcknowledgenotificationset
  extends StObject
     with StandardParameters {
  
  /**
    * The notification set ID as returned by Enterprises.PullNotificationSet. This must be provided.
    */
  var notificationSetId: js.UndefOr[String] = js.undefined
}
object ParamsResourceEnterprisesAcknowledgenotificationset {
  
  inline def apply(): ParamsResourceEnterprisesAcknowledgenotificationset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceEnterprisesAcknowledgenotificationset]
  }
  
  extension [Self <: ParamsResourceEnterprisesAcknowledgenotificationset](x: Self) {
    
    inline def setNotificationSetId(value: String): Self = StObject.set(x, "notificationSetId", value.asInstanceOf[js.Any])
    
    inline def setNotificationSetIdUndefined: Self = StObject.set(x, "notificationSetId", js.undefined)
  }
}
