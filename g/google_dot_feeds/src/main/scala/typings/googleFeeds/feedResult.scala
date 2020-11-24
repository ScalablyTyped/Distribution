package typings.googleFeeds

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait feedResult extends js.Object {
  
  var error: js.UndefOr[feedError] = js.native
  
  var feed: feedJSON = js.native
  
  var xmlDocument: js.UndefOr[String] = js.native
}
object feedResult {
  
  @scala.inline
  def apply(feed: feedJSON): feedResult = {
    val __obj = js.Dynamic.literal(feed = feed.asInstanceOf[js.Any])
    __obj.asInstanceOf[feedResult]
  }
  
  @scala.inline
  implicit class feedResultOps[Self <: feedResult] (val x: Self) extends AnyVal {
    
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
    def setFeed(value: feedJSON): Self = this.set("feed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: feedError): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setXmlDocument(value: String): Self = this.set("xmlDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlDocument: Self = this.set("xmlDocument", js.undefined)
  }
}
