package typings.estree.estreeMod

import typings.estree.estreeStrings.init
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.estree.estreeMod.Node because Already inherited */ trait AssignmentProperty extends Property {
  @JSName("kind")
  var kind_AssignmentProperty: init
  @JSName("value")
  var value_AssignmentProperty: Pattern
}

object AssignmentProperty {
  @scala.inline
  def apply(
    computed: Boolean,
    key: Expression,
    kind: init,
    method: Boolean,
    shorthand: Boolean,
    `type`: typings.estree.estreeStrings.Property,
    value: Pattern,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): AssignmentProperty = {
    val __obj = js.Dynamic.literal(computed = computed, key = key, kind = kind, method = method, shorthand = shorthand, value = value)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[AssignmentProperty]
  }
}

