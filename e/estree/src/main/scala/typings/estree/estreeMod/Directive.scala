package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Directive extends BaseNode {
  var directive: String
  var expression: Literal
  @JSName("type")
  var type_Directive: typings.estree.estreeStrings.ExpressionStatement
}

object Directive {
  @scala.inline
  def apply(
    directive: String,
    expression: Literal,
    `type`: typings.estree.estreeStrings.ExpressionStatement,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): Directive = {
    val __obj = js.Dynamic.literal(directive = directive.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directive]
  }
}

