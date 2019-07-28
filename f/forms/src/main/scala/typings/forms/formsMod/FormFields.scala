package typings.forms.formsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormFields extends /* key */ StringDictionary[Field | FormFields]

object FormFields {
  @scala.inline
  def apply(StringDictionary: /* key */ StringDictionary[Field | FormFields] = null): FormFields = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[FormFields]
  }
}

