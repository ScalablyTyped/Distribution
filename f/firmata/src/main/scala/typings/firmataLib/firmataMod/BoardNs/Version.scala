package typings
package firmataLib.firmataMod.BoardNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Version extends js.Object {
  var major: scala.Double
  var minor: scala.Double
}

object Version {
  @scala.inline
  def apply(major: scala.Double, minor: scala.Double): Version = {
    val __obj = js.Dynamic.literal(major = major, minor = minor)
  
    __obj.asInstanceOf[Version]
  }
}

