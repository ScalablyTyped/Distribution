package typings.firmata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Firmware extends js.Object {
  var name: String
  var version: Version
}

object Firmware {
  @scala.inline
  def apply(name: String, version: Version): Firmware = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Firmware]
  }
}

