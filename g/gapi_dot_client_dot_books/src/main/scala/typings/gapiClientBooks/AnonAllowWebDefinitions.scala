package typings.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowWebDefinitions extends js.Object {
  /** For the dictionary layer. Whether or not to allow web definitions. */
  var allowWebDefinitions: js.UndefOr[Boolean] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** The ID of the annotation data to retrieve. */
  var annotationDataId: String
  /** The content version for the volume you are trying to retrieve. */
  var contentVersion: String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** The requested pixel height for any images. If height is provided width must also be provided. */
  var h: js.UndefOr[Double] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** The ID for the layer to get the annotations. */
  var layerId: String
  /** The locale information for the data. ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'. */
  var locale: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** The requested scale for the image. */
  var scale: js.UndefOr[Double] = js.undefined
  /** String to identify the originator of this request. */
  var source: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
  /** The volume to retrieve annotations for. */
  var volumeId: String
  /** The requested pixel width for any images. If width is provided height must also be provided. */
  var w: js.UndefOr[Double] = js.undefined
}

object AnonAllowWebDefinitions {
  @scala.inline
  def apply(
    annotationDataId: String,
    contentVersion: String,
    layerId: String,
    volumeId: String,
    allowWebDefinitions: js.UndefOr[Boolean] = js.undefined,
    alt: String = null,
    fields: String = null,
    h: Int | Double = null,
    key: String = null,
    locale: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    scale: Int | Double = null,
    source: String = null,
    userIp: String = null,
    w: Int | Double = null
  ): AnonAllowWebDefinitions = {
    val __obj = js.Dynamic.literal(annotationDataId = annotationDataId.asInstanceOf[js.Any], contentVersion = contentVersion.asInstanceOf[js.Any], layerId = layerId.asInstanceOf[js.Any], volumeId = volumeId.asInstanceOf[js.Any])
    if (!js.isUndefined(allowWebDefinitions)) __obj.updateDynamic("allowWebDefinitions")(allowWebDefinitions.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowWebDefinitions]
  }
}

