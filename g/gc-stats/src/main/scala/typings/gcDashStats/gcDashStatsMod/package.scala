package typings.gcDashStats

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gcDashStatsMod {
  type GCStatsListener = js.Function1[/* stats */ GCStatistics, Unit]
}
