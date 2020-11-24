package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaylistSnippet extends js.Object {
  
  var channelId: js.UndefOr[String] = js.native
  
  var channelTitle: js.UndefOr[String] = js.native
  
  var defaultLanguage: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var localized: js.UndefOr[PlaylistLocalization] = js.native
  
  var publishedAt: js.UndefOr[String] = js.native
  
  var tags: js.UndefOr[js.Array[String]] = js.native
  
  var thumbnails: js.UndefOr[ThumbnailDetails] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object PlaylistSnippet {
  
  @scala.inline
  def apply(): PlaylistSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaylistSnippet]
  }
  
  @scala.inline
  implicit class PlaylistSnippetOps[Self <: PlaylistSnippet] (val x: Self) extends AnyVal {
    
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
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelId: Self = this.set("channelId", js.undefined)
    
    @scala.inline
    def setChannelTitle(value: String): Self = this.set("channelTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelTitle: Self = this.set("channelTitle", js.undefined)
    
    @scala.inline
    def setDefaultLanguage(value: String): Self = this.set("defaultLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLanguage: Self = this.set("defaultLanguage", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setLocalized(value: PlaylistLocalization): Self = this.set("localized", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalized: Self = this.set("localized", js.undefined)
    
    @scala.inline
    def setPublishedAt(value: String): Self = this.set("publishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishedAt: Self = this.set("publishedAt", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setThumbnails(value: ThumbnailDetails): Self = this.set("thumbnails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbnails: Self = this.set("thumbnails", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
