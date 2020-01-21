package typings.gapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var databases: DatabasesResource
}

object ProjectsResource {
  @scala.inline
  def apply(databases: DatabasesResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(databases = databases.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

