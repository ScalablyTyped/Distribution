package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleResponse extends js.Object {
  var displayText: js.UndefOr[java.lang.String] = js.undefined
  var ssml: js.UndefOr[java.lang.String] = js.undefined
  var textToSpeech: js.UndefOr[java.lang.String] = js.undefined
}

object SimpleResponse {
  @scala.inline
  def apply(
    displayText: java.lang.String = null,
    ssml: java.lang.String = null,
    textToSpeech: java.lang.String = null
  ): SimpleResponse = {
    val __obj = js.Dynamic.literal()
    if (displayText != null) __obj.updateDynamic("displayText")(displayText)
    if (ssml != null) __obj.updateDynamic("ssml")(ssml)
    if (textToSpeech != null) __obj.updateDynamic("textToSpeech")(textToSpeech)
    __obj.asInstanceOf[SimpleResponse]
  }
}

