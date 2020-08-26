package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lead extends js.Object {
  /** The AdWords Customer ID of the lead. */
  var adwordsCustomerId: js.UndefOr[String] = js.native
  /** Comments lead source gave. */
  var comments: js.UndefOr[String] = js.native
  /** Timestamp of when this lead was created. */
  var createTime: js.UndefOr[String] = js.native
  /** Email address of lead source. */
  var email: js.UndefOr[String] = js.native
  /** Last name of lead source. */
  var familyName: js.UndefOr[String] = js.native
  /** First name of lead source. */
  var givenName: js.UndefOr[String] = js.native
  /** List of reasons for using Google Partner Search and creating a lead. */
  var gpsMotivations: js.UndefOr[js.Array[String]] = js.native
  /** ID of the lead. */
  var id: js.UndefOr[String] = js.native
  /**
    * Language code of the lead's language preference, as defined by
    * <a href="https://tools.ietf.org/html/bcp47">BCP 47</a>
    * (IETF BCP 47, "Tags for Identifying Languages").
    */
  var languageCode: js.UndefOr[String] = js.native
  /** Whether or not the lead signed up for marketing emails */
  var marketingOptIn: js.UndefOr[Boolean] = js.native
  /** The minimum monthly budget lead source is willing to spend. */
  var minMonthlyBudget: js.UndefOr[Money] = js.native
  /** Phone number of lead source. */
  var phoneNumber: js.UndefOr[String] = js.native
  /** The lead's state in relation to the company. */
  var state: js.UndefOr[String] = js.native
  /** Type of lead. */
  var `type`: js.UndefOr[String] = js.native
  /** Website URL of lead source. */
  var websiteUrl: js.UndefOr[String] = js.native
}

object Lead {
  @scala.inline
  def apply(): Lead = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lead]
  }
  @scala.inline
  implicit class LeadOps[Self <: Lead] (val x: Self) extends AnyVal {
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
    def setAdwordsCustomerId(value: String): Self = this.set("adwordsCustomerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdwordsCustomerId: Self = this.set("adwordsCustomerId", js.undefined)
    @scala.inline
    def setComments(value: String): Self = this.set("comments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setFamilyName(value: String): Self = this.set("familyName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamilyName: Self = this.set("familyName", js.undefined)
    @scala.inline
    def setGivenName(value: String): Self = this.set("givenName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGivenName: Self = this.set("givenName", js.undefined)
    @scala.inline
    def setGpsMotivationsVarargs(value: String*): Self = this.set("gpsMotivations", js.Array(value :_*))
    @scala.inline
    def setGpsMotivations(value: js.Array[String]): Self = this.set("gpsMotivations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGpsMotivations: Self = this.set("gpsMotivations", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    @scala.inline
    def setMarketingOptIn(value: Boolean): Self = this.set("marketingOptIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarketingOptIn: Self = this.set("marketingOptIn", js.undefined)
    @scala.inline
    def setMinMonthlyBudget(value: Money): Self = this.set("minMonthlyBudget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinMonthlyBudget: Self = this.set("minMonthlyBudget", js.undefined)
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setWebsiteUrl(value: String): Self = this.set("websiteUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsiteUrl: Self = this.set("websiteUrl", js.undefined)
  }
  
}

