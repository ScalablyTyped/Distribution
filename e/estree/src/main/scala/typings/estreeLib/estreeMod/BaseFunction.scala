package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseFunction extends BaseNode {
  var async: js.UndefOr[scala.Boolean] = js.undefined
  // The body is either BlockStatement or Expression because arrow functions
  // can have a body that's either. FunctionDeclarations and
  // FunctionExpressions have only BlockStatement bodies.
  var body: BlockStatement | Expression
  var generator: js.UndefOr[scala.Boolean] = js.undefined
  var params: js.Array[Pattern]
}

object BaseFunction {
  @scala.inline
  def apply(
    body: BlockStatement | Expression,
    params: js.Array[Pattern],
    `type`: java.lang.String,
    async: js.UndefOr[scala.Boolean] = js.undefined,
    generator: js.UndefOr[scala.Boolean] = js.undefined,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): BaseFunction = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (!js.isUndefined(generator)) __obj.updateDynamic("generator")(generator)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[BaseFunction]
  }
}

