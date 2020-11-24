package typings.fancybox

import typings.fancybox.fancyboxStrings.`inline`
import typings.fancybox.fancyboxStrings.ajax
import typings.fancybox.fancyboxStrings.html
import typings.fancybox.fancyboxStrings.iframe
import typings.fancybox.fancyboxStrings.image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FancyBoxGroupItem extends js.Object {
  
  var opts: js.UndefOr[FancyBoxOptions] = js.native
  
  var src: String = js.native
  
  var `type`: js.UndefOr[image | `inline` | ajax | iframe | html] = js.native
}
object FancyBoxGroupItem {
  
  @scala.inline
  def apply(src: String): FancyBoxGroupItem = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxGroupItem]
  }
  
  @scala.inline
  implicit class FancyBoxGroupItemOps[Self <: FancyBoxGroupItem] (val x: Self) extends AnyVal {
    
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
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpts(value: FancyBoxOptions): Self = this.set("opts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpts: Self = this.set("opts", js.undefined)
    
    @scala.inline
    def setType(value: image | `inline` | ajax | iframe | html): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
