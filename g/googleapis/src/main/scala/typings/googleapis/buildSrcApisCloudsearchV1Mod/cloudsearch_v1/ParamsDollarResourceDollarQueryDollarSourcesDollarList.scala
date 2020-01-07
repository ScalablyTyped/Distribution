package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarQueryDollarSourcesDollarList extends StandardParameters {
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

