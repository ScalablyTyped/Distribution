package typings
package gapiDotClientDotFirestoreLib.gapiNs.clientNs.firestoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsResource extends js.Object {
  var databases: DatabasesResource
}

object ProjectsResource {
  @scala.inline
  def apply(databases: DatabasesResource): ProjectsResource = {
    val __obj = js.Dynamic.literal(databases = databases)
  
    __obj.asInstanceOf[ProjectsResource]
  }
}

