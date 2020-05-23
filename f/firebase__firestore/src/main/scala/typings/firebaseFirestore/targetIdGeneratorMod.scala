package typings.firebaseFirestore

import typings.firebaseFirestore.typesMod.TargetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/core/target_id_generator", JSImport.Namespace)
@js.native
object targetIdGeneratorMod extends js.Object {
  @js.native
  class TargetIdGenerator protected () extends js.Object {
    def this(lastId: Double) = this()
    var lastId: js.Any = js.native
    def next(): TargetId = js.native
  }
  
  /* static members */
  @js.native
  object TargetIdGenerator extends js.Object {
    def forSyncEngine(): TargetIdGenerator = js.native
    def forTargetCache(): TargetIdGenerator = js.native
  }
  
}

