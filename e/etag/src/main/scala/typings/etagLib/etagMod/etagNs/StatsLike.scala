package typings
package etagLib.etagMod.etagNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsLike extends js.Object {
  var ctime: stdLib.Date
  var ino: scala.Double
  var mtime: stdLib.Date
  var size: scala.Double
}

object StatsLike {
  @scala.inline
  def apply(ctime: stdLib.Date, ino: scala.Double, mtime: stdLib.Date, size: scala.Double): StatsLike = {
    val __obj = js.Dynamic.literal(ctime = ctime, ino = ino, mtime = mtime, size = size)
  
    __obj.asInstanceOf[StatsLike]
  }
}

