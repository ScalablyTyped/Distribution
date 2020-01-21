package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClickThroughUrl extends js.Object {
  /**
    * Read-only convenience field representing the actual URL that will be used for this click-through. The URL is computed as follows:
    * - If defaultLandingPage is enabled then the campaign's default landing page URL is assigned to this field.
    * - If defaultLandingPage is not enabled and a landingPageId is specified then that landing page's URL is assigned to this field.
    * - If neither of the above cases apply, then the customClickThroughUrl is assigned to this field.
    */
  var computedClickThroughUrl: js.UndefOr[String] = js.undefined
  /** Custom click-through URL. Applicable if the defaultLandingPage field is set to false and the landingPageId field is left unset. */
  var customClickThroughUrl: js.UndefOr[String] = js.undefined
  /** Whether the campaign default landing page is used. */
  var defaultLandingPage: js.UndefOr[Boolean] = js.undefined
  /** ID of the landing page for the click-through URL. Applicable if the defaultLandingPage field is set to false. */
  var landingPageId: js.UndefOr[String] = js.undefined
}

object ClickThroughUrl {
  @scala.inline
  def apply(
    computedClickThroughUrl: String = null,
    customClickThroughUrl: String = null,
    defaultLandingPage: js.UndefOr[Boolean] = js.undefined,
    landingPageId: String = null
  ): ClickThroughUrl = {
    val __obj = js.Dynamic.literal()
    if (computedClickThroughUrl != null) __obj.updateDynamic("computedClickThroughUrl")(computedClickThroughUrl.asInstanceOf[js.Any])
    if (customClickThroughUrl != null) __obj.updateDynamic("customClickThroughUrl")(customClickThroughUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultLandingPage)) __obj.updateDynamic("defaultLandingPage")(defaultLandingPage.asInstanceOf[js.Any])
    if (landingPageId != null) __obj.updateDynamic("landingPageId")(landingPageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClickThroughUrl]
  }
}

