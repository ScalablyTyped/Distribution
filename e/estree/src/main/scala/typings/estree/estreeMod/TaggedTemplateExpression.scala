package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaggedTemplateExpression
  extends BaseNode
     with Expression {
  var quasi: TemplateLiteral
  var tag: Expression
  @JSName("type")
  var type_TaggedTemplateExpression: typings.estree.estreeStrings.TaggedTemplateExpression
}

object TaggedTemplateExpression {
  @scala.inline
  def apply(
    quasi: TemplateLiteral,
    tag: Expression,
    `type`: typings.estree.estreeStrings.TaggedTemplateExpression,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): TaggedTemplateExpression = {
    val __obj = js.Dynamic.literal(quasi = quasi, tag = tag)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TaggedTemplateExpression]
  }
}

