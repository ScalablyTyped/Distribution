package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassDeclaration
  extends BaseClass
     with Class
     with Declaration {
  /** It is null when a class declaration is a part of the `export default class` statement */
  var id: Identifier | scala.Null
  @JSName("type")
  var type_ClassDeclaration: estreeLib.estreeLibStrings.ClassDeclaration
}

object ClassDeclaration {
  @scala.inline
  def apply(
    body: ClassBody,
    `type`: estreeLib.estreeLibStrings.ClassDeclaration,
    id: Identifier = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    superClass: estreeLib.Expression = null,
    trailingComments: js.Array[Comment] = null
  ): ClassDeclaration = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("body")(body)
    if (id != null) __obj.updateDynamic("id")(id)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (superClass != null) __obj.updateDynamic("superClass")(superClass)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ClassDeclaration]
  }
}

