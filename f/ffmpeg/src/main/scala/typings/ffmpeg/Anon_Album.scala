package typings.ffmpeg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Album extends js.Object {
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

object Anon_Album {
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
  ): Anon_Album = {
    val __obj = js.Dynamic.literal(album = album, album_artist = album_artist, author = author, comment = comment, composer = composer, copyright = copyright, description = description, episode_id = episode_id, genre = genre, grouping = grouping, lyrics = lyrics, network = network, show = show, synopsis = synopsis, title = title, track = track, year = year)
  
    __obj.asInstanceOf[Anon_Album]
  }
}

