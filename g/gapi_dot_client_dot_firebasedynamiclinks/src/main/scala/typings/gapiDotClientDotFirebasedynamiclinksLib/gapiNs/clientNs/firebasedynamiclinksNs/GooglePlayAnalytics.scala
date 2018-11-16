package typings
package gapiDotClientDotFirebasedynamiclinksLib.gapiNs.clientNs.firebasedynamiclinksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GooglePlayAnalytics extends js.Object {
  /**
               * [AdWords autotagging parameter](https://support.google.com/analytics/answer/1033981?hl=en);
               * used to measure Google AdWords ads. This value is generated dynamically
               * and should never be modified.
               */
  var gclid: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Campaign name; used for keyword analysis to identify a specific product
               * promotion or strategic campaign.
               */
  var utmCampaign: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Campaign content; used for A/B testing and content-targeted ads to
               * differentiate ads or links that point to the same URL.
               */
  var utmContent: js.UndefOr[java.lang.String] = js.undefined
  /** Campaign medium; used to identify a medium such as email or cost-per-click. */
  var utmMedium: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Campaign source; used to identify a search engine, newsletter, or other
               * source.
               */
  var utmSource: js.UndefOr[java.lang.String] = js.undefined
  /** Campaign term; used with paid search to supply the keywords for ads. */
  var utmTerm: js.UndefOr[java.lang.String] = js.undefined
}

