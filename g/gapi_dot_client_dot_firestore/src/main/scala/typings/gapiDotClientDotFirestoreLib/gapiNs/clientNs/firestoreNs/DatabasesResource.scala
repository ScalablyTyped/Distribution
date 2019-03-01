package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatabasesResource extends js.Object {
  var documents: DocumentsResource
  var indexes: IndexesResource
}

object DatabasesResource {
  @scala.inline
  def apply(documents: DocumentsResource, indexes: IndexesResource): DatabasesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("documents")(documents)
    __obj.updateDynamic("indexes")(indexes)
    __obj.asInstanceOf[DatabasesResource]
  }
}

