package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an object under the hit test point within a chart control, on the client side.
  */
@js.native
trait ASPxClientHitObject extends StObject {
  
  /**
    * Provides access to an object, which is in some way related to the object being hit. The returned value depends on the ASPxClientHitObject.Object type and hit point location.
    */
  var AdditionalObject: ASPxClientWebChartElement = js.native
  
  /**
    * Gets the chart element for which the event was raised.
    */
  var Object: ASPxClientWebChartElement = js.native
}
object ASPxClientHitObject {
  
  @scala.inline
  def apply(AdditionalObject: ASPxClientWebChartElement, Object: ASPxClientWebChartElement): ASPxClientHitObject = {
    val __obj = js.Dynamic.literal(AdditionalObject = AdditionalObject.asInstanceOf[js.Any], Object = Object.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHitObject]
  }
  
  @scala.inline
  implicit class ASPxClientHitObjectMutableBuilder[Self <: ASPxClientHitObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalObject(value: ASPxClientWebChartElement): Self = StObject.set(x, "AdditionalObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: ASPxClientWebChartElement): Self = StObject.set(x, "Object", value.asInstanceOf[js.Any])
  }
}
