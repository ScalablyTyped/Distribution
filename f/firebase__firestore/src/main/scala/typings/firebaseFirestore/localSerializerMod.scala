package typings.firebaseFirestore

import typings.firebaseFirestore.documentMod.MaybeDocument
import typings.firebaseFirestore.indexeddbSchemaMod.DbMutationBatch
import typings.firebaseFirestore.indexeddbSchemaMod.DbRemoteDocument
import typings.firebaseFirestore.indexeddbSchemaMod.DbTarget
import typings.firebaseFirestore.indexeddbSchemaMod.DbTimestampKey
import typings.firebaseFirestore.mutationBatchMod.MutationBatch
import typings.firebaseFirestore.remoteSerializerMod.JsonProtoSerializer
import typings.firebaseFirestore.snapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.targetDataMod.TargetData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/local/local_serializer", JSImport.Namespace)
@js.native
object localSerializerMod extends js.Object {
  @js.native
  class LocalSerializer protected () extends js.Object {
    def this(remoteSerializer: JsonProtoSerializer) = this()
    val remoteSerializer: JsonProtoSerializer = js.native
  }
  
  def fromDbMutationBatch(localSerializer: LocalSerializer, dbBatch: DbMutationBatch): MutationBatch = js.native
  def fromDbRemoteDocument(localSerializer: LocalSerializer, remoteDoc: DbRemoteDocument): MaybeDocument = js.native
  def fromDbTarget(dbTarget: DbTarget): TargetData = js.native
  def fromDbTimestampKey(dbTimestampKey: DbTimestampKey): SnapshotVersion = js.native
  def toDbMutationBatch(localSerializer: LocalSerializer, userId: String, batch: MutationBatch): DbMutationBatch = js.native
  def toDbRemoteDocument(localSerializer: LocalSerializer, maybeDoc: MaybeDocument, readTime: SnapshotVersion): DbRemoteDocument = js.native
  def toDbTarget(localSerializer: LocalSerializer, targetData: TargetData): DbTarget = js.native
  def toDbTimestampKey(snapshotVersion: SnapshotVersion): DbTimestampKey = js.native
}

