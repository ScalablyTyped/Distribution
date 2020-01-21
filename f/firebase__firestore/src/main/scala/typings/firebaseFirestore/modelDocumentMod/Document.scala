package typings.firebaseFirestore.modelDocumentMod

import typings.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces.Value
import typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.modelPathMod.FieldPath
import typings.firebaseFirestore.srcModelFieldValueMod.FieldValue
import typings.firebaseFirestore.srcModelFieldValueMod.JsonObject
import typings.firebaseFirestore.srcModelFieldValueMod.ObjectValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/model/document", "Document")
@js.native
class Document protected () extends MaybeDocument {
  def this(key: DocumentKey, version: SnapshotVersion, options: DocumentOptions) = this()
  def this(key: DocumentKey, version: SnapshotVersion, options: DocumentOptions, objectValue: ObjectValue) = this()
  def this(
    key: DocumentKey,
    version: SnapshotVersion,
    options: DocumentOptions,
    objectValue: js.UndefOr[scala.Nothing],
    proto: typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces.Document
  ) = this()
  def this(
    key: DocumentKey,
    version: SnapshotVersion,
    options: DocumentOptions,
    objectValue: ObjectValue,
    proto: typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces.Document
  ) = this()
  def this(
    key: DocumentKey,
    version: SnapshotVersion,
    options: DocumentOptions,
    objectValue: js.UndefOr[scala.Nothing],
    proto: js.UndefOr[scala.Nothing],
    converter: js.Function1[/* value */ Value, FieldValue]
  ) = this()
  def this(
    key: DocumentKey,
    version: SnapshotVersion,
    options: DocumentOptions,
    objectValue: js.UndefOr[scala.Nothing],
    proto: typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces.Document,
    converter: js.Function1[/* value */ Value, FieldValue]
  ) = this()
  def this(
    key: DocumentKey,
    version: SnapshotVersion,
    options: DocumentOptions,
    objectValue: ObjectValue,
    proto: js.UndefOr[scala.Nothing],
    converter: js.Function1[/* value */ Value, FieldValue]
  ) = this()
  def this(
    key: DocumentKey,
    version: SnapshotVersion,
    options: DocumentOptions,
    objectValue: ObjectValue,
    proto: typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces.Document,
    converter: js.Function1[/* value */ Value, FieldValue]
  ) = this()
  val converter: js.UndefOr[js.Any] = js.native
  /**
    * A cache of canonicalized FieldPaths to FieldValues that have already been
    * deserialized in `getField()`.
    */
  var fieldValueCache: js.UndefOr[js.Any] = js.native
  /**
    * Returns the nested Protobuf value for 'path`. Can only be called if
    * `proto` was provided at construction time.
    */
  var getProtoField: js.Any = js.native
  val hasCommittedMutations: Boolean = js.native
  val hasLocalMutations: Boolean = js.native
  var objectValue: js.UndefOr[js.Any] = js.native
  val proto: js.UndefOr[
    typings.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces.Document
  ] = js.native
  def data(): ObjectValue = js.native
  def field(path: FieldPath): FieldValue | Null = js.native
  def value(): JsonObject[_] = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/src/model/document", "Document")
@js.native
object Document extends js.Object {
  def compareByField(field: FieldPath, d1: Document, d2: Document): Double = js.native
}

