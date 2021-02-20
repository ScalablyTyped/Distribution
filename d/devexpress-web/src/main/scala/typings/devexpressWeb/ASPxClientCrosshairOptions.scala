package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The client-side equivalent of the CrosshairOptions class.
  */
@js.native
trait ASPxClientCrosshairOptions extends ASPxClientWebChartElement {
  
  /**
    * Gets the color of a crosshair argument line.
    */
  var argumentLineColor: String = js.native
  
  /**
    * Specifies the way in which the crosshair label is shown for a series on a diagram.
    */
  var crosshairLabelMode: String = js.native
  
  /**
    * Gets a string which represents the  pattern specifying the group header text to be displayed within the crosshair label.
    */
  var groupHeaderPattern: String = js.native
  
  /**
    * Gets the value specifying how the Crosshair Cursor's lines snap to points when hovering on them.
    */
  var linesMode: String = js.native
  
  /**
    * Gets a value that indicates whether a crosshair cursor argument line is shown for a series point on a diagram.
    */
  var showArgumentLine: Boolean = js.native
  
  /**
    * Gets a value indicating whether it is necessary to show a crosshair label for the X-axis.
    */
  var showAxisXLabels: Boolean = js.native
  
  /**
    * Gets a value indicating whether it is necessary to show a crosshair label for the Y-axis.
    */
  var showAxisYLabels: Boolean = js.native
  
  /**
    * Gets a value that defines whether a crosshair label of a series point indicated by a crosshair cursor is shown on a diagram.
    */
  var showCrosshairLabels: Boolean = js.native
  
  /**
    * Gets a value that indicates whether to show a header for each series group in crosshair cursor labels.
    */
  var showGroupHeaders: Boolean = js.native
  
  /**
    * Gets a value that specifies whether to show a crosshair cursor in a focused pane only.
    */
  var showOnlyInFocusedPane: Boolean = js.native
  
  /**
    * Gets a value that specifies whether the Crosshair cursor should show points that are out of visual range.
    */
  var showOutOfRangePoints: Boolean = js.native
  
  /**
    * Specifies whether to show a value line of a series point indicated by a crosshair cursor on a diagram.
    */
  var showValueLine: Boolean = js.native
  
  /**
    * Specifies the current snap mode of a crosshair cursor.
    */
  var snapMode: String = js.native
  
  /**
    * Gets the color of a crosshair value line.
    */
  var valueLineColor: String = js.native
  
  /**
    * Gets the identifier specifying the behavior of the selection of points shown in the crosshair label.
    */
  var valueSelectionMode: String = js.native
}
object ASPxClientCrosshairOptions {
  
  @scala.inline
  def apply(
    argumentLineColor: String,
    chart: ASPxClientWebChart,
    crosshairLabelMode: String,
    groupHeaderPattern: String,
    linesMode: String,
    showArgumentLine: Boolean,
    showAxisXLabels: Boolean,
    showAxisYLabels: Boolean,
    showCrosshairLabels: Boolean,
    showGroupHeaders: Boolean,
    showOnlyInFocusedPane: Boolean,
    showOutOfRangePoints: Boolean,
    showValueLine: Boolean,
    snapMode: String,
    valueLineColor: String,
    valueSelectionMode: String
  ): ASPxClientCrosshairOptions = {
    val __obj = js.Dynamic.literal(argumentLineColor = argumentLineColor.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], crosshairLabelMode = crosshairLabelMode.asInstanceOf[js.Any], groupHeaderPattern = groupHeaderPattern.asInstanceOf[js.Any], linesMode = linesMode.asInstanceOf[js.Any], showArgumentLine = showArgumentLine.asInstanceOf[js.Any], showAxisXLabels = showAxisXLabels.asInstanceOf[js.Any], showAxisYLabels = showAxisYLabels.asInstanceOf[js.Any], showCrosshairLabels = showCrosshairLabels.asInstanceOf[js.Any], showGroupHeaders = showGroupHeaders.asInstanceOf[js.Any], showOnlyInFocusedPane = showOnlyInFocusedPane.asInstanceOf[js.Any], showOutOfRangePoints = showOutOfRangePoints.asInstanceOf[js.Any], showValueLine = showValueLine.asInstanceOf[js.Any], snapMode = snapMode.asInstanceOf[js.Any], valueLineColor = valueLineColor.asInstanceOf[js.Any], valueSelectionMode = valueSelectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCrosshairOptions]
  }
  
  @scala.inline
  implicit class ASPxClientCrosshairOptionsMutableBuilder[Self <: ASPxClientCrosshairOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgumentLineColor(value: String): Self = StObject.set(x, "argumentLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrosshairLabelMode(value: String): Self = StObject.set(x, "crosshairLabelMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupHeaderPattern(value: String): Self = StObject.set(x, "groupHeaderPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinesMode(value: String): Self = StObject.set(x, "linesMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowArgumentLine(value: Boolean): Self = StObject.set(x, "showArgumentLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAxisXLabels(value: Boolean): Self = StObject.set(x, "showAxisXLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAxisYLabels(value: Boolean): Self = StObject.set(x, "showAxisYLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCrosshairLabels(value: Boolean): Self = StObject.set(x, "showCrosshairLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowGroupHeaders(value: Boolean): Self = StObject.set(x, "showGroupHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOnlyInFocusedPane(value: Boolean): Self = StObject.set(x, "showOnlyInFocusedPane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOutOfRangePoints(value: Boolean): Self = StObject.set(x, "showOutOfRangePoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowValueLine(value: Boolean): Self = StObject.set(x, "showValueLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapMode(value: String): Self = StObject.set(x, "snapMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueLineColor(value: String): Self = StObject.set(x, "valueLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueSelectionMode(value: String): Self = StObject.set(x, "valueSelectionMode", value.asInstanceOf[js.Any])
  }
}
