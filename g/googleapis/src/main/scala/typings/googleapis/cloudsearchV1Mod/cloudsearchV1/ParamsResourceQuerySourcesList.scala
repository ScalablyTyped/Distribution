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
  def apply(
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    callback: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    requestOptionsDotdebugOptionsDotenableDebugging: js.UndefOr[Boolean] = js.undefined,
    requestOptionsDotlanguageCode: String = null,
    requestOptionsDotsearchApplicationId: String = null,
    requestOptionsDottimeZone: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): ParamsResourceQuerySourcesList = {
    val __obj = js.Dynamic.literal()
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (!js.isUndefined(requestOptionsDotdebugOptionsDotenableDebugging)) __obj.updateDynamic("requestOptions.debugOptions.enableDebugging")(requestOptionsDotdebugOptionsDotenableDebugging.asInstanceOf[js.Any])
    if (requestOptionsDotlanguageCode != null) __obj.updateDynamic("requestOptions.languageCode")(requestOptionsDotlanguageCode.asInstanceOf[js.Any])
    if (requestOptionsDotsearchApplicationId != null) __obj.updateDynamic("requestOptions.searchApplicationId")(requestOptionsDotsearchApplicationId.asInstanceOf[js.Any])
    if (requestOptionsDottimeZone != null) __obj.updateDynamic("requestOptions.timeZone")(requestOptionsDottimeZone.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceQuerySourcesList]
  }
}

