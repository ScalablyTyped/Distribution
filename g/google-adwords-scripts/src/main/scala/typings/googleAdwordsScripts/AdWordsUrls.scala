package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdWordsUrls extends StObject {
  
  def getCustomParameters(): js.Object
  
  def getTrackingTemplate(): String
}
object AdWordsUrls {
  
  inline def apply(getCustomParameters: () => js.Object, getTrackingTemplate: () => String): AdWordsUrls = {
    val __obj = js.Dynamic.literal(getCustomParameters = js.Any.fromFunction0(getCustomParameters), getTrackingTemplate = js.Any.fromFunction0(getTrackingTemplate))
    __obj.asInstanceOf[AdWordsUrls]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdWordsUrls] (val x: Self) extends AnyVal {
    
    inline def setGetCustomParameters(value: () => js.Object): Self = StObject.set(x, "getCustomParameters", js.Any.fromFunction0(value))
    
    inline def setGetTrackingTemplate(value: () => String): Self = StObject.set(x, "getTrackingTemplate", js.Any.fromFunction0(value))
  }
}
