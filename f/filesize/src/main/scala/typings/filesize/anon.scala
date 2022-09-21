package typings.filesize

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Exponent extends StObject {
    
    var exponent: Double
    
    var symbol: String
    
    var unit: String
    
    var value: Double
  }
  object Exponent {
    
    inline def apply(exponent: Double, symbol: String, unit: String, value: Double): Exponent = {
      val __obj = js.Dynamic.literal(exponent = exponent.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exponent]
    }
    
    extension [Self <: Exponent](x: Self) {
      
      inline def setExponent(value: Double): Self = StObject.set(x, "exponent", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Precision extends StObject {
    
    var precision: Double
  }
  object Precision {
    
    inline def apply(precision: Double): Precision = {
      val __obj = js.Dynamic.literal(precision = precision.asInstanceOf[js.Any])
      __obj.asInstanceOf[Precision]
    }
    
    extension [Self <: Precision](x: Self) {
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    }
  }
}
