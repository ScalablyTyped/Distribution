package typings.gapiDotClientDotAppsactivity.gapi.client.appsactivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Photo extends js.Object {
  /** The URL of the photo. */
  var url: js.UndefOr[String] = js.undefined
}

object Photo {
  @scala.inline
  def apply(url: String = null): Photo = {
    val __obj = js.Dynamic.literal()
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Photo]
  }
}

