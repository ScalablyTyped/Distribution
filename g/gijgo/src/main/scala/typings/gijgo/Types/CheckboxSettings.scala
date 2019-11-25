package typings.gijgo.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Checkbox
trait CheckboxSettings extends js.Object {
  //Events
  var change: js.UndefOr[js.Function2[/* e */ js.Any, /* state */ String, _]] = js.undefined
  var iconsLibrary: js.UndefOr[String] = js.undefined
  var uiLibrary: js.UndefOr[String] = js.undefined
}

object CheckboxSettings {
  @scala.inline
  def apply(
    change: (/* e */ js.Any, /* state */ String) => _ = null,
    iconsLibrary: String = null,
    uiLibrary: String = null
  ): CheckboxSettings = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2(change))
    if (iconsLibrary != null) __obj.updateDynamic("iconsLibrary")(iconsLibrary.asInstanceOf[js.Any])
    if (uiLibrary != null) __obj.updateDynamic("uiLibrary")(uiLibrary.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxSettings]
  }
}

