package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateLiteral
  extends BaseNode
     with Expression {
  var expressions: js.Array[Expression]
  var quasis: js.Array[TemplateElement]
  @JSName("type")
  var type_TemplateLiteral: typings.estree.estreeStrings.TemplateLiteral
}

object TemplateLiteral {
  @scala.inline
  def apply(
    expressions: js.Array[Expression],
    quasis: js.Array[TemplateElement],
    `type`: typings.estree.estreeStrings.TemplateLiteral,
    leadingComments: js.Array[Comment] = null,
    loc: js.UndefOr[Null | SourceLocation] = js.undefined,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): TemplateLiteral = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateLiteral]
  }
}

