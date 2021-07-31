package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInlineStylesForNodeResponse extends StObject {
  
  /**
    * Attribute-defined element style (e.g. resulting from "width=20 height=100%").
    */
  var attributesStyle: js.UndefOr[CSSStyle] = js.undefined
  
  /**
    * Inline style for the specified DOM node.
    */
  var inlineStyle: js.UndefOr[CSSStyle] = js.undefined
}
object GetInlineStylesForNodeResponse {
  
  @scala.inline
  def apply(): GetInlineStylesForNodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInlineStylesForNodeResponse]
  }
  
  @scala.inline
  implicit class GetInlineStylesForNodeResponseMutableBuilder[Self <: GetInlineStylesForNodeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributesStyle(value: CSSStyle): Self = StObject.set(x, "attributesStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesStyleUndefined: Self = StObject.set(x, "attributesStyle", js.undefined)
    
    @scala.inline
    def setInlineStyle(value: CSSStyle): Self = StObject.set(x, "inlineStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInlineStyleUndefined: Self = StObject.set(x, "inlineStyle", js.undefined)
  }
}
