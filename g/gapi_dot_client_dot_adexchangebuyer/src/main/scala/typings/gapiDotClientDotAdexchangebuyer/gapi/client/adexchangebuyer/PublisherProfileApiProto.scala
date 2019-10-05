package typings.gapiDotClientDotAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublisherProfileApiProto extends js.Object {
  /** Deprecated: use the seller.account_id. The account id of the seller. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Publisher provided info on its audience. */
  var audience: js.UndefOr[String] = js.undefined
  /** A pitch statement for the buyer */
  var buyerPitchStatement: js.UndefOr[String] = js.undefined
  /** Direct contact for the publisher profile. */
  var directContact: js.UndefOr[String] = js.undefined
  /** Exchange where this publisher profile is from. E.g. AdX, Rubicon etc... */
  var exchange: js.UndefOr[String] = js.undefined
  /** Link to publisher's Google+ page. */
  var googlePlusLink: js.UndefOr[String] = js.undefined
  /** True, if this is the parent profile, which represents all domains owned by the publisher. */
  var isParent: js.UndefOr[Boolean] = js.undefined
  /** True, if this profile is published. Deprecated for state. */
  var isPublished: js.UndefOr[Boolean] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "adexchangebuyer#publisherProfileApiProto". */
  var kind: js.UndefOr[String] = js.undefined
  /** The url to the logo for the publisher. */
  var logoUrl: js.UndefOr[String] = js.undefined
  /** The url for additional marketing and sales materials. */
  var mediaKitLink: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  /** Publisher provided overview. */
  var overview: js.UndefOr[String] = js.undefined
  /** The pair of (seller.account_id, profile_id) uniquely identifies a publisher profile for a given publisher. */
  var profileId: js.UndefOr[Double] = js.undefined
  /** Programmatic contact for the publisher profile. */
  var programmaticContact: js.UndefOr[String] = js.undefined
  /** The list of domains represented in this publisher profile. Empty if this is a parent profile. */
  var publisherDomains: js.UndefOr[js.Array[String]] = js.undefined
  /** Unique Id for publisher profile. */
  var publisherProfileId: js.UndefOr[String] = js.undefined
  /** Publisher provided forecasting information. */
  var publisherProvidedForecast: js.UndefOr[PublisherProvidedForecast] = js.undefined
  /** Link to publisher rate card */
  var rateCardInfoLink: js.UndefOr[String] = js.undefined
  /** Link for a sample content page. */
  var samplePageLink: js.UndefOr[String] = js.undefined
  /** Seller of the publisher profile. */
  var seller: js.UndefOr[Seller] = js.undefined
  /** State of the publisher profile. */
  var state: js.UndefOr[String] = js.undefined
  /** Publisher provided key metrics and rankings. */
  var topHeadlines: js.UndefOr[js.Array[String]] = js.undefined
}

object PublisherProfileApiProto {
  @scala.inline
  def apply(
    accountId: String = null,
    audience: String = null,
    buyerPitchStatement: String = null,
    directContact: String = null,
    exchange: String = null,
    googlePlusLink: String = null,
    isParent: js.UndefOr[Boolean] = js.undefined,
    isPublished: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    logoUrl: String = null,
    mediaKitLink: String = null,
    name: String = null,
    overview: String = null,
    profileId: Int | Double = null,
    programmaticContact: String = null,
    publisherDomains: js.Array[String] = null,
    publisherProfileId: String = null,
    publisherProvidedForecast: PublisherProvidedForecast = null,
    rateCardInfoLink: String = null,
    samplePageLink: String = null,
    seller: Seller = null,
    state: String = null,
    topHeadlines: js.Array[String] = null
  ): PublisherProfileApiProto = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (audience != null) __obj.updateDynamic("audience")(audience)
    if (buyerPitchStatement != null) __obj.updateDynamic("buyerPitchStatement")(buyerPitchStatement)
    if (directContact != null) __obj.updateDynamic("directContact")(directContact)
    if (exchange != null) __obj.updateDynamic("exchange")(exchange)
    if (googlePlusLink != null) __obj.updateDynamic("googlePlusLink")(googlePlusLink)
    if (!js.isUndefined(isParent)) __obj.updateDynamic("isParent")(isParent)
    if (!js.isUndefined(isPublished)) __obj.updateDynamic("isPublished")(isPublished)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (logoUrl != null) __obj.updateDynamic("logoUrl")(logoUrl)
    if (mediaKitLink != null) __obj.updateDynamic("mediaKitLink")(mediaKitLink)
    if (name != null) __obj.updateDynamic("name")(name)
    if (overview != null) __obj.updateDynamic("overview")(overview)
    if (profileId != null) __obj.updateDynamic("profileId")(profileId.asInstanceOf[js.Any])
    if (programmaticContact != null) __obj.updateDynamic("programmaticContact")(programmaticContact)
    if (publisherDomains != null) __obj.updateDynamic("publisherDomains")(publisherDomains)
    if (publisherProfileId != null) __obj.updateDynamic("publisherProfileId")(publisherProfileId)
    if (publisherProvidedForecast != null) __obj.updateDynamic("publisherProvidedForecast")(publisherProvidedForecast)
    if (rateCardInfoLink != null) __obj.updateDynamic("rateCardInfoLink")(rateCardInfoLink)
    if (samplePageLink != null) __obj.updateDynamic("samplePageLink")(samplePageLink)
    if (seller != null) __obj.updateDynamic("seller")(seller)
    if (state != null) __obj.updateDynamic("state")(state)
    if (topHeadlines != null) __obj.updateDynamic("topHeadlines")(topHeadlines)
    __obj.asInstanceOf[PublisherProfileApiProto]
  }
}

