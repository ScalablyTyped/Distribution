package typings
package expressDashGraphqlLib.expressDashGraphqlMod.graphqlHTTPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLParams extends js.Object {
  var operationName: js.UndefOr[java.lang.String | scala.Null]
  var query: js.UndefOr[java.lang.String | scala.Null]
  var raw: js.UndefOr[scala.Boolean | scala.Null]
  var variables: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Null]
}

object GraphQLParams {
  @scala.inline
  def apply(
    operationName: java.lang.String = null,
    query: java.lang.String = null,
    raw: js.UndefOr[scala.Boolean] = js.undefined,
    variables: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): GraphQLParams = {
    val __obj = js.Dynamic.literal()
    if (operationName != null) __obj.updateDynamic("operationName")(operationName)
    if (query != null) __obj.updateDynamic("query")(query)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[GraphQLParams]
  }
}

