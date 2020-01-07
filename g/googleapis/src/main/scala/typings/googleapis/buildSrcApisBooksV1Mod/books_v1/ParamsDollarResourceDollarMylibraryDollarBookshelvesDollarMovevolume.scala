package typings.googleapis.buildSrcApisBooksV1Mod.books_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarMovevolume extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * ID of bookshelf with the volume.
    */
  var shelf: js.UndefOr[String] = js.native
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * ID of volume to move.
    */
  var volumeId: js.UndefOr[String] = js.native
  /**
    * Position on shelf to move the item (0 puts the item before the current
    * first item, 1 puts it between the first and the second and so on.)
    */
  var volumePosition: js.UndefOr[Double] = js.native
}

object ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarMovevolume {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    shelf: String = null,
    source: String = null,
    userIp: String = null,
    volumeId: String = null,
    volumePosition: Int | Double = null
  ): ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarMovevolume = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (shelf != null) __obj.updateDynamic("shelf")(shelf.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId.asInstanceOf[js.Any])
    if (volumePosition != null) __obj.updateDynamic("volumePosition")(volumePosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarMylibraryDollarBookshelvesDollarMovevolume]
  }
}

