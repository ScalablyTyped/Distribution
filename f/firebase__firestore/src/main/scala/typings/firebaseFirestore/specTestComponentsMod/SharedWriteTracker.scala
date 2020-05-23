package typings.firebaseFirestore.specTestComponentsMod

import typings.firebaseFirestore.mutationMod.Mutation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/test/unit/specs/spec_test_components", "SharedWriteTracker")
@js.native
class SharedWriteTracker () extends js.Object {
  var writes: js.Any = js.native
  def peek(): js.Array[Mutation] = js.native
  def push(write: js.Array[Mutation]): Unit = js.native
  def shift(): js.Array[Mutation] = js.native
}

