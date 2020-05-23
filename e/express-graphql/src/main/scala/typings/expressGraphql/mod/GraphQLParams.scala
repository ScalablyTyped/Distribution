package typings.expressGraphql.mod

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
    operationName: js.UndefOr[Null | String] = js.undefined,
    query: js.UndefOr[Null | String] = js.undefined,
    raw: js.UndefOr[Null | Boolean] = js.undefined,
    variables: js.UndefOr[Null | StringDictionary[js.Any]] = js.undefined
  ): GraphQLParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(operationName)) __obj.updateDynamic("operationName")(operationName.asInstanceOf[js.Any])
    if (!js.isUndefined(query)) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (!js.isUndefined(variables)) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLParams]
  }
}

