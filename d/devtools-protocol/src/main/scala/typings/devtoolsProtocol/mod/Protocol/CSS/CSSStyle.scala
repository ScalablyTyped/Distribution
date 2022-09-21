package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSStyle extends StObject {
  
  /**
    * CSS properties in the style.
    */
  var cssProperties: js.Array[CSSProperty]
  
  /**
    * Style declaration text (if available).
    */
  var cssText: js.UndefOr[String] = js.undefined
  
  /**
    * Style declaration range in the enclosing stylesheet (if available).
    */
  var range: js.UndefOr[SourceRange] = js.undefined
  
  /**
    * Computed values for all shorthands found in the style.
    */
  var shorthandEntries: js.Array[ShorthandEntry]
  
  /**
    * The css style sheet identifier (absent for user agent stylesheet and user-specified
    * stylesheet rules) this rule came from.
    */
  var styleSheetId: js.UndefOr[StyleSheetId] = js.undefined
}
object CSSStyle {
  
  inline def apply(cssProperties: js.Array[CSSProperty], shorthandEntries: js.Array[ShorthandEntry]): CSSStyle = {
    val __obj = js.Dynamic.literal(cssProperties = cssProperties.asInstanceOf[js.Any], shorthandEntries = shorthandEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSStyle]
  }
  
  extension [Self <: CSSStyle](x: Self) {
    
    inline def setCssProperties(value: js.Array[CSSProperty]): Self = StObject.set(x, "cssProperties", value.asInstanceOf[js.Any])
    
    inline def setCssPropertiesVarargs(value: CSSProperty*): Self = StObject.set(x, "cssProperties", js.Array(value*))
    
    inline def setCssText(value: String): Self = StObject.set(x, "cssText", value.asInstanceOf[js.Any])
    
    inline def setCssTextUndefined: Self = StObject.set(x, "cssText", js.undefined)
    
    inline def setRange(value: SourceRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setShorthandEntries(value: js.Array[ShorthandEntry]): Self = StObject.set(x, "shorthandEntries", value.asInstanceOf[js.Any])
    
    inline def setShorthandEntriesVarargs(value: ShorthandEntry*): Self = StObject.set(x, "shorthandEntries", js.Array(value*))
    
    inline def setStyleSheetId(value: StyleSheetId): Self = StObject.set(x, "styleSheetId", value.asInstanceOf[js.Any])
    
    inline def setStyleSheetIdUndefined: Self = StObject.set(x, "styleSheetId", js.undefined)
  }
}
