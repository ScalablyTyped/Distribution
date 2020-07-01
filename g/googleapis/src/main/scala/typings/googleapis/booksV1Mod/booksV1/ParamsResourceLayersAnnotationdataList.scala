package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceLayersAnnotationdataList extends StandardParameters {
  /**
    * The list of Annotation Data Ids to retrieve. Pagination is ignored if
    * this is set.
    */
  var annotationDataId: js.UndefOr[js.Array[String]] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The content version for the requested volume.
    */
  var contentVersion: js.UndefOr[String] = js.native
  /**
    * The requested pixel height for any images. If height is provided width
    * must also be provided.
    */
  var h: js.UndefOr[Double] = js.native
  /**
    * The ID for the layer to get the annotation data.
    */
  var layerId: js.UndefOr[String] = js.native
  /**
    * The locale information for the data. ISO-639-1 language and ISO-3166-1
    * country code. Ex: 'en_US'.
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * Maximum number of results to return
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * The value of the nextToken from the previous page.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The requested scale for the image.
    */
  var scale: js.UndefOr[Double] = js.native
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * RFC 3339 timestamp to restrict to items updated prior to this timestamp
    * (exclusive).
    */
  var updatedMax: js.UndefOr[String] = js.native
  /**
    * RFC 3339 timestamp to restrict to items updated since this timestamp
    * (inclusive).
    */
  var updatedMin: js.UndefOr[String] = js.native
  /**
    * The volume to retrieve annotation data for.
    */
  var volumeId: js.UndefOr[String] = js.native
  /**
    * The requested pixel width for any images. If width is provided height
    * must also be provided.
    */
  var w: js.UndefOr[Double] = js.native
}

object ParamsResourceLayersAnnotationdataList {
  @scala.inline
  def apply(
    alt: String = null,
    annotationDataId: js.Array[String] = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    contentVersion: String = null,
    fields: String = null,
    h: js.UndefOr[Double] = js.undefined,
    key: String = null,
    layerId: String = null,
    locale: String = null,
    maxResults: js.UndefOr[Double] = js.undefined,
    oauth_token: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    scale: js.UndefOr[Double] = js.undefined,
    source: String = null,
    updatedMax: String = null,
    updatedMin: String = null,
    userIp: String = null,
    volumeId: String = null,
    w: js.UndefOr[Double] = js.undefined
  ): ParamsResourceLayersAnnotationdataList = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (annotationDataId != null) __obj.updateDynamic("annotationDataId")(annotationDataId.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (contentVersion != null) __obj.updateDynamic("contentVersion")(contentVersion.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(h)) __obj.updateDynamic("h")(h.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (layerId != null) __obj.updateDynamic("layerId")(layerId.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (updatedMax != null) __obj.updateDynamic("updatedMax")(updatedMax.asInstanceOf[js.Any])
    if (updatedMin != null) __obj.updateDynamic("updatedMin")(updatedMin.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId.asInstanceOf[js.Any])
    if (!js.isUndefined(w)) __obj.updateDynamic("w")(w.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceLayersAnnotationdataList]
  }
}

