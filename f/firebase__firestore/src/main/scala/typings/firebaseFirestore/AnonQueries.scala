package typings.firebaseFirestore

import typings.firebaseFirestore.specTestRunnerMod.SpecQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQueries extends js.Object {
  var queries: js.Array[SpecQuery]
  var resumeToken: String
}

object AnonQueries {
  @scala.inline
  def apply(queries: js.Array[SpecQuery], resumeToken: String): AnonQueries = {
    val __obj = js.Dynamic.literal(queries = queries.asInstanceOf[js.Any], resumeToken = resumeToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonQueries]
  }
}

