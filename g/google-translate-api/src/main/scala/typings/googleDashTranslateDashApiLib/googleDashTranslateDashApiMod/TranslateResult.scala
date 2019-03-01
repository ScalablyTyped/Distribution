package typings
package googleDashTranslateDashApiLib.googleDashTranslateDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslateResult extends js.Object {
  var from: googleDashTranslateDashApiLib.Anon_Language
  var raw: java.lang.String
  var text: java.lang.String
}

object TranslateResult {
  @scala.inline
  def apply(from: googleDashTranslateDashApiLib.Anon_Language, raw: java.lang.String, text: java.lang.String): TranslateResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("raw")(raw)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[TranslateResult]
  }
}

