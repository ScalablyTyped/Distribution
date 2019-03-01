package typings
package documentdbDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Can be used as the query parameter in queryAttachments and queryDocuments. */
trait IParameterizedQuery extends js.Object {
  /** Parameters */
  var parameters: js.Array[IQueryParam]
  /** SQL query string. */
  var query: java.lang.String
}

object IParameterizedQuery {
  @scala.inline
  def apply(parameters: js.Array[IQueryParam], query: java.lang.String): IParameterizedQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parameters")(parameters)
    __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[IParameterizedQuery]
  }
}

