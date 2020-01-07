package typings.googleapis.buildSrcApisIndexingV3Mod.indexing_v3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Summary of the most recent Indexing API notifications successfully
  * received, for a given URL.
  */
@js.native
trait Schema$UrlNotificationMetadata extends js.Object {
  /**
    * Latest notification received with type `URL_REMOVED`.
    */
  var latestRemove: js.UndefOr[Schema$UrlNotification] = js.native
  /**
    * Latest notification received with type `URL_UPDATED`.
    */
  var latestUpdate: js.UndefOr[Schema$UrlNotification] = js.native
  /**
    * URL to which this metadata refers.
    */
  var url: js.UndefOr[String] = js.native
}

object Schema$UrlNotificationMetadata {
  @scala.inline
  def apply(
    latestRemove: Schema$UrlNotification = null,
    latestUpdate: Schema$UrlNotification = null,
    url: String = null
  ): Schema$UrlNotificationMetadata = {
    val __obj = js.Dynamic.literal()
    if (latestRemove != null) __obj.updateDynamic("latestRemove")(latestRemove.asInstanceOf[js.Any])
    if (latestUpdate != null) __obj.updateDynamic("latestUpdate")(latestUpdate.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UrlNotificationMetadata]
  }
}

