package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectorySite extends js.Object {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var inpageTagFormats: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var interstitialTagFormats: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var settings: js.UndefOr[DirectorySiteSettings] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object DirectorySite {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    idDimensionValue: DimensionValue = null,
    inpageTagFormats: js.Array[java.lang.String] = null,
    interstitialTagFormats: js.Array[java.lang.String] = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    settings: DirectorySiteSettings = null,
    url: java.lang.String = null
  ): DirectorySite = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (id != null) __obj.updateDynamic("id")(id)
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue)
    if (inpageTagFormats != null) __obj.updateDynamic("inpageTagFormats")(inpageTagFormats)
    if (interstitialTagFormats != null) __obj.updateDynamic("interstitialTagFormats")(interstitialTagFormats)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[DirectorySite]
  }
}

