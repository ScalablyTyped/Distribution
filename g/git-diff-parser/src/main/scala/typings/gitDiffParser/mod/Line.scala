package typings.gitDiffParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Line extends js.Object {
  /** Has line break. Always false for added failes */
  var break: Boolean
  /** The main line number */
  var ln1: Double
  /** New line number (for type normal) */
  var ln2: js.UndefOr[Double] = js.undefined
  /** Content of removed or added string */
  var text: String
  var `type`: LineType
}

object Line {
  @scala.inline
  def apply(
    break: Boolean,
    ln1: Double,
    text: String,
    `type`: LineType,
    ln2: js.UndefOr[Double] = js.undefined
  ): Line = {
    val __obj = js.Dynamic.literal(break = break.asInstanceOf[js.Any], ln1 = ln1.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(ln2)) __obj.updateDynamic("ln2")(ln2.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
}

