package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectExpression extends BaseNode {
  var properties: js.Array[Property]
  @JSName("type")
  var type_ObjectExpression: estreeLib.estreeLibStrings.ObjectExpression
}

object ObjectExpression {
  @scala.inline
  def apply(
    properties: js.Array[Property],
    `type`: estreeLib.estreeLibStrings.ObjectExpression,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): ObjectExpression = {
    val __obj = js.Dynamic.literal(properties = properties)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ObjectExpression]
  }
}

