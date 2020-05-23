package typings.estree.mod

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
    id: js.UndefOr[Null | Identifier] = js.undefined,
    leadingComments: js.Array[Comment] = null,
    loc: js.UndefOr[Null | SourceLocation] = js.undefined,
    range: js.Tuple2[Double, Double] = null,
    superClass: js.UndefOr[Null | Expression] = js.undefined,
    trailingComments: js.Array[Comment] = null
  ): ClassExpression = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(superClass)) __obj.updateDynamic("superClass")(superClass.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassExpression]
  }
}

