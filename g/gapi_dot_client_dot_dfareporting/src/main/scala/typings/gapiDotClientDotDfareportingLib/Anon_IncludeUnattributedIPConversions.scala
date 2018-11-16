package typings
package gapiDotClientDotDfareportingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_IncludeUnattributedIPConversions extends js.Object {
  /** Include conversions that have no cookie, but do have an exposure path. */
  var includeAttributedIPConversions: js.UndefOr[scala.Boolean] = js.undefined
  /**
                       * Include conversions of users with a DoubleClick cookie but without an exposure. That means the user did not click or see an ad from the advertiser
                       * within the Floodlight group, or that the interaction happened outside the lookback window.
                       */
  var includeUnattributedCookieConversions: js.UndefOr[scala.Boolean] = js.undefined
  /**
                       * Include conversions that have no associated cookies and no exposures. It’s therefore impossible to know how the user was exposed to your ads during the
                       * lookback window prior to a conversion.
                       */
  var includeUnattributedIPConversions: js.UndefOr[scala.Boolean] = js.undefined
}

