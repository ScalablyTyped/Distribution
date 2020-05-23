package typings.firebaseFirestore.serializerMod

import typings.firebaseFirestore.blobMod.Blob
import typings.firebaseFirestore.byteStringMod.ByteString
import typings.firebaseFirestore.databaseInfoMod.DatabaseId
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.documentMod.Document
import typings.firebaseFirestore.documentMod.MaybeDocument
import typings.firebaseFirestore.errorMod.FirestoreError
import typings.firebaseFirestore.mutationMod.FieldMask
import typings.firebaseFirestore.mutationMod.Mutation
import typings.firebaseFirestore.mutationMod.MutationResult
import typings.firebaseFirestore.objectValueMod.ObjectValue
import typings.firebaseFirestore.pathMod.FieldPath
import typings.firebaseFirestore.pathMod.ResourcePath
import typings.firebaseFirestore.queryMod.Direction
import typings.firebaseFirestore.queryMod.FieldFilter
import typings.firebaseFirestore.queryMod.Filter
import typings.firebaseFirestore.queryMod.Operator
import typings.firebaseFirestore.queryMod.OrderBy
import typings.firebaseFirestore.snapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.targetDataMod.TargetData
import typings.firebaseFirestore.targetMod.Target
import typings.firebaseFirestore.timestampMod.Timestamp
import typings.firebaseFirestore.watchChangeMod.WatchChange
import typings.firebaseFirestore.watchChangeMod.WatchTargetChangeState
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/remote/serializer", "JsonProtoSerializer")
@js.native
class JsonProtoSerializer protected () extends js.Object {
  def this(databaseId: DatabaseId, options: SerializerOptions) = this()
  var databaseId: js.Any = js.native
  var extractLocalPathFromResourceName: js.Any = js.native
  var fromCursor: js.Any = js.native
  var fromFieldTransform: js.Any = js.native
  var fromFilter: js.Any = js.native
  var fromFound: js.Any = js.native
  /**
    * Returns a number (or null) from a google.protobuf.Int32Value proto.
    */
  var fromInt32Proto: js.Any = js.native
  var fromMissing: js.Any = js.native
  var fromOrder: js.Any = js.native
  var fromPrecondition: js.Any = js.native
  var fromTimestamp: js.Any = js.native
  var fromWriteResult: js.Any = js.native
  var fullyQualifiedPrefixPath: js.Any = js.native
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
  var toInt32Proto: js.Any = js.native
  var toLabel: js.Any = js.native
  var toOrder: js.Any = js.native
  var toPrecondition: js.Any = js.native
  def encodedDatabaseId: String = js.native
  /**
    * Returns a ByteString based on the proto string value.
    */
  def fromBytes(): ByteString = js.native
  def fromBytes(value: String): ByteString = js.native
  def fromBytes(value: Uint8Array): ByteString = js.native
  def fromDirection(): js.UndefOr[Direction] = js.native
  def fromDirection(
    dir: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.OrderDirection */ js.Any
  ): js.UndefOr[Direction] = js.native
  def fromDocument(
    document: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Document */ js.Any
  ): Document = js.native
  def fromDocument(
    document: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Document */ js.Any,
    hasCommittedMutations: Boolean
  ): Document = js.native
  def fromDocumentMask(
    proto: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.DocumentMask */ js.Any
  ): FieldMask = js.native
  def fromDocumentsTarget(
    documentsTarget: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.DocumentsTarget */ js.Any
  ): Target = js.native
  def fromFieldFilter(
    filter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Filter */ js.Any
  ): Filter = js.native
  def fromFieldPathReference(
    fieldReference: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.FieldReference */ js.Any
  ): FieldPath = js.native
  def fromMaybeDocument(
    result: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.BatchGetDocumentsResponse */ js.Any
  ): MaybeDocument = js.native
  def fromMutation(
    proto: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Write */ js.Any
  ): Mutation = js.native
  def fromName(name: String): DocumentKey = js.native
  def fromOperatorName(
    op: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.FieldFilterOp */ js.Any
  ): Operator = js.native
  def fromPropertyOrder(
    orderBy: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Order */ js.Any
  ): OrderBy = js.native
  def fromQueryPath(name: String): ResourcePath = js.native
  def fromQueryTarget(
    target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.QueryTarget */ js.Any
  ): Target = js.native
  def fromResourceName(name: String): ResourcePath = js.native
  def fromRpcStatus(
    status: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Status */ js.Any
  ): FirestoreError = js.native
  def fromUnaryFilter(
    filter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Filter */ js.Any
  ): Filter = js.native
  def fromVersion(
    version: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Timestamp */ js.Any
  ): SnapshotVersion = js.native
  def fromWatchChange(
    change: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.ListenResponse */ js.Any
  ): WatchChange = js.native
  def fromWatchTargetChangeState(
    state: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.TargetChangeTargetChangeType */ js.Any
  ): WatchTargetChangeState = js.native
  def fromWriteResults(): js.Array[MutationResult] = js.native
  def fromWriteResults(
    protos: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.WriteResult */ _
    ]
  ): js.Array[MutationResult] = js.native
  def fromWriteResults(
    protos: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.WriteResult */ _
    ],
    commitTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Timestamp */ js.Any
  ): js.Array[MutationResult] = js.native
  /**
    * Returns a value for bytes that's appropriate to put in a proto.
    *
    * Visible for testing.
    */
  def toBytes(bytes: Blob): String | Uint8Array = js.native
  def toBytes(bytes: ByteString): String | Uint8Array = js.native
  def toDirection(dir: Direction): js.Any = js.native
  def toDocument(document: Document): js.Any = js.native
  def toDocumentMask(fieldMask: FieldMask): js.Any = js.native
  def toDocumentsTarget(target: Target): js.Any = js.native
  /**
    * Returns an DoubleValue for `value` that is encoded based the serializer's
    * `useProto3Json` setting.
    */
  def toDouble(value: Double): js.Any = js.native
  def toFieldPathReference(path: FieldPath): js.Any = js.native
  /**
    * Returns an IntegerValue for `value`.
    */
  def toInteger(value: Double): js.Any = js.native
  def toListenRequestLabels(targetData: TargetData): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.ApiClientObjectMap<string> */ js.Any) | Null = js.native
  def toMutation(mutation: Mutation): js.Any = js.native
  /** Creates an api.Document from key and fields (but no create/update time) */
  def toMutationDocument(key: DocumentKey, fields: ObjectValue): js.Any = js.native
  def toName(key: DocumentKey): String = js.native
  /**
    * Returns a value for a number that's appropriate to put into a proto.
    * The return value is an IntegerValue if it can safely represent the value,
    * otherwise a DoubleValue is returned.
    */
  def toNumber(value: Double): js.Any = js.native
  def toOperatorName(op: Operator): js.Any = js.native
  def toPropertyOrder(orderBy: OrderBy): js.Any = js.native
  def toQueryPath(path: ResourcePath): String = js.native
  def toQueryTarget(target: Target): js.Any = js.native
  def toResourceName(path: ResourcePath): String = js.native
  def toResourceName(path: ResourcePath, databaseId: DatabaseId): String = js.native
  def toTarget(targetData: TargetData): js.Any = js.native
  /**
    * Returns a value for a Date that's appropriate to put into a proto.
    */
  def toTimestamp(timestamp: Timestamp): js.Any = js.native
  def toUnaryOrFieldFilter(filter: FieldFilter): js.Any = js.native
  def toVersion(version: SnapshotVersion): js.Any = js.native
  def versionFromListenResponse(
    change: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.ListenResponse */ js.Any
  ): SnapshotVersion = js.native
}

