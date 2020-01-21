package typings.fundamentalReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClassNameString extends js.Object {
  var className: js.UndefOr[String] = js.undefined
}

object AnonClassNameString {
  @scala.inline
  def apply(className: String = null): AnonClassNameString = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClassNameString]
  }
}

