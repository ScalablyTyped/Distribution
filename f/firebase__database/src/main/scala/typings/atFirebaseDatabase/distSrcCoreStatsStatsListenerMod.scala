package typings.atFirebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typings.atFirebaseDatabase.distSrcCoreStatsStatsCollectionMod.StatsCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/stats/StatsListener", JSImport.Namespace)
@js.native
object distSrcCoreStatsStatsListenerMod extends js.Object {
  @js.native
  class StatsListener protected () extends js.Object {
    def this(collection_ : StatsCollection) = this()
    var collection_ : js.Any = js.native
    var last_ : js.Any = js.native
    def get(): StringDictionary[Double] = js.native
  }
  
}

