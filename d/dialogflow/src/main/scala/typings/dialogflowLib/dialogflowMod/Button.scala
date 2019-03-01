package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Button extends js.Object {
  var postback: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object Button {
  @scala.inline
  def apply(postback: java.lang.String = null, text: java.lang.String = null): Button = {
    val __obj = js.Dynamic.literal()
    if (postback != null) __obj.updateDynamic("postback")(postback)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Button]
  }
}

