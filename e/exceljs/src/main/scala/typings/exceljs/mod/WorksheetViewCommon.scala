package typings.exceljs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorksheetViewCommon extends StObject {
  
  /**
  	 * The currently selected cell
  	 */
  var activeCell: String
  
  /**
  	 * Sets the worksheet view's orientation to right-to-left, `false` by default
  	 */
  var rightToLeft: Boolean
  
  /**
  	 * Shows or hides the gridlines (shown for cells where borders have not been defined),
  	 * `true` by default
  	 */
  var showGridLines: Boolean
  
  /**
  	 * Shows or hides the row and column headers (e.g. A1, B1 at the top and 1,2,3 on the left,
  	 * `true` by default
  	 */
  var showRowColHeaders: Boolean
  
  /**
  	 * Shows or hides the ruler in Page Layout, `true` by default
  	 */
  var showRuler: Boolean
  
  /**
  	 * 	Percentage zoom to use for the view, `100` by default
  	 */
  var zoomScale: Double
  
  /**
  	 * 	Normal zoom for the view, `100` by default
  	 */
  var zoomScaleNormal: Double
}
object WorksheetViewCommon {
  
  @scala.inline
  def apply(
    activeCell: String,
    rightToLeft: Boolean,
    showGridLines: Boolean,
    showRowColHeaders: Boolean,
    showRuler: Boolean,
    zoomScale: Double,
    zoomScaleNormal: Double
  ): WorksheetViewCommon = {
    val __obj = js.Dynamic.literal(activeCell = activeCell.asInstanceOf[js.Any], rightToLeft = rightToLeft.asInstanceOf[js.Any], showGridLines = showGridLines.asInstanceOf[js.Any], showRowColHeaders = showRowColHeaders.asInstanceOf[js.Any], showRuler = showRuler.asInstanceOf[js.Any], zoomScale = zoomScale.asInstanceOf[js.Any], zoomScaleNormal = zoomScaleNormal.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetViewCommon]
  }
  
  @scala.inline
  implicit class WorksheetViewCommonMutableBuilder[Self <: WorksheetViewCommon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveCell(value: String): Self = StObject.set(x, "activeCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightToLeft(value: Boolean): Self = StObject.set(x, "rightToLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowGridLines(value: Boolean): Self = StObject.set(x, "showGridLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowRowColHeaders(value: Boolean): Self = StObject.set(x, "showRowColHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowRuler(value: Boolean): Self = StObject.set(x, "showRuler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomScale(value: Double): Self = StObject.set(x, "zoomScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoomScaleNormal(value: Double): Self = StObject.set(x, "zoomScaleNormal", value.asInstanceOf[js.Any])
  }
}
