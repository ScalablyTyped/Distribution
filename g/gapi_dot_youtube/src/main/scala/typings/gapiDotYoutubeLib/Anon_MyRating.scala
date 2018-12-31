package typings
package gapiDotYoutubeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MyRating extends js.Object {
  /**
    * Set this parameter's value to mostPopular to instruct the API to return videos belonging to the chart of most popular videos.
    */
  var chart: java.lang.String
  /**
    * The id parameter specifies a comma-separated list of the YouTube video ID(s) for the resource(s) that are being retrieved. In a video resource, the id property specifies the video's ID.
    */
  var id: java.lang.String
  /**
    * The locale parameter selects a video chart available in the specified locale. If using this parameter, chart must also be set. The parameter value is an BCP 47 locale. Supported locales include ar_AE, ar_DZ, ar_EG, ar_JO, ar_MA, ar_SA, ar_TN, ar_YE, cs_CZ, de_DE, el_GR, en_AU, en_BE, en_CA, en_GB, en_GH, en_IE, en_IL, en_IN, en_KE, en_NG, en_NZ, en_SG, en_UG, en_US, en_ZA, es_AR, es_CL, es_CO, es_ES, es_MX, es_PE, fil_PH, fr_FR, hu_HU, id_ID, it_IT, ja_JP, ko_KR, ms_MY, nl_NL, pl_PL, pt_BR, ru_RU, sv_SE, tr_TR, zh_HK, zh_TW
    */
  var locale: java.lang.String
  /**
    * The maxResults parameter specifies the maximum number of items that should be returned in the result set.
    */
  var maxResults: scala.Double
  /**
    * Set this parameter's value to like or dislike to instruct the API to only return videos liked or disliked by the authenticated user.
    */
  var myRating: java.lang.String
  /**
    * The onBehalfOfContentOwner parameter indicates that the authenticated user is acting on behalf of the content owner specified in the parameter value. This parameter is intended for YouTube content partners that own and manage many different YouTube channels. It allows content owners to authenticate once and get access to all their video and channel data, without having to provide authentication credentials for each individual channel. The actual CMS account that the user authenticates with needs to be linked to the specified YouTube content owner.
    */
  var onBehalfOfContentOwner: java.lang.String
  /**
    * The pageToken parameter identifies a specific page in the result set that should be returned. In an API response, the nextPageToken and prevPageToken properties identify other pages that could be retrieved.
    */
  var pageToken: java.lang.String
  /**
    * The part parameter specifies a comma-separated list of one or more video resource properties that the API response will include. The part names that you can include in the parameter value are id, snippet, contentDetails, player, statistics, status, and topicDetails. If the parameter identifies a property that contains child properties, the child properties will be included in the response. For example, in a video resource, the snippet property contains the channelId, title, description, tags, and categoryId properties. As such, if you set part=snippet, the API response will contain all of those properties.
    */
  var part: java.lang.String
  /**
    * The videoCategoryId parameter selects a video chart based on the category. If using this parameter, chart must also be set.
    */
  var videoCategoryId: java.lang.String
}

