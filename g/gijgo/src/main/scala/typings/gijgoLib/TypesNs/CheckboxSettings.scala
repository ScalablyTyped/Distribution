package typings
package gijgoLib.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Checkbox
trait CheckboxSettings extends js.Object {
  //Events
  var change: js.UndefOr[js.Function2[/* e */ js.Any, /* state */ java.lang.String, _]] = js.undefined
  var iconsLibrary: js.UndefOr[java.lang.String] = js.undefined
  var uiLibrary: js.UndefOr[java.lang.String] = js.undefined
}

object CheckboxSettings {
  @scala.inline
  def apply(
    change: (/* e */ js.Any, /* state */ java.lang.String) => _ = null,
    iconsLibrary: java.lang.String = null,
    uiLibrary: java.lang.String = null
  ): CheckboxSettings = {
    val __obj = js.Dynamic.literal()
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction2(change))
    if (iconsLibrary != null) __obj.updateDynamic("iconsLibrary")(iconsLibrary)
    if (uiLibrary != null) __obj.updateDynamic("uiLibrary")(uiLibrary)
    __obj.asInstanceOf[CheckboxSettings]
  }
}

