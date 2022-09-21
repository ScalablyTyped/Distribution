package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFormatting extends StObject {
  
  var bold: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This indicates that the segment should be rendered as highlighted or visually emphasized.
    */
  var highlight: js.UndefOr[Boolean | Null] = js.undefined
  
  var italics: js.UndefOr[Boolean | Null] = js.undefined
  
  var strikethrough: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If set, this indicates that the segment should be rendered with the specified style. The absence of an explicit style represents "no style", i.e. the segment can be rendered with the default style chosen by the application.
    */
  var style: js.UndefOr[String | Null] = js.undefined
  
  var underline: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaFormatting {
  
  inline def apply(): SchemaFormatting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFormatting]
  }
  
  extension [Self <: SchemaFormatting](x: Self) {
    
    inline def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def setBoldNull: Self = StObject.set(x, "bold", null)
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    inline def setHighlightNull: Self = StObject.set(x, "highlight", null)
    
    inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    inline def setItalics(value: Boolean): Self = StObject.set(x, "italics", value.asInstanceOf[js.Any])
    
    inline def setItalicsNull: Self = StObject.set(x, "italics", null)
    
    inline def setItalicsUndefined: Self = StObject.set(x, "italics", js.undefined)
    
    inline def setStrikethrough(value: Boolean): Self = StObject.set(x, "strikethrough", value.asInstanceOf[js.Any])
    
    inline def setStrikethroughNull: Self = StObject.set(x, "strikethrough", null)
    
    inline def setStrikethroughUndefined: Self = StObject.set(x, "strikethrough", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleNull: Self = StObject.set(x, "style", null)
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setUnderline(value: Boolean): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    
    inline def setUnderlineNull: Self = StObject.set(x, "underline", null)
    
    inline def setUnderlineUndefined: Self = StObject.set(x, "underline", js.undefined)
  }
}
