package typings.fsDashTreeDashDiff.fsDashTreeDashDiffMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry extends js.Object {
  var mode: Double
  var mtime: Date
  var relativePath: String
  var size: Double
  def isDirectory(): Boolean
}

object Entry {
  @scala.inline
  def apply(isDirectory: () => Boolean, mode: Double, mtime: Date, relativePath: String, size: Double): Entry = {
    val __obj = js.Dynamic.literal(isDirectory = js.Any.fromFunction0(isDirectory), mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], relativePath = relativePath.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Entry]
  }
}

