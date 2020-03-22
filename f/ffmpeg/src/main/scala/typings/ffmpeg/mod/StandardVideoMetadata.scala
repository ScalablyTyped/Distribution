package typings.ffmpeg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  title  :string,   author  :string,   album_artist  :string,   album  :string,   grouping  :string,   composer  :string,   year  :string,   track  :string,   comment  :string,   genre  :string,   copyright  :string,   description  :string,   synopsis  :string,   show  :string,   episode_id  :string,   network  :string,   lyrics  :string}> */
trait StandardVideoMetadata extends js.Object {
  var album: js.UndefOr[String] = js.undefined
  var album_artist: js.UndefOr[String] = js.undefined
  var author: js.UndefOr[String] = js.undefined
  var comment: js.UndefOr[String] = js.undefined
  var composer: js.UndefOr[String] = js.undefined
  var copyright: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var episode_id: js.UndefOr[String] = js.undefined
  var genre: js.UndefOr[String] = js.undefined
  var grouping: js.UndefOr[String] = js.undefined
  var lyrics: js.UndefOr[String] = js.undefined
  var network: js.UndefOr[String] = js.undefined
  var show: js.UndefOr[String] = js.undefined
  var synopsis: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var track: js.UndefOr[String] = js.undefined
  var year: js.UndefOr[String] = js.undefined
}

object StandardVideoMetadata {
  @scala.inline
  def apply(
    album: String = null,
    album_artist: String = null,
    author: String = null,
    comment: String = null,
    composer: String = null,
    copyright: String = null,
    description: String = null,
    episode_id: String = null,
    genre: String = null,
    grouping: String = null,
    lyrics: String = null,
    network: String = null,
    show: String = null,
    synopsis: String = null,
    title: String = null,
    track: String = null,
    year: String = null
  ): StandardVideoMetadata = {
    val __obj = js.Dynamic.literal()
    if (album != null) __obj.updateDynamic("album")(album.asInstanceOf[js.Any])
    if (album_artist != null) __obj.updateDynamic("album_artist")(album_artist.asInstanceOf[js.Any])
    if (author != null) __obj.updateDynamic("author")(author.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (composer != null) __obj.updateDynamic("composer")(composer.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (episode_id != null) __obj.updateDynamic("episode_id")(episode_id.asInstanceOf[js.Any])
    if (genre != null) __obj.updateDynamic("genre")(genre.asInstanceOf[js.Any])
    if (grouping != null) __obj.updateDynamic("grouping")(grouping.asInstanceOf[js.Any])
    if (lyrics != null) __obj.updateDynamic("lyrics")(lyrics.asInstanceOf[js.Any])
    if (network != null) __obj.updateDynamic("network")(network.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    if (synopsis != null) __obj.updateDynamic("synopsis")(synopsis.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (track != null) __obj.updateDynamic("track")(track.asInstanceOf[js.Any])
    if (year != null) __obj.updateDynamic("year")(year.asInstanceOf[js.Any])
    __obj.asInstanceOf[StandardVideoMetadata]
  }
}

