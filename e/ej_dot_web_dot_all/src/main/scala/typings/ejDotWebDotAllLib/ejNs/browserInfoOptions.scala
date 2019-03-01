package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait browserInfoOptions extends js.Object {
  var culture: js.Any
  var isMSPointerEnabled: scala.Boolean
  var name: java.lang.String
  var version: java.lang.String
}

object browserInfoOptions {
  @scala.inline
  def apply(
    culture: js.Any,
    isMSPointerEnabled: scala.Boolean,
    name: java.lang.String,
    version: java.lang.String
  ): browserInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("culture")(culture)
    __obj.updateDynamic("isMSPointerEnabled")(isMSPointerEnabled)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[browserInfoOptions]
  }
}

