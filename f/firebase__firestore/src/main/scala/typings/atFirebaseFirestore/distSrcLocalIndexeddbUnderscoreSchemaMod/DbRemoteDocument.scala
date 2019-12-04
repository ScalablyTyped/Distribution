package typings.atFirebaseFirestore.distSrcLocalIndexeddbUnderscoreSchemaMod

import typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/src/local/indexeddb_schema", "DbRemoteDocument")
@js.native
class DbRemoteDocument protected () extends js.Object {
  def this(
    /**
    * Set to an instance of DbUnknownDocument if the data for a document is
    * not known, but it is known that a document exists at the specified
    * version (e.g. it had a successful update applied to it)
    */
  unknownDocument: js.UndefOr[DbUnknownDocument | Null],
    /**
    * Set to an instance of a DbNoDocument if it is known that no document
    * exists.
    */
  noDocument: DbNoDocument | Null,
    /**
    * Set to an instance of a Document if there's a cached version of the
    * document.
    */
  document: Document | Null,
    /**
    * Documents that were written to the remote document store based on
    * a write acknowledgment are marked with `hasCommittedMutations`. These
    * documents are potentially inconsistent with the backend's copy and use
    * the write's commit version as their document version.
    */
  hasCommittedMutations: js.UndefOr[Boolean],
    /**
    * When the document was read from the backend. Undefined for data written
    * prior to schema version 9.
    */
  readTime: js.UndefOr[DbTimestampKey],
    /**
    * The path of the collection this document is part of. Undefined for data
    * written prior to schema version 9.
    */
  parentPath: js.UndefOr[js.Array[String]]
  ) = this()
  /**
    * Set to an instance of a Document if there's a cached version of the
    * document.
    */
  var document: Document | Null = js.native
  /**
    * Documents that were written to the remote document store based on
    * a write acknowledgment are marked with `hasCommittedMutations`. These
    * documents are potentially inconsistent with the backend's copy and use
    * the write's commit version as their document version.
    */
  var hasCommittedMutations: js.UndefOr[Boolean] = js.native
  /**
    * Set to an instance of a DbNoDocument if it is known that no document
    * exists.
    */
  var noDocument: DbNoDocument | Null = js.native
  /**
    * The path of the collection this document is part of. Undefined for data
    * written prior to schema version 9.
    */
  var parentPath: js.UndefOr[js.Array[String]] = js.native
  /**
    * When the document was read from the backend. Undefined for data written
    * prior to schema version 9.
    */
  var readTime: js.UndefOr[DbTimestampKey] = js.native
  /**
    * Set to an instance of DbUnknownDocument if the data for a document is
    * not known, but it is known that a document exists at the specified
    * version (e.g. it had a successful update applied to it)
    */
  var unknownDocument: js.UndefOr[DbUnknownDocument | Null] = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/src/local/indexeddb_schema", "DbRemoteDocument")
@js.native
object DbRemoteDocument extends js.Object {
  /**
    * An index that provides access to documents in a collection sorted by read
    * time.
    *
    * This index is used to allow the RemoteDocumentCache to fetch newly changed
    * documents in a collection.
    */
  var collectionReadTimeIndex: String = js.native
  var collectionReadTimeIndexPath: js.Array[String] = js.native
  /**
    * An index that provides access to all entries sorted by read time (which
    * corresponds to the last modification time of each row).
    *
    * This index is used to provide a changelog for Multi-Tab.
    */
  var readTimeIndex: String = js.native
  var readTimeIndexPath: String = js.native
  var store: String = js.native
}

