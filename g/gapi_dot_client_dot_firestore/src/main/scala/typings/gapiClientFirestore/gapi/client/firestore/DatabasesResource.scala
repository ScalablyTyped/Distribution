package typings.gapiClientFirestore.gapi.client.firestore

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
    val __obj = js.Dynamic.literal(documents = documents.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DatabasesResource]
  }
}

