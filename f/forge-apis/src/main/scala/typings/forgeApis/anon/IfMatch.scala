package typings.forgeApis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IfMatch extends js.Object {
  
  var contentDisposition: js.UndefOr[String] = js.native
  
  var ifMatch: js.UndefOr[String] = js.native
  
  var xAdsRegion: js.UndefOr[String] = js.native
}
object IfMatch {
  
  @scala.inline
  def apply(): IfMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IfMatch]
  }
  
  @scala.inline
  implicit class IfMatchOps[Self <: IfMatch] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setXAdsRegion(value: String): Self = this.set("xAdsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAdsRegion: Self = this.set("xAdsRegion", js.undefined)
  }
}
