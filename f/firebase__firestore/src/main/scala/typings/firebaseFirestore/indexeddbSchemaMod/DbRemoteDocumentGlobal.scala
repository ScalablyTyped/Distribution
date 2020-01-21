package typings.firebaseFirestore.indexeddbSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/local/indexeddb_schema", "DbRemoteDocumentGlobal")
@js.native
class DbRemoteDocumentGlobal protected () extends js.Object {
  /**
    * @param byteSize Approximately the total size in bytes of all the documents in the document
    * cache.
    */
  def this(byteSize: Double) = this()
  var byteSize: Double = js.native
}

/* static members */
@JSImport("@firebase/firestore/dist/lib/src/local/indexeddb_schema", "DbRemoteDocumentGlobal")
@js.native
object DbRemoteDocumentGlobal extends js.Object {
  var key: String = js.native
  var store: String = js.native
}

