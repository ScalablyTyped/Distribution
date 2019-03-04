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
    val __obj = js.Dynamic.literal(culture = culture, isMSPointerEnabled = isMSPointerEnabled, name = name, version = version)
  
    __obj.asInstanceOf[browserInfoOptions]
  }
}

