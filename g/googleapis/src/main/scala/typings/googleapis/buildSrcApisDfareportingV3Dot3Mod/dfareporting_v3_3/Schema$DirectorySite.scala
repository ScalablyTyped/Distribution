package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * DirectorySites contains properties of a website from the Site Directory.
  * Sites need to be added to an account via the Sites resource before they can
  * be assigned to a placement.
  */
@js.native
trait Schema$DirectorySite extends js.Object {
  /**
    * Whether this directory site is active.
    */
  var active: js.UndefOr[Boolean] = js.native
  /**
    * ID of this directory site. This is a read-only, auto-generated field.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Dimension value for the ID of this directory site. This is a read-only,
    * auto-generated field.
    */
  var idDimensionValue: js.UndefOr[Schema$DimensionValue] = js.native
  /**
    * Tag types for regular placements.  Acceptable values are: -
    * &quot;STANDARD&quot; - &quot;IFRAME_JAVASCRIPT_INPAGE&quot; -
    * &quot;INTERNAL_REDIRECT_INPAGE&quot; - &quot;JAVASCRIPT_INPAGE&quot;
    */
  var inpageTagFormats: js.UndefOr[js.Array[String]] = js.native
  /**
    * Tag types for interstitial placements.  Acceptable values are: -
    * &quot;IFRAME_JAVASCRIPT_INTERSTITIAL&quot; -
    * &quot;INTERNAL_REDIRECT_INTERSTITIAL&quot; -
    * &quot;JAVASCRIPT_INTERSTITIAL&quot;
    */
  var interstitialTagFormats: js.UndefOr[js.Array[String]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#directorySite&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this directory site.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Directory site settings.
    */
  var settings: js.UndefOr[Schema$DirectorySiteSettings] = js.native
  /**
    * URL of this directory site.
    */
  var url: js.UndefOr[String] = js.native
}

object Schema$DirectorySite {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    idDimensionValue: Schema$DimensionValue = null,
    inpageTagFormats: js.Array[String] = null,
    interstitialTagFormats: js.Array[String] = null,
    kind: String = null,
    name: String = null,
    settings: Schema$DirectorySiteSettings = null,
    url: String = null
  ): Schema$DirectorySite = {
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
    __obj.asInstanceOf[Schema$DirectorySite]
  }
}

