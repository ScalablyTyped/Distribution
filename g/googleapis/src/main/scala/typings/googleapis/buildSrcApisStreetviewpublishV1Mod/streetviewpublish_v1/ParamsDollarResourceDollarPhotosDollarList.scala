package typings.googleapis.buildSrcApisStreetviewpublishV1Mod.streetviewpublish_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarPhotosDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The filter expression. For example:
    * `placeId=ChIJj61dQgK6j4AR4GeTYWZsKWw`.  The only filter supported at the
    * moment is `placeId`.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * The BCP-47 language code, such as "en-US" or "sr-Latn". For more
    * information, see
    * http://www.unicode.org/reports/tr35/#Unicode_locale_identifier. If
    * language_code is unspecified, the user's language preference for Google
    * services is used.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * The maximum number of photos to return. `pageSize` must be non-negative.
    * If `pageSize` is zero or is not provided, the default page size of 100 is
    * used. The number of photos returned in the response may be less than
    * `pageSize` if the number of photos that belong to the user is less than
    * `pageSize`.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The nextPageToken value returned from a previous ListPhotos request, if
    * any.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Specifies if a download URL for the photos bytes should be returned in
    * the Photos response.
    */
  var view: js.UndefOr[String] = js.native
}

