package typings.figma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIPostMessageOptions extends js.Object {
  var targetOrigin: js.UndefOr[String] = js.undefined
}

object UIPostMessageOptions {
  @scala.inline
  def apply(targetOrigin: String = null): UIPostMessageOptions = {
    val __obj = js.Dynamic.literal()
    if (targetOrigin != null) __obj.updateDynamic("targetOrigin")(targetOrigin)
    __obj.asInstanceOf[UIPostMessageOptions]
  }
}

