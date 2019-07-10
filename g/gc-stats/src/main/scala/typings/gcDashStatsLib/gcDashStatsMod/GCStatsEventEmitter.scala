package typings
package gcDashStatsLib.gcDashStatsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GCStatsEventEmitter
  extends nodeLib.eventsMod.EventEmitter {
  @JSName("addListener")
  def addListener_stats(event: gcDashStatsLib.gcDashStatsLibStrings.stats, listener: GCStatsListener): this.type = js.native
  @JSName("on")
  def on_stats(event: gcDashStatsLib.gcDashStatsLibStrings.stats, listener: GCStatsListener): this.type = js.native
  @JSName("once")
  def once_stats(event: gcDashStatsLib.gcDashStatsLibStrings.stats, listener: GCStatsListener): this.type = js.native
}

