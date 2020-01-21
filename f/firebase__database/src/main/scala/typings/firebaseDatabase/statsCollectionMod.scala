package typings.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/stats/StatsCollection", JSImport.Namespace)
@js.native
object statsCollectionMod extends js.Object {
  @js.native
  class StatsCollection () extends js.Object {
    var counters_ : js.Any = js.native
    def get(): StringDictionary[Double] = js.native
    def incrementCounter(name: String): Unit = js.native
    def incrementCounter(name: String, amount: Double): Unit = js.native
  }
  
}

