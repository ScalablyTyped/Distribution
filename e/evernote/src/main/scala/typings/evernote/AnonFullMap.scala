package typings.evernote

import typings.std.Map
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFullMap extends js.Object {
  var fullMap: js.UndefOr[Map[String, String]] = js.undefined
  var keysOnly: js.UndefOr[Set[String]] = js.undefined
}

object AnonFullMap {
  @scala.inline
  def apply(fullMap: Map[String, String] = null, keysOnly: Set[String] = null): AnonFullMap = {
    val __obj = js.Dynamic.literal()
    if (fullMap != null) __obj.updateDynamic("fullMap")(fullMap.asInstanceOf[js.Any])
    if (keysOnly != null) __obj.updateDynamic("keysOnly")(keysOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFullMap]
  }
}

