package typings.firmata.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Version extends js.Object {
  var major: Double
  var minor: Double
}

object Version {
  @scala.inline
  def apply(major: Double, minor: Double): Version = {
    val __obj = js.Dynamic.literal(major = major, minor = minor)
  
    __obj.asInstanceOf[Version]
  }
}

