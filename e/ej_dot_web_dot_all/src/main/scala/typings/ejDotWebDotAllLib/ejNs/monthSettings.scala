package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait monthSettings extends js.Object {
  var names: js.Array[java.lang.String]
  var namesAbbr: js.Array[java.lang.String]
}

object monthSettings {
  @scala.inline
  def apply(names: js.Array[java.lang.String], namesAbbr: js.Array[java.lang.String]): monthSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("names")(names)
    __obj.updateDynamic("namesAbbr")(namesAbbr)
    __obj.asInstanceOf[monthSettings]
  }
}

