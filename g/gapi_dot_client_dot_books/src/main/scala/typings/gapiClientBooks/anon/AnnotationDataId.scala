package typings.gapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnnotationDataId extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** The list of Annotation Data Ids to retrieve. Pagination is ignored if this is set. */
  var annotationDataId: js.UndefOr[String] = js.undefined
  /** The content version for the requested volume. */
  var contentVersion: String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** The requested pixel height for any images. If height is provided width must also be provided. */
  var h: js.UndefOr[Double] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** The ID for the layer to get the annotation data. */
  var layerId: String
  /** The locale information for the data. ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'. */
  var locale: js.UndefOr[String] = js.undefined
  /** Maximum number of results to return */
  var maxResults: js.UndefOr[Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** The value of the nextToken from the previous page. */
  var pageToken: js.UndefOr[String] = js.undefined
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
  /** RFC 3339 timestamp to restrict to items updated prior to this timestamp (exclusive). */
  var updatedMax: js.UndefOr[String] = js.undefined
  /** RFC 3339 timestamp to restrict to items updated since this timestamp (inclusive). */
  var updatedMin: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
  /** The volume to retrieve annotation data for. */
  var volumeId: String
  /** The requested pixel width for any images. If width is provided height must also be provided. */
  var w: js.UndefOr[Double] = js.undefined
}

object AnnotationDataId {
  @scala.inline
  def apply(
    contentVersion: String,
    layerId: String,
    volumeId: String,
    alt: String = null,
    annotationDataId: String = null,
    fields: String = null,
    h: js.UndefOr[Double] = js.undefined,
    key: String = null,
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
    w: js.UndefOr[Double] = js.undefined
  ): AnnotationDataId = {
    val __obj = js.Dynamic.literal(contentVersion = contentVersion.asInstanceOf[js.Any], layerId = layerId.asInstanceOf[js.Any], volumeId = volumeId.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (annotationDataId != null) __obj.updateDynamic("annotationDataId")(annotationDataId.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(h)) __obj.updateDynamic("h")(h.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
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
    if (!js.isUndefined(w)) __obj.updateDynamic("w")(w.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationDataId]
  }
}

