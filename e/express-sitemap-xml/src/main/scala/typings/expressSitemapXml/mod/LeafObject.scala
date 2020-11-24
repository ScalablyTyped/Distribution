package typings.expressSitemapXml.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeafObject extends js.Object {
  
  var changeFreq: js.UndefOr[String] = js.native
  
  var lastMod: js.UndefOr[String | Date] = js.native
  
  var url: String = js.native
}
object LeafObject {
  
  @scala.inline
  def apply(url: String): LeafObject = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeafObject]
  }
  
  @scala.inline
  implicit class LeafObjectOps[Self <: LeafObject] (val x: Self) extends AnyVal {
    
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeFreq(value: String): Self = this.set("changeFreq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeFreq: Self = this.set("changeFreq", js.undefined)
    
    @scala.inline
    def setLastMod(value: String | Date): Self = this.set("lastMod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastMod: Self = this.set("lastMod", js.undefined)
  }
}
