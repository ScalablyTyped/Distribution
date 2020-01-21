package typings.gapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoContent extends js.Object {
  /** The URL to fetch a video ad. */
  var videoUrl: js.UndefOr[String] = js.undefined
}

object VideoContent {
  @scala.inline
  def apply(videoUrl: String = null): VideoContent = {
    val __obj = js.Dynamic.literal()
    if (videoUrl != null) __obj.updateDynamic("videoUrl")(videoUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoContent]
  }
}

