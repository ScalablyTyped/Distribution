package typings.ffmpeg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  title :string,   author :string,   album_artist :string,   album :string,   grouping :string,   composer :string,   year :string,   track :string,   comment :string,   genre :string,   copyright :string,   description :string,   synopsis :string,   show :string,   episode_id :string,   network :string,   lyrics :string}> */
@js.native
trait StandardVideoMetadata extends js.Object {
  var album: js.UndefOr[String] = js.native
  var album_artist: js.UndefOr[String] = js.native
  var author: js.UndefOr[String] = js.native
  var comment: js.UndefOr[String] = js.native
  var composer: js.UndefOr[String] = js.native
  var copyright: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var episode_id: js.UndefOr[String] = js.native
  var genre: js.UndefOr[String] = js.native
  var grouping: js.UndefOr[String] = js.native
  var lyrics: js.UndefOr[String] = js.native
  var network: js.UndefOr[String] = js.native
  var show: js.UndefOr[String] = js.native
  var synopsis: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var track: js.UndefOr[String] = js.native
  var year: js.UndefOr[String] = js.native
}

object StandardVideoMetadata {
  @scala.inline
  def apply(): StandardVideoMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardVideoMetadata]
  }
  @scala.inline
  implicit class StandardVideoMetadataOps[Self <: StandardVideoMetadata] (val x: Self) extends AnyVal {
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
    def setAlbum(value: String): Self = this.set("album", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlbum: Self = this.set("album", js.undefined)
    @scala.inline
    def setAlbum_artist(value: String): Self = this.set("album_artist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlbum_artist: Self = this.set("album_artist", js.undefined)
    @scala.inline
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setComposer(value: String): Self = this.set("composer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComposer: Self = this.set("composer", js.undefined)
    @scala.inline
    def setCopyright(value: String): Self = this.set("copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEpisode_id(value: String): Self = this.set("episode_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEpisode_id: Self = this.set("episode_id", js.undefined)
    @scala.inline
    def setGenre(value: String): Self = this.set("genre", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenre: Self = this.set("genre", js.undefined)
    @scala.inline
    def setGrouping(value: String): Self = this.set("grouping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrouping: Self = this.set("grouping", js.undefined)
    @scala.inline
    def setLyrics(value: String): Self = this.set("lyrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLyrics: Self = this.set("lyrics", js.undefined)
    @scala.inline
    def setNetwork(value: String): Self = this.set("network", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    @scala.inline
    def setShow(value: String): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setSynopsis(value: String): Self = this.set("synopsis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSynopsis: Self = this.set("synopsis", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTrack(value: String): Self = this.set("track", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrack: Self = this.set("track", js.undefined)
    @scala.inline
    def setYear(value: String): Self = this.set("year", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
  }
  
}

