package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metadata extends js.Object {
  var actor: js.UndefOr[js.Array[String]] = js.native
  var album: js.UndefOr[String] = js.native
  var artist: js.UndefOr[js.Array[String]] = js.native
  var broadcaster: js.UndefOr[js.Array[String]] = js.native
  var category: js.UndefOr[String] = js.native
  var contentType: js.UndefOr[String] = js.native
  var copyrightDate: js.UndefOr[Date] = js.native
  var customId: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var director: js.UndefOr[js.Array[String]] = js.native
  var eidr: js.UndefOr[String] = js.native
  var endYear: js.UndefOr[Double] = js.native
  var episodeNumber: js.UndefOr[String] = js.native
  var episodesAreUntitled: js.UndefOr[Boolean] = js.native
  var genre: js.UndefOr[js.Array[String]] = js.native
  var grid: js.UndefOr[String] = js.native
  var hfa: js.UndefOr[String] = js.native
  var infoUrl: js.UndefOr[String] = js.native
  var isan: js.UndefOr[String] = js.native
  var isrc: js.UndefOr[String] = js.native
  var iswc: js.UndefOr[String] = js.native
  var keyword: js.UndefOr[js.Array[String]] = js.native
  var label: js.UndefOr[String] = js.native
  var notes: js.UndefOr[String] = js.native
  var originalReleaseMedium: js.UndefOr[String] = js.native
  var producer: js.UndefOr[js.Array[String]] = js.native
  var ratings: js.UndefOr[js.Array[Rating]] = js.native
  var releaseDate: js.UndefOr[Date] = js.native
  var seasonNumber: js.UndefOr[String] = js.native
  var showCustomId: js.UndefOr[String] = js.native
  var showTitle: js.UndefOr[String] = js.native
  var spokenLanguage: js.UndefOr[String] = js.native
  var startYear: js.UndefOr[Double] = js.native
  var subtitledLanguage: js.UndefOr[js.Array[String]] = js.native
  var title: js.UndefOr[String] = js.native
  var tmsId: js.UndefOr[String] = js.native
  var totalEpisodesExpected: js.UndefOr[Double] = js.native
  var upc: js.UndefOr[String] = js.native
  var writer: js.UndefOr[js.Array[String]] = js.native
}

