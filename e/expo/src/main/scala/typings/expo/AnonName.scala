package typings.expo

import typings.expo.aRMod.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonName extends js.Object {
  var name: String | Null
  var size: Size
}

object AnonName {
  @scala.inline
  def apply(size: Size, name: String = null): AnonName = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonName]
  }
}

