package typings.gapiDotClientDotFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocialMetaTagInfo extends js.Object {
  /** A short description of the link. Optional. */
  var socialDescription: js.UndefOr[String] = js.undefined
  /** An image url string. Optional. */
  var socialImageLink: js.UndefOr[String] = js.undefined
  /** Title to be displayed. Optional. */
  var socialTitle: js.UndefOr[String] = js.undefined
}

object SocialMetaTagInfo {
  @scala.inline
  def apply(socialDescription: String = null, socialImageLink: String = null, socialTitle: String = null): SocialMetaTagInfo = {
    val __obj = js.Dynamic.literal()
    if (socialDescription != null) __obj.updateDynamic("socialDescription")(socialDescription.asInstanceOf[js.Any])
    if (socialImageLink != null) __obj.updateDynamic("socialImageLink")(socialImageLink.asInstanceOf[js.Any])
    if (socialTitle != null) __obj.updateDynamic("socialTitle")(socialTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocialMetaTagInfo]
  }
}

