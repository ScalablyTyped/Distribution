package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Property
  extends BaseNode
     with Node {
  var computed: scala.Boolean
  var key: Expression
   // Could be an AssignmentProperty
  var kind: estreeLib.estreeLibStrings.init | estreeLib.estreeLibStrings.get | estreeLib.estreeLibStrings.set
  var method: scala.Boolean
  var shorthand: scala.Boolean
  @JSName("type")
  var type_Property: estreeLib.estreeLibStrings.Property
  var value: Expression | Pattern
}

object Property {
  @scala.inline
  def apply(
    computed: scala.Boolean,
    key: Expression,
    kind: estreeLib.estreeLibStrings.init | estreeLib.estreeLibStrings.get | estreeLib.estreeLibStrings.set,
    method: scala.Boolean,
    shorthand: scala.Boolean,
    `type`: estreeLib.estreeLibStrings.Property,
    value: Expression | Pattern,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): Property = {
    val __obj = js.Dynamic.literal(computed = computed, key = key, kind = kind.asInstanceOf[js.Any], method = method, shorthand = shorthand, value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[Property]
  }
}

