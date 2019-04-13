package typings
package firmataLib.firmataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Firmware extends js.Object {
  var name: java.lang.String
  var version: Version
}

object Firmware {
  @scala.inline
  def apply(name: java.lang.String, version: Version): Firmware = {
    val __obj = js.Dynamic.literal(name = name, version = version)
  
    __obj.asInstanceOf[Firmware]
  }
}

