package typings.estree.estreeMod

import typings.estree.estreeStrings.Block
import typings.estree.estreeStrings.Line
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends BaseNodeWithoutComments {
  @JSName("type")
  var type_Comment: Line | Block
  var value: String
}

object Comment {
  @scala.inline
  def apply(
    `type`: Line | Block,
    value: String,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null
  ): Comment = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

