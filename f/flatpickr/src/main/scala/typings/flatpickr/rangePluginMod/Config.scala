package typings.flatpickr.rangePluginMod

import typings.flatpickr.flatpickrStrings.left
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var input: js.UndefOr[String | HTMLInputElement] = js.undefined
  var position: js.UndefOr[left] = js.undefined
}

object Config {
  @scala.inline
  def apply(input: String | HTMLInputElement = null, position: left = null): Config = {
    val __obj = js.Dynamic.literal()
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

