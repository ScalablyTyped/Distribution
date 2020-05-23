package typings.firebaseFirestore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  var query: typings.firebaseFirestore.queryMod.Query
  var resumeToken: js.UndefOr[String] = js.undefined
}

object Query {
  @scala.inline
  def apply(query: typings.firebaseFirestore.queryMod.Query, resumeToken: String = null): Query = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (resumeToken != null) __obj.updateDynamic("resumeToken")(resumeToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
}

