package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmptyStatement
  extends BaseNode
     with Statement {
  @JSName("type")
  var type_EmptyStatement: estreeLib.estreeLibStrings.EmptyStatement
}

object EmptyStatement {
  @scala.inline
  def apply(
    `type`: estreeLib.estreeLibStrings.EmptyStatement,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): EmptyStatement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[EmptyStatement]
  }
}

