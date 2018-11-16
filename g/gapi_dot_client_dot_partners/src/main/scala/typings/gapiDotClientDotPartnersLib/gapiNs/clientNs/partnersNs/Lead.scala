package typings
package gapiDotClientDotPartnersLib.gapiNs.clientNs.partnersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Lead extends js.Object {
  /** The AdWords Customer ID of the lead. */
  var adwordsCustomerId: js.UndefOr[java.lang.String] = js.undefined
  /** Comments lead source gave. */
  var comments: js.UndefOr[java.lang.String] = js.undefined
  /** Timestamp of when this lead was created. */
  var createTime: js.UndefOr[java.lang.String] = js.undefined
  /** Email address of lead source. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** Last name of lead source. */
  var familyName: js.UndefOr[java.lang.String] = js.undefined
  /** First name of lead source. */
  var givenName: js.UndefOr[java.lang.String] = js.undefined
  /** List of reasons for using Google Partner Search and creating a lead. */
  var gpsMotivations: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** ID of the lead. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Language code of the lead's language preference, as defined by
               * <a href="https://tools.ietf.org/html/bcp47">BCP 47</a>
               * (IETF BCP 47, "Tags for Identifying Languages").
               */
  var languageCode: js.UndefOr[java.lang.String] = js.undefined
  /** Whether or not the lead signed up for marketing emails */
  var marketingOptIn: js.UndefOr[scala.Boolean] = js.undefined
  /** The minimum monthly budget lead source is willing to spend. */
  var minMonthlyBudget: js.UndefOr[Money] = js.undefined
  /** Phone number of lead source. */
  var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
  /** The lead's state in relation to the company. */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** Type of lead. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** Website URL of lead source. */
  var websiteUrl: js.UndefOr[java.lang.String] = js.undefined
}

