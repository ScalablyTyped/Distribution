package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetaProperty
  extends BaseNode
     with Expression {
  var meta: Identifier
  var property: Identifier
  @JSName("type")
  var type_MetaProperty: estreeLib.estreeLibStrings.MetaProperty
}

object MetaProperty {
  @scala.inline
  def apply(
    meta: Identifier,
    property: Identifier,
    `type`: estreeLib.estreeLibStrings.MetaProperty,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): MetaProperty = {
    val __obj = js.Dynamic.literal(meta = meta, property = property)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[MetaProperty]
  }
}

