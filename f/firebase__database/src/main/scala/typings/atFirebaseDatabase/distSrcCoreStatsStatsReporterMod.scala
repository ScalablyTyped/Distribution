package typings.atFirebaseDatabase

import typings.atFirebaseDatabase.distSrcCoreServerActionsMod.ServerActions
import typings.atFirebaseDatabase.distSrcCoreStatsStatsCollectionMod.StatsCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/stats/StatsReporter", JSImport.Namespace)
@js.native
object distSrcCoreStatsStatsReporterMod extends js.Object {
  @js.native
  class StatsReporter protected () extends js.Object {
    /**
      * @param collection
      * @param server_
      */
    def this(collection: StatsCollection, server_ : ServerActions) = this()
    var reportStats_ : js.Any = js.native
    var server_ : js.Any = js.native
    var statsListener_ : js.Any = js.native
    var statsToReport_ : js.Any = js.native
    def includeStat(stat: String): Unit = js.native
  }
  
}

