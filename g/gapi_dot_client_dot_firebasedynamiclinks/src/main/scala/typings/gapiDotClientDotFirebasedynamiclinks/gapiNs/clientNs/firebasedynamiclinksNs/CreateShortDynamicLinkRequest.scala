package typings.gapiDotClientDotFirebasedynamiclinks.gapiNs.clientNs.firebasedynamiclinksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateShortDynamicLinkRequest extends js.Object {
  /**
    * Information about the Dynamic Link to be shortened.
    * [Learn more](https://firebase.google.com/docs/dynamic-links/android#create-a-dynamic-link-programmatically).
    */
  var dynamicLinkInfo: js.UndefOr[DynamicLinkInfo] = js.undefined
  /**
    * Full long Dynamic Link URL with desired query parameters specified.
    * For example,
    * "https://sample.app.goo.gl/?link=http://www.google.com&apn=com.sample",
    * [Learn more](https://firebase.google.com/docs/dynamic-links/android#create-a-dynamic-link-programmatically).
    */
  var longDynamicLink: js.UndefOr[String] = js.undefined
  /** Short Dynamic Link suffix. Optional. */
  var suffix: js.UndefOr[Suffix] = js.undefined
}

object CreateShortDynamicLinkRequest {
  @scala.inline
  def apply(dynamicLinkInfo: DynamicLinkInfo = null, longDynamicLink: String = null, suffix: Suffix = null): CreateShortDynamicLinkRequest = {
    val __obj = js.Dynamic.literal()
    if (dynamicLinkInfo != null) __obj.updateDynamic("dynamicLinkInfo")(dynamicLinkInfo)
    if (longDynamicLink != null) __obj.updateDynamic("longDynamicLink")(longDynamicLink)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[CreateShortDynamicLinkRequest]
  }
}

