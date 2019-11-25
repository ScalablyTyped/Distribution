package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser._manifest._ThemeTypeAdditionalBackgroundsAlignment
import typings.firefoxDashWebextDashBrowser.browser._manifest._ThemeTypeAdditionalBackgroundsTiling
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Additionalbackgroundsalignment extends js.Object {
  var additional_backgrounds_alignment: js.UndefOr[js.Array[_ThemeTypeAdditionalBackgroundsAlignment]] = js.undefined
  var additional_backgrounds_tiling: js.UndefOr[js.Array[_ThemeTypeAdditionalBackgroundsTiling]] = js.undefined
}

object Anon_Additionalbackgroundsalignment {
  @scala.inline
  def apply(
    additional_backgrounds_alignment: js.Array[_ThemeTypeAdditionalBackgroundsAlignment] = null,
    additional_backgrounds_tiling: js.Array[_ThemeTypeAdditionalBackgroundsTiling] = null
  ): Anon_Additionalbackgroundsalignment = {
    val __obj = js.Dynamic.literal()
    if (additional_backgrounds_alignment != null) __obj.updateDynamic("additional_backgrounds_alignment")(additional_backgrounds_alignment.asInstanceOf[js.Any])
    if (additional_backgrounds_tiling != null) __obj.updateDynamic("additional_backgrounds_tiling")(additional_backgrounds_tiling.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Additionalbackgroundsalignment]
  }
}

