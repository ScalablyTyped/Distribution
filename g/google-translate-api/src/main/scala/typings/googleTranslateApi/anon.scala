package typings.googleTranslateApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AutoCorrected extends StObject {
    
    var autoCorrected: Boolean
    
    var didYouMean: Boolean
    
    var value: String
  }
  object AutoCorrected {
    
    inline def apply(autoCorrected: Boolean, didYouMean: Boolean, value: String): AutoCorrected = {
      val __obj = js.Dynamic.literal(autoCorrected = autoCorrected.asInstanceOf[js.Any], didYouMean = didYouMean.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoCorrected]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoCorrected] (val x: Self) extends AnyVal {
      
      inline def setAutoCorrected(value: Boolean): Self = StObject.set(x, "autoCorrected", value.asInstanceOf[js.Any])
      
      inline def setDidYouMean(value: Boolean): Self = StObject.set(x, "didYouMean", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait DidYouMean extends StObject {
    
    var didYouMean: Boolean
    
    var iso: String
  }
  object DidYouMean {
    
    inline def apply(didYouMean: Boolean, iso: String): DidYouMean = {
      val __obj = js.Dynamic.literal(didYouMean = didYouMean.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any])
      __obj.asInstanceOf[DidYouMean]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DidYouMean] (val x: Self) extends AnyVal {
      
      inline def setDidYouMean(value: Boolean): Self = StObject.set(x, "didYouMean", value.asInstanceOf[js.Any])
      
      inline def setIso(value: String): Self = StObject.set(x, "iso", value.asInstanceOf[js.Any])
    }
  }
  
  trait Language extends StObject {
    
    var language: DidYouMean
    
    var text: AutoCorrected
  }
  object Language {
    
    inline def apply(language: DidYouMean, text: AutoCorrected): Language = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Language]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Language] (val x: Self) extends AnyVal {
      
      inline def setLanguage(value: DidYouMean): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setText(value: AutoCorrected): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
