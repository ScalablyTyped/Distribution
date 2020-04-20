package typings.etag.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsLike extends js.Object {
  var ctime: Date
  var ino: Double
  var mtime: Date
  var size: Double
}

object StatsLike {
  @scala.inline
  def apply(ctime: Date, ino: Double, mtime: Date, size: Double): StatsLike = {
    val __obj = js.Dynamic.literal(ctime = ctime.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatsLike]
  }
}

