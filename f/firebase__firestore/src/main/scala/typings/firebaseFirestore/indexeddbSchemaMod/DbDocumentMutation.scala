package typings.firebaseFirestore.indexeddbSchemaMod

import typings.firebaseFirestore.encodedResourcePathMod.EncodedResourcePath
import typings.firebaseFirestore.pathMod.ResourcePath
import typings.firebaseFirestore.typesMod.BatchId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/local/indexeddb_schema", "DbDocumentMutation")
@js.native
class DbDocumentMutation protected () extends js.Object

/* static members */
@JSImport("@firebase/firestore/dist/packages/firestore/src/local/indexeddb_schema", "DbDocumentMutation")
@js.native
object DbDocumentMutation extends js.Object {
  /**
    * Because we store all the useful information for this store in the key,
    * there is no useful information to store as the value. The raw (unencoded)
    * path cannot be stored because IndexedDb doesn't store prototype
    * information.
    */
  var PLACEHOLDER: DbDocumentMutation = js.native
  var store: String = js.native
  /**
    * Creates a full index key of [userId, encodedPath, batchId] for inserting
    * and deleting into the DbDocumentMutations index.
    */
  def key(userId: String, path: ResourcePath, batchId: BatchId): DbDocumentMutationKey = js.native
  /**
    * Creates a [userId, encodedPath] key for use in the DbDocumentMutations
    * index to iterate over all at document mutations for a given path or lower.
    */
  def prefixForPath(userId: String, path: ResourcePath): js.Tuple2[String, EncodedResourcePath] = js.native
  /**
    * Creates a [userId] key for use in the DbDocumentMutations index to iterate
    * over all of a user's document mutations.
    */
  def prefixForUser(userId: String): js.Array[String] = js.native
}

