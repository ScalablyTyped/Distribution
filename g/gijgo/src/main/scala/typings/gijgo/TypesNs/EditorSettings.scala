package typings.gijgo.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Editor
trait EditorSettings extends js.Object {
  var changed: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  //Events
  var changing: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var iconsLibrary: js.UndefOr[String] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var uiLibrary: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object EditorSettings {
  @scala.inline
  def apply(
    changed: /* e */ js.Any => _ = null,
    changing: /* e */ js.Any => _ = null,
    height: Double | String = null,
    iconsLibrary: String = null,
    locale: String = null,
    uiLibrary: String = null,
    width: Double | String = null
  ): EditorSettings = {
    val __obj = js.Dynamic.literal()
    if (changed != null) __obj.updateDynamic("changed")(js.Any.fromFunction1(changed))
    if (changing != null) __obj.updateDynamic("changing")(js.Any.fromFunction1(changing))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (iconsLibrary != null) __obj.updateDynamic("iconsLibrary")(iconsLibrary)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (uiLibrary != null) __obj.updateDynamic("uiLibrary")(uiLibrary)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorSettings]
  }
}

