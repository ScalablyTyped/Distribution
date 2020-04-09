package typings.firebaseFirestore.specsSpecBuilderMod

import typings.firebaseFirestore.coreTargetIdGeneratorMod.TargetIdGenerator
import typings.firebaseFirestore.coreTargetMod.Target
import typings.firebaseFirestore.utilObjMapMod.ObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/test/unit/specs/spec_builder", "ClientMemoryState")
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

