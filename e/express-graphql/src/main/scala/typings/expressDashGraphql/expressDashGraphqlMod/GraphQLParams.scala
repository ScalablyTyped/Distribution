package typings.expressDashGraphql.expressDashGraphqlMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLParams extends js.Object {
  var operationName: js.UndefOr[String | Null] = js.undefined
  var query: js.UndefOr[String | Null] = js.undefined
  var raw: js.UndefOr[Boolean | Null] = js.undefined
  var variables: js.UndefOr[StringDictionary[js.Any] | Null] = js.undefined
}

object GraphQLParams {
  @scala.inline
  def apply(
    operationName: String = null,
    query: String = null,
    raw: js.UndefOr[Boolean] = js.undefined,
    variables: StringDictionary[js.Any] = null
  ): GraphQLParams = {
    val __obj = js.Dynamic.literal()
    if (operationName != null) __obj.updateDynamic("operationName")(operationName)
    if (query != null) __obj.updateDynamic("query")(query)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[GraphQLParams]
  }
}

