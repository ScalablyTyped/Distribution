package typings.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectorySite extends js.Object {
  /** Whether this directory site is active. */
  var active: js.UndefOr[Boolean] = js.native
  /** Directory site contacts. */
  var contactAssignments: js.UndefOr[js.Array[DirectorySiteContactAssignment]] = js.native
  /** Country ID of this directory site. This is a read-only field. */
  var countryId: js.UndefOr[String] = js.native
  /**
    * Currency ID of this directory site. This is a read-only field.
    * Possible values are:
    * - "1" for USD
    * - "2" for GBP
    * - "3" for ESP
    * - "4" for SEK
    * - "5" for CAD
    * - "6" for JPY
    * - "7" for DEM
    * - "8" for AUD
    * - "9" for FRF
    * - "10" for ITL
    * - "11" for DKK
    * - "12" for NOK
    * - "13" for FIM
    * - "14" for ZAR
    * - "15" for IEP
    * - "16" for NLG
    * - "17" for EUR
    * - "18" for KRW
    * - "19" for TWD
    * - "20" for SGD
    * - "21" for CNY
    * - "22" for HKD
    * - "23" for NZD
    * - "24" for MYR
    * - "25" for BRL
    * - "26" for PTE
    * - "27" for MXP
    * - "28" for CLP
    * - "29" for TRY
    * - "30" for ARS
    * - "31" for PEN
    * - "32" for ILS
    * - "33" for CHF
    * - "34" for VEF
    * - "35" for COP
    * - "36" for GTQ
    * - "37" for PLN
    * - "39" for INR
    * - "40" for THB
    * - "41" for IDR
    * - "42" for CZK
    * - "43" for RON
    * - "44" for HUF
    * - "45" for RUB
    * - "46" for AED
    * - "47" for BGN
    * - "48" for HRK
    * - "49" for MXN
    */
  var currencyId: js.UndefOr[String] = js.native
  /** Description of this directory site. This is a read-only field. */
  var description: js.UndefOr[String] = js.native
  /** ID of this directory site. This is a read-only, auto-generated field. */
  var id: js.UndefOr[String] = js.native
  /** Dimension value for the ID of this directory site. This is a read-only, auto-generated field. */
  var idDimensionValue: js.UndefOr[DimensionValue] = js.native
  /**
    * Tag types for regular placements.
    *
    * Acceptable values are:
    * - "STANDARD"
    * - "IFRAME_JAVASCRIPT_INPAGE"
    * - "INTERNAL_REDIRECT_INPAGE"
    * - "JAVASCRIPT_INPAGE"
    */
  var inpageTagFormats: js.UndefOr[js.Array[String]] = js.native
  /**
    * Tag types for interstitial placements.
    *
    * Acceptable values are:
    * - "IFRAME_JAVASCRIPT_INTERSTITIAL"
    * - "INTERNAL_REDIRECT_INTERSTITIAL"
    * - "JAVASCRIPT_INTERSTITIAL"
    */
  var interstitialTagFormats: js.UndefOr[js.Array[String]] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#directorySite". */
  var kind: js.UndefOr[String] = js.native
  /** Name of this directory site. */
  var name: js.UndefOr[String] = js.native
  /** Parent directory site ID. */
  var parentId: js.UndefOr[String] = js.native
  /** Directory site settings. */
  var settings: js.UndefOr[DirectorySiteSettings] = js.native
  /** URL of this directory site. */
  var url: js.UndefOr[String] = js.native
}

object DirectorySite {
  @scala.inline
  def apply(): DirectorySite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectorySite]
  }
  @scala.inline
  implicit class DirectorySiteOps[Self <: DirectorySite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setContactAssignmentsVarargs(value: DirectorySiteContactAssignment*): Self = this.set("contactAssignments", js.Array(value :_*))
    @scala.inline
    def setContactAssignments(value: js.Array[DirectorySiteContactAssignment]): Self = this.set("contactAssignments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactAssignments: Self = this.set("contactAssignments", js.undefined)
    @scala.inline
    def setCountryId(value: String): Self = this.set("countryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryId: Self = this.set("countryId", js.undefined)
    @scala.inline
    def setCurrencyId(value: String): Self = this.set("currencyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencyId: Self = this.set("currencyId", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIdDimensionValue(value: DimensionValue): Self = this.set("idDimensionValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdDimensionValue: Self = this.set("idDimensionValue", js.undefined)
    @scala.inline
    def setInpageTagFormatsVarargs(value: String*): Self = this.set("inpageTagFormats", js.Array(value :_*))
    @scala.inline
    def setInpageTagFormats(value: js.Array[String]): Self = this.set("inpageTagFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInpageTagFormats: Self = this.set("inpageTagFormats", js.undefined)
    @scala.inline
    def setInterstitialTagFormatsVarargs(value: String*): Self = this.set("interstitialTagFormats", js.Array(value :_*))
    @scala.inline
    def setInterstitialTagFormats(value: js.Array[String]): Self = this.set("interstitialTagFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterstitialTagFormats: Self = this.set("interstitialTagFormats", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
    @scala.inline
    def setSettings(value: DirectorySiteSettings): Self = this.set("settings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

