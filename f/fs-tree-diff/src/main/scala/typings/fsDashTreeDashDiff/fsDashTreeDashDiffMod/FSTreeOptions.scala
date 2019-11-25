package typings.fsDashTreeDashDiff.fsDashTreeDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FSTreeOptions extends js.Object {
  var entries: js.Array[Entry]
  var sortAndExpand: Boolean
}

object FSTreeOptions {
  @scala.inline
  def apply(entries: js.Array[Entry], sortAndExpand: Boolean): FSTreeOptions = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], sortAndExpand = sortAndExpand.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FSTreeOptions]
  }
}

