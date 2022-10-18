package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcAuthUserMod.User
import typings.firebaseFirestore.distLiteFirestoreSrcCoreBundleMod.NamedQuery
import typings.firebaseFirestore.distLiteFirestoreSrcCoreQueryMod.Query
import typings.firebaseFirestore.distLiteFirestoreSrcCoreSnapshotVersionMod.SnapshotVersion
import typings.firebaseFirestore.distLiteFirestoreSrcLocalIndexeddbSchemaMod.DbBundle
import typings.firebaseFirestore.distLiteFirestoreSrcLocalIndexeddbSchemaMod.DbDocumentOverlay
import typings.firebaseFirestore.distLiteFirestoreSrcLocalIndexeddbSchemaMod.DbIndexConfiguration
import typings.firebaseFirestore.distLiteFirestoreSrcLocalIndexeddbSchemaMod.DbIndexState
import typings.firebaseFirestore.distLiteFirestoreSrcLocalIndexeddbSchemaMod.DbMutationBatch
import typings.firebaseFirestore.distLiteFirestoreSrcLocalIndexeddbSchemaMod.DbNamedQuery
import typings.firebaseFirestore.distLiteFirestoreSrcLocalIndexeddbSchemaMod.DbRemoteDocument
import typings.firebaseFirestore.distLiteFirestoreSrcLocalIndexeddbSchemaMod.DbTarget
import typings.firebaseFirestore.distLiteFirestoreSrcLocalIndexeddbSchemaMod.DbTimestamp
import typings.firebaseFirestore.distLiteFirestoreSrcLocalIndexeddbSentinelsMod.DbDocumentOverlayKey
import typings.firebaseFirestore.distLiteFirestoreSrcLocalIndexeddbSentinelsMod.DbTimestampKey
import typings.firebaseFirestore.distLiteFirestoreSrcLocalTargetDataMod.TargetData
import typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.distLiteFirestoreSrcModelDocumentMod.MutableDocument
import typings.firebaseFirestore.distLiteFirestoreSrcModelFieldIndexMod.FieldIndex
import typings.firebaseFirestore.distLiteFirestoreSrcModelFieldIndexMod.IndexOffset
import typings.firebaseFirestore.distLiteFirestoreSrcModelMutationBatchMod.MutationBatch
import typings.firebaseFirestore.distLiteFirestoreSrcModelOverlayMod.Overlay
import typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreBundleProtoMod.BundleMetadata
import typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreBundleProtoMod.BundledQuery
import typings.firebaseFirestore.distLiteFirestoreSrcRemoteSerializerMod.JsonProtoSerializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcLocalLocalSerializerMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/local_serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/local/local_serializer", "LocalSerializer")
  @js.native
  open class LocalSerializer protected () extends StObject {
    def this(remoteSerializer: JsonProtoSerializer) = this()
    
    val remoteSerializer: JsonProtoSerializer = js.native
  }
  
  inline def fromBundleMetadata(metadata: BundleMetadata): typings.firebaseFirestore.distLiteFirestoreSrcCoreBundleMod.BundleMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBundleMetadata")(metadata.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcCoreBundleMod.BundleMetadata]
  
  inline def fromBundledQuery(bundledQuery: BundledQuery): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBundledQuery")(bundledQuery.asInstanceOf[js.Any]).asInstanceOf[Query]
  
  inline def fromDbBundle(dbBundle: DbBundle): typings.firebaseFirestore.distLiteFirestoreSrcCoreBundleMod.BundleMetadata = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDbBundle")(dbBundle.asInstanceOf[js.Any]).asInstanceOf[typings.firebaseFirestore.distLiteFirestoreSrcCoreBundleMod.BundleMetadata]
  
  inline def fromDbDocumentOverlay(localSerializer: LocalSerializer, dbDocumentOverlay: DbDocumentOverlay): Overlay = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDbDocumentOverlay")(localSerializer.asInstanceOf[js.Any], dbDocumentOverlay.asInstanceOf[js.Any])).asInstanceOf[Overlay]
  
  inline def fromDbIndexConfiguration(index: DbIndexConfiguration): FieldIndex = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDbIndexConfiguration")(index.asInstanceOf[js.Any]).asInstanceOf[FieldIndex]
  inline def fromDbIndexConfiguration(index: DbIndexConfiguration, state: DbIndexState): FieldIndex = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDbIndexConfiguration")(index.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[FieldIndex]
  
  inline def fromDbMutationBatch(localSerializer: LocalSerializer, dbBatch: DbMutationBatch): MutationBatch = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDbMutationBatch")(localSerializer.asInstanceOf[js.Any], dbBatch.asInstanceOf[js.Any])).asInstanceOf[MutationBatch]
  
  inline def fromDbNamedQuery(dbNamedQuery: DbNamedQuery): NamedQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDbNamedQuery")(dbNamedQuery.asInstanceOf[js.Any]).asInstanceOf[NamedQuery]
  
  inline def fromDbRemoteDocument(localSerializer: LocalSerializer, remoteDoc: DbRemoteDocument): MutableDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDbRemoteDocument")(localSerializer.asInstanceOf[js.Any], remoteDoc.asInstanceOf[js.Any])).asInstanceOf[MutableDocument]
  
  inline def fromDbTarget(dbTarget: DbTarget): TargetData = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDbTarget")(dbTarget.asInstanceOf[js.Any]).asInstanceOf[TargetData]
  
  inline def fromDbTimestampKey(dbTimestampKey: DbTimestampKey): SnapshotVersion = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDbTimestampKey")(dbTimestampKey.asInstanceOf[js.Any]).asInstanceOf[SnapshotVersion]
  
  inline def fromProtoNamedQuery(namedQuery: typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreBundleProtoMod.NamedQuery): NamedQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProtoNamedQuery")(namedQuery.asInstanceOf[js.Any]).asInstanceOf[NamedQuery]
  
  inline def toDbBundle(metadata: BundleMetadata): DbBundle = ^.asInstanceOf[js.Dynamic].applyDynamic("toDbBundle")(metadata.asInstanceOf[js.Any]).asInstanceOf[DbBundle]
  
  inline def toDbDocumentOverlay(localSerializer: LocalSerializer, userId: String, overlay: Overlay): DbDocumentOverlay = (^.asInstanceOf[js.Dynamic].applyDynamic("toDbDocumentOverlay")(localSerializer.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], overlay.asInstanceOf[js.Any])).asInstanceOf[DbDocumentOverlay]
  
  inline def toDbDocumentOverlayKey(userId: String, docKey: DocumentKey): DbDocumentOverlayKey = (^.asInstanceOf[js.Dynamic].applyDynamic("toDbDocumentOverlayKey")(userId.asInstanceOf[js.Any], docKey.asInstanceOf[js.Any])).asInstanceOf[DbDocumentOverlayKey]
  
  inline def toDbIndexConfiguration(index: FieldIndex): DbIndexConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("toDbIndexConfiguration")(index.asInstanceOf[js.Any]).asInstanceOf[DbIndexConfiguration]
  
  inline def toDbIndexState(indexId: Double, user: User, sequenceNumber: Double, offset: IndexOffset): DbIndexState = (^.asInstanceOf[js.Dynamic].applyDynamic("toDbIndexState")(indexId.asInstanceOf[js.Any], user.asInstanceOf[js.Any], sequenceNumber.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[DbIndexState]
  
  inline def toDbMutationBatch(localSerializer: LocalSerializer, userId: String, batch: MutationBatch): DbMutationBatch = (^.asInstanceOf[js.Dynamic].applyDynamic("toDbMutationBatch")(localSerializer.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], batch.asInstanceOf[js.Any])).asInstanceOf[DbMutationBatch]
  
  inline def toDbNamedQuery(query: typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreBundleProtoMod.NamedQuery): DbNamedQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("toDbNamedQuery")(query.asInstanceOf[js.Any]).asInstanceOf[DbNamedQuery]
  
  inline def toDbRemoteDocument(localSerializer: LocalSerializer, document: MutableDocument): DbRemoteDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("toDbRemoteDocument")(localSerializer.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[DbRemoteDocument]
  
  inline def toDbTarget(localSerializer: LocalSerializer, targetData: TargetData): DbTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("toDbTarget")(localSerializer.asInstanceOf[js.Any], targetData.asInstanceOf[js.Any])).asInstanceOf[DbTarget]
  
  inline def toDbTimestamp(snapshotVersion: SnapshotVersion): DbTimestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("toDbTimestamp")(snapshotVersion.asInstanceOf[js.Any]).asInstanceOf[DbTimestamp]
  
  inline def toDbTimestampKey(snapshotVersion: SnapshotVersion): DbTimestampKey = ^.asInstanceOf[js.Dynamic].applyDynamic("toDbTimestampKey")(snapshotVersion.asInstanceOf[js.Any]).asInstanceOf[DbTimestampKey]
}
