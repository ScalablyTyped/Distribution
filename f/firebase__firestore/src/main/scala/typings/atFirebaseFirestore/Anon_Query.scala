package typings.atFirebaseFirestore

import typings.atFirebaseFirestore.distSrcCoreQueryMod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Query extends js.Object {
  var query: Query
  var resumeToken: String
}

object Anon_Query {
  @scala.inline
  def apply(query: Query, resumeToken: String): Anon_Query = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], resumeToken = resumeToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Query]
  }
}

