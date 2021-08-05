package typings.firebaseAdmin.messagingMod.messaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidFcmOptions extends StObject {
  
  /**
    * The label associated with the message's analytics data.
    */
  var analyticsLabel: js.UndefOr[String] = js.undefined
}
object AndroidFcmOptions {
  
  inline def apply(): AndroidFcmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidFcmOptions]
  }
  
  extension [Self <: AndroidFcmOptions](x: Self) {
    
    inline def setAnalyticsLabel(value: String): Self = StObject.set(x, "analyticsLabel", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsLabelUndefined: Self = StObject.set(x, "analyticsLabel", js.undefined)
  }
}
