package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltAnnotationDataId extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** The list of Annotation Data Ids to retrieve. Pagination is ignored if this is set. */
  var annotationDataId: js.UndefOr[java.lang.String] = js.undefined
  /** The content version for the requested volume. */
  var contentVersion: java.lang.String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** The requested pixel height for any images. If height is provided width must also be provided. */
  var h: js.UndefOr[scala.Double] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** The ID for the layer to get the annotation data. */
  var layerId: java.lang.String
  /** The locale information for the data. ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'. */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum number of results to return */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** The value of the nextToken from the previous page. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
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
  /** RFC 3339 timestamp to restrict to items updated prior to this timestamp (exclusive). */
  var updatedMax: js.UndefOr[java.lang.String] = js.undefined
  /** RFC 3339 timestamp to restrict to items updated since this timestamp (inclusive). */
  var updatedMin: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
  /** The volume to retrieve annotation data for. */
  var volumeId: java.lang.String
  /** The requested pixel width for any images. If width is provided height must also be provided. */
  var w: js.UndefOr[scala.Double] = js.undefined
}

object Anon_AltAnnotationDataId {
  @scala.inline
  def apply(
    contentVersion: java.lang.String,
    layerId: java.lang.String,
    volumeId: java.lang.String,
    alt: java.lang.String = null,
    annotationDataId: java.lang.String = null,
    fields: java.lang.String = null,
    h: scala.Int | scala.Double = null,
    key: java.lang.String = null,
    locale: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    oauth_token: java.lang.String = null,
    pageToken: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    scale: scala.Int | scala.Double = null,
    source: java.lang.String = null,
    updatedMax: java.lang.String = null,
    updatedMin: java.lang.String = null,
    userIp: java.lang.String = null,
    w: scala.Int | scala.Double = null
  ): Anon_AltAnnotationDataId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentVersion")(contentVersion)
    __obj.updateDynamic("layerId")(layerId)
    __obj.updateDynamic("volumeId")(volumeId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (annotationDataId != null) __obj.updateDynamic("annotationDataId")(annotationDataId)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (h != null) __obj.updateDynamic("h")(h.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (updatedMax != null) __obj.updateDynamic("updatedMax")(updatedMax)
    if (updatedMin != null) __obj.updateDynamic("updatedMin")(updatedMin)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    if (w != null) __obj.updateDynamic("w")(w.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AltAnnotationDataId]
  }
}

