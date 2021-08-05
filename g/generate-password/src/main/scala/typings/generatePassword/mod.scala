package typings.generatePassword

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("generate-password", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generate(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[String]
  inline def generate(options: Options): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def generateMultiple(amount: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateMultiple")(amount.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def generateMultiple(amount: Double, options: Options): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateMultiple")(amount.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  trait Options extends StObject {
    
    var exclude: js.UndefOr[String] = js.undefined
    
    var excludeSimilarCharacters: js.UndefOr[Boolean] = js.undefined
    
    var length: js.UndefOr[Double] = js.undefined
    
    var lowercase: js.UndefOr[Boolean] = js.undefined
    
    var numbers: js.UndefOr[Boolean] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
    
    var symbols: js.UndefOr[Boolean] = js.undefined
    
    var uppercase: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setExclude(value: String): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeSimilarCharacters(value: Boolean): Self = StObject.set(x, "excludeSimilarCharacters", value.asInstanceOf[js.Any])
      
      inline def setExcludeSimilarCharactersUndefined: Self = StObject.set(x, "excludeSimilarCharacters", js.undefined)
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setLowercase(value: Boolean): Self = StObject.set(x, "lowercase", value.asInstanceOf[js.Any])
      
      inline def setLowercaseUndefined: Self = StObject.set(x, "lowercase", js.undefined)
      
      inline def setNumbers(value: Boolean): Self = StObject.set(x, "numbers", value.asInstanceOf[js.Any])
      
      inline def setNumbersUndefined: Self = StObject.set(x, "numbers", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
      
      inline def setSymbols(value: Boolean): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
      
      inline def setUppercase(value: Boolean): Self = StObject.set(x, "uppercase", value.asInstanceOf[js.Any])
      
      inline def setUppercaseUndefined: Self = StObject.set(x, "uppercase", js.undefined)
    }
  }
}
