package typings.estree.estreeMod

import typings.estree.Anon_Cooked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateElement
  extends BaseNode
     with Node {
  var tail: Boolean
  @JSName("type")
  var type_TemplateElement: typings.estree.estreeStrings.TemplateElement
  var value: Anon_Cooked
}

object TemplateElement {
  @scala.inline
  def apply(
    tail: Boolean,
    `type`: typings.estree.estreeStrings.TemplateElement,
    value: Anon_Cooked,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): TemplateElement = {
    val __obj = js.Dynamic.literal(tail = tail, value = value)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[TemplateElement]
  }
}

