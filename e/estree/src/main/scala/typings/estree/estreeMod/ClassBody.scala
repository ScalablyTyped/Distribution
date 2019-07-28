package typings.estree.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassBody
  extends BaseNode
     with Node {
  var body: js.Array[MethodDefinition]
  @JSName("type")
  var type_ClassBody: typings.estree.estreeStrings.ClassBody
}

object ClassBody {
  @scala.inline
  def apply(
    body: js.Array[MethodDefinition],
    `type`: typings.estree.estreeStrings.ClassBody,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): ClassBody = {
    val __obj = js.Dynamic.literal(body = body)
    __obj.updateDynamic("type")(`type`)
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments)
    __obj.asInstanceOf[ClassBody]
  }
}

