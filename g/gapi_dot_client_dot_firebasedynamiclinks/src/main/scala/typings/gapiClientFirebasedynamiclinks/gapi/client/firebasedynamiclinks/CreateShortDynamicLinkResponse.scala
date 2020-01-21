package typings.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateShortDynamicLinkResponse extends js.Object {
  /** Preivew link to show the link flow chart. */
  var previewLink: js.UndefOr[String] = js.undefined
  /** Short Dynamic Link value. e.g. https://abcd.app.goo.gl/wxyz */
  var shortLink: js.UndefOr[String] = js.undefined
  /** Information about potential warnings on link creation. */
  var warning: js.UndefOr[js.Array[DynamicLinkWarning]] = js.undefined
}

object CreateShortDynamicLinkResponse {
  @scala.inline
  def apply(previewLink: String = null, shortLink: String = null, warning: js.Array[DynamicLinkWarning] = null): CreateShortDynamicLinkResponse = {
    val __obj = js.Dynamic.literal()
    if (previewLink != null) __obj.updateDynamic("previewLink")(previewLink.asInstanceOf[js.Any])
    if (shortLink != null) __obj.updateDynamic("shortLink")(shortLink.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateShortDynamicLinkResponse]
  }
}

