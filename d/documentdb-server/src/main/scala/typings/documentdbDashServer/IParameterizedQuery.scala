package typings.documentdbDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Can be used as the query parameter in queryAttachments and queryDocuments. */
trait IParameterizedQuery extends js.Object {
  /** Parameters */
  var parameters: js.Array[IQueryParam]
  /** SQL query string. */
  var query: String
}

object IParameterizedQuery {
  @scala.inline
  def apply(parameters: js.Array[IQueryParam], query: String): IParameterizedQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters, query = query)
  
    __obj.asInstanceOf[IParameterizedQuery]
  }
}

