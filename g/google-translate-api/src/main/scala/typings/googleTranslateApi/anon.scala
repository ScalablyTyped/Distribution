package typings.googleTranslateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AutoCorrected extends StObject {
    
    var autoCorrected: Boolean = js.native
    
    var didYouMean: Boolean = js.native
    
    var value: String = js.native
  }
  object AutoCorrected {
    
    @scala.inline
    def apply(autoCorrected: Boolean, didYouMean: Boolean, value: String): AutoCorrected = {
      val __obj = js.Dynamic.literal(autoCorrected = autoCorrected.asInstanceOf[js.Any], didYouMean = didYouMean.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoCorrected]
    }
    
    @scala.inline
    implicit class AutoCorrectedMutableBuilder[Self <: AutoCorrected] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoCorrected(value: Boolean): Self = StObject.set(x, "autoCorrected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDidYouMean(value: Boolean): Self = StObject.set(x, "didYouMean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DidYouMean extends StObject {
    
    var didYouMean: Boolean = js.native
    
    var iso: String = js.native
  }
  object DidYouMean {
    
    @scala.inline
    def apply(didYouMean: Boolean, iso: String): DidYouMean = {
      val __obj = js.Dynamic.literal(didYouMean = didYouMean.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any])
      __obj.asInstanceOf[DidYouMean]
    }
    
    @scala.inline
    implicit class DidYouMeanMutableBuilder[Self <: DidYouMean] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDidYouMean(value: Boolean): Self = StObject.set(x, "didYouMean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIso(value: String): Self = StObject.set(x, "iso", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Language extends StObject {
    
    var language: DidYouMean = js.native
    
    var text: AutoCorrected = js.native
  }
  object Language {
    
    @scala.inline
    def apply(language: DidYouMean, text: AutoCorrected): Language = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Language]
    }
    
    @scala.inline
    implicit class LanguageMutableBuilder[Self <: Language] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLanguage(value: DidYouMean): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: AutoCorrected): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
