package typings.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSProperty extends StObject {
  
  /**
    * Whether the property is disabled by the user (present for source-based properties only).
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the property is implicit (implies `false` if absent).
    */
  var `implicit`: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the property has "!important" annotation (implies `false` if absent).
    */
  var important: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Parsed longhand components of this property if it is a shorthand.
    * This field will be empty if the given property is not a shorthand.
    */
  var longhandProperties: js.UndefOr[js.Array[CSSProperty]] = js.undefined
  
  /**
    * The property name.
    */
  var name: String
  
  /**
    * Whether the property is understood by the browser (implies `true` if absent).
    */
  var parsedOk: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The entire property range in the enclosing style declaration (if available).
    */
  var range: js.UndefOr[SourceRange] = js.undefined
  
  /**
    * The full property text as specified in the style.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * The property value.
    */
  var value: String
}
object CSSProperty {
  
  inline def apply(name: String, value: String): CSSProperty = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSProperty]
  }
  
  extension [Self <: CSSProperty](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setImplicit(value: Boolean): Self = StObject.set(x, "implicit", value.asInstanceOf[js.Any])
    
    inline def setImplicitUndefined: Self = StObject.set(x, "implicit", js.undefined)
    
    inline def setImportant(value: Boolean): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
    
    inline def setImportantUndefined: Self = StObject.set(x, "important", js.undefined)
    
    inline def setLonghandProperties(value: js.Array[CSSProperty]): Self = StObject.set(x, "longhandProperties", value.asInstanceOf[js.Any])
    
    inline def setLonghandPropertiesUndefined: Self = StObject.set(x, "longhandProperties", js.undefined)
    
    inline def setLonghandPropertiesVarargs(value: CSSProperty*): Self = StObject.set(x, "longhandProperties", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParsedOk(value: Boolean): Self = StObject.set(x, "parsedOk", value.asInstanceOf[js.Any])
    
    inline def setParsedOkUndefined: Self = StObject.set(x, "parsedOk", js.undefined)
    
    inline def setRange(value: SourceRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
