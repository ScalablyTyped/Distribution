package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait hasSetTrackingTemplate extends StObject {
  
  def setCustomParameters(customParameters: js.Object): Unit
  
  def setTrackingTemplate(trackingTemplate: String): Unit
}
object hasSetTrackingTemplate {
  
  inline def apply(setCustomParameters: js.Object => Unit, setTrackingTemplate: String => Unit): hasSetTrackingTemplate = {
    val __obj = js.Dynamic.literal(setCustomParameters = js.Any.fromFunction1(setCustomParameters), setTrackingTemplate = js.Any.fromFunction1(setTrackingTemplate))
    __obj.asInstanceOf[hasSetTrackingTemplate]
  }
  
  extension [Self <: hasSetTrackingTemplate](x: Self) {
    
    inline def setSetCustomParameters(value: js.Object => Unit): Self = StObject.set(x, "setCustomParameters", js.Any.fromFunction1(value))
    
    inline def setSetTrackingTemplate(value: String => Unit): Self = StObject.set(x, "setTrackingTemplate", js.Any.fromFunction1(value))
  }
}
