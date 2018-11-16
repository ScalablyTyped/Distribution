package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PublisherProfileApiProto extends js.Object {
  /** Deprecated: use the seller.account_id. The account id of the seller. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Publisher provided info on its audience. */
  var audience: js.UndefOr[java.lang.String] = js.undefined
  /** A pitch statement for the buyer */
  var buyerPitchStatement: js.UndefOr[java.lang.String] = js.undefined
  /** Direct contact for the publisher profile. */
  var directContact: js.UndefOr[java.lang.String] = js.undefined
  /** Exchange where this publisher profile is from. E.g. AdX, Rubicon etc... */
  var exchange: js.UndefOr[java.lang.String] = js.undefined
  /** Link to publisher's Google+ page. */
  var googlePlusLink: js.UndefOr[java.lang.String] = js.undefined
  /** True, if this is the parent profile, which represents all domains owned by the publisher. */
  var isParent: js.UndefOr[scala.Boolean] = js.undefined
  /** True, if this profile is published. Deprecated for state. */
  var isPublished: js.UndefOr[scala.Boolean] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "adexchangebuyer#publisherProfileApiProto". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The url to the logo for the publisher. */
  var logoUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The url for additional marketing and sales materials. */
  var mediaKitLink: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Publisher provided overview. */
  var overview: js.UndefOr[java.lang.String] = js.undefined
  /** The pair of (seller.account_id, profile_id) uniquely identifies a publisher profile for a given publisher. */
  var profileId: js.UndefOr[scala.Double] = js.undefined
  /** Programmatic contact for the publisher profile. */
  var programmaticContact: js.UndefOr[java.lang.String] = js.undefined
  /** The list of domains represented in this publisher profile. Empty if this is a parent profile. */
  var publisherDomains: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Unique Id for publisher profile. */
  var publisherProfileId: js.UndefOr[java.lang.String] = js.undefined
  /** Publisher provided forecasting information. */
  var publisherProvidedForecast: js.UndefOr[PublisherProvidedForecast] = js.undefined
  /** Link to publisher rate card */
  var rateCardInfoLink: js.UndefOr[java.lang.String] = js.undefined
  /** Link for a sample content page. */
  var samplePageLink: js.UndefOr[java.lang.String] = js.undefined
  /** Seller of the publisher profile. */
  var seller: js.UndefOr[Seller] = js.undefined
  /** State of the publisher profile. */
  var state: js.UndefOr[java.lang.String] = js.undefined
  /** Publisher provided key metrics and rankings. */
  var topHeadlines: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

