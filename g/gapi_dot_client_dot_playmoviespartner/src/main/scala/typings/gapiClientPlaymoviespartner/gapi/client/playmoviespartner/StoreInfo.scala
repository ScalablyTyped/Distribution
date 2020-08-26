package typings.gapiClientPlaymoviespartner.gapi.client.playmoviespartner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreInfo extends js.Object {
  /** Audio tracks available for this Edit. */
  var audioTracks: js.UndefOr[js.Array[String]] = js.native
  /**
    * Country where Edit is available in ISO 3166-1 alpha-2 country
    * code.
    * Example: "US".
    */
  var country: js.UndefOr[String] = js.native
  /**
    * Edit-level EIDR ID.
    * Example: "10.5240/1489-49A2-3956-4B2D-FE16-6".
    */
  var editLevelEidr: js.UndefOr[String] = js.native
  /**
    * The number assigned to the episode within a season.
    * Only available on TV Edits.
    * Example: "1".
    */
  var episodeNumber: js.UndefOr[String] = js.native
  /** Whether the Edit has a 5.1 channel audio track. */
  var hasAudio51: js.UndefOr[Boolean] = js.native
  /** Whether the Edit has a EST offer. */
  var hasEstOffer: js.UndefOr[Boolean] = js.native
  /** Whether the Edit has a HD offer. */
  var hasHdOffer: js.UndefOr[Boolean] = js.native
  /** Whether the Edit has info cards. */
  var hasInfoCards: js.UndefOr[Boolean] = js.native
  /** Whether the Edit has a SD offer. */
  var hasSdOffer: js.UndefOr[Boolean] = js.native
  /** Whether the Edit has a VOD offer. */
  var hasVodOffer: js.UndefOr[Boolean] = js.native
  /** Timestamp when the Edit went live on the Store. */
  var liveTime: js.UndefOr[String] = js.native
  /**
    * Knowledge Graph ID associated to this Edit, if available.
    * This ID links the Edit to its knowledge entity, externally accessible
    * at http://freebase.com.
    * In the absense of Title EIDR or Edit EIDR, this ID helps link together
    * multiple Edits across countries.
    * Example: '/m/0ffx29'
    */
  var mid: js.UndefOr[String] = js.native
  /**
    * Default Edit name, usually in the language of the country of
    * origin.
    * Example: "Googlers, The".
    */
  var name: js.UndefOr[String] = js.native
  /** Name of the post-production houses that manage the Edit. */
  var pphNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * Google-generated ID identifying the season linked to the Edit.
    * Only available for TV Edits.
    * Example: 'ster23ex'
    */
  var seasonId: js.UndefOr[String] = js.native
  /**
    * Default Season name, usually in the language of the country of
    * origin.
    * Only available for TV Edits
    * Example: "Googlers, The - A Brave New World".
    */
  var seasonName: js.UndefOr[String] = js.native
  /**
    * The number assigned to the season within a show.
    * Only available on TV Edits.
    * Example: "1".
    */
  var seasonNumber: js.UndefOr[String] = js.native
  /**
    * Google-generated ID identifying the show linked to the Edit.
    * Only available for TV Edits.
    * Example: 'et2hsue_x'
    */
  var showId: js.UndefOr[String] = js.native
  /**
    * Default Show name, usually in the language of the country of
    * origin.
    * Only available for TV Edits
    * Example: "Googlers, The".
    */
  var showName: js.UndefOr[String] = js.native
  /** Name of the studio that owns the Edit ordered. */
  var studioName: js.UndefOr[String] = js.native
  /** Subtitles available for this Edit. */
  var subtitles: js.UndefOr[js.Array[String]] = js.native
  /**
    * Title-level EIDR ID.
    * Example: "10.5240/1489-49A2-3956-4B2D-FE16-5".
    */
  var titleLevelEidr: js.UndefOr[String] = js.native
  /**
    * Google-generated ID identifying the trailer linked to the Edit.
    * Example: 'bhd_4e_cx'
    */
  var trailerId: js.UndefOr[String] = js.native
  /** Edit type, like Movie, Episode or Season. */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Google-generated ID identifying the video linked to the Edit.
    * Example: 'gtry456_xc'
    */
  var videoId: js.UndefOr[String] = js.native
}

