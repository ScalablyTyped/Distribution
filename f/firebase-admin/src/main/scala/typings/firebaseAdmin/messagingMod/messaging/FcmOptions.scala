package typings.firebaseAdmin.messagingMod.messaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FcmOptions extends StObject {
  
  /**
    * The label associated with the message's analytics data.
    */
  var analyticsLabel: js.UndefOr[String] = js.undefined
}
object FcmOptions {
  
  @scala.inline
  def apply(): FcmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FcmOptions]
  }
  
  @scala.inline
  implicit class FcmOptionsMutableBuilder[Self <: FcmOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyticsLabel(value: String): Self = StObject.set(x, "analyticsLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyticsLabelUndefined: Self = StObject.set(x, "analyticsLabel", js.undefined)
  }
}
