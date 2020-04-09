package typings.firebaseFirestore

import typings.firebaseFirestore.coreQueryMod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResumeToken extends js.Object {
  var query: Query
  var resumeToken: String
}

object AnonResumeToken {
  @scala.inline
  def apply(query: Query, resumeToken: String): AnonResumeToken = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], resumeToken = resumeToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonResumeToken]
  }
}

