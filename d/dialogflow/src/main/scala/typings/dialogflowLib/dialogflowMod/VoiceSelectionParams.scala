package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoiceSelectionParams extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var ssmlGender: js.UndefOr[js.Any] = js.undefined
}

object VoiceSelectionParams {
  @scala.inline
  def apply(name: java.lang.String = null, ssmlGender: js.Any = null): VoiceSelectionParams = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (ssmlGender != null) __obj.updateDynamic("ssmlGender")(ssmlGender)
    __obj.asInstanceOf[VoiceSelectionParams]
  }
}

