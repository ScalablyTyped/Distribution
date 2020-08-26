package typings.expressGraphql.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLParams extends js.Object {
  var operationName: String | Null = js.native
  var query: String | Null = js.native
  var raw: Boolean = js.native
  var variables: StringDictionary[js.Any] | Null = js.native
}

object GraphQLParams {
  @scala.inline
  def apply(raw: Boolean): GraphQLParams = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLParams]
  }
  @scala.inline
  implicit class GraphQLParamsOps[Self <: GraphQLParams] (val x: Self) extends AnyVal {
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
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationName(value: String): Self = this.set("operationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationNameNull: Self = this.set("operationName", null)
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryNull: Self = this.set("query", null)
    @scala.inline
    def setVariables(value: StringDictionary[js.Any]): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariablesNull: Self = this.set("variables", null)
  }
  
}

