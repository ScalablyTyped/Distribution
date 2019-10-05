package typings.atFirebaseDatabase

import typings.atFirebaseDatabase.distSrcCoreViewChangeMod.Change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/view/ChildChangeAccumulator", JSImport.Namespace)
@js.native
object distSrcCoreViewChildChangeAccumulatorMod extends js.Object {
  @js.native
  class ChildChangeAccumulator () extends js.Object {
    val changeMap: js.Any = js.native
    def getChanges(): js.Array[Change] = js.native
    def trackChildChange(change: Change): Unit = js.native
  }
  
}

