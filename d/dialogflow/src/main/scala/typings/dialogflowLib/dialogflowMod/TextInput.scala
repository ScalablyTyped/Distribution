package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInput extends js.Object {
  var languageCode: java.lang.String
  var text: java.lang.String
}

object TextInput {
  @scala.inline
  def apply(languageCode: java.lang.String, text: java.lang.String): TextInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("languageCode")(languageCode)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TextInput]
  }
}

