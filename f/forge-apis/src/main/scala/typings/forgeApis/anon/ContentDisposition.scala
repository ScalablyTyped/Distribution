package typings.forgeApis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentDisposition extends js.Object {
  
  var contentDisposition: js.UndefOr[String] = js.native
  
  var ifMatch: js.UndefOr[String] = js.native
}
object ContentDisposition {
  
  @scala.inline
  def apply(): ContentDisposition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentDisposition]
  }
  
  @scala.inline
  implicit class ContentDispositionOps[Self <: ContentDisposition] (val x: Self) extends AnyVal {
    
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
    def setContentDisposition(value: String): Self = this.set("contentDisposition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentDisposition: Self = this.set("contentDisposition", js.undefined)
    
    @scala.inline
    def setIfMatch(value: String): Self = this.set("ifMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIfMatch: Self = this.set("ifMatch", js.undefined)
  }
}
