package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Project extends js.Object {
  /** Account ID of this project. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Advertiser ID of this project. */
  var advertiserId: js.UndefOr[java.lang.String] = js.undefined
  /** Audience age group of this project. */
  var audienceAgeGroup: js.UndefOr[java.lang.String] = js.undefined
  /** Audience gender of this project. */
  var audienceGender: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Budget of this project in the currency specified by the current account. The value stored in this field represents only the non-fractional amount. For
               * example, for USD, the smallest value that can be represented by this field is 1 US dollar.
               */
  var budget: js.UndefOr[java.lang.String] = js.undefined
  /** Client billing code of this project. */
  var clientBillingCode: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the project client. */
  var clientName: js.UndefOr[java.lang.String] = js.undefined
  /** End date of the project. */
  var endDate: js.UndefOr[java.lang.String] = js.undefined
  /** ID of this project. This is a read-only, auto-generated field. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#project". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Information about the most recent modification of this project. */
  var lastModifiedInfo: js.UndefOr[LastModifiedInfo] = js.undefined
  /** Name of this project. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Overview of this project. */
  var overview: js.UndefOr[java.lang.String] = js.undefined
  /** Start date of the project. */
  var startDate: js.UndefOr[java.lang.String] = js.undefined
  /** Subaccount ID of this project. */
  var subaccountId: js.UndefOr[java.lang.String] = js.undefined
  /** Number of clicks that the advertiser is targeting. */
  var targetClicks: js.UndefOr[java.lang.String] = js.undefined
  /** Number of conversions that the advertiser is targeting. */
  var targetConversions: js.UndefOr[java.lang.String] = js.undefined
  /** CPA that the advertiser is targeting. */
  var targetCpaNanos: js.UndefOr[java.lang.String] = js.undefined
  /** CPC that the advertiser is targeting. */
  var targetCpcNanos: js.UndefOr[java.lang.String] = js.undefined
  /** vCPM from Active View that the advertiser is targeting. */
  var targetCpmActiveViewNanos: js.UndefOr[java.lang.String] = js.undefined
  /** CPM that the advertiser is targeting. */
  var targetCpmNanos: js.UndefOr[java.lang.String] = js.undefined
  /** Number of impressions that the advertiser is targeting. */
  var targetImpressions: js.UndefOr[java.lang.String] = js.undefined
}

