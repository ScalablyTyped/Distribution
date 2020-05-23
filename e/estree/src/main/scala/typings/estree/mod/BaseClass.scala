package typings.estree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseClass extends BaseNode {
  var body: ClassBody
  var superClass: js.UndefOr[Expression | Null] = js.undefined
}

object BaseClass {
  @scala.inline
  def apply(
    body: ClassBody,
    `type`: String,
    leadingComments: js.Array[Comment] = null,
    loc: js.UndefOr[Null | SourceLocation] = js.undefined,
    range: js.Tuple2[Double, Double] = null,
    superClass: js.UndefOr[Null | Expression] = js.undefined,
    trailingComments: js.Array[Comment] = null
  ): BaseClass = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (!js.isUndefined(loc)) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (!js.isUndefined(superClass)) __obj.updateDynamic("superClass")(superClass.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseClass]
  }
}

