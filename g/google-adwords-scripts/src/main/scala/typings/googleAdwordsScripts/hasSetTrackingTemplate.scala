package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait hasSetTrackingTemplate extends StObject {
  
  def setCustomParameters(customParameters: js.Object): Unit
  
  def setTrackingTemplate(trackingTemplate: String): Unit
}
object hasSetTrackingTemplate {
  
  @scala.inline
  def apply(setCustomParameters: js.Object => Unit, setTrackingTemplate: String => Unit): hasSetTrackingTemplate = {
    val __obj = js.Dynamic.literal(setCustomParameters = js.Any.fromFunction1(setCustomParameters), setTrackingTemplate = js.Any.fromFunction1(setTrackingTemplate))
    __obj.asInstanceOf[hasSetTrackingTemplate]
  }
  
  @scala.inline
  implicit class hasSetTrackingTemplateMutableBuilder[Self <: hasSetTrackingTemplate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetCustomParameters(value: js.Object => Unit): Self = StObject.set(x, "setCustomParameters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTrackingTemplate(value: String => Unit): Self = StObject.set(x, "setTrackingTemplate", js.Any.fromFunction1(value))
  }
}
