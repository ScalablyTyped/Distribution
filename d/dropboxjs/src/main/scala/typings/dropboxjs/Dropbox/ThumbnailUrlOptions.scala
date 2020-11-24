package typings.dropboxjs.Dropbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThumbnailUrlOptions extends js.Object {
  
  var format: js.UndefOr[String] = js.native
  
  var png: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[String] = js.native
}
object ThumbnailUrlOptions {
  
  @scala.inline
  def apply(): ThumbnailUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThumbnailUrlOptions]
  }
  
  @scala.inline
  implicit class ThumbnailUrlOptionsOps[Self <: ThumbnailUrlOptions] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setPng(value: Boolean): Self = this.set("png", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePng: Self = this.set("png", js.undefined)
    
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
}
