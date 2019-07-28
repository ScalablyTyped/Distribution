package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassExpression
  extends BaseClass
     with Class
     with Expression {
  var id: js.UndefOr[Identifier | Null] = js.undefined
  @JSName("type")
  var type_ClassExpression: typings.estree.estreeStrings.ClassExpression
}

object ClassExpression {
  @scala.inline
  def apply(
    body: ClassBody,
    `type`: typings.estree.estreeStrings.ClassExpression,
    id: Identifier = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    superClass: Expression = null,
    trailingComments: js.Array[Comment] = null
  ): ClassExpression = {
    val __obj = js.Dynamic.literal(body = body)
    __obj.updateDynamic("type")(`type`)
    if (id != null) __obj.updateDynamic("id")(id)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (superClass != null) __obj.updateDynamic("superClass")(superClass)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ClassExpression]
  }
}

