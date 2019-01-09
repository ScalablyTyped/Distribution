package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomMetric extends js.Object {
  /** Account ID. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Boolean indicating whether the custom metric is active. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** Time the custom metric was created. */
  var created: js.UndefOr[java.lang.String] = js.undefined
  /** Custom metric ID. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Index of the custom metric. */
  var index: js.UndefOr[scala.Double] = js.undefined
  /** Kind value for a custom metric. Set to "analytics#customMetric". It is a read-only field. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Max value of custom metric. */
  var max_value: js.UndefOr[java.lang.String] = js.undefined
  /** Min value of custom metric. */
  var min_value: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the custom metric. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Parent link for the custom metric. Points to the property to which the custom metric belongs. */
  var parentLink: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_Href] = js.undefined
  /** Scope of the custom metric: HIT or PRODUCT. */
  var scope: js.UndefOr[java.lang.String] = js.undefined
  /** Link for the custom metric */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** Data type of custom metric. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Time the custom metric was last modified. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /** Property ID. */
  var webPropertyId: js.UndefOr[java.lang.String] = js.undefined
}

