package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait hasTrackingTemplateBuilder[B] extends StObject {
  
  def withCustomParameters(customParameters: js.Object): B = js.native
  
  def withTrackingTemplate(trackingTemplate: String): B = js.native
}
object hasTrackingTemplateBuilder {
  
  @scala.inline
  def apply[B](withCustomParameters: js.Object => B, withTrackingTemplate: String => B): hasTrackingTemplateBuilder[B] = {
    val __obj = js.Dynamic.literal(withCustomParameters = js.Any.fromFunction1(withCustomParameters), withTrackingTemplate = js.Any.fromFunction1(withTrackingTemplate))
    __obj.asInstanceOf[hasTrackingTemplateBuilder[B]]
  }
  
  @scala.inline
  implicit class hasTrackingTemplateBuilderMutableBuilder[Self <: hasTrackingTemplateBuilder[_], B] (val x: Self with hasTrackingTemplateBuilder[B]) extends AnyVal {
    
    @scala.inline
    def setWithCustomParameters(value: js.Object => B): Self = StObject.set(x, "withCustomParameters", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithTrackingTemplate(value: String => B): Self = StObject.set(x, "withTrackingTemplate", js.Any.fromFunction1(value))
  }
}
