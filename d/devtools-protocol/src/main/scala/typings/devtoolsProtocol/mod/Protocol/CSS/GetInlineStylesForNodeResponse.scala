package typings.devtoolsProtocol.mod.Protocol.CSS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetInlineStylesForNodeResponse extends js.Object {
  
  /**
    * Attribute-defined element style (e.g. resulting from "width=20 height=100%").
    */
  var attributesStyle: js.UndefOr[CSSStyle] = js.native
  
  /**
    * Inline style for the specified DOM node.
    */
  var inlineStyle: js.UndefOr[CSSStyle] = js.native
}
object GetInlineStylesForNodeResponse {
  
  @scala.inline
  def apply(): GetInlineStylesForNodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInlineStylesForNodeResponse]
  }
  
  @scala.inline
  implicit class GetInlineStylesForNodeResponseOps[Self <: GetInlineStylesForNodeResponse] (val x: Self) extends AnyVal {
    
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
    def setAttributesStyle(value: CSSStyle): Self = this.set("attributesStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributesStyle: Self = this.set("attributesStyle", js.undefined)
    
    @scala.inline
    def setInlineStyle(value: CSSStyle): Self = this.set("inlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineStyle: Self = this.set("inlineStyle", js.undefined)
  }
}
