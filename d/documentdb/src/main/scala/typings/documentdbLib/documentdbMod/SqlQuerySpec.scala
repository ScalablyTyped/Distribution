package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlQuerySpec extends js.Object {
  /** The array of SqlParameters. */
  var parameters: js.Array[SqlParameter]
  /** The body of the query. */
  var query: java.lang.String
}

object SqlQuerySpec {
  @scala.inline
  def apply(parameters: js.Array[SqlParameter], query: java.lang.String): SqlQuerySpec = {
    val __obj = js.Dynamic.literal(parameters = parameters, query = query)
  
    __obj.asInstanceOf[SqlQuerySpec]
  }
}

