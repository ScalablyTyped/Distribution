package typings
package atFirebaseDatabaseLib.distSrcCoreViewChildChangeAccumulatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/database/dist/src/core/view/ChildChangeAccumulator", "ChildChangeAccumulator")
@js.native
class ChildChangeAccumulator () extends js.Object {
  var `changeMap_`: js.Any = js.native
  /**
       * @return {!Array.<!Change>}
       */
  def getChanges(): js.Array[atFirebaseDatabaseLib.distSrcCoreViewChangeMod.Change] = js.native
  /**
       * @param {!Change} change
       */
  def trackChildChange(change: atFirebaseDatabaseLib.distSrcCoreViewChangeMod.Change): scala.Unit = js.native
}

