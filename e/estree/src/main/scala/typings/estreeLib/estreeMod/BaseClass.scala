package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseClass extends BaseNode {
  var body: ClassBody
  var superClass: js.UndefOr[Expression | scala.Null] = js.undefined
}

object BaseClass {
  @scala.inline
  def apply(
    body: ClassBody,
    `type`: java.lang.String,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    superClass: Expression = null,
    trailingComments: js.Array[Comment] = null
  ): BaseClass = {
    val __obj = js.Dynamic.literal(body = body)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (superClass != null) __obj.updateDynamic("superClass")(superClass)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[BaseClass]
  }
}

