package typings.fastPrintf

import typings.fastPrintf.fastPrintfStrings.`-_`
import typings.fastPrintf.fastPrintfStrings.literal
import typings.fastPrintf.fastPrintfStrings.placeholder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.fastPrintf.fastPrintfStrings.`-_`
    - typings.fastPrintf.fastPrintfStrings.`-Plussign`
    - typings.fastPrintf.fastPrintfStrings.Plussign
    - typings.fastPrintf.fastPrintfStrings.`0`
  */
  trait Flag extends StObject
  object Flag {
    
    inline def `-Plussign`: typings.fastPrintf.fastPrintfStrings.`-Plussign` = "-+".asInstanceOf[typings.fastPrintf.fastPrintfStrings.`-Plussign`]
    
    inline def `0`: typings.fastPrintf.fastPrintfStrings.`0` = "0".asInstanceOf[typings.fastPrintf.fastPrintfStrings.`0`]
    
    inline def Plussign: typings.fastPrintf.fastPrintfStrings.Plussign = "+".asInstanceOf[typings.fastPrintf.fastPrintfStrings.Plussign]
    
    inline def _dash: `-_` = "-".asInstanceOf[`-_`]
  }
  
  trait LiteralToken
    extends StObject
       with Token {
    
    var literal: String
    
    var `type`: literal
  }
  object LiteralToken {
    
    inline def apply(literal: String): LiteralToken = {
      val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("literal")
      __obj.asInstanceOf[LiteralToken]
    }
    
    extension [Self <: LiteralToken](x: Self) {
      
      inline def setLiteral(value: String): Self = StObject.set(x, "literal", value.asInstanceOf[js.Any])
      
      inline def setType(value: literal): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait PlaceholderToken
    extends StObject
       with Token {
    
    var conversion: String
    
    var flag: Flag | Null
    
    var placeholder: String
    
    var position: Double
    
    var precision: Double | Null
    
    var `type`: placeholder
    
    var width: Double | Null
  }
  object PlaceholderToken {
    
    inline def apply(conversion: String, placeholder: String, position: Double): PlaceholderToken = {
      val __obj = js.Dynamic.literal(conversion = conversion.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], flag = null, precision = null, width = null)
      __obj.updateDynamic("type")("placeholder")
      __obj.asInstanceOf[PlaceholderToken]
    }
    
    extension [Self <: PlaceholderToken](x: Self) {
      
      inline def setConversion(value: String): Self = StObject.set(x, "conversion", value.asInstanceOf[js.Any])
      
      inline def setFlag(value: Flag): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
      
      inline def setFlagNull: Self = StObject.set(x, "flag", null)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionNull: Self = StObject.set(x, "precision", null)
      
      inline def setType(value: placeholder): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthNull: Self = StObject.set(x, "width", null)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.fastPrintf.distSrcTypesMod.LiteralToken
    - typings.fastPrintf.distSrcTypesMod.PlaceholderToken
  */
  trait Token extends StObject
  object Token {
    
    inline def LiteralToken(literal: String): typings.fastPrintf.distSrcTypesMod.LiteralToken = {
      val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("literal")
      __obj.asInstanceOf[typings.fastPrintf.distSrcTypesMod.LiteralToken]
    }
    
    inline def PlaceholderToken(conversion: String, placeholder: String, position: Double): typings.fastPrintf.distSrcTypesMod.PlaceholderToken = {
      val __obj = js.Dynamic.literal(conversion = conversion.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], flag = null, precision = null, width = null)
      __obj.updateDynamic("type")("placeholder")
      __obj.asInstanceOf[typings.fastPrintf.distSrcTypesMod.PlaceholderToken]
    }
  }
}
