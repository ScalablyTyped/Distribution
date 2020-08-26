package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceQuerySourcesList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Number of sources to return in the response.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * If set, the request will enable debugging features of Cloud Search. Only
    * turn on this field, if asked by Google to help with debugging.
    */
  @JSName("requestOptions.debugOptions.enableDebugging")
  var requestOptionsDotdebugOptionsDotenableDebugging: js.UndefOr[Boolean] = js.native
  /**
    * The BCP-47 language code, such as "en-US" or "sr-Latn". For more
    * information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. For
    * translations.
    */
  @JSName("requestOptions.languageCode")
  var requestOptionsDotlanguageCode: js.UndefOr[String] = js.native
  /**
    * Id of the application created using SearchApplicationsService.
    */
  @JSName("requestOptions.searchApplicationId")
  var requestOptionsDotsearchApplicationId: js.UndefOr[String] = js.native
  /**
    * Current user's time zone id, such as "America/Los_Angeles" or
    * "Australia/Sydney". These IDs are defined by [Unicode Common Locale Data
    * Repository (CLDR)](http://cldr.unicode.org/) project, and currently
    * available in the file
    * [timezone.xml](http://unicode.org/repos/cldr/trunk/common/bcp47/timezone.xml)
    */
  @JSName("requestOptions.timeZone")
  var requestOptionsDottimeZone: js.UndefOr[String] = js.native
}

object ParamsResourceQuerySourcesList {
  @scala.inline
  def apply(): ParamsResourceQuerySourcesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceQuerySourcesList]
  }
  @scala.inline
  implicit class ParamsResourceQuerySourcesListOps[Self <: ParamsResourceQuerySourcesList] (val x: Self) extends AnyVal {
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
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setRequestOptionsDotdebugOptionsDotenableDebugging(value: Boolean): Self = this.set("requestOptions.debugOptions.enableDebugging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestOptionsDotdebugOptionsDotenableDebugging: Self = this.set("requestOptions.debugOptions.enableDebugging", js.undefined)
    @scala.inline
    def setRequestOptionsDotlanguageCode(value: String): Self = this.set("requestOptions.languageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestOptionsDotlanguageCode: Self = this.set("requestOptions.languageCode", js.undefined)
    @scala.inline
    def setRequestOptionsDotsearchApplicationId(value: String): Self = this.set("requestOptions.searchApplicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestOptionsDotsearchApplicationId: Self = this.set("requestOptions.searchApplicationId", js.undefined)
    @scala.inline
    def setRequestOptionsDottimeZone(value: String): Self = this.set("requestOptions.timeZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestOptionsDottimeZone: Self = this.set("requestOptions.timeZone", js.undefined)
  }
  
}

