package typings.estree.estreeMod

import typings.estree.estreeStrings.get
import typings.estree.estreeStrings.init
import typings.estree.estreeStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Property
  extends BaseNode
     with Node {
  var computed: Boolean
  var key: Expression
   // Could be an AssignmentProperty
  var kind: init | get | set
  var method: Boolean
  var shorthand: Boolean
  @JSName("type")
  var type_Property: typings.estree.estreeStrings.Property
  var value: Expression | Pattern
}

object Property {
  @scala.inline
  def apply(
    computed: Boolean,
    key: Expression,
    kind: init | get | set,
    method: Boolean,
    shorthand: Boolean,
    `type`: typings.estree.estreeStrings.Property,
    value: Expression | Pattern,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
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

