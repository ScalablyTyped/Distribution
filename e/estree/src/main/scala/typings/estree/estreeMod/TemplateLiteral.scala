package typings.estree.estreeMod

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
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): TemplateLiteral = {
    val __obj = js.Dynamic.literal(expressions = expressions, quasis = quasis)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TemplateLiteral]
  }
}

