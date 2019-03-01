package typings
package gijgoLib.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Editor
trait EditorSettings extends js.Object {
  var changed: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  //Events
  var changing: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var iconsLibrary: js.UndefOr[java.lang.String] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var uiLibrary: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object EditorSettings {
  @scala.inline
  def apply(
    changed: js.Function1[/* e */ js.Any, _] = null,
    changing: js.Function1[/* e */ js.Any, _] = null,
    height: scala.Double | java.lang.String = null,
    iconsLibrary: java.lang.String = null,
    locale: java.lang.String = null,
    uiLibrary: java.lang.String = null,
    width: scala.Double | java.lang.String = null
  ): EditorSettings = {
    val __obj = js.Dynamic.literal()
    if (changed != null) __obj.updateDynamic("changed")(changed)
    if (changing != null) __obj.updateDynamic("changing")(changing)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (iconsLibrary != null) __obj.updateDynamic("iconsLibrary")(iconsLibrary)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (uiLibrary != null) __obj.updateDynamic("uiLibrary")(uiLibrary)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorSettings]
  }
}

