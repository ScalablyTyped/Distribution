package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchCase
  extends BaseNode
     with _Node {
  var consequent: js.Array[Statement]
  var test: js.UndefOr[estreeLib.Expression | scala.Null] = js.undefined
  @JSName("type")
  var type_SwitchCase: estreeLib.estreeLibStrings.SwitchCase
}

object SwitchCase {
  @scala.inline
  def apply(
    consequent: js.Array[Statement],
    `type`: estreeLib.estreeLibStrings.SwitchCase,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    test: estreeLib.Expression = null,
    trailingComments: js.Array[Comment] = null
  ): SwitchCase = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("consequent")(consequent)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (test != null) __obj.updateDynamic("test")(test)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[SwitchCase]
  }
}

