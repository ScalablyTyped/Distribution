package typings.atFirebaseFirestore

import typings.atFirebaseFirestore.distSrcCoreSnapshotUnderscoreVersionMod.SnapshotVersion
import typings.atFirebaseFirestore.distSrcLocalEncodedUnderscoreResourceUnderscorePathMod.EncodedResourcePath
import typings.atFirebaseFirestore.distSrcLocalIndexeddbUnderscoreSchemaMod.DbMutationBatch
import typings.atFirebaseFirestore.distSrcLocalIndexeddbUnderscoreSchemaMod.DbRemoteDocument
import typings.atFirebaseFirestore.distSrcLocalIndexeddbUnderscoreSchemaMod.DbTarget
import typings.atFirebaseFirestore.distSrcLocalIndexeddbUnderscoreSchemaMod.DbTimestampKey
import typings.atFirebaseFirestore.distSrcLocalTargetUnderscoreDataMod.TargetData
import typings.atFirebaseFirestore.distSrcModelCollectionsMod.DocumentKeySet
import typings.atFirebaseFirestore.distSrcModelDocumentMod.MaybeDocument
import typings.atFirebaseFirestore.distSrcModelMutationUnderscoreBatchMod.MutationBatch
import typings.atFirebaseFirestore.distSrcRemoteSerializerMod.JsonProtoSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/local_serializer", JSImport.Namespace)
@js.native
object distSrcLocalLocalUnderscoreSerializerMod extends js.Object {
  @js.native
  class LocalSerializer protected () extends js.Object {
    def this(remoteSerializer: JsonProtoSerializer) = this()
    var fromDbTimestamp: js.Any = js.native
    var remoteSerializer: js.Any = js.native
    var toDbTimestamp: js.Any = js.native
    /** Decodes a DbMutationBatch into a MutationBatch */
    def fromDbMutationBatch(dbBatch: DbMutationBatch): MutationBatch = js.native
    /** Decodes a remote document from storage locally to a Document. */
    def fromDbRemoteDocument(remoteDoc: DbRemoteDocument): MaybeDocument = js.native
    /** Decodes an array of EncodedResourcePaths into a set of document keys. */
    def fromDbResourcePaths(encodedPaths: js.Array[EncodedResourcePath]): DocumentKeySet = js.native
    /** Decodes a DbTarget into TargetData */
    def fromDbTarget(dbTarget: DbTarget): TargetData = js.native
    def fromDbTimestampKey(dbTimestampKey: DbTimestampKey): SnapshotVersion = js.native
    /** Encodes a batch of mutations into a DbMutationBatch for local storage. */
    def toDbMutationBatch(userId: String, batch: MutationBatch): DbMutationBatch = js.native
    /** Encodes a document for storage locally. */
    def toDbRemoteDocument(maybeDoc: MaybeDocument, readTime: SnapshotVersion): DbRemoteDocument = js.native
    def toDbResourcePaths(keys: DocumentKeySet): js.Array[EncodedResourcePath] = js.native
    /** Encodes TargetData into a DbTarget for storage locally. */
    def toDbTarget(targetData: TargetData): DbTarget = js.native
    def toDbTimestampKey(snapshotVersion: SnapshotVersion): DbTimestampKey = js.native
  }
  
}

