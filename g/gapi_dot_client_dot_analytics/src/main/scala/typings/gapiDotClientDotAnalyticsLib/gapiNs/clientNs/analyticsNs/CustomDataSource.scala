package typings
package gapiDotClientDotAnalyticsLib.gapiNs.clientNs.analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDataSource extends js.Object {
  /** Account ID to which this custom data source belongs. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var childLink: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_Href] = js.undefined
  /** Time this custom data source was created. */
  var created: js.UndefOr[java.lang.String] = js.undefined
  /** Description of custom data source. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Custom data source ID. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  var importBehavior: js.UndefOr[java.lang.String] = js.undefined
  /** Resource type for Analytics custom data source. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this custom data source. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Parent link for this custom data source. Points to the web property to which this custom data source belongs. */
  var parentLink: js.UndefOr[gapiDotClientDotAnalyticsLib.Anon_Href] = js.undefined
  /** IDs of views (profiles) linked to the custom data source. */
  var profilesLinked: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Collection of schema headers of the custom data source. */
  var schema: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Link for this Analytics custom data source. */
  var selfLink: js.UndefOr[java.lang.String] = js.undefined
  /** Type of the custom data source. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Time this custom data source was last modified. */
  var updated: js.UndefOr[java.lang.String] = js.undefined
  /** Upload type of the custom data source. */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Web property ID of the form UA-XXXXX-YY to which this custom data source belongs. */
  var webPropertyId: js.UndefOr[java.lang.String] = js.undefined
}

