package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait hasFinalUrlBuilder[B] extends StObject {
  
  def withFinalUrl(url: String): B = js.native
  
  def withMobileFinalUrl(url: String): B = js.native
}
object hasFinalUrlBuilder {
  
  @scala.inline
  def apply[B](withFinalUrl: String => B, withMobileFinalUrl: String => B): hasFinalUrlBuilder[B] = {
    val __obj = js.Dynamic.literal(withFinalUrl = js.Any.fromFunction1(withFinalUrl), withMobileFinalUrl = js.Any.fromFunction1(withMobileFinalUrl))
    __obj.asInstanceOf[hasFinalUrlBuilder[B]]
  }
  
  @scala.inline
  implicit class hasFinalUrlBuilderMutableBuilder[Self <: hasFinalUrlBuilder[_], B] (val x: Self with hasFinalUrlBuilder[B]) extends AnyVal {
    
    @scala.inline
    def setWithFinalUrl(value: String => B): Self = StObject.set(x, "withFinalUrl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithMobileFinalUrl(value: String => B): Self = StObject.set(x, "withMobileFinalUrl", js.Any.fromFunction1(value))
  }
}
