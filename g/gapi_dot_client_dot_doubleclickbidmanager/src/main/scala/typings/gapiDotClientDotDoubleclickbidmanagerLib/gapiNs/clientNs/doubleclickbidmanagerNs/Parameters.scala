package typings
package gapiDotClientDotDoubleclickbidmanagerLib.gapiNs.clientNs.doubleclickbidmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameters extends js.Object {
  /** Filters used to match traffic data in your report. */
  var filters: js.UndefOr[js.Array[FilterPair]] = js.undefined
  /** Data is grouped by the filters listed in this field. */
  var groupBys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Whether to include data from Invite Media. */
  var includeInviteData: js.UndefOr[scala.Boolean] = js.undefined
  /** Metrics to include as columns in your report. */
  var metrics: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Report type. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

