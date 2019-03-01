package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Property
  extends BaseNode
     with _Node {
  var computed: scala.Boolean
  var key: estreeLib.Expression
   // Could be an AssignmentProperty
  var kind: estreeLib.estreeLibStrings.init | estreeLib.estreeLibStrings.get | estreeLib.estreeLibStrings.set
  var method: scala.Boolean
  var shorthand: scala.Boolean
  @JSName("type")
  var type_Property: estreeLib.estreeLibStrings.Property
  var value: estreeLib.Expression | Pattern
}

object Property {
  @scala.inline
  def apply(
    computed: scala.Boolean,
    key: estreeLib.Expression,
    kind: estreeLib.estreeLibStrings.init | estreeLib.estreeLibStrings.get | estreeLib.estreeLibStrings.set,
    method: scala.Boolean,
    shorthand: scala.Boolean,
    `type`: estreeLib.estreeLibStrings.Property,
    value: estreeLib.Expression | Pattern,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): Property = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("computed")(computed)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("shorthand")(shorthand)
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[Property]
  }
}

