package typings.gapiClientDfareporting.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeAttributedIPConversions extends js.Object {
  /** Include conversions that have no cookie, but do have an exposure path. */
  var includeAttributedIPConversions: js.UndefOr[Boolean] = js.undefined
  /**
    * Include conversions of users with a DoubleClick cookie but without an exposure. That means the user did not click or see an ad from the advertiser
    * within the Floodlight group, or that the interaction happened outside the lookback window.
    */
  var includeUnattributedCookieConversions: js.UndefOr[Boolean] = js.undefined
  /**
    * Include conversions that have no associated cookies and no exposures. It’s therefore impossible to know how the user was exposed to your ads during the
    * lookback window prior to a conversion.
    */
  var includeUnattributedIPConversions: js.UndefOr[Boolean] = js.undefined
}

object IncludeAttributedIPConversions {
  @scala.inline
  def apply(
    includeAttributedIPConversions: js.UndefOr[Boolean] = js.undefined,
    includeUnattributedCookieConversions: js.UndefOr[Boolean] = js.undefined,
    includeUnattributedIPConversions: js.UndefOr[Boolean] = js.undefined
  ): IncludeAttributedIPConversions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeAttributedIPConversions)) __obj.updateDynamic("includeAttributedIPConversions")(includeAttributedIPConversions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeUnattributedCookieConversions)) __obj.updateDynamic("includeUnattributedCookieConversions")(includeUnattributedCookieConversions.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeUnattributedIPConversions)) __obj.updateDynamic("includeUnattributedIPConversions")(includeUnattributedIPConversions.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeAttributedIPConversions]
  }
}

