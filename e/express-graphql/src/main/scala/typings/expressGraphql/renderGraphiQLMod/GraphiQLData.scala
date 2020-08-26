package typings.expressGraphql.renderGraphiQLMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.executeMod.FormattedExecutionResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphiQLData extends js.Object {
  var operationName: js.UndefOr[String | Null] = js.native
  var query: js.UndefOr[String | Null] = js.native
  var result: js.UndefOr[FormattedExecutionResult[StringDictionary[_], StringDictionary[_]]] = js.native
  var variables: js.UndefOr[StringDictionary[js.Any] | Null] = js.native
}

object GraphiQLData {
  @scala.inline
  def apply(): GraphiQLData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphiQLData]
  }
  @scala.inline
  implicit class GraphiQLDataOps[Self <: GraphiQLData] (val x: Self) extends AnyVal {
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
    def setOperationName(value: String): Self = this.set("operationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationName: Self = this.set("operationName", js.undefined)
    @scala.inline
    def setOperationNameNull: Self = this.set("operationName", null)
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setQueryNull: Self = this.set("query", null)
    @scala.inline
    def setResult(value: FormattedExecutionResult[StringDictionary[_], StringDictionary[_]]): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    @scala.inline
    def setVariables(value: StringDictionary[js.Any]): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
    @scala.inline
    def setVariablesNull: Self = this.set("variables", null)
  }
  
}

