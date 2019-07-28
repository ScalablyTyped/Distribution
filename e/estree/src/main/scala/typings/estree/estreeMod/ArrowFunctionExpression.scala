package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrowFunctionExpression
  extends BaseFunction
     with Expression
     with Function {
  var expression: Boolean
  @JSName("type")
  var type_ArrowFunctionExpression: typings.estree.estreeStrings.ArrowFunctionExpression
}

object ArrowFunctionExpression {
  @scala.inline
  def apply(
    body: BlockStatement | Expression,
    expression: Boolean,
    params: js.Array[Pattern],
    `type`: typings.estree.estreeStrings.ArrowFunctionExpression,
    async: js.UndefOr[Boolean] = js.undefined,
    generator: js.UndefOr[Boolean] = js.undefined,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): ArrowFunctionExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], expression = expression, params = params)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (!js.isUndefined(generator)) __obj.updateDynamic("generator")(generator)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ArrowFunctionExpression]
  }
}

