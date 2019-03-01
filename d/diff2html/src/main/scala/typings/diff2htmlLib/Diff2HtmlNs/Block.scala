package typings
package diff2htmlLib.Diff2HtmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Block extends js.Object {
  var header: java.lang.String
  var lines: js.Array[Line]
  var newStartLine: scala.Double
  var oldStartLine: scala.Double
  var oldStartLine2: js.UndefOr[scala.Double] = js.undefined
}

object Block {
  @scala.inline
  def apply(
    header: java.lang.String,
    lines: js.Array[Line],
    newStartLine: scala.Double,
    oldStartLine: scala.Double,
    oldStartLine2: scala.Int | scala.Double = null
  ): Block = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("header")(header)
    __obj.updateDynamic("lines")(lines)
    __obj.updateDynamic("newStartLine")(newStartLine)
    __obj.updateDynamic("oldStartLine")(oldStartLine)
    if (oldStartLine2 != null) __obj.updateDynamic("oldStartLine2")(oldStartLine2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
}