object StoreInfo {
  @scala.inline
  def apply(): StoreInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StoreInfo]
  }
  @scala.inline
  implicit class StoreInfoOps[Self <: StoreInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAudioTracksVarargs(value: String*): Self = this.set("audioTracks", js.Array(value :_*))
    @scala.inline
    def setAudioTracks(value: js.Array[String]): Self = this.set("audioTracks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudioTracks: Self = this.set("audioTracks", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setEditLevelEidr(value: String): Self = this.set("editLevelEidr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditLevelEidr: Self = this.set("editLevelEidr", js.undefined)
    @scala.inline
    def setEpisodeNumber(value: String): Self = this.set("episodeNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEpisodeNumber: Self = this.set("episodeNumber", js.undefined)
    @scala.inline
    def setHasAudio51(value: Boolean): Self = this.set("hasAudio51", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasAudio51: Self = this.set("hasAudio51", js.undefined)
    @scala.inline
    def setHasEstOffer(value: Boolean): Self = this.set("hasEstOffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasEstOffer: Self = this.set("hasEstOffer", js.undefined)
    @scala.inline
    def setHasHdOffer(value: Boolean): Self = this.set("hasHdOffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasHdOffer: Self = this.set("hasHdOffer", js.undefined)
    @scala.inline
    def setHasInfoCards(value: Boolean): Self = this.set("hasInfoCards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasInfoCards: Self = this.set("hasInfoCards", js.undefined)
    @scala.inline
    def setHasSdOffer(value: Boolean): Self = this.set("hasSdOffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasSdOffer: Self = this.set("hasSdOffer", js.undefined)
    @scala.inline
    def setHasVodOffer(value: Boolean): Self = this.set("hasVodOffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHasVodOffer: Self = this.set("hasVodOffer", js.undefined)
    @scala.inline
    def setLiveTime(value: String): Self = this.set("liveTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLiveTime: Self = this.set("liveTime", js.undefined)
    @scala.inline
    def setMid(value: String): Self = this.set("mid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMid: Self = this.set("mid", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPphNamesVarargs(value: String*): Self = this.set("pphNames", js.Array(value :_*))
    @scala.inline
    def setPphNames(value: js.Array[String]): Self = this.set("pphNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePphNames: Self = this.set("pphNames", js.undefined)
    @scala.inline
    def setSeasonId(value: String): Self = this.set("seasonId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeasonId: Self = this.set("seasonId", js.undefined)
    @scala.inline
    def setSeasonName(value: String): Self = this.set("seasonName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeasonName: Self = this.set("seasonName", js.undefined)
    @scala.inline
    def setSeasonNumber(value: String): Self = this.set("seasonNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeasonNumber: Self = this.set("seasonNumber", js.undefined)
    @scala.inline
    def setShowId(value: String): Self = this.set("showId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowId: Self = this.set("showId", js.undefined)
    @scala.inline
    def setShowName(value: String): Self = this.set("showName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowName: Self = this.set("showName", js.undefined)
    @scala.inline
    def setStudioName(value: String): Self = this.set("studioName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStudioName: Self = this.set("studioName", js.undefined)
    @scala.inline
    def setSubtitlesVarargs(value: String*): Self = this.set("subtitles", js.Array(value :_*))
    @scala.inline
    def setSubtitles(value: js.Array[String]): Self = this.set("subtitles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitles: Self = this.set("subtitles", js.undefined)
    @scala.inline
    def setTitleLevelEidr(value: String): Self = this.set("titleLevelEidr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleLevelEidr: Self = this.set("titleLevelEidr", js.undefined)
    @scala.inline
    def setTrailerId(value: String): Self = this.set("trailerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrailerId: Self = this.set("trailerId", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setVideoId(value: String): Self = this.set("videoId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoId: Self = this.set("videoId", js.undefined)
  }
  
}

