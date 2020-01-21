package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectorySite extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  var inpageTagFormats: js.UndefOr[js.Array[String]] = js.undefined
  var interstitialTagFormats: js.UndefOr[js.Array[String]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var settings: js.UndefOr[DirectorySiteSettings] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object DirectorySite {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    idDimensionValue: DimensionValue = null,
    inpageTagFormats: js.Array[String] = null,
    interstitialTagFormats: js.Array[String] = null,
    kind: String = null,
    name: String = null,
    settings: DirectorySiteSettings = null,
    url: String = null
  ): DirectorySite = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue.asInstanceOf[js.Any])
    if (inpageTagFormats != null) __obj.updateDynamic("inpageTagFormats")(inpageTagFormats.asInstanceOf[js.Any])
    if (interstitialTagFormats != null) __obj.updateDynamic("interstitialTagFormats")(interstitialTagFormats.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectorySite]
  }
}

