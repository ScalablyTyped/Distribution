package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for a chart control's ASPxClientWebChartControl.ObjectHotTracked and ASPxClientWebChartControl.ObjectSelected events on the client side.
  */
@js.native
trait ASPxClientWebChartControlHotTrackEventArgs extends ASPxClientProcessingModeEventArgs {
  
  /**
    * Gets the X-coordinate of the hit test point, relative to the top left corner of the Web Page containing this chart.
    */
  var absoluteX: Double = js.native
  
  /**
    * Gets the Y-coordinate of the hit test point, relative to the top left corner of the Web Page containing this chart.
    */
  var absoluteY: Double = js.native
  
  /**
    * Provides access on the client side to the object, which is in some way related to the object being hit. The returned value depends on the ASPxClientWebChartControlHotTrackEventArgs.hitObject type and hit point location.
    */
  var additionalHitObject: ASPxClientWebChartElement = js.native
  
  /**
    * Gets a value indicating whether the hot-tracking or object selection should be canceled.
    */
  var cancel: Boolean = js.native
  
  /**
    * Provides access on the client side to the chart and all its elements.
    */
  var chart: ASPxClientWebChart = js.native
  
  /**
    * Gets details on the chart elements located at the point where an end-user has clicked when hot-tracking or selecting a chart element on the client side.
    */
  var hitInfo: ASPxClientWebChartHitInfo = js.native
  
  /**
    * Provides access on the client side to the chart element, for which the event was raised.
    */
  var hitObject: ASPxClientWebChartElement = js.native
  
  /**
    * Gets the HTML object that contains the processed item.
    */
  var htmlElement: js.Any = js.native
  
  /**
    * Gets the X-coordinate of the hit test point, relative to the top left corner of the chart.
    */
  var x: Double = js.native
  
  /**
    * Gets the Y-coordinate of the hit test point, relative to the top left corner of the chart.
    */
  var y: Double = js.native
}
object ASPxClientWebChartControlHotTrackEventArgs {
  
  @scala.inline
  def apply(
    absoluteX: Double,
    absoluteY: Double,
    additionalHitObject: ASPxClientWebChartElement,
    cancel: Boolean,
    chart: ASPxClientWebChart,
    hitInfo: ASPxClientWebChartHitInfo,
    hitObject: ASPxClientWebChartElement,
    htmlElement: js.Any,
    processOnServer: Boolean,
    x: Double,
    y: Double
  ): ASPxClientWebChartControlHotTrackEventArgs = {
    val __obj = js.Dynamic.literal(absoluteX = absoluteX.asInstanceOf[js.Any], absoluteY = absoluteY.asInstanceOf[js.Any], additionalHitObject = additionalHitObject.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], hitInfo = hitInfo.asInstanceOf[js.Any], hitObject = hitObject.asInstanceOf[js.Any], htmlElement = htmlElement.asInstanceOf[js.Any], processOnServer = processOnServer.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebChartControlHotTrackEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientWebChartControlHotTrackEventArgsMutableBuilder[Self <: ASPxClientWebChartControlHotTrackEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbsoluteX(value: Double): Self = StObject.set(x, "absoluteX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsoluteY(value: Double): Self = StObject.set(x, "absoluteY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalHitObject(value: ASPxClientWebChartElement): Self = StObject.set(x, "additionalHitObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChart(value: ASPxClientWebChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitInfo(value: ASPxClientWebChartHitInfo): Self = StObject.set(x, "hitInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHitObject(value: ASPxClientWebChartElement): Self = StObject.set(x, "hitObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlElement(value: js.Any): Self = StObject.set(x, "htmlElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
