package typings.firebaseFirestore

import typings.firebaseFirestore.blobMod.Blob
import typings.firebaseFirestore.byteStringMod.ByteString
import typings.firebaseFirestore.databaseInfoMod.DatabaseId
import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.documentMod.Document
import typings.firebaseFirestore.documentMod.MaybeDocument
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
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/remote/serializer", JSImport.Namespace)
@js.native
object remoteSerializerMod extends js.Object {
  @js.native
  class JsonProtoSerializer protected () extends js.Object {
    def this(databaseId: DatabaseId, useProto3Json: Boolean) = this()
    val databaseId: DatabaseId = js.native
    val useProto3Json: Boolean = js.native
  }
  
  def fromBytes(serializer: JsonProtoSerializer): ByteString = js.native
  def fromBytes(serializer: JsonProtoSerializer, value: String): ByteString = js.native
  def fromBytes(serializer: JsonProtoSerializer, value: Uint8Array): ByteString = js.native
  def fromDirection(): js.UndefOr[Direction] = js.native
  def fromDirection(
    dir: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.OrderDirection */ js.Any
  ): js.UndefOr[Direction] = js.native
  def fromDocument(
    serializer: JsonProtoSerializer,
    document: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Document */ js.Any
  ): Document = js.native
  def fromDocument(
    serializer: JsonProtoSerializer,
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
    serializer: JsonProtoSerializer,
    result: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.BatchGetDocumentsResponse */ js.Any
  ): MaybeDocument = js.native
  def fromMutation(
    serializer: JsonProtoSerializer,
    proto: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Write */ js.Any
  ): Mutation = js.native
  def fromName(serializer: JsonProtoSerializer, name: String): DocumentKey = js.native
  def fromOperatorName(
    op: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.FieldFilterOp */ js.Any
  ): Operator = js.native
  def fromPropertyOrder(
    orderBy: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Order */ js.Any
  ): OrderBy = js.native
  def fromQueryTarget(
    target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.QueryTarget */ js.Any
  ): Target = js.native
  def fromUnaryFilter(
    filter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Filter */ js.Any
  ): Filter = js.native
  def fromVersion(
    version: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Timestamp */ js.Any
  ): SnapshotVersion = js.native
  def fromWatchChange(
    serializer: JsonProtoSerializer,
    change: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.ListenResponse */ js.Any
  ): WatchChange = js.native
  def fromWriteResults(): js.Array[MutationResult] = js.native
  def fromWriteResults(
    protos: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WriteResult */ _
    ]
  ): js.Array[MutationResult] = js.native
  def fromWriteResults(
    protos: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WriteResult */ _
    ],
    commitTime: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.Timestamp */ js.Any
  ): js.Array[MutationResult] = js.native
  def getEncodedDatabaseId(serializer: JsonProtoSerializer): String = js.native
  def isValidResourceName(path: ResourcePath): Boolean = js.native
  def toBytes(serializer: JsonProtoSerializer, bytes: Blob): String | Uint8Array = js.native
  def toBytes(serializer: JsonProtoSerializer, bytes: ByteString): String | Uint8Array = js.native
  def toDirection(dir: Direction): js.Any = js.native
  def toDocument(serializer: JsonProtoSerializer, document: Document): js.Any = js.native
  def toDocumentMask(fieldMask: FieldMask): js.Any = js.native
  def toDocumentsTarget(serializer: JsonProtoSerializer, target: Target): js.Any = js.native
  def toDouble(serializer: JsonProtoSerializer, value: Double): js.Any = js.native
  def toFieldPathReference(path: FieldPath): js.Any = js.native
  def toInteger(value: Double): js.Any = js.native
  def toListenRequestLabels(serializer: JsonProtoSerializer, targetData: TargetData): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.ApiClientObjectMap<string> */ js.Any) | Null = js.native
  def toMutation(serializer: JsonProtoSerializer, mutation: Mutation): js.Any = js.native
  def toMutationDocument(serializer: JsonProtoSerializer, key: DocumentKey, fields: ObjectValue): js.Any = js.native
  def toName(serializer: JsonProtoSerializer, key: DocumentKey): String = js.native
  def toNumber(serializer: JsonProtoSerializer, value: Double): js.Any = js.native
  def toOperatorName(op: Operator): js.Any = js.native
  def toPropertyOrder(orderBy: OrderBy): js.Any = js.native
  def toQueryTarget(serializer: JsonProtoSerializer, target: Target): js.Any = js.native
  def toResourceName(databaseId: DatabaseId, path: ResourcePath): String = js.native
  def toTarget(serializer: JsonProtoSerializer, targetData: TargetData): js.Any = js.native
  def toTimestamp(serializer: JsonProtoSerializer, timestamp: Timestamp): js.Any = js.native
  def toUnaryOrFieldFilter(filter: FieldFilter): js.Any = js.native
  def toVersion(serializer: JsonProtoSerializer, version: SnapshotVersion): js.Any = js.native
  def versionFromListenResponse(
    change: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify api.ListenResponse */ js.Any
  ): SnapshotVersion = js.native
}

