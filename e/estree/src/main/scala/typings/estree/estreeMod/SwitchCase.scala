package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchCase
  extends BaseNode
     with Node {
  var consequent: js.Array[Statement]
  var test: js.UndefOr[Expression | Null] = js.undefined
  @JSName("type")
  var type_SwitchCase: typings.estree.estreeStrings.SwitchCase
}

object SwitchCase {
  @scala.inline
  def apply(
    consequent: js.Array[Statement],
    `type`: typings.estree.estreeStrings.SwitchCase,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    test: Expression = null,
    trailingComments: js.Array[Comment] = null
  ): SwitchCase = {
    val __obj = js.Dynamic.literal(consequent = consequent)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (test != null) __obj.updateDynamic("test")(test)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[SwitchCase]
  }
}

