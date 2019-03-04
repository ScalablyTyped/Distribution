package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowWebDefinitions extends js.Object {
  /** For the dictionary layer. Whether or not to allow web definitions. */
  var allowWebDefinitions: js.UndefOr[scala.Boolean] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the annotation data to retrieve. */
  var annotationDataId: java.lang.String
  /** The content version for the volume you are trying to retrieve. */
  var contentVersion: java.lang.String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** The requested pixel height for any images. If height is provided width must also be provided. */
  var h: js.UndefOr[scala.Double] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** The ID for the layer to get the annotations. */
  var layerId: java.lang.String
  /** The locale information for the data. ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'. */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** The requested scale for the image. */
  var scale: js.UndefOr[scala.Double] = js.undefined
  /** String to identify the originator of this request. */
  var source: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
  /** The volume to retrieve annotations for. */
  var volumeId: java.lang.String
  /** The requested pixel width for any images. If width is provided height must also be provided. */
  var w: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AllowWebDefinitions {
  @scala.inline
  def apply(
    annotationDataId: java.lang.String,
    contentVersion: java.lang.String,
    layerId: java.lang.String,
    volumeId: java.lang.String,
    allowWebDefinitions: js.UndefOr[scala.Boolean] = js.undefined,
    alt: java.lang.String = null,
    fields: java.lang.String = null,
    h: scala.Int | scala.Double = null,
    key: java.lang.String = null,
    locale: java.lang.String = null,
    oauth_token: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    scale: scala.Int | scala.Double = null,
    source: java.lang.String = null,
    userIp: java.lang.String = null,
    w: scala.Int | scala.Double = null
  ): Anon_AllowWebDefinitions = {
    val __obj = js.Dynamic.literal(annotationDataId = annotationDataId, contentVersion = contentVersion, layerId = layerId, volumeId = volumeId)
    if (!js.isUndefined(allowWebDefinitions)) __obj.updateDynamic("allowWebDefinitions")(allowWebDefinitions)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllowWebDefinitions]
  }
}

