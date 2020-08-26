package typings.documentdbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Can be used as the query parameter in queryAttachments and queryDocuments. */
@js.native
trait IParameterizedQuery extends js.Object {
  /** Parameters */
  var parameters: js.Array[IQueryParam] = js.native
  /** SQL query string. */
  var query: String = js.native
}

object IParameterizedQuery {
  @scala.inline
  def apply(parameters: js.Array[IQueryParam], query: String): IParameterizedQuery = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[IParameterizedQuery]
  }
  @scala.inline
  implicit class IParameterizedQueryOps[Self <: IParameterizedQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParametersVarargs(value: IQueryParam*): Self = this.set("parameters", js.Array(value :_*))
    @scala.inline
    def setParameters(value: js.Array[IQueryParam]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
  }
  
}

