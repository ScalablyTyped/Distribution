package typings.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabasesResource extends js.Object {
  var documents: DocumentsResource = js.native
  var indexes: IndexesResource = js.native
}

object DatabasesResource {
  @scala.inline
  def apply(documents: DocumentsResource, indexes: IndexesResource): DatabasesResource = {
    val __obj = js.Dynamic.literal(documents = documents.asInstanceOf[js.Any], indexes = indexes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabasesResource]
  }
  @scala.inline
  implicit class DatabasesResourceOps[Self <: DatabasesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDocuments(value: DocumentsResource): Self = this.set("documents", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexes(value: IndexesResource): Self = this.set("indexes", value.asInstanceOf[js.Any])
  }
  
}

