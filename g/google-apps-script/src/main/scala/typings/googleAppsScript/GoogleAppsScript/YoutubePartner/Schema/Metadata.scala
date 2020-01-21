package typings.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var actor: js.UndefOr[js.Array[String]] = js.undefined
  var album: js.UndefOr[String] = js.undefined
  var artist: js.UndefOr[js.Array[String]] = js.undefined
  var broadcaster: js.UndefOr[js.Array[String]] = js.undefined
  var category: js.UndefOr[String] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var copyrightDate: js.UndefOr[Date] = js.undefined
  var customId: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var director: js.UndefOr[js.Array[String]] = js.undefined
  var eidr: js.UndefOr[String] = js.undefined
  var endYear: js.UndefOr[Double] = js.undefined
  var episodeNumber: js.UndefOr[String] = js.undefined
  var episodesAreUntitled: js.UndefOr[Boolean] = js.undefined
  var genre: js.UndefOr[js.Array[String]] = js.undefined
  var grid: js.UndefOr[String] = js.undefined
  var hfa: js.UndefOr[String] = js.undefined
  var infoUrl: js.UndefOr[String] = js.undefined
  var isan: js.UndefOr[String] = js.undefined
  var isrc: js.UndefOr[String] = js.undefined
  var iswc: js.UndefOr[String] = js.undefined
  var keyword: js.UndefOr[js.Array[String]] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var notes: js.UndefOr[String] = js.undefined
  var originalReleaseMedium: js.UndefOr[String] = js.undefined
  var producer: js.UndefOr[js.Array[String]] = js.undefined
  var ratings: js.UndefOr[js.Array[Rating]] = js.undefined
  var releaseDate: js.UndefOr[Date] = js.undefined
  var seasonNumber: js.UndefOr[String] = js.undefined
  var showCustomId: js.UndefOr[String] = js.undefined
  var showTitle: js.UndefOr[String] = js.undefined
  var spokenLanguage: js.UndefOr[String] = js.undefined
  var startYear: js.UndefOr[Double] = js.undefined
  var subtitledLanguage: js.UndefOr[js.Array[String]] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var tmsId: js.UndefOr[String] = js.undefined
  var totalEpisodesExpected: js.UndefOr[Double] = js.undefined
  var upc: js.UndefOr[String] = js.undefined
  var writer: js.UndefOr[js.Array[String]] = js.undefined
}

object Metadata {
  @scala.inline
  def apply(
    actor: js.Array[String] = null,
    album: String = null,
    artist: js.Array[String] = null,
    broadcaster: js.Array[String] = null,
    category: String = null,
    contentType: String = null,
    copyrightDate: Date = null,
    customId: String = null,
    description: String = null,
    director: js.Array[String] = null,
    eidr: String = null,
    endYear: Int | Double = null,
    episodeNumber: String = null,
    episodesAreUntitled: js.UndefOr[Boolean] = js.undefined,
    genre: js.Array[String] = null,
    grid: String = null,
    hfa: String = null,
    infoUrl: String = null,
    isan: String = null,
    isrc: String = null,
    iswc: String = null,
    keyword: js.Array[String] = null,
    label: String = null,
    notes: String = null,
    originalReleaseMedium: String = null,
    producer: js.Array[String] = null,
    ratings: js.Array[Rating] = null,
    releaseDate: Date = null,
    seasonNumber: String = null,
    showCustomId: String = null,
    showTitle: String = null,
    spokenLanguage: String = null,
    startYear: Int | Double = null,
    subtitledLanguage: js.Array[String] = null,
    title: String = null,
    tmsId: String = null,
    totalEpisodesExpected: Int | Double = null,
    upc: String = null,
    writer: js.Array[String] = null
  ): Metadata = {
    val __obj = js.Dynamic.literal()
    if (actor != null) __obj.updateDynamic("actor")(actor.asInstanceOf[js.Any])
    if (album != null) __obj.updateDynamic("album")(album.asInstanceOf[js.Any])
    if (artist != null) __obj.updateDynamic("artist")(artist.asInstanceOf[js.Any])
    if (broadcaster != null) __obj.updateDynamic("broadcaster")(broadcaster.asInstanceOf[js.Any])
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (copyrightDate != null) __obj.updateDynamic("copyrightDate")(copyrightDate.asInstanceOf[js.Any])
    if (customId != null) __obj.updateDynamic("customId")(customId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (director != null) __obj.updateDynamic("director")(director.asInstanceOf[js.Any])
    if (eidr != null) __obj.updateDynamic("eidr")(eidr.asInstanceOf[js.Any])
    if (endYear != null) __obj.updateDynamic("endYear")(endYear.asInstanceOf[js.Any])
    if (episodeNumber != null) __obj.updateDynamic("episodeNumber")(episodeNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(episodesAreUntitled)) __obj.updateDynamic("episodesAreUntitled")(episodesAreUntitled.asInstanceOf[js.Any])
    if (genre != null) __obj.updateDynamic("genre")(genre.asInstanceOf[js.Any])
    if (grid != null) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (hfa != null) __obj.updateDynamic("hfa")(hfa.asInstanceOf[js.Any])
    if (infoUrl != null) __obj.updateDynamic("infoUrl")(infoUrl.asInstanceOf[js.Any])
    if (isan != null) __obj.updateDynamic("isan")(isan.asInstanceOf[js.Any])
    if (isrc != null) __obj.updateDynamic("isrc")(isrc.asInstanceOf[js.Any])
    if (iswc != null) __obj.updateDynamic("iswc")(iswc.asInstanceOf[js.Any])
    if (keyword != null) __obj.updateDynamic("keyword")(keyword.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (originalReleaseMedium != null) __obj.updateDynamic("originalReleaseMedium")(originalReleaseMedium.asInstanceOf[js.Any])
    if (producer != null) __obj.updateDynamic("producer")(producer.asInstanceOf[js.Any])
    if (ratings != null) __obj.updateDynamic("ratings")(ratings.asInstanceOf[js.Any])
    if (releaseDate != null) __obj.updateDynamic("releaseDate")(releaseDate.asInstanceOf[js.Any])
    if (seasonNumber != null) __obj.updateDynamic("seasonNumber")(seasonNumber.asInstanceOf[js.Any])
    if (showCustomId != null) __obj.updateDynamic("showCustomId")(showCustomId.asInstanceOf[js.Any])
    if (showTitle != null) __obj.updateDynamic("showTitle")(showTitle.asInstanceOf[js.Any])
    if (spokenLanguage != null) __obj.updateDynamic("spokenLanguage")(spokenLanguage.asInstanceOf[js.Any])
    if (startYear != null) __obj.updateDynamic("startYear")(startYear.asInstanceOf[js.Any])
    if (subtitledLanguage != null) __obj.updateDynamic("subtitledLanguage")(subtitledLanguage.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (tmsId != null) __obj.updateDynamic("tmsId")(tmsId.asInstanceOf[js.Any])
    if (totalEpisodesExpected != null) __obj.updateDynamic("totalEpisodesExpected")(totalEpisodesExpected.asInstanceOf[js.Any])
    if (upc != null) __obj.updateDynamic("upc")(upc.asInstanceOf[js.Any])
    if (writer != null) __obj.updateDynamic("writer")(writer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metadata]
  }
}

