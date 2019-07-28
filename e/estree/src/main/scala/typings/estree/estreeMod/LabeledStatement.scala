package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabeledStatement
  extends BaseNode
     with Statement {
  var body: Statement
  var label: Identifier
  @JSName("type")
  var type_LabeledStatement: typings.estree.estreeStrings.LabeledStatement
}

object LabeledStatement {
  @scala.inline
  def apply(
    body: Statement,
    label: Identifier,
    `type`: typings.estree.estreeStrings.LabeledStatement,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): LabeledStatement = {
    val __obj = js.Dynamic.literal(body = body, label = label)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[LabeledStatement]
  }
}

