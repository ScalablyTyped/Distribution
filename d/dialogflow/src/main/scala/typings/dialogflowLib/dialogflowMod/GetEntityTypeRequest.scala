package typings
package dialogflowLib.dialogflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEntityTypeRequest extends js.Object {
  var languageCode: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
}

object GetEntityTypeRequest {
  @scala.inline
  def apply(name: java.lang.String, languageCode: java.lang.String = null): GetEntityTypeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    __obj.asInstanceOf[GetEntityTypeRequest]
  }
}

