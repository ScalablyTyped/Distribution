package typings.googleapis.booksV1Mod.booksV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceLayersAnnotationdataGet extends StandardParameters {
  /**
    * For the dictionary layer. Whether or not to allow web definitions.
    */
  var allowWebDefinitions: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the annotation data to retrieve.
    */
  var annotationDataId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The content version for the volume you are trying to retrieve.
    */
  var contentVersion: js.UndefOr[String] = js.native
  /**
    * The requested pixel height for any images. If height is provided width
    * must also be provided.
    */
  var h: js.UndefOr[Double] = js.native
  /**
    * The ID for the layer to get the annotations.
    */
  var layerId: js.UndefOr[String] = js.native
  /**
    * The locale information for the data. ISO-639-1 language and ISO-3166-1
    * country code. Ex: 'en_US'.
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * The requested scale for the image.
    */
  var scale: js.UndefOr[Double] = js.native
  /**
    * String to identify the originator of this request.
    */
  var source: js.UndefOr[String] = js.native
  /**
    * The volume to retrieve annotations for.
    */
  var volumeId: js.UndefOr[String] = js.native
  /**
    * The requested pixel width for any images. If width is provided height
    * must also be provided.
    */
  var w: js.UndefOr[Double] = js.native
}

object ParamsResourceLayersAnnotationdataGet {
  @scala.inline
  def apply(
    allowWebDefinitions: js.UndefOr[Boolean] = js.undefined,
    alt: String = null,
    annotationDataId: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
    contentVersion: String = null,
    fields: String = null,
    h: js.UndefOr[Double] = js.undefined,
    key: String = null,
    layerId: String = null,
    locale: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    scale: js.UndefOr[Double] = js.undefined,
    source: String = null,
    userIp: String = null,
    volumeId: String = null,
    w: js.UndefOr[Double] = js.undefined
  ): ParamsResourceLayersAnnotationdataGet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowWebDefinitions)) __obj.updateDynamic("allowWebDefinitions")(allowWebDefinitions.get.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (annotationDataId != null) __obj.updateDynamic("annotationDataId")(annotationDataId.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
    if (contentVersion != null) __obj.updateDynamic("contentVersion")(contentVersion.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(h)) __obj.updateDynamic("h")(h.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (layerId != null) __obj.updateDynamic("layerId")(layerId.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.get.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (!js.isUndefined(scale)) __obj.updateDynamic("scale")(scale.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId.asInstanceOf[js.Any])
    if (!js.isUndefined(w)) __obj.updateDynamic("w")(w.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsResourceLayersAnnotationdataGet]
  }
}

