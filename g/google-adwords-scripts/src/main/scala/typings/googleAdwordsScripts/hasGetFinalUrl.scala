package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait hasGetFinalUrl extends StObject {
  
  def getFinalUrl(): String = js.native
  
  def getMobileFinalUrl(): String = js.native
}
object hasGetFinalUrl {
  
  @scala.inline
  def apply(getFinalUrl: () => String, getMobileFinalUrl: () => String): hasGetFinalUrl = {
    val __obj = js.Dynamic.literal(getFinalUrl = js.Any.fromFunction0(getFinalUrl), getMobileFinalUrl = js.Any.fromFunction0(getMobileFinalUrl))
    __obj.asInstanceOf[hasGetFinalUrl]
  }
  
  @scala.inline
  implicit class hasGetFinalUrlMutableBuilder[Self <: hasGetFinalUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetFinalUrl(value: () => String): Self = StObject.set(x, "getFinalUrl", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMobileFinalUrl(value: () => String): Self = StObject.set(x, "getMobileFinalUrl", js.Any.fromFunction0(value))
  }
}
