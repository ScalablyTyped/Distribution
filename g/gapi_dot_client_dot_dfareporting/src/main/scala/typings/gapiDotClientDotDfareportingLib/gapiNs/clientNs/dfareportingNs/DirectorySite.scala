package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectorySite extends js.Object {
  /** Whether this directory site is active. */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** Directory site contacts. */
  var contactAssignments: js.UndefOr[js.Array[DirectorySiteContactAssignment]] = js.undefined
  /** Country ID of this directory site. This is a read-only field. */
  var countryId: js.UndefOr[java.lang.String] = js.undefined
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
  var currencyId: js.UndefOr[java.lang.String] = js.undefined
  /** Description of this directory site. This is a read-only field. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** ID of this directory site. This is a read-only, auto-generated field. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Dimension value for the ID of this directory site. This is a read-only, auto-generated field. */
  var idDimensionValue: js.UndefOr[DimensionValue] = js.undefined
  /**
    * Tag types for regular placements.
    *
    * Acceptable values are:
    * - "STANDARD"
    * - "IFRAME_JAVASCRIPT_INPAGE"
    * - "INTERNAL_REDIRECT_INPAGE"
    * - "JAVASCRIPT_INPAGE"
    */
  var inpageTagFormats: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Tag types for interstitial placements.
    *
    * Acceptable values are:
    * - "IFRAME_JAVASCRIPT_INTERSTITIAL"
    * - "INTERNAL_REDIRECT_INTERSTITIAL"
    * - "JAVASCRIPT_INTERSTITIAL"
    */
  var interstitialTagFormats: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#directorySite". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this directory site. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Parent directory site ID. */
  var parentId: js.UndefOr[java.lang.String] = js.undefined
  /** Directory site settings. */
  var settings: js.UndefOr[DirectorySiteSettings] = js.undefined
  /** URL of this directory site. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

