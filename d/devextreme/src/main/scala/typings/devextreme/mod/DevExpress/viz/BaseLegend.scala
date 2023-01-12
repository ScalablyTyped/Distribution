package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.anon.BottomLeft
import typings.devextreme.anon.CornerRadius
import typings.devextreme.mod.DevExpress.common.HorizontalAlignment
import typings.devextreme.mod.DevExpress.common.Orientation
import typings.devextreme.mod.DevExpress.common.Position
import typings.devextreme.mod.DevExpress.common.VerticalEdge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseLegend extends StObject {
  
  /**
    * Colors the legend&apos;s background.
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Configures the legend&apos;s border.
    */
  var border: js.UndefOr[CornerRadius] = js.undefined
  
  /**
    * Arranges legend items into several columns.
    */
  var columnCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies an empty space between item columns in pixels.
    */
  var columnItemSpacing: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the legend items&apos; font properties.
    */
  var font: js.UndefOr[Font] = js.undefined
  
  /**
    * Along with verticalAlignment, specifies the legend&apos;s position.
    */
  var horizontalAlignment: js.UndefOr[HorizontalAlignment] = js.undefined
  
  /**
    * Specifies the text&apos;s position relative to the marker in a legend item.
    */
  var itemTextPosition: js.UndefOr[Position] = js.undefined
  
  /**
    * Aligns items in the last column or row (depending on the legend&apos;s orientation). Applies when legend items are not divided into columns or rows equally.
    */
  var itemsAlignment: js.UndefOr[HorizontalAlignment] = js.undefined
  
  /**
    * Generates an empty space, measured in pixels, around the legend.
    */
  var margin: js.UndefOr[Double | BottomLeft] = js.undefined
  
  /**
    * Specifies the marker&apos;s size in a legend item in pixels.
    */
  var markerSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Arranges legend items vertically (in a column) or horizontally (in a row). The default value is &apos;horizontal&apos; if the legend.horizontalAlignment is &apos;center&apos;. Otherwise, it is &apos;vertical&apos;.
    */
  var orientation: js.UndefOr[Orientation] = js.undefined
  
  /**
    * Generates an empty space, measured in pixels, between the legend&apos;s left/right border and its items.
    */
  var paddingLeftRight: js.UndefOr[Double] = js.undefined
  
  /**
    * Generates an empty space, measured in pixels, between the legend&apos;s top/bottom border and its items.
    */
  var paddingTopBottom: js.UndefOr[Double] = js.undefined
  
  /**
    * Arranges legend items in several rows.
    */
  var rowCount: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies an empty space between item rows in pixels.
    */
  var rowItemSpacing: js.UndefOr[Double] = js.undefined
  
  /**
    * Configures the legend title.
    */
  var title: js.UndefOr[typings.devextreme.anon.HorizontalAlignment | String] = js.undefined
  
  /**
    * Along with horizontalAlignment, specifies the legend&apos;s position.
    */
  var verticalAlignment: js.UndefOr[VerticalEdge] = js.undefined
  
  /**
    * Specifies the legend&apos;s visibility.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object BaseLegend {
  
  inline def apply(): BaseLegend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseLegend]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseLegend] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorder(value: CornerRadius): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
    
    inline def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
    
    inline def setColumnItemSpacing(value: Double): Self = StObject.set(x, "columnItemSpacing", value.asInstanceOf[js.Any])
    
    inline def setColumnItemSpacingUndefined: Self = StObject.set(x, "columnItemSpacing", js.undefined)
    
    inline def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setHorizontalAlignment(value: HorizontalAlignment): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
    
    inline def setItemTextPosition(value: Position): Self = StObject.set(x, "itemTextPosition", value.asInstanceOf[js.Any])
    
    inline def setItemTextPositionUndefined: Self = StObject.set(x, "itemTextPosition", js.undefined)
    
    inline def setItemsAlignment(value: HorizontalAlignment): Self = StObject.set(x, "itemsAlignment", value.asInstanceOf[js.Any])
    
    inline def setItemsAlignmentUndefined: Self = StObject.set(x, "itemsAlignment", js.undefined)
    
    inline def setMargin(value: Double | BottomLeft): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMarkerSize(value: Double): Self = StObject.set(x, "markerSize", value.asInstanceOf[js.Any])
    
    inline def setMarkerSizeUndefined: Self = StObject.set(x, "markerSize", js.undefined)
    
    inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPaddingLeftRight(value: Double): Self = StObject.set(x, "paddingLeftRight", value.asInstanceOf[js.Any])
    
    inline def setPaddingLeftRightUndefined: Self = StObject.set(x, "paddingLeftRight", js.undefined)
    
    inline def setPaddingTopBottom(value: Double): Self = StObject.set(x, "paddingTopBottom", value.asInstanceOf[js.Any])
    
    inline def setPaddingTopBottomUndefined: Self = StObject.set(x, "paddingTopBottom", js.undefined)
    
    inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    
    inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    
    inline def setRowItemSpacing(value: Double): Self = StObject.set(x, "rowItemSpacing", value.asInstanceOf[js.Any])
    
    inline def setRowItemSpacingUndefined: Self = StObject.set(x, "rowItemSpacing", js.undefined)
    
    inline def setTitle(value: typings.devextreme.anon.HorizontalAlignment | String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVerticalAlignment(value: VerticalEdge): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
