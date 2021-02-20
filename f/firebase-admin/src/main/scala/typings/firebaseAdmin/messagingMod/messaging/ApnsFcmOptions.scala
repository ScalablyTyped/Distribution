package typings.firebaseAdmin.messagingMod.messaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApnsFcmOptions extends StObject {
  
  /**
    * The label associated with the message's analytics data.
    */
  var analyticsLabel: js.UndefOr[String] = js.native
  
  /**
    * URL of an image to be displayed in the notification.
    */
  var imageUrl: js.UndefOr[String] = js.native
}
object ApnsFcmOptions {
  
  @scala.inline
  def apply(): ApnsFcmOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApnsFcmOptions]
  }
  
  @scala.inline
  implicit class ApnsFcmOptionsMutableBuilder[Self <: ApnsFcmOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyticsLabel(value: String): Self = StObject.set(x, "analyticsLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyticsLabelUndefined: Self = StObject.set(x, "analyticsLabel", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
  }
}
