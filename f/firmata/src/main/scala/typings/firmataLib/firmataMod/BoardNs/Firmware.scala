package typings
package firmataLib.firmataMod.BoardNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Firmware]
  }
}

