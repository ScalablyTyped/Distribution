package typings.firebaseFirestore.specBuilderMod

import typings.firebaseFirestore.objMapMod.ObjectMap
import typings.firebaseFirestore.targetIdGeneratorMod.TargetIdGenerator
import typings.firebaseFirestore.targetMod.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/test/unit/specs/spec_builder", "ClientMemoryState")
@js.native
class ClientMemoryState () extends js.Object {
  var activeTargets: ActiveTargetMap = js.native
  var limboIdGenerator: TargetIdGenerator = js.native
  var limboMapping: LimboMap = js.native
  var queryMapping: ObjectMap[Target, Double] = js.native
  /** Reset all internal memory state (as done during a client restart). */
  def reset(): Unit = js.native
  /**
    * Reset the internal limbo mapping (as done during a primary lease failover).
    */
  def resetLimboMapping(): Unit = js.native
}

