package typings.firebaseFirestore.indexeddbSchemaMod

import typings.firebaseFirestore.encodedResourcePathMod.EncodedResourcePath
import typings.firebaseFirestore.typesMod.TargetId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/local/indexeddb_schema", "DbTargetDocument")
@js.native
class DbTargetDocument protected () extends js.Object {
  def this(
    /**
    * The targetId identifying a target or 0 for a sentinel row.
    */
  targetId: TargetId,
    /**
    * The path to the document, as encoded in the key.
    */
  path: EncodedResourcePath
  ) = this()
  def this(
    /**
    * The targetId identifying a target or 0 for a sentinel row.
    */
  targetId: TargetId,
    /**
    * The path to the document, as encoded in the key.
    */
  path: EncodedResourcePath,
    /**
    * If this is a sentinel row, this should be the sequence number of the last
    * time the document specified by `path` was used. Otherwise, it should be
    * `undefined`.
    */
  sequenceNumber: Double
  ) = this()
  /**
    * The path to the document, as encoded in the key.
    */
  var path: EncodedResourcePath = js.native
  /**
    * If this is a sentinel row, this should be the sequence number of the last
    * time the document specified by `path` was used. Otherwise, it should be
    * `undefined`.
    */
  var sequenceNumber: js.UndefOr[Double] = js.native
  /**
    * The targetId identifying a target or 0 for a sentinel row.
    */
  var targetId: TargetId = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/lib/src/local/indexeddb_schema", "DbTargetDocument")
@js.native
object DbTargetDocument extends js.Object {
  /** The index name for the reverse index. */
  var documentTargetsIndex: String = js.native
  /** We also need to create the reverse index for these properties. */
  var documentTargetsKeyPath: js.Array[String] = js.native
  /** Keys are automatically assigned via the targetId, path properties. */
  var keyPath: js.Array[String] = js.native
  /** Name of the IndexedDb object store.  */
  var store: String = js.native
}

