package typings.firebaseFirestore

import typings.firebaseFirestore.coreQueryMod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQueryResumeToken extends js.Object {
  var query: Query
  var resumeToken: String
}

object AnonQueryResumeToken {
  @scala.inline
  def apply(query: Query, resumeToken: String): AnonQueryResumeToken = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], resumeToken = resumeToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonQueryResumeToken]
  }
}

