package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassDeclaration
  extends BaseClass
     with Class
     with Declaration {
  /** It is null when a class declaration is a part of the `export default class` statement */
  var id: Identifier | Null
  @JSName("type")
  var type_ClassDeclaration: typings.estree.estreeStrings.ClassDeclaration
}

object ClassDeclaration {
  @scala.inline
  def apply(
    body: ClassBody,
    `type`: typings.estree.estreeStrings.ClassDeclaration,
    id: Identifier = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    superClass: Expression = null,
    trailingComments: js.Array[Comment] = null
  ): ClassDeclaration = {
    val __obj = js.Dynamic.literal(body = body)
    __obj.updateDynamic("type")(`type`)
    if (id != null) __obj.updateDynamic("id")(id)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (superClass != null) __obj.updateDynamic("superClass")(superClass)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ClassDeclaration]
  }
}

