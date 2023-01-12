package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait hasTrackingTemplateBuilder[B] extends StObject {
  
  def withCustomParameters(customParameters: js.Object): B
  
  def withTrackingTemplate(trackingTemplate: String): B
}
object hasTrackingTemplateBuilder {
  
  inline def apply[B](withCustomParameters: js.Object => B, withTrackingTemplate: String => B): hasTrackingTemplateBuilder[B] = {
    val __obj = js.Dynamic.literal(withCustomParameters = js.Any.fromFunction1(withCustomParameters), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
    __obj.asInstanceOf[hasTrackingTemplateBuilder[B]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: hasTrackingTemplateBuilder[?], B] (val x: Self & hasTrackingTemplateBuilder[B]) extends AnyVal {
    
    inline def setWithCustomParameters(value: js.Object => B): Self = StObject.set(x, "withCustomParameters", js.Any.fromFunction1(value))
    
    inline def setWithTrackingTemplate(value: String => B): Self = StObject.set(x, "withTrackingTemplate", js.Any.fromFunction1(value))
  }
}
