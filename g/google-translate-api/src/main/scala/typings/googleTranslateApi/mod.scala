package typings.googleTranslateApi

import typings.googleTranslateApi.anon.Language
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(text: String): js.Promise[TranslateResult] = ^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TranslateResult]]
  inline def apply(text: String, options: TranslateOption): js.Promise[TranslateResult] = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TranslateResult]]
  
  @JSImport("google-translate-api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait TranslateOption extends StObject {
    
    var from: js.UndefOr[String] = js.undefined
    
    var raw: js.UndefOr[Boolean] = js.undefined
    
    var to: js.UndefOr[String] = js.undefined
  }
  object TranslateOption {
    
    inline def apply(): TranslateOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TranslateOption]
    }
    
    extension [Self <: TranslateOption](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait TranslateResult extends StObject {
    
    var from: Language
    
    var raw: String
    
    var text: String
  }
  object TranslateResult {
    
    inline def apply(from: Language, raw: String, text: String): TranslateResult = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TranslateResult]
    }
    
    extension [Self <: TranslateResult](x: Self) {
      
      inline def setFrom(value: Language): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
