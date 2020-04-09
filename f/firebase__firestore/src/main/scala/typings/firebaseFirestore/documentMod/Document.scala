package typings.firebaseFirestore.documentMod

import typings.firebaseFirestore.AnonMapValue
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.modelFieldValueMod.ObjectValue
import typings.firebaseFirestore.pathMod.FieldPath
import typings.firebaseFirestore.snapshotVersionMod.SnapshotVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/model/document", "Document")
@js.native
class Document protected () extends MaybeDocument {
  def this(key: DocumentKey, version: SnapshotVersion, objectValue: ObjectValue, options: DocumentOptions) = this()
  val hasCommittedMutations: Boolean = js.native
  val hasLocalMutations: Boolean = js.native
  val objectValue: js.Any = js.native
  def data(): ObjectValue = js.native
  def field(path: FieldPath): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Value */ js.Any) | Null = js.native
  def toProto(): AnonMapValue = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/lib/src/model/document", "Document")
@js.native
object Document extends js.Object {
  def compareByField(field: FieldPath, d1: Document, d2: Document): Double = js.native
}

