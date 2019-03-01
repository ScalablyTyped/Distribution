package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

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
  var computedClickThroughUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Custom click-through URL. Applicable if the defaultLandingPage field is set to false and the landingPageId field is left unset. */
  var customClickThroughUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the campaign default landing page is used. */
  var defaultLandingPage: js.UndefOr[scala.Boolean] = js.undefined
  /** ID of the landing page for the click-through URL. Applicable if the defaultLandingPage field is set to false. */
  var landingPageId: js.UndefOr[java.lang.String] = js.undefined
}

object ClickThroughUrl {
  @scala.inline
  def apply(
    computedClickThroughUrl: java.lang.String = null,
    customClickThroughUrl: java.lang.String = null,
    defaultLandingPage: js.UndefOr[scala.Boolean] = js.undefined,
    landingPageId: java.lang.String = null
  ): ClickThroughUrl = {
    val __obj = js.Dynamic.literal()
    if (computedClickThroughUrl != null) __obj.updateDynamic("computedClickThroughUrl")(computedClickThroughUrl)
    if (customClickThroughUrl != null) __obj.updateDynamic("customClickThroughUrl")(customClickThroughUrl)
    if (!js.isUndefined(defaultLandingPage)) __obj.updateDynamic("defaultLandingPage")(defaultLandingPage)
    if (landingPageId != null) __obj.updateDynamic("landingPageId")(landingPageId)
    __obj.asInstanceOf[ClickThroughUrl]
  }
}

