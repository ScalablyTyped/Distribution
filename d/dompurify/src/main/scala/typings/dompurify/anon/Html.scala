package typings.dompurify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Html extends js.Object {
  
  var html: js.UndefOr[Boolean] = js.native
  
  var mathMl: js.UndefOr[Boolean] = js.native
  
  var svg: js.UndefOr[Boolean] = js.native
  
  var svgFilters: js.UndefOr[Boolean] = js.native
}
object Html {
  
  @scala.inline
  def apply(): Html = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Html]
  }
  
  @scala.inline
  implicit class HtmlOps[Self <: Html] (val x: Self) extends AnyVal {
    
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
    def setHtml(value: Boolean): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    
    @scala.inline
    def setMathMl(value: Boolean): Self = this.set("mathMl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMathMl: Self = this.set("mathMl", js.undefined)
    
    @scala.inline
    def setSvg(value: Boolean): Self = this.set("svg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSvg: Self = this.set("svg", js.undefined)
    
    @scala.inline
    def setSvgFilters(value: Boolean): Self = this.set("svgFilters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSvgFilters: Self = this.set("svgFilters", js.undefined)
  }
}
