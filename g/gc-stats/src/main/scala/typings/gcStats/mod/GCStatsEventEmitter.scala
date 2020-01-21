package typings.gcStats.mod

import typings.gcStats.gcStatsStrings.stats
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GCStatsEventEmitter extends EventEmitter {
  @JSName("addListener")
  def addListener_stats(event: stats, listener: GCStatsListener): this.type = js.native
  @JSName("on")
  def on_stats(event: stats, listener: GCStatsListener): this.type = js.native
  @JSName("once")
  def once_stats(event: stats, listener: GCStatsListener): this.type = js.native
}

