package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmulatedFormFactor extends js.Object {
  var emulatedFormFactor: js.UndefOr[String] = js.native
  var locale: js.UndefOr[String] = js.native
  var onlyCategories: js.UndefOr[js.Any] = js.native
}

object EmulatedFormFactor {
  @scala.inline
  def apply(emulatedFormFactor: String = null, locale: String = null, onlyCategories: js.Any = null): EmulatedFormFactor = {
    val __obj = js.Dynamic.literal()
    if (emulatedFormFactor != null) __obj.updateDynamic("emulatedFormFactor")(emulatedFormFactor.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (onlyCategories != null) __obj.updateDynamic("onlyCategories")(onlyCategories.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmulatedFormFactor]
  }
}

