package typings.ejDotWebDotAll.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait browserInfoOptions extends js.Object {
  var culture: js.Any
  var isMSPointerEnabled: Boolean
  var name: String
  var version: String
}

object browserInfoOptions {
  @scala.inline
  def apply(culture: js.Any, isMSPointerEnabled: Boolean, name: String, version: String): browserInfoOptions = {
    val __obj = js.Dynamic.literal(culture = culture, isMSPointerEnabled = isMSPointerEnabled, name = name, version = version)
  
    __obj.asInstanceOf[browserInfoOptions]
  }
}

