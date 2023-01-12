package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait hasSetFinalUrl extends StObject {
  
  def setFinalUrl(url: String): Unit
  
  def setMobileFinalUrl(url: String): Unit
}
object hasSetFinalUrl {
  
  inline def apply(setFinalUrl: String => Unit, setMobileFinalUrl: String => Unit): hasSetFinalUrl = {
    val __obj = js.Dynamic.literal(setFinalUrl = js.Any.fromFunction1(setFinalUrl), setMobileFinalUrl = js.Any.fromFunction1(setMobileFinalUrl))
    __obj.asInstanceOf[hasSetFinalUrl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: hasSetFinalUrl] (val x: Self) extends AnyVal {
    
    inline def setSetFinalUrl(value: String => Unit): Self = StObject.set(x, "setFinalUrl", js.Any.fromFunction1(value))
    
    inline def setSetMobileFinalUrl(value: String => Unit): Self = StObject.set(x, "setMobileFinalUrl", js.Any.fromFunction1(value))
  }
}
