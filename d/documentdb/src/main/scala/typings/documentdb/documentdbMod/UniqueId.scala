package typings.documentdb.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UniqueId extends js.Object {
  /** The user-defined unique identifier for a document or other DocumentDB object (database, collection, procedure...) */
  var id: String
}

object UniqueId {
  @scala.inline
  def apply(id: String): UniqueId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UniqueId]
  }
}

