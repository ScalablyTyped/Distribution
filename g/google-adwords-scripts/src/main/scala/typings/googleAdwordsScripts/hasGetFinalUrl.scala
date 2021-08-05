package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait hasGetFinalUrl extends StObject {
  
  def getFinalUrl(): String
  
  def getMobileFinalUrl(): String
}
object hasGetFinalUrl {
  
  inline def apply(getFinalUrl: () => String, getMobileFinalUrl: () => String): hasGetFinalUrl = {
    val __obj = js.Dynamic.literal(getFinalUrl = js.Any.fromFunction0(getFinalUrl), getMobileFinalUrl = js.Any.fromFunction0(getMobileFinalUrl))
    __obj.asInstanceOf[hasGetFinalUrl]
  }
  
  extension [Self <: hasGetFinalUrl](x: Self) {
    
    inline def setGetFinalUrl(value: () => String): Self = StObject.set(x, "getFinalUrl", js.Any.fromFunction0(value))
    
    inline def setGetMobileFinalUrl(value: () => String): Self = StObject.set(x, "getMobileFinalUrl", js.Any.fromFunction0(value))
  }
}
