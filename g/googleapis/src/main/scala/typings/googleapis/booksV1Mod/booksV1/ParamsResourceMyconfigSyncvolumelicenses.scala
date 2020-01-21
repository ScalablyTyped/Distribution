package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceMyconfigSyncvolumelicenses extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The device/version ID from which to release the restriction.
    */
  var cpksver: js.UndefOr[String] = js.native
  /**
    * List of features supported by the client, i.e., 'RENTALS'
    */
  var features: js.UndefOr[js.Array[String]] = js.native
  /**
    * Set to true to include non-comics series. Defaults to false.
    */
  var includeNonComicsSeries: js.UndefOr[Boolean] = js.native
  /**
    * ISO-639-1, ISO-3166-1 codes for message localization, i.e. en_US.
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * The client nonce value.
    */
  var nonce: js.UndefOr[String] = js.native
  /**
    * Set to true to show pre-ordered books. Defaults to false.
    */
  var showPreorders: js.UndefOr[Boolean] = js.native
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * The volume(s) to request download restrictions for.
    */
  var volumeIds: js.UndefOr[js.Array[String]] = js.native
}

object ParamsResourceMyconfigSyncvolumelicenses {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    cpksver: String = null,
    features: js.Array[String] = null,
    fields: String = null,
    includeNonComicsSeries: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    locale: String = null,
    nonce: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    showPreorders: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    userIp: String = null,
    volumeIds: js.Array[String] = null
  ): ParamsResourceMyconfigSyncvolumelicenses = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (cpksver != null) __obj.updateDynamic("cpksver")(cpksver.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNonComicsSeries)) __obj.updateDynamic("includeNonComicsSeries")(includeNonComicsSeries.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (!js.isUndefined(showPreorders)) __obj.updateDynamic("showPreorders")(showPreorders.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (volumeIds != null) __obj.updateDynamic("volumeIds")(volumeIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceMyconfigSyncvolumelicenses]
  }
}

