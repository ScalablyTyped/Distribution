package typings.generatePassword

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("generate-password", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generate(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")().asInstanceOf[String]
  inline def generate(options: GenerateOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def generateMultiple(count: Double): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateMultiple")(count.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def generateMultiple(count: Double, options: GenerateOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateMultiple")(count.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  trait GenerateOptions extends StObject {
    
    /**
      * List of characters to be excluded from the password
      * @default ""
      */
    var exclude: js.UndefOr[String] = js.undefined
    
    /**
      * Should exclude visually similar characters like 'i' and 'I'
      * @default false
      */
    var excludeSimilarCharacters: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Length of the generated password.
      * @default 10
      */
    var length: js.UndefOr[Double] = js.undefined
    
    /**
      * Should the password include lowercase characters
      * @default true
      */
    var lowercase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Should the password include numbers
      * @default false
      */
    var numbers: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Password should include at least one character from each pool
      * @default false
      */
    var strict: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Should the password include symbols, or symbols to include
      * @default false
      */
    var symbols: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * Should the password include uppercase characters
      * @default true
      */
    var uppercase: js.UndefOr[Boolean] = js.undefined
  }
  object GenerateOptions {
    
    inline def apply(): GenerateOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenerateOptions] (val x: Self) extends AnyVal {
      
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
      
      inline def setSymbols(value: Boolean | String): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
      
      inline def setUppercase(value: Boolean): Self = StObject.set(x, "uppercase", value.asInstanceOf[js.Any])
      
      inline def setUppercaseUndefined: Self = StObject.set(x, "uppercase", js.undefined)
    }
  }
}
