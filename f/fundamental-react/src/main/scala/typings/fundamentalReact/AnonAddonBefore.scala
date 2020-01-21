package typings.fundamentalReact

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAddonBefore extends js.Object {
  /* Set to **true** enables menu items with add-on before. */
  var addonBefore: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var customStyles: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var disableStyles: js.UndefOr[Boolean] = js.undefined
}

object AnonAddonBefore {
  @scala.inline
  def apply(
    addonBefore: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined
  ): AnonAddonBefore = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addonBefore)) __obj.updateDynamic("addonBefore")(addonBefore.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAddonBefore]
  }
}

