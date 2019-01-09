package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDimension extends js.Object {
  /** Account ID. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Boolean indicating whether the custom dimension is active. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** Time the custom dimension was created. */
  var created: js.UndefOr[java.lang.String] = js.undefined
  /** Custom dimension ID. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Index of the custom dimension. */
  var index: js.UndefOr[scala.Double] = js.undefined
  /** Kind value for a custom dimension. Set to "analytics#customDimension". It is a read-only field. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the custom dimension. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Parent link for the custom dimension. Points to the property to which the custom dimension belongs. */
  var parentLink: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_Href] = js.undefined
  /** Scope of the custom dimension: HIT, SESSION, USER or PRODUCT. */
  var scope: js.UndefOr[java.lang.String] = js.undefined
  /** Link for the custom dimension */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** Time the custom dimension was last modified. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /** Property ID. */
  var webPropertyId: js.UndefOr[java.lang.String] = js.undefined
}

