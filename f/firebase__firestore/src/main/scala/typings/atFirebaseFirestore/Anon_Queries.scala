package typings.atFirebaseFirestore

import typings.atFirebaseFirestore.distTestUnitSpecsSpecUnderscoreTestUnderscoreRunnerMod.SpecQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Queries extends js.Object {
  var queries: js.Array[SpecQuery]
  var resumeToken: String
}

object Anon_Queries {
  @scala.inline
  def apply(queries: js.Array[SpecQuery], resumeToken: String): Anon_Queries = {
    val __obj = js.Dynamic.literal(queries = queries.asInstanceOf[js.Any], resumeToken = resumeToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Queries]
  }
}

