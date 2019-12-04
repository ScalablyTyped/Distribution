package typings.atFirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distSrcLocalIndexeddbUnderscoreSchemaMod {
  import typings.atFirebaseFirestore.distSrcCoreTypesMod.BatchId
  import typings.atFirebaseFirestore.distSrcCoreTypesMod.TargetId
  import typings.atFirebaseFirestore.distSrcLocalEncodedUnderscoreResourceUnderscorePathMod.EncodedResourcePath
  import typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.DocumentsTarget
  import typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.QueryTarget

  type DbClientMetadataKey = String
  type DbCollectionParentKey = js.Tuple2[String, EncodedResourcePath]
  type DbDocumentMutationKey = js.Tuple3[String, EncodedResourcePath, BatchId]
  type DbMutationBatchKey = BatchId
  type DbMutationQueueKey = String
  type DbPrimaryClientKey = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DbPrimaryClient.key */ js.Any
  type DbQuery = QueryTarget | DocumentsTarget
  type DbRemoteDocumentGlobalKey = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DbRemoteDocumentGlobal.key */ js.Any
  type DbRemoteDocumentKey = js.Array[String]
  type DbTargetDocumentKey = js.Tuple2[TargetId, EncodedResourcePath]
  type DbTargetGlobalKey = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DbTargetGlobal.key */ js.Any
  type DbTargetKey = TargetId
  type DbTimestampKey = js.Tuple2[/* seconds */ Double, /* nanos */ Double]
}
