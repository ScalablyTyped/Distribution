package typings.googleVisualization.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsHtml extends js.Object {
  
  var isHtml: Boolean = js.native
}
object IsHtml {
  
  @scala.inline
  def apply(isHtml: Boolean): IsHtml = {
    val __obj = js.Dynamic.literal(isHtml = isHtml.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsHtml]
  }
  
  @scala.inline
  implicit class IsHtmlOps[Self <: IsHtml] (val x: Self) extends AnyVal {
    
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
    def setIsHtml(value: Boolean): Self = this.set("isHtml", value.asInstanceOf[js.Any])
  }
}
