package typings.googleTranslateApi

import typings.googleTranslateApi.anon.Language
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("google-translate-api", JSImport.Namespace)
  @js.native
  def apply(text: String): js.Promise[TranslateResult] = js.native
  @JSImport("google-translate-api", JSImport.Namespace)
  @js.native
  def apply(text: String, options: TranslateOption): js.Promise[TranslateResult] = js.native
  
  @js.native
  trait TranslateOption extends StObject {
    
    var from: js.UndefOr[String] = js.native
    
    var raw: js.UndefOr[Boolean] = js.native
    
    var to: js.UndefOr[String] = js.native
  }
  object TranslateOption {
    
    @scala.inline
    def apply(): TranslateOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TranslateOption]
    }
    
    @scala.inline
    implicit class TranslateOptionMutableBuilder[Self <: TranslateOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      @scala.inline
      def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  @js.native
  trait TranslateResult extends StObject {
    
    var from: Language = js.native
    
    var raw: String = js.native
    
    var text: String = js.native
  }
  object TranslateResult {
    
    @scala.inline
    def apply(from: Language, raw: String, text: String): TranslateResult = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[TranslateResult]
    }
    
    @scala.inline
    implicit class TranslateResultMutableBuilder[Self <: TranslateResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: Language): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
