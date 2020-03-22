package typings.firebaseFirestore.remoteSerializerMod

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseFirestore.apiBlobMod.Blob
import typings.firebaseFirestore.coreDatabaseInfoMod.DatabaseId
import typings.firebaseFirestore.coreQueryMod.Direction
import typings.firebaseFirestore.coreQueryMod.FieldFilter
import typings.firebaseFirestore.coreQueryMod.Operator
import typings.firebaseFirestore.coreQueryMod.OrderBy
import typings.firebaseFirestore.coreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.coreTargetMod.Target
import typings.firebaseFirestore.firestoreProtoApiMod.ApiClientObjectMap
import typings.firebaseFirestore.firestoreProtoApiMod.BatchGetDocumentsResponse
import typings.firebaseFirestore.firestoreProtoApiMod.Document
import typings.firebaseFirestore.firestoreProtoApiMod.DocumentMask
import typings.firebaseFirestore.firestoreProtoApiMod.DocumentsTarget
import typings.firebaseFirestore.firestoreProtoApiMod.FieldFilterOp
import typings.firebaseFirestore.firestoreProtoApiMod.FieldReference
import typings.firebaseFirestore.firestoreProtoApiMod.Filter
import typings.firebaseFirestore.firestoreProtoApiMod.ListenResponse
import typings.firebaseFirestore.firestoreProtoApiMod.MapValue
import typings.firebaseFirestore.firestoreProtoApiMod.Order
import typings.firebaseFirestore.firestoreProtoApiMod.OrderDirection
import typings.firebaseFirestore.firestoreProtoApiMod.QueryTarget
import typings.firebaseFirestore.firestoreProtoApiMod.Status
import typings.firebaseFirestore.firestoreProtoApiMod.TargetChangeTargetChangeType
import typings.firebaseFirestore.firestoreProtoApiMod.Value
import typings.firebaseFirestore.firestoreProtoApiMod.Write
import typings.firebaseFirestore.firestoreProtoApiMod.WriteResult
import typings.firebaseFirestore.localTargetDataMod.TargetData
import typings.firebaseFirestore.modelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.modelDocumentMod.MaybeDocument
import typings.firebaseFirestore.modelMutationMod.FieldMask
import typings.firebaseFirestore.modelMutationMod.Mutation
import typings.firebaseFirestore.modelMutationMod.MutationResult
import typings.firebaseFirestore.modelPathMod.FieldPath
import typings.firebaseFirestore.modelPathMod.ResourcePath
import typings.firebaseFirestore.remoteWatchChangeMod.WatchChange
import typings.firebaseFirestore.remoteWatchChangeMod.WatchTargetChangeState
import typings.firebaseFirestore.srcModelFieldValueMod.ArrayValue
import typings.firebaseFirestore.srcModelFieldValueMod.FieldValue
import typings.firebaseFirestore.srcModelFieldValueMod.ObjectValue
import typings.firebaseFirestore.utilByteStringMod.ByteString
import typings.firebaseFirestore.utilErrorMod.FirestoreError
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/remote/serializer", "JsonProtoSerializer")
@js.native
class JsonProtoSerializer protected () extends js.Object {
  def this(databaseId: DatabaseId, options: SerializerOptions) = this()
  var databaseId: js.Any = js.native
  var extractLocalPathFromResourceName: js.Any = js.native
  /**
    * Parse the blob from the protos into the internal Blob class. Note that the
    * typings assume all blobs are strings, but they are actually Uint8Arrays
    * on Node.
    */
  var fromBlob: js.Any = js.native
  var fromCursor: js.Any = js.native
  var fromFieldTransform: js.Any = js.native
  var fromFilter: js.Any = js.native
  var fromFound: js.Any = js.native
  /**
    * Returns a number (or null) from a google.protobuf.Int32Value proto.
    * DO NOT USE THIS FOR ANYTHING ELSE.
    * This method cheats. It's typed as accepting "number" because that's what
    * our generated proto interfaces say Int32Value must be, but it actually
    * accepts { value: number } to match our serialization in toInt32Value().
    */
  var fromInt32Value: js.Any = js.native
  var fromIso8601String: js.Any = js.native
  var fromMissing: js.Any = js.native
  var fromOrder: js.Any = js.native
  var fromPrecondition: js.Any = js.native
  var fromTimestamp: js.Any = js.native
  var fromWriteResult: js.Any = js.native
  var fullyQualifiedPrefixPath: js.Any = js.native
  var isValidResourceName: js.Any = js.native
  var options: js.Any = js.native
  var toCursor: js.Any = js.native
  var toFieldTransform: js.Any = js.native
  var toFilter: js.Any = js.native
  /**
    * Returns a value for a number (or null) that's appropriate to put into
    * a google.protobuf.Int32Value proto.
    * DO NOT USE THIS FOR ANYTHING ELSE.
    * This method cheats. It's typed as returning "number" because that's what
    * our generated proto interfaces say Int32Value must be. But GRPC actually
    * expects a { value: <number> } struct.
    */
  var toInt32Value: js.Any = js.native
  var toLabel: js.Any = js.native
  var toOrder: js.Any = js.native
  var toPrecondition: js.Any = js.native
  /**
    * Returns a value for a Date that's appropriate to put into a proto.
    * DO NOT USE THIS FOR ANYTHING ELSE.
    * This method cheats. It's typed as returning "string" because that's what
    * our generated proto interfaces say dates must be. But it's easier and safer
    * to actually return a Timestamp proto.
    */
  var toTimestamp: js.Any = js.native
  var toWatchTargetChangeState: js.Any = js.native
  def encodedDatabaseId(): String = js.native
  def fromBytes(): ByteString = js.native
  /**
    * Returns a ByteString based on the proto string value.
    */
  def fromBytes(value: String): ByteString = js.native
  def fromBytes(value: Uint8Array): ByteString = js.native
  def fromDirection(): js.UndefOr[Direction] = js.native
  def fromDirection(dir: OrderDirection): js.UndefOr[Direction] = js.native
  def fromDocument(document: Document): typings.firebaseFirestore.modelDocumentMod.Document = js.native
  def fromDocument(document: Document, hasCommittedMutations: Boolean): typings.firebaseFirestore.modelDocumentMod.Document = js.native
  def fromDocumentMask(proto: DocumentMask): FieldMask = js.native
  def fromDocumentsTarget(documentsTarget: DocumentsTarget): Target = js.native
  def fromFieldFilter(filter: Filter): typings.firebaseFirestore.coreQueryMod.Filter = js.native
  def fromFieldPathReference(fieldReference: FieldReference): FieldPath = js.native
  def fromFields(`object`: js.Object): ObjectValue = js.native
  def fromMaybeDocument(result: BatchGetDocumentsResponse): MaybeDocument = js.native
  def fromMutation(proto: Write): Mutation = js.native
  def fromName(name: String): DocumentKey = js.native
  def fromOperatorName(op: FieldFilterOp): Operator = js.native
  def fromPropertyOrder(orderBy: Order): OrderBy = js.native
  def fromQueryPath(name: String): ResourcePath = js.native
  def fromQueryTarget(target: QueryTarget): Target = js.native
  def fromResourceName(name: String): ResourcePath = js.native
  def fromRpcStatus(status: Status): FirestoreError = js.native
  def fromUnaryFilter(filter: Filter): typings.firebaseFirestore.coreQueryMod.Filter = js.native
  def fromValue(obj: Value): FieldValue = js.native
  def fromVersion(version: String): SnapshotVersion = js.native
  def fromWatchChange(change: ListenResponse): WatchChange = js.native
  def fromWatchTargetChangeState(state: TargetChangeTargetChangeType): WatchTargetChangeState = js.native
  def fromWriteResults(): js.Array[MutationResult] = js.native
  def fromWriteResults(protos: js.UndefOr[scala.Nothing], commitTime: String): js.Array[MutationResult] = js.native
  def fromWriteResults(protos: js.Array[WriteResult]): js.Array[MutationResult] = js.native
  def fromWriteResults(protos: js.Array[WriteResult], commitTime: String): js.Array[MutationResult] = js.native
  def toArrayValue(array: ArrayValue): typings.firebaseFirestore.firestoreProtoApiMod.ArrayValue = js.native
  /**
    * Returns a value for bytes that's appropriate to put in a proto.
    * DO NOT USE THIS FOR ANYTHING ELSE.
    * This method cheats. It's typed as returning "string" because that's what
    * our generated proto interfaces say bytes must be. But it should return
    * an Uint8Array in Node.
    *
    * Visible for testing.
    */
  def toBytes(bytes: Blob): String = js.native
  def toBytes(bytes: ByteString): String = js.native
  def toDirection(dir: Direction): OrderDirection = js.native
  def toDocument(document: typings.firebaseFirestore.modelDocumentMod.Document): Document = js.native
  def toDocumentMask(fieldMask: FieldMask): DocumentMask = js.native
  def toDocumentsTarget(target: Target): DocumentsTarget = js.native
  def toFieldPathReference(path: FieldPath): FieldReference = js.native
  def toFields(fields: ObjectValue): StringDictionary[Value] = js.native
  def toListenRequestLabels(targetData: TargetData): ApiClientObjectMap[String] | Null = js.native
  def toMapValue(map: ObjectValue): MapValue = js.native
  def toMutation(mutation: Mutation): Write = js.native
  /** Creates an api.Document from key and fields (but no create/update time) */
  def toMutationDocument(key: DocumentKey, fields: ObjectValue): Document = js.native
  def toName(key: DocumentKey): String = js.native
  def toOperatorName(op: Operator): FieldFilterOp = js.native
  def toPropertyOrder(orderBy: OrderBy): Order = js.native
  def toQueryPath(path: ResourcePath): String = js.native
  def toQueryTarget(target: Target): QueryTarget = js.native
  def toResourceName(databaseId: DatabaseId, path: ResourcePath): String = js.native
  def toTarget(targetData: TargetData): typings.firebaseFirestore.firestoreProtoApiMod.Target = js.native
  def toTestWatchChange(watchChange: WatchChange): ListenResponse = js.native
  def toUnaryOrFieldFilter(filter: FieldFilter): Filter = js.native
  def toValue(`val`: FieldValue): Value = js.native
  def toVersion(version: SnapshotVersion): String = js.native
  def versionFromListenResponse(change: ListenResponse): SnapshotVersion = js.native
}

