package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

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
    * Directory site contacts.
    */
  var contactAssignments: js.UndefOr[js.Array[Schema$DirectorySiteContactAssignment]] = js.native
  /**
    * Country ID of this directory site. This is a read-only field.
    */
  var countryId: js.UndefOr[String] = js.native
  /**
    * Currency ID of this directory site. This is a read-only field. Possible
    * values are:  - &quot;1&quot; for USD  - &quot;2&quot; for GBP  -
    * &quot;3&quot; for ESP  - &quot;4&quot; for SEK  - &quot;5&quot; for CAD
    * - &quot;6&quot; for JPY  - &quot;7&quot; for DEM  - &quot;8&quot; for AUD
    * - &quot;9&quot; for FRF  - &quot;10&quot; for ITL  - &quot;11&quot; for
    * DKK  - &quot;12&quot; for NOK  - &quot;13&quot; for FIM  - &quot;14&quot;
    * for ZAR  - &quot;15&quot; for IEP  - &quot;16&quot; for NLG  -
    * &quot;17&quot; for EUR  - &quot;18&quot; for KRW  - &quot;19&quot; for
    * TWD  - &quot;20&quot; for SGD  - &quot;21&quot; for CNY  - &quot;22&quot;
    * for HKD  - &quot;23&quot; for NZD  - &quot;24&quot; for MYR  -
    * &quot;25&quot; for BRL  - &quot;26&quot; for PTE  - &quot;27&quot; for
    * MXP  - &quot;28&quot; for CLP  - &quot;29&quot; for TRY  - &quot;30&quot;
    * for ARS  - &quot;31&quot; for PEN  - &quot;32&quot; for ILS  -
    * &quot;33&quot; for CHF  - &quot;34&quot; for VEF  - &quot;35&quot; for
    * COP  - &quot;36&quot; for GTQ  - &quot;37&quot; for PLN  - &quot;39&quot;
    * for INR  - &quot;40&quot; for THB  - &quot;41&quot; for IDR  -
    * &quot;42&quot; for CZK  - &quot;43&quot; for RON  - &quot;44&quot; for
    * HUF  - &quot;45&quot; for RUB  - &quot;46&quot; for AED  - &quot;47&quot;
    * for BGN  - &quot;48&quot; for HRK  - &quot;49&quot; for MXN  -
    * &quot;50&quot; for NGN
    */
  var currencyId: js.UndefOr[String] = js.native
  /**
    * Description of this directory site. This is a read-only field.
    */
  var description: js.UndefOr[String] = js.native
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
    * Parent directory site ID.
    */
  var parentId: js.UndefOr[String] = js.native
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
    contactAssignments: js.Array[Schema$DirectorySiteContactAssignment] = null,
    countryId: String = null,
    currencyId: String = null,
    description: String = null,
    id: String = null,
    idDimensionValue: Schema$DimensionValue = null,
    inpageTagFormats: js.Array[String] = null,
    interstitialTagFormats: js.Array[String] = null,
    kind: String = null,
    name: String = null,
    parentId: String = null,
    settings: Schema$DirectorySiteSettings = null,
    url: String = null
  ): Schema$DirectorySite = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (contactAssignments != null) __obj.updateDynamic("contactAssignments")(contactAssignments.asInstanceOf[js.Any])
    if (countryId != null) __obj.updateDynamic("countryId")(countryId.asInstanceOf[js.Any])
    if (currencyId != null) __obj.updateDynamic("currencyId")(currencyId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (idDimensionValue != null) __obj.updateDynamic("idDimensionValue")(idDimensionValue.asInstanceOf[js.Any])
    if (inpageTagFormats != null) __obj.updateDynamic("inpageTagFormats")(inpageTagFormats.asInstanceOf[js.Any])
    if (interstitialTagFormats != null) __obj.updateDynamic("interstitialTagFormats")(interstitialTagFormats.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DirectorySite]
  }
}

