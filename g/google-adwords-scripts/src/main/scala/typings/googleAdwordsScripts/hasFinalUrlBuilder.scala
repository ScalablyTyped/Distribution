package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait hasFinalUrlBuilder[B] extends StObject {
  
  def withFinalUrl(url: String): B
  
  def withMobileFinalUrl(url: String): B
}
object hasFinalUrlBuilder {
  
  inline def apply[B](withFinalUrl: String => B, withMobileFinalUrl: String => B): hasFinalUrlBuilder[B] = {
    val __obj = js.Dynamic.literal(withFinalUrl = js.Any.fromFunction1(withFinalUrl), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl))
    __obj.asInstanceOf[hasFinalUrlBuilder[B]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: hasFinalUrlBuilder[?], B] (val x: Self & hasFinalUrlBuilder[B]) extends AnyVal {
    
    inline def setWithFinalUrl(value: String => B): Self = StObject.set(x, "withFinalUrl", js.Any.fromFunction1(value))
    
    inline def setWithMobileFinalUrl(value: String => B): Self = StObject.set(x, "withMobileFinalUrl", js.Any.fromFunction1(value))
  }
}
