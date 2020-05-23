package typings.firebaseFirestore.viewMod

import typings.firebaseFirestore.documentKeyMod.DocumentKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/core/view", "AddedLimboDocument")
@js.native
class AddedLimboDocument protected () extends LimboDocumentChange {
  def this(key: DocumentKey) = this()
  var key: DocumentKey = js.native
}

