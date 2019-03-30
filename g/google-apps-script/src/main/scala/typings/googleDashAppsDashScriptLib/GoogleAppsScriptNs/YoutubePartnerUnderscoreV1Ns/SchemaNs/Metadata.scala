package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.YoutubePartnerUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var actor: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var album: js.UndefOr[java.lang.String] = js.undefined
  var artist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var broadcaster: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var category: js.UndefOr[java.lang.String] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var copyrightDate: js.UndefOr[Date] = js.undefined
  var customId: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var director: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var eidr: js.UndefOr[java.lang.String] = js.undefined
  var endYear: js.UndefOr[scala.Double] = js.undefined
  var episodeNumber: js.UndefOr[java.lang.String] = js.undefined
  var episodesAreUntitled: js.UndefOr[scala.Boolean] = js.undefined
  var genre: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var grid: js.UndefOr[java.lang.String] = js.undefined
  var hfa: js.UndefOr[java.lang.String] = js.undefined
  var infoUrl: js.UndefOr[java.lang.String] = js.undefined
  var isan: js.UndefOr[java.lang.String] = js.undefined
  var isrc: js.UndefOr[java.lang.String] = js.undefined
  var iswc: js.UndefOr[java.lang.String] = js.undefined
  var keyword: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var notes: js.UndefOr[java.lang.String] = js.undefined
  var originalReleaseMedium: js.UndefOr[java.lang.String] = js.undefined
  var producer: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var ratings: js.UndefOr[js.Array[Rating]] = js.undefined
  var releaseDate: js.UndefOr[Date] = js.undefined
  var seasonNumber: js.UndefOr[java.lang.String] = js.undefined
  var showCustomId: js.UndefOr[java.lang.String] = js.undefined
  var showTitle: js.UndefOr[java.lang.String] = js.undefined
  var spokenLanguage: js.UndefOr[java.lang.String] = js.undefined
  var startYear: js.UndefOr[scala.Double] = js.undefined
  var subtitledLanguage: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var tmsId: js.UndefOr[java.lang.String] = js.undefined
  var totalEpisodesExpected: js.UndefOr[scala.Double] = js.undefined
  var upc: js.UndefOr[java.lang.String] = js.undefined
  var writer: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Metadata {
  @scala.inline
  def apply(
    actor: js.Array[java.lang.String] = null,
    album: java.lang.String = null,
    artist: js.Array[java.lang.String] = null,
    broadcaster: js.Array[java.lang.String] = null,
    category: java.lang.String = null,
    contentType: java.lang.String = null,
    copyrightDate: Date = null,
    customId: java.lang.String = null,
    description: java.lang.String = null,
    director: js.Array[java.lang.String] = null,
    eidr: java.lang.String = null,
    endYear: scala.Int | scala.Double = null,
    episodeNumber: java.lang.String = null,
    episodesAreUntitled: js.UndefOr[scala.Boolean] = js.undefined,
    genre: js.Array[java.lang.String] = null,
    grid: java.lang.String = null,
    hfa: java.lang.String = null,
    infoUrl: java.lang.String = null,
    isan: java.lang.String = null,
    isrc: java.lang.String = null,
    iswc: java.lang.String = null,
    keyword: js.Array[java.lang.String] = null,
    label: java.lang.String = null,
    notes: java.lang.String = null,
    originalReleaseMedium: java.lang.String = null,
    producer: js.Array[java.lang.String] = null,
    ratings: js.Array[Rating] = null,
    releaseDate: Date = null,
    seasonNumber: java.lang.String = null,
    showCustomId: java.lang.String = null,
    showTitle: java.lang.String = null,
    spokenLanguage: java.lang.String = null,
    startYear: scala.Int | scala.Double = null,
    subtitledLanguage: js.Array[java.lang.String] = null,
    title: java.lang.String = null,
    tmsId: java.lang.String = null,
    totalEpisodesExpected: scala.Int | scala.Double = null,
    upc: java.lang.String = null,
    writer: js.Array[java.lang.String] = null
  ): Metadata = {
    val __obj = js.Dynamic.literal()
    if (actor != null) __obj.updateDynamic("actor")(actor)
    if (album != null) __obj.updateDynamic("album")(album)
    if (artist != null) __obj.updateDynamic("artist")(artist)
    if (broadcaster != null) __obj.updateDynamic("broadcaster")(broadcaster)
    if (category != null) __obj.updateDynamic("category")(category)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (copyrightDate != null) __obj.updateDynamic("copyrightDate")(copyrightDate)
    if (customId != null) __obj.updateDynamic("customId")(customId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (director != null) __obj.updateDynamic("director")(director)
    if (eidr != null) __obj.updateDynamic("eidr")(eidr)
    if (endYear != null) __obj.updateDynamic("endYear")(endYear.asInstanceOf[js.Any])
    if (episodeNumber != null) __obj.updateDynamic("episodeNumber")(episodeNumber)
    if (!js.isUndefined(episodesAreUntitled)) __obj.updateDynamic("episodesAreUntitled")(episodesAreUntitled)
    if (genre != null) __obj.updateDynamic("genre")(genre)
    if (grid != null) __obj.updateDynamic("grid")(grid)
    if (hfa != null) __obj.updateDynamic("hfa")(hfa)
    if (infoUrl != null) __obj.updateDynamic("infoUrl")(infoUrl)
    if (isan != null) __obj.updateDynamic("isan")(isan)
    if (isrc != null) __obj.updateDynamic("isrc")(isrc)
    if (iswc != null) __obj.updateDynamic("iswc")(iswc)
    if (keyword != null) __obj.updateDynamic("keyword")(keyword)
    if (label != null) __obj.updateDynamic("label")(label)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (originalReleaseMedium != null) __obj.updateDynamic("originalReleaseMedium")(originalReleaseMedium)
    if (producer != null) __obj.updateDynamic("producer")(producer)
    if (ratings != null) __obj.updateDynamic("ratings")(ratings)
    if (releaseDate != null) __obj.updateDynamic("releaseDate")(releaseDate)
    if (seasonNumber != null) __obj.updateDynamic("seasonNumber")(seasonNumber)
    if (showCustomId != null) __obj.updateDynamic("showCustomId")(showCustomId)
    if (showTitle != null) __obj.updateDynamic("showTitle")(showTitle)
    if (spokenLanguage != null) __obj.updateDynamic("spokenLanguage")(spokenLanguage)
    if (startYear != null) __obj.updateDynamic("startYear")(startYear.asInstanceOf[js.Any])
    if (subtitledLanguage != null) __obj.updateDynamic("subtitledLanguage")(subtitledLanguage)
    if (title != null) __obj.updateDynamic("title")(title)
    if (tmsId != null) __obj.updateDynamic("tmsId")(tmsId)
    if (totalEpisodesExpected != null) __obj.updateDynamic("totalEpisodesExpected")(totalEpisodesExpected.asInstanceOf[js.Any])
    if (upc != null) __obj.updateDynamic("upc")(upc)
    if (writer != null) __obj.updateDynamic("writer")(writer)
    __obj.asInstanceOf[Metadata]
  }
}

