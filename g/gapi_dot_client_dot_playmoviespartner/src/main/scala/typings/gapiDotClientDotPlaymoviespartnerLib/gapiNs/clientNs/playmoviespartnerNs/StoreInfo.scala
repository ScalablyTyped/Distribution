package typings
package gapiDotClientDotPlaymoviespartnerLib.gapiNs.clientNs.playmoviespartnerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreInfo extends js.Object {
  /** Audio tracks available for this Edit. */
  var audioTracks: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Country where Edit is available in ISO 3166-1 alpha-2 country
    * code.
    * Example: "US".
    */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Edit-level EIDR ID.
    * Example: "10.5240/1489-49A2-3956-4B2D-FE16-6".
    */
  var editLevelEidr: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The number assigned to the episode within a season.
    * Only available on TV Edits.
    * Example: "1".
    */
  var episodeNumber: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the Edit has a 5.1 channel audio track. */
  var hasAudio51: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the Edit has a EST offer. */
  var hasEstOffer: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the Edit has a HD offer. */
  var hasHdOffer: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the Edit has info cards. */
  var hasInfoCards: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the Edit has a SD offer. */
  var hasSdOffer: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the Edit has a VOD offer. */
  var hasVodOffer: js.UndefOr[scala.Boolean] = js.undefined
  /** Timestamp when the Edit went live on the Store. */
  var liveTime: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Knowledge Graph ID associated to this Edit, if available.
    * This ID links the Edit to its knowledge entity, externally accessible
    * at http://freebase.com.
    * In the absense of Title EIDR or Edit EIDR, this ID helps link together
    * multiple Edits across countries.
    * Example: '/m/0ffx29'
    */
  var mid: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default Edit name, usually in the language of the country of
    * origin.
    * Example: "Googlers, The".
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the post-production houses that manage the Edit. */
  var pphNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Google-generated ID identifying the season linked to the Edit.
    * Only available for TV Edits.
    * Example: 'ster23ex'
    */
  var seasonId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default Season name, usually in the language of the country of
    * origin.
    * Only available for TV Edits
    * Example: "Googlers, The - A Brave New World".
    */
  var seasonName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The number assigned to the season within a show.
    * Only available on TV Edits.
    * Example: "1".
    */
  var seasonNumber: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Google-generated ID identifying the show linked to the Edit.
    * Only available for TV Edits.
    * Example: 'et2hsue_x'
    */
  var showId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default Show name, usually in the language of the country of
    * origin.
    * Only available for TV Edits
    * Example: "Googlers, The".
    */
  var showName: js.UndefOr[java.lang.String] = js.undefined
  /** Name of the studio that owns the Edit ordered. */
  var studioName: js.UndefOr[java.lang.String] = js.undefined
  /** Subtitles available for this Edit. */
  var subtitles: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Title-level EIDR ID.
    * Example: "10.5240/1489-49A2-3956-4B2D-FE16-5".
    */
  var titleLevelEidr: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Google-generated ID identifying the trailer linked to the Edit.
    * Example: 'bhd_4e_cx'
    */
  var trailerId: js.UndefOr[java.lang.String] = js.undefined
  /** Edit type, like Movie, Episode or Season. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Google-generated ID identifying the video linked to the Edit.
    * Example: 'gtry456_xc'
    */
  var videoId: js.UndefOr[java.lang.String] = js.undefined
}

object StoreInfo {
  @scala.inline
  def apply(
    audioTracks: js.Array[java.lang.String] = null,
    country: java.lang.String = null,
    editLevelEidr: java.lang.String = null,
    episodeNumber: java.lang.String = null,
    hasAudio51: js.UndefOr[scala.Boolean] = js.undefined,
    hasEstOffer: js.UndefOr[scala.Boolean] = js.undefined,
    hasHdOffer: js.UndefOr[scala.Boolean] = js.undefined,
    hasInfoCards: js.UndefOr[scala.Boolean] = js.undefined,
    hasSdOffer: js.UndefOr[scala.Boolean] = js.undefined,
    hasVodOffer: js.UndefOr[scala.Boolean] = js.undefined,
    liveTime: java.lang.String = null,
    mid: java.lang.String = null,
    name: java.lang.String = null,
    pphNames: js.Array[java.lang.String] = null,
    seasonId: java.lang.String = null,
    seasonName: java.lang.String = null,
    seasonNumber: java.lang.String = null,
    showId: java.lang.String = null,
    showName: java.lang.String = null,
    studioName: java.lang.String = null,
    subtitles: js.Array[java.lang.String] = null,
    titleLevelEidr: java.lang.String = null,
    trailerId: java.lang.String = null,
    `type`: java.lang.String = null,
    videoId: java.lang.String = null
  ): StoreInfo = {
    val __obj = js.Dynamic.literal()
    if (audioTracks != null) __obj.updateDynamic("audioTracks")(audioTracks)
    if (country != null) __obj.updateDynamic("country")(country)
    if (editLevelEidr != null) __obj.updateDynamic("editLevelEidr")(editLevelEidr)
    if (episodeNumber != null) __obj.updateDynamic("episodeNumber")(episodeNumber)
    if (!js.isUndefined(hasAudio51)) __obj.updateDynamic("hasAudio51")(hasAudio51)
    if (!js.isUndefined(hasEstOffer)) __obj.updateDynamic("hasEstOffer")(hasEstOffer)
    if (!js.isUndefined(hasHdOffer)) __obj.updateDynamic("hasHdOffer")(hasHdOffer)
    if (!js.isUndefined(hasInfoCards)) __obj.updateDynamic("hasInfoCards")(hasInfoCards)
    if (!js.isUndefined(hasSdOffer)) __obj.updateDynamic("hasSdOffer")(hasSdOffer)
    if (!js.isUndefined(hasVodOffer)) __obj.updateDynamic("hasVodOffer")(hasVodOffer)
    if (liveTime != null) __obj.updateDynamic("liveTime")(liveTime)
    if (mid != null) __obj.updateDynamic("mid")(mid)
    if (name != null) __obj.updateDynamic("name")(name)
    if (pphNames != null) __obj.updateDynamic("pphNames")(pphNames)
    if (seasonId != null) __obj.updateDynamic("seasonId")(seasonId)
    if (seasonName != null) __obj.updateDynamic("seasonName")(seasonName)
    if (seasonNumber != null) __obj.updateDynamic("seasonNumber")(seasonNumber)
    if (showId != null) __obj.updateDynamic("showId")(showId)
    if (showName != null) __obj.updateDynamic("showName")(showName)
    if (studioName != null) __obj.updateDynamic("studioName")(studioName)
    if (subtitles != null) __obj.updateDynamic("subtitles")(subtitles)
    if (titleLevelEidr != null) __obj.updateDynamic("titleLevelEidr")(titleLevelEidr)
    if (trailerId != null) __obj.updateDynamic("trailerId")(trailerId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (videoId != null) __obj.updateDynamic("videoId")(videoId)
    __obj.asInstanceOf[StoreInfo]
  }
}

