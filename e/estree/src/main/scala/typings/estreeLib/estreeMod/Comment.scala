package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends BaseNodeWithoutComments {
  @JSName("type")
  var type_Comment: estreeLib.estreeLibStrings.Line | estreeLib.estreeLibStrings.Block
  var value: java.lang.String
}

object Comment {
  @scala.inline
  def apply(
    `type`: estreeLib.estreeLibStrings.Line | estreeLib.estreeLibStrings.Block,
    value: java.lang.String,
    loc: SourceLocation = null,
    range: js.Tuple2[scala.Double, scala.Double] = null
  ): Comment = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(value)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (range != null) __obj.updateDynamic("range")(range)
    __obj.asInstanceOf[Comment]
  }
}

