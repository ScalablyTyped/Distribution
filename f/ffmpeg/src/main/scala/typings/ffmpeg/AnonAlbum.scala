package typings.ffmpeg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlbum extends js.Object {
  var album: String
  var album_artist: String
  var author: String
  var comment: String
  var composer: String
  var copyright: String
  var description: String
  var episode_id: String
  var genre: String
  var grouping: String
  var lyrics: String
  var network: String
  var show: String
  var synopsis: String
  var title: String
  var track: String
  var year: String
}

object AnonAlbum {
  @scala.inline
  def apply(
    album: String,
    album_artist: String,
    author: String,
    comment: String,
    composer: String,
    copyright: String,
    description: String,
    episode_id: String,
    genre: String,
    grouping: String,
    lyrics: String,
    network: String,
    show: String,
    synopsis: String,
    title: String,
    track: String,
    year: String
  ): AnonAlbum = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], album_artist = album_artist.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], composer = composer.asInstanceOf[js.Any], copyright = copyright.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], episode_id = episode_id.asInstanceOf[js.Any], genre = genre.asInstanceOf[js.Any], grouping = grouping.asInstanceOf[js.Any], lyrics = lyrics.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any], synopsis = synopsis.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAlbum]
  }
}

