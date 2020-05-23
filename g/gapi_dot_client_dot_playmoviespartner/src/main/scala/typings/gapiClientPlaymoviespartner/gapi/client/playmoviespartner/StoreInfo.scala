package typings.gapiClientPlaymoviespartner.gapi.client.playmoviespartner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoreInfo extends js.Object {
  /** Audio tracks available for this Edit. */
  var audioTracks: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Country where Edit is available in ISO 3166-1 alpha-2 country
    * code.
    * Example: "US".
    */
  var country: js.UndefOr[String] = js.undefined
  /**
    * Edit-level EIDR ID.
    * Example: "10.5240/1489-49A2-3956-4B2D-FE16-6".
    */
  var editLevelEidr: js.UndefOr[String] = js.undefined
  /**
    * The number assigned to the episode within a season.
    * Only available on TV Edits.
    * Example: "1".
    */
  var episodeNumber: js.UndefOr[String] = js.undefined
  /** Whether the Edit has a 5.1 channel audio track. */
  var hasAudio51: js.UndefOr[Boolean] = js.undefined
  /** Whether the Edit has a EST offer. */
  var hasEstOffer: js.UndefOr[Boolean] = js.undefined
  /** Whether the Edit has a HD offer. */
  var hasHdOffer: js.UndefOr[Boolean] = js.undefined
  /** Whether the Edit has info cards. */
  var hasInfoCards: js.UndefOr[Boolean] = js.undefined
  /** Whether the Edit has a SD offer. */
  var hasSdOffer: js.UndefOr[Boolean] = js.undefined
  /** Whether the Edit has a VOD offer. */
  var hasVodOffer: js.UndefOr[Boolean] = js.undefined
  /** Timestamp when the Edit went live on the Store. */
  var liveTime: js.UndefOr[String] = js.undefined
  /**
    * Knowledge Graph ID associated to this Edit, if available.
    * This ID links the Edit to its knowledge entity, externally accessible
    * at http://freebase.com.
    * In the absense of Title EIDR or Edit EIDR, this ID helps link together
    * multiple Edits across countries.
    * Example: '/m/0ffx29'
    */
  var mid: js.UndefOr[String] = js.undefined
  /**
    * Default Edit name, usually in the language of the country of
    * origin.
    * Example: "Googlers, The".
    */
  var name: js.UndefOr[String] = js.undefined
  /** Name of the post-production houses that manage the Edit. */
  var pphNames: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Google-generated ID identifying the season linked to the Edit.
    * Only available for TV Edits.
    * Example: 'ster23ex'
    */
  var seasonId: js.UndefOr[String] = js.undefined
  /**
    * Default Season name, usually in the language of the country of
    * origin.
    * Only available for TV Edits
    * Example: "Googlers, The - A Brave New World".
    */
  var seasonName: js.UndefOr[String] = js.undefined
  /**
    * The number assigned to the season within a show.
    * Only available on TV Edits.
    * Example: "1".
    */
  var seasonNumber: js.UndefOr[String] = js.undefined
  /**
    * Google-generated ID identifying the show linked to the Edit.
    * Only available for TV Edits.
    * Example: 'et2hsue_x'
    */
  var showId: js.UndefOr[String] = js.undefined
  /**
    * Default Show name, usually in the language of the country of
    * origin.
    * Only available for TV Edits
    * Example: "Googlers, The".
    */
  var showName: js.UndefOr[String] = js.undefined
  /** Name of the studio that owns the Edit ordered. */
  var studioName: js.UndefOr[String] = js.undefined
  /** Subtitles available for this Edit. */
  var subtitles: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Title-level EIDR ID.
    * Example: "10.5240/1489-49A2-3956-4B2D-FE16-5".
    */
  var titleLevelEidr: js.UndefOr[String] = js.undefined
  /**
    * Google-generated ID identifying the trailer linked to the Edit.
    * Example: 'bhd_4e_cx'
    */
  var trailerId: js.UndefOr[String] = js.undefined
  /** Edit type, like Movie, Episode or Season. */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Google-generated ID identifying the video linked to the Edit.
    * Example: 'gtry456_xc'
    */
  var videoId: js.UndefOr[String] = js.undefined
}

object StoreInfo {
  @scala.inline
  def apply(
    audioTracks: js.Array[String] = null,
    country: String = null,
    editLevelEidr: String = null,
    episodeNumber: String = null,
    hasAudio51: js.UndefOr[Boolean] = js.undefined,
    hasEstOffer: js.UndefOr[Boolean] = js.undefined,
    hasHdOffer: js.UndefOr[Boolean] = js.undefined,
    hasInfoCards: js.UndefOr[Boolean] = js.undefined,
    hasSdOffer: js.UndefOr[Boolean] = js.undefined,
    hasVodOffer: js.UndefOr[Boolean] = js.undefined,
    liveTime: String = null,
    mid: String = null,
    name: String = null,
    pphNames: js.Array[String] = null,
    seasonId: String = null,
    seasonName: String = null,
    seasonNumber: String = null,
    showId: String = null,
    showName: String = null,
    studioName: String = null,
    subtitles: js.Array[String] = null,
    titleLevelEidr: String = null,
    trailerId: String = null,
    `type`: String = null,
    videoId: String = null
  ): StoreInfo = {
    val __obj = js.Dynamic.literal()
    if (audioTracks != null) __obj.updateDynamic("audioTracks")(audioTracks.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (editLevelEidr != null) __obj.updateDynamic("editLevelEidr")(editLevelEidr.asInstanceOf[js.Any])
    if (episodeNumber != null) __obj.updateDynamic("episodeNumber")(episodeNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(hasAudio51)) __obj.updateDynamic("hasAudio51")(hasAudio51.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasEstOffer)) __obj.updateDynamic("hasEstOffer")(hasEstOffer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasHdOffer)) __obj.updateDynamic("hasHdOffer")(hasHdOffer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasInfoCards)) __obj.updateDynamic("hasInfoCards")(hasInfoCards.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasSdOffer)) __obj.updateDynamic("hasSdOffer")(hasSdOffer.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasVodOffer)) __obj.updateDynamic("hasVodOffer")(hasVodOffer.get.asInstanceOf[js.Any])
    if (liveTime != null) __obj.updateDynamic("liveTime")(liveTime.asInstanceOf[js.Any])
    if (mid != null) __obj.updateDynamic("mid")(mid.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pphNames != null) __obj.updateDynamic("pphNames")(pphNames.asInstanceOf[js.Any])
    if (seasonId != null) __obj.updateDynamic("seasonId")(seasonId.asInstanceOf[js.Any])
    if (seasonName != null) __obj.updateDynamic("seasonName")(seasonName.asInstanceOf[js.Any])
    if (seasonNumber != null) __obj.updateDynamic("seasonNumber")(seasonNumber.asInstanceOf[js.Any])
    if (showId != null) __obj.updateDynamic("showId")(showId.asInstanceOf[js.Any])
    if (showName != null) __obj.updateDynamic("showName")(showName.asInstanceOf[js.Any])
    if (studioName != null) __obj.updateDynamic("studioName")(studioName.asInstanceOf[js.Any])
    if (subtitles != null) __obj.updateDynamic("subtitles")(subtitles.asInstanceOf[js.Any])
    if (titleLevelEidr != null) __obj.updateDynamic("titleLevelEidr")(titleLevelEidr.asInstanceOf[js.Any])
    if (trailerId != null) __obj.updateDynamic("trailerId")(trailerId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (videoId != null) __obj.updateDynamic("videoId")(videoId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreInfo]
  }
}

