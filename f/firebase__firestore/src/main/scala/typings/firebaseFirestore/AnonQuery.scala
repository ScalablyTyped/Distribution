package typings.firebaseFirestore

import typings.firebaseFirestore.queryMod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQuery extends js.Object {
  var query: Query
  var resumeToken: String
}

object AnonQuery {
  @scala.inline
  def apply(query: Query, resumeToken: String): AnonQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], resumeToken = resumeToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonQuery]
  }
}

