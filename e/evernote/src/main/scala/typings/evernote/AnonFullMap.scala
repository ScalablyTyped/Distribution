package typings.evernote

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFullMap extends js.Object {
  var fullMap: js.UndefOr[StringDictionary[String]] = js.undefined
  var keysOnly: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonFullMap {
  @scala.inline
  def apply(fullMap: StringDictionary[String] = null, keysOnly: js.Array[String] = null): AnonFullMap = {
    val __obj = js.Dynamic.literal()
    if (fullMap != null) __obj.updateDynamic("fullMap")(fullMap.asInstanceOf[js.Any])
    if (keysOnly != null) __obj.updateDynamic("keysOnly")(keysOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFullMap]
  }
}

