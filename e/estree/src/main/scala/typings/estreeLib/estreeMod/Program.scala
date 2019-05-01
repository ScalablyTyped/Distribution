package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Program
  extends BaseNode
     with Node {
  var body: js.Array[Statement | ModuleDeclaration]
  var comments: js.UndefOr[js.Array[Comment]] = js.undefined
  var sourceType: estreeLib.estreeLibStrings.script | estreeLib.estreeLibStrings.module
  @JSName("type")
  var type_Program: estreeLib.estreeLibStrings.Program
}

object Program {
  @scala.inline
  def apply(
    body: js.Array[Statement | ModuleDeclaration],
    sourceType: estreeLib.estreeLibStrings.script | estreeLib.estreeLibStrings.module,
    `type`: estreeLib.estreeLibStrings.Program,
    comments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null,
    trailingComments: js.Array[Comment] = null
  ): Program = {
    val __obj = js.Dynamic.literal(body = body, sourceType = sourceType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[Program]
  }
}

