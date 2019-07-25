package typings
package atFirebaseDatabaseLib.distSrcCoreViewChildChangeAccumulatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/view/ChildChangeAccumulator", "ChildChangeAccumulator")
@js.native
class ChildChangeAccumulator () extends js.Object {
  val changeMap: js.Any = js.native
  def getChanges(): js.Array[atFirebaseDatabaseLib.distSrcCoreViewChangeMod.Change] = js.native
  def trackChildChange(change: atFirebaseDatabaseLib.distSrcCoreViewChangeMod.Change): scala.Unit = js.native
}

