package typings.devexpressUtils.anon

import typings.std.HTMLScriptElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HtmlScriptElement extends js.Object {
  
  var htmlScriptElement: HTMLScriptElement = js.native
}
object HtmlScriptElement {
  
  @scala.inline
  def apply(htmlScriptElement: HTMLScriptElement): HtmlScriptElement = {
    val __obj = js.Dynamic.literal(htmlScriptElement = htmlScriptElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlScriptElement]
  }
  
  @scala.inline
  implicit class HtmlScriptElementOps[Self <: HtmlScriptElement] (val x: Self) extends AnyVal {
    
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
    def setHtmlScriptElement(value: HTMLScriptElement): Self = this.set("htmlScriptElement", value.asInstanceOf[js.Any])
  }
}
