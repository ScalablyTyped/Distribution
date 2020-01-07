package typings.googleapis.buildSrcApisIndexingV3Mod.indexing_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Output for PublishUrlNotification
  */
@js.native
trait Schema$PublishUrlNotificationResponse extends js.Object {
  /**
    * Description of the notification events received for this URL.
    */
  var urlNotificationMetadata: js.UndefOr[Schema$UrlNotificationMetadata] = js.native
}

object Schema$PublishUrlNotificationResponse {
  @scala.inline
  def apply(urlNotificationMetadata: Schema$UrlNotificationMetadata = null): Schema$PublishUrlNotificationResponse = {
    val __obj = js.Dynamic.literal()
    if (urlNotificationMetadata != null) __obj.updateDynamic("urlNotificationMetadata")(urlNotificationMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PublishUrlNotificationResponse]
  }
}

