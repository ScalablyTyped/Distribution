package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlQuerySpec extends js.Object {
  /** The array of SqlParameters. */
  var parameters: js.Array[SqlParameter]
  /** The body of the query. */
  var query: String
}

object SqlQuerySpec {
  @scala.inline
  def apply(parameters: js.Array[SqlParameter], query: String): SqlQuerySpec = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SqlQuerySpec]
  }
}