object Metadata {
  @scala.inline
  def apply(): Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metadata]
  }
  @scala.inline
  implicit class MetadataOps[Self <: Metadata] (val x: Self) extends AnyVal {
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
    def setActorVarargs(value: String*): Self = this.set("actor", js.Array(value :_*))
    @scala.inline
    def setActor(value: js.Array[String]): Self = this.set("actor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActor: Self = this.set("actor", js.undefined)
    @scala.inline
    def setAlbum(value: String): Self = this.set("album", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlbum: Self = this.set("album", js.undefined)
    @scala.inline
    def setArtistVarargs(value: String*): Self = this.set("artist", js.Array(value :_*))
    @scala.inline
    def setArtist(value: js.Array[String]): Self = this.set("artist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtist: Self = this.set("artist", js.undefined)
    @scala.inline
    def setBroadcasterVarargs(value: String*): Self = this.set("broadcaster", js.Array(value :_*))
    @scala.inline
    def setBroadcaster(value: js.Array[String]): Self = this.set("broadcaster", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBroadcaster: Self = this.set("broadcaster", js.undefined)
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategory: Self = this.set("category", js.undefined)
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setCopyrightDate(value: Date): Self = this.set("copyrightDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyrightDate: Self = this.set("copyrightDate", js.undefined)
    @scala.inline
    def setCustomId(value: String): Self = this.set("customId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomId: Self = this.set("customId", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDirectorVarargs(value: String*): Self = this.set("director", js.Array(value :_*))
    @scala.inline
    def setDirector(value: js.Array[String]): Self = this.set("director", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirector: Self = this.set("director", js.undefined)
    @scala.inline
    def setEidr(value: String): Self = this.set("eidr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEidr: Self = this.set("eidr", js.undefined)
    @scala.inline
    def setEndYear(value: Double): Self = this.set("endYear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndYear: Self = this.set("endYear", js.undefined)
    @scala.inline
    def setEpisodeNumber(value: String): Self = this.set("episodeNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEpisodeNumber: Self = this.set("episodeNumber", js.undefined)
    @scala.inline
    def setEpisodesAreUntitled(value: Boolean): Self = this.set("episodesAreUntitled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEpisodesAreUntitled: Self = this.set("episodesAreUntitled", js.undefined)
    @scala.inline
    def setGenreVarargs(value: String*): Self = this.set("genre", js.Array(value :_*))
    @scala.inline
    def setGenre(value: js.Array[String]): Self = this.set("genre", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenre: Self = this.set("genre", js.undefined)
    @scala.inline
    def setGrid(value: String): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    @scala.inline
    def setHfa(value: String): Self = this.set("hfa", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHfa: Self = this.set("hfa", js.undefined)
    @scala.inline
    def setInfoUrl(value: String): Self = this.set("infoUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfoUrl: Self = this.set("infoUrl", js.undefined)
    @scala.inline
    def setIsan(value: String): Self = this.set("isan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsan: Self = this.set("isan", js.undefined)
    @scala.inline
    def setIsrc(value: String): Self = this.set("isrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsrc: Self = this.set("isrc", js.undefined)
    @scala.inline
    def setIswc(value: String): Self = this.set("iswc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIswc: Self = this.set("iswc", js.undefined)
    @scala.inline
    def setKeywordVarargs(value: String*): Self = this.set("keyword", js.Array(value :_*))
    @scala.inline
    def setKeyword(value: js.Array[String]): Self = this.set("keyword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyword: Self = this.set("keyword", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    @scala.inline
    def setOriginalReleaseMedium(value: String): Self = this.set("originalReleaseMedium", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalReleaseMedium: Self = this.set("originalReleaseMedium", js.undefined)
    @scala.inline
    def setProducerVarargs(value: String*): Self = this.set("producer", js.Array(value :_*))
    @scala.inline
    def setProducer(value: js.Array[String]): Self = this.set("producer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProducer: Self = this.set("producer", js.undefined)
    @scala.inline
    def setRatingsVarargs(value: Rating*): Self = this.set("ratings", js.Array(value :_*))
    @scala.inline
    def setRatings(value: js.Array[Rating]): Self = this.set("ratings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRatings: Self = this.set("ratings", js.undefined)
    @scala.inline
    def setReleaseDate(value: Date): Self = this.set("releaseDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleaseDate: Self = this.set("releaseDate", js.undefined)
    @scala.inline
    def setSeasonNumber(value: String): Self = this.set("seasonNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeasonNumber: Self = this.set("seasonNumber", js.undefined)
    @scala.inline
    def setShowCustomId(value: String): Self = this.set("showCustomId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCustomId: Self = this.set("showCustomId", js.undefined)
    @scala.inline
    def setShowTitle(value: String): Self = this.set("showTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowTitle: Self = this.set("showTitle", js.undefined)
    @scala.inline
    def setSpokenLanguage(value: String): Self = this.set("spokenLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpokenLanguage: Self = this.set("spokenLanguage", js.undefined)
    @scala.inline
    def setStartYear(value: Double): Self = this.set("startYear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartYear: Self = this.set("startYear", js.undefined)
    @scala.inline
    def setSubtitledLanguageVarargs(value: String*): Self = this.set("subtitledLanguage", js.Array(value :_*))
    @scala.inline
    def setSubtitledLanguage(value: js.Array[String]): Self = this.set("subtitledLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitledLanguage: Self = this.set("subtitledLanguage", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTmsId(value: String): Self = this.set("tmsId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTmsId: Self = this.set("tmsId", js.undefined)
    @scala.inline
    def setTotalEpisodesExpected(value: Double): Self = this.set("totalEpisodesExpected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalEpisodesExpected: Self = this.set("totalEpisodesExpected", js.undefined)
    @scala.inline
    def setUpc(value: String): Self = this.set("upc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpc: Self = this.set("upc", js.undefined)
    @scala.inline
    def setWriterVarargs(value: String*): Self = this.set("writer", js.Array(value :_*))
    @scala.inline
    def setWriter(value: js.Array[String]): Self = this.set("writer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWriter: Self = this.set("writer", js.undefined)
  }
  
}

