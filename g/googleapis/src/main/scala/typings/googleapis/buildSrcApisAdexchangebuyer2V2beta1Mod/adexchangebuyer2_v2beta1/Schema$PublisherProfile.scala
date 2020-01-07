package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Note: this resource requires whitelisting for access. Please contact your
  * account manager for access to Marketplace resources.  Represents a
  * publisher profile in Marketplace.  All fields are read only. All string
  * fields are free-form text entered by the publisher unless noted otherwise.
  */
@js.native
trait Schema$PublisherProfile extends js.Object {
  /**
    * Description on the publisher&#39;s audience.
    */
  var audienceDescription: js.UndefOr[String] = js.native
  /**
    * Statement explaining what&#39;s unique about publisher&#39;s business,
    * and why buyers should partner with the publisher.
    */
  var buyerPitchStatement: js.UndefOr[String] = js.native
  /**
    * Contact information for direct reservation deals. This is free text
    * entered by the publisher and may include information like names, phone
    * numbers and email addresses.
    */
  var directDealsContact: js.UndefOr[String] = js.native
  /**
    * Name of the publisher profile.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The list of domains represented in this publisher profile. Empty if this
    * is a parent profile. These are top private domains, meaning that these
    * will not contain a string like &quot;photos.google.co.uk/123&quot;, but
    * will instead contain &quot;google.co.uk&quot;.
    */
  var domains: js.UndefOr[js.Array[String]] = js.native
  /**
    * URL to publisher&#39;s Google+ page.
    */
  var googlePlusUrl: js.UndefOr[String] = js.native
  /**
    * A Google public URL to the logo for this publisher profile. The logo is
    * stored as a PNG, JPG, or GIF image.
    */
  var logoUrl: js.UndefOr[String] = js.native
  /**
    * URL to additional marketing and sales materials.
    */
  var mediaKitUrl: js.UndefOr[String] = js.native
  /**
    * Overview of the publisher.
    */
  var overview: js.UndefOr[String] = js.native
  /**
    * Contact information for programmatic deals. This is free text entered by
    * the publisher and may include information like names, phone numbers and
    * email addresses.
    */
  var programmaticDealsContact: js.UndefOr[String] = js.native
  /**
    * Unique ID for publisher profile.
    */
  var publisherProfileId: js.UndefOr[String] = js.native
  /**
    * URL to a publisher rate card.
    */
  var rateCardInfoUrl: js.UndefOr[String] = js.native
  /**
    * URL to a sample content page.
    */
  var samplePageUrl: js.UndefOr[String] = js.native
  /**
    * Seller of the publisher profile.
    */
  var seller: js.UndefOr[Schema$Seller] = js.native
  /**
    * Up to three key metrics and rankings. Max 100 characters each. For
    * example &quot;#1 Mobile News Site for 20 Straight Months&quot;.
    */
  var topHeadlines: js.UndefOr[js.Array[String]] = js.native
}

object Schema$PublisherProfile {
  @scala.inline
  def apply(
    audienceDescription: String = null,
    buyerPitchStatement: String = null,
    directDealsContact: String = null,
    displayName: String = null,
    domains: js.Array[String] = null,
    googlePlusUrl: String = null,
    logoUrl: String = null,
    mediaKitUrl: String = null,
    overview: String = null,
    programmaticDealsContact: String = null,
    publisherProfileId: String = null,
    rateCardInfoUrl: String = null,
    samplePageUrl: String = null,
    seller: Schema$Seller = null,
    topHeadlines: js.Array[String] = null
  ): Schema$PublisherProfile = {
    val __obj = js.Dynamic.literal()
    if (audienceDescription != null) __obj.updateDynamic("audienceDescription")(audienceDescription.asInstanceOf[js.Any])
    if (buyerPitchStatement != null) __obj.updateDynamic("buyerPitchStatement")(buyerPitchStatement.asInstanceOf[js.Any])
    if (directDealsContact != null) __obj.updateDynamic("directDealsContact")(directDealsContact.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (domains != null) __obj.updateDynamic("domains")(domains.asInstanceOf[js.Any])
    if (googlePlusUrl != null) __obj.updateDynamic("googlePlusUrl")(googlePlusUrl.asInstanceOf[js.Any])
    if (logoUrl != null) __obj.updateDynamic("logoUrl")(logoUrl.asInstanceOf[js.Any])
    if (mediaKitUrl != null) __obj.updateDynamic("mediaKitUrl")(mediaKitUrl.asInstanceOf[js.Any])
    if (overview != null) __obj.updateDynamic("overview")(overview.asInstanceOf[js.Any])
    if (programmaticDealsContact != null) __obj.updateDynamic("programmaticDealsContact")(programmaticDealsContact.asInstanceOf[js.Any])
    if (publisherProfileId != null) __obj.updateDynamic("publisherProfileId")(publisherProfileId.asInstanceOf[js.Any])
    if (rateCardInfoUrl != null) __obj.updateDynamic("rateCardInfoUrl")(rateCardInfoUrl.asInstanceOf[js.Any])
    if (samplePageUrl != null) __obj.updateDynamic("samplePageUrl")(samplePageUrl.asInstanceOf[js.Any])
    if (seller != null) __obj.updateDynamic("seller")(seller.asInstanceOf[js.Any])
    if (topHeadlines != null) __obj.updateDynamic("topHeadlines")(topHeadlines.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$PublisherProfile]
  }
}

