package typings.firebaseFirestore.modelDocumentMod

import typings.firebaseFirestore.AnonMapValueMapValue
import typings.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.firestoreProtoApiMod.Value
import typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.modelPathMod.FieldPath
import typings.firebaseFirestore.srcModelFieldValueMod.ObjectValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/model/document", "Document")
@js.native
class Document protected () extends MaybeDocument {
  def this(key: DocumentKey, version: SnapshotVersion, objectValue: ObjectValue, options: DocumentOptions) = this()
  val hasCommittedMutations: Boolean = js.native
  val hasLocalMutations: Boolean = js.native
  val objectValue: js.Any = js.native
  def data(): ObjectValue = js.native
  def field(path: FieldPath): Value | Null = js.native
  def toProto(): AnonMapValueMapValue = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/src/model/document", "Document")
@js.native
object Document extends js.Object {
  def compareByField(field: FieldPath, d1: Document, d2: Document): Double = js.native
}

