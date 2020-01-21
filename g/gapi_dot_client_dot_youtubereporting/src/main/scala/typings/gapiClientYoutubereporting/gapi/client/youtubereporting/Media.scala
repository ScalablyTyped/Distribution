package typings.gapiClientYoutubereporting.gapi.client.youtubereporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Media extends js.Object {
  /** Name of the media resource. */
  var resourceName: js.UndefOr[String] = js.undefined
}

object Media {
  @scala.inline
  def apply(resourceName: String = null): Media = {
    val __obj = js.Dynamic.literal()
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Media]
  }
}

