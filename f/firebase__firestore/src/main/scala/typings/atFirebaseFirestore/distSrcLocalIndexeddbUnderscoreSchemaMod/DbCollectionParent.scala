package typings.atFirebaseFirestore.distSrcLocalIndexeddbUnderscoreSchemaMod

import typings.atFirebaseFirestore.distSrcLocalEncodedUnderscoreResourceUnderscorePathMod.EncodedResourcePath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/indexeddb_schema", "DbCollectionParent")
@js.native
class DbCollectionParent protected () extends js.Object {
  def this(
    /**
    * The collectionId (e.g. 'messages')
    */
  collectionId: String,
    /**
    * The path to the parent (either a document location or an empty path for
    * a root-level collection).
    */
  parent: EncodedResourcePath
  ) = this()
  /**
    * The collectionId (e.g. 'messages')
    */
  var collectionId: String = js.native
  /**
    * The path to the parent (either a document location or an empty path for
    * a root-level collection).
    */
  var parent: EncodedResourcePath = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/src/local/indexeddb_schema", "DbCollectionParent")
@js.native
object DbCollectionParent extends js.Object {
  /** Keys are automatically assigned via the collectionId, parent properties. */
  var keyPath: js.Array[String] = js.native
  /** Name of the IndexedDb object store. */
  var store: String = js.native
}

