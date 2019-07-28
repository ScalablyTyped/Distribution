package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionDeclaration
  extends BaseFunction
     with Declaration
     with Function {
  @JSName("body")
  var body_FunctionDeclaration: BlockStatement
  /** It is null when a function declaration is a part of the `export default function` statement */
  var id: Identifier | Null
  @JSName("type")
  var type_FunctionDeclaration: typings.estree.estreeStrings.FunctionDeclaration
}

object FunctionDeclaration {
  @scala.inline
  def apply(
    body: BlockStatement,
    params: js.Array[Pattern],
    `type`: typings.estree.estreeStrings.FunctionDeclaration,
    async: js.UndefOr[Boolean] = js.undefined,
    generator: js.UndefOr[Boolean] = js.undefined,
    id: Identifier = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): FunctionDeclaration = {
    val __obj = js.Dynamic.literal(body = body, params = params)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(async)) __obj.updateDynamic("async")(async)
    if (!js.isUndefined(generator)) __obj.updateDynamic("generator")(generator)
    if (id != null) __obj.updateDynamic("id")(id)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[FunctionDeclaration]
  }
}

