package typings.firebaseFirestore.specBuilderMod

import typings.firebaseFirestore.specTestRunnerMod.SpecQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveTargetSpec extends js.Object {
  var queries: js.Array[SpecQuery]
  var resumeToken: String
}

object ActiveTargetSpec {
  @scala.inline
  def apply(queries: js.Array[SpecQuery], resumeToken: String): ActiveTargetSpec = {
    val __obj = js.Dynamic.literal(queries = queries.asInstanceOf[js.Any], resumeToken = resumeToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActiveTargetSpec]
  }
}

