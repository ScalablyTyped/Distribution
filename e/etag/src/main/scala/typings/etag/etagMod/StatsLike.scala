package typings.etag.etagMod

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
    val __obj = js.Dynamic.literal(ctime = ctime, ino = ino, mtime = mtime, size = size)
  
    __obj.asInstanceOf[StatsLike]
  }
}

