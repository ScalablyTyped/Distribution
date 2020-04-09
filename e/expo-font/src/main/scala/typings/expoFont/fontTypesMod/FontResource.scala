package typings.expoFont.fontTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FontResource extends js.Object {
  var display: js.UndefOr[FontDisplay] = js.undefined
  var uri: String | Double
}

object FontResource {
  @scala.inline
  def apply(uri: String | Double, display: FontDisplay = null): FontResource = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontResource]
  }
}

