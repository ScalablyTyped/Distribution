package typings.devtoolsProtocol.mod.Protocol.Input

import typings.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImeSetCompositionRequest extends StObject {
  
  /**
    * replacement end
    */
  var replacementEnd: js.UndefOr[integer] = js.undefined
  
  /**
    * replacement start
    */
  var replacementStart: js.UndefOr[integer] = js.undefined
  
  /**
    * selection end
    */
  var selectionEnd: integer
  
  /**
    * selection start
    */
  var selectionStart: integer
  
  /**
    * The text to insert
    */
  var text: String
}
object ImeSetCompositionRequest {
  
  inline def apply(selectionEnd: integer, selectionStart: integer, text: String): ImeSetCompositionRequest = {
    val __obj = js.Dynamic.literal(selectionEnd = selectionEnd.asInstanceOf[js.Any], selectionStart = selectionStart.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImeSetCompositionRequest]
  }
  
  extension [Self <: ImeSetCompositionRequest](x: Self) {
    
    inline def setReplacementEnd(value: integer): Self = StObject.set(x, "replacementEnd", value.asInstanceOf[js.Any])
    
    inline def setReplacementEndUndefined: Self = StObject.set(x, "replacementEnd", js.undefined)
    
    inline def setReplacementStart(value: integer): Self = StObject.set(x, "replacementStart", value.asInstanceOf[js.Any])
    
    inline def setReplacementStartUndefined: Self = StObject.set(x, "replacementStart", js.undefined)
    
    inline def setSelectionEnd(value: integer): Self = StObject.set(x, "selectionEnd", value.asInstanceOf[js.Any])
    
    inline def setSelectionStart(value: integer): Self = StObject.set(x, "selectionStart", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
