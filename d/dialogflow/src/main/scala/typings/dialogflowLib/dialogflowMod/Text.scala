package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends js.Object {
  var text: js.Array[java.lang.String]
}

object Text {
  @scala.inline
  def apply(text: js.Array[java.lang.String]): Text = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[Text]
  }
}

