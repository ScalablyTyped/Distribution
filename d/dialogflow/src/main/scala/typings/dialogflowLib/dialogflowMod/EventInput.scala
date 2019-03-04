package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventInput extends js.Object {
  var languageCode: java.lang.String
  var name: java.lang.String
  var parameters: js.UndefOr[js.Any] = js.undefined
}

object EventInput {
  @scala.inline
  def apply(languageCode: java.lang.String, name: java.lang.String, parameters: js.Any = null): EventInput = {
    val __obj = js.Dynamic.literal(languageCode = languageCode, name = name)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    __obj.asInstanceOf[EventInput]
  }
}

