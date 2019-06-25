package typings
package eslintDashPluginDashReactLib.libTypesMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASTNode
  extends estreeLib.estreeMod.BaseNode
     with /* _ */ org.scalablytyped.runtime.StringDictionary[js.Any]

object ASTNode {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    StringDictionary: /* _ */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    leadingComments: js.Array[estreeLib.estreeMod.Comment] = null,
    loc: estreeLib.estreeMod.SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[estreeLib.estreeMod.Comment] = null
  ): ASTNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ASTNode]
  }
}

