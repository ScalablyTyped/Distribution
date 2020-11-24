package typings.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveStreamSnippet extends js.Object {
  
  var channelId: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var isDefaultStream: js.UndefOr[Boolean] = js.native
  
  var publishedAt: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object LiveStreamSnippet {
  
  @scala.inline
  def apply(): LiveStreamSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveStreamSnippet]
  }
  
  @scala.inline
  implicit class LiveStreamSnippetOps[Self <: LiveStreamSnippet] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setIsDefaultStream(value: Boolean): Self = this.set("isDefaultStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDefaultStream: Self = this.set("isDefaultStream", js.undefined)
    
    @scala.inline
    def setPublishedAt(value: String): Self = this.set("publishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublishedAt: Self = this.set("publishedAt", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
