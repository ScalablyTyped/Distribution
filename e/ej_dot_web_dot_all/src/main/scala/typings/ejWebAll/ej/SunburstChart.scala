package typings.ejWebAll.ej

import typings.ejWebAll.ej.datavisualization.Sunburst.FontStyle
import typings.ejWebAll.ej.datavisualization.Sunburst.FontWeight
import typings.ejWebAll.ej.datavisualization.Sunburst.SunburstAlignment
import typings.ejWebAll.ej.datavisualization.Sunburst.SunburstClickAction
import typings.ejWebAll.ej.datavisualization.Sunburst.SunburstHighlightMode
import typings.ejWebAll.ej.datavisualization.Sunburst.SunburstHighlightType
import typings.ejWebAll.ej.datavisualization.Sunburst.SunburstHorizontalAlignment
import typings.ejWebAll.ej.datavisualization.Sunburst.SunburstLabelOverflowMode
import typings.ejWebAll.ej.datavisualization.Sunburst.SunburstLabelRotationMode
import typings.ejWebAll.ej.datavisualization.Sunburst.SunburstLegendPosition
import typings.ejWebAll.ej.datavisualization.Sunburst.SunburstLegendShape
import typings.ejWebAll.ej.datavisualization.Sunburst.SunburstTheme
import typings.ejWebAll.ej.datavisualization.Sunburst.SunburstVerticalAlignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SunburstChart
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  @JSName("model")
  var model_SunburstChart: Model = js.native
  
  /** Redraws the entire sunburst. You can call this method whenever you update, add or remove points from the data source or whenever you want to refresh the UI.
    * @returns {void}
    */
  def redraw(): Unit = js.native
}
object SunburstChart {
  
  trait Border extends StObject {
    
    /** Border color of the sunburst.
      * @default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Width of the Sunburst border.
      * @default {2}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Border {
    
    inline def apply(): Border = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Border]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Border] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Includes clicked region data
      */
    var data: js.UndefOr[String] = js.undefined
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ClickEventArgs {
    
    inline def apply(): ClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DataLabelRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Sunburst datalabel data
      */
    var data: js.UndefOr[String] = js.undefined
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DataLabelRenderingEventArgs {
    
    inline def apply(): DataLabelRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataLabelRenderingEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataLabelRenderingEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DataLabelSettings extends StObject {
    
    /** Fill color for the datalabel
      * @default {null}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Options for customizing the data label font.
      */
    var font: js.UndefOr[DataLabelSettingsFont] = js.undefined
    
    /** Datalabel overflow mode
      * @default {Trim. See LabelOverflowMode}
      */
    var labelOverflowMode: js.UndefOr[SunburstLabelOverflowMode | String] = js.undefined
    
    /** Alignment of sunburst datalabel
      * @default {Angle. See DatalabelAlignment}
      */
    var labelRotationMode: js.UndefOr[SunburstLabelRotationMode | String] = js.undefined
    
    /** Custom template for datalabel
      * @default {null}
      */
    var template: js.UndefOr[String] = js.undefined
    
    /** Datalabel visibility of the Sunburst.
      * @default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object DataLabelSettings {
    
    inline def apply(): DataLabelSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataLabelSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataLabelSettings] (val x: Self) extends AnyVal {
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFont(value: DataLabelSettingsFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setLabelOverflowMode(value: SunburstLabelOverflowMode | String): Self = StObject.set(x, "labelOverflowMode", value.asInstanceOf[js.Any])
      
      inline def setLabelOverflowModeUndefined: Self = StObject.set(x, "labelOverflowMode", js.undefined)
      
      inline def setLabelRotationMode(value: SunburstLabelRotationMode | String): Self = StObject.set(x, "labelRotationMode", value.asInstanceOf[js.Any])
      
      inline def setLabelRotationModeUndefined: Self = StObject.set(x, "labelRotationMode", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait DataLabelSettingsFont extends StObject {
    
    /** Font color of the data label text.
      * @default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Font family of the data label.
      * @default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Font style of the data label.
      * @default {normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Font weight of the data label.
      * @default {regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
    
    /** Opacity of the text.
      * @default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Font size of the data label.
      * @default {12px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object DataLabelSettingsFont {
    
    inline def apply(): DataLabelSettingsFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataLabelSettingsFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataLabelSettingsFont] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait DoubleClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Includes double clicked region data
      */
    var data: js.UndefOr[String] = js.undefined
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DoubleClickEventArgs {
    
    inline def apply(): DoubleClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DoubleClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DoubleClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DrillDownBackEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Drill down data of points
      */
    var data: js.UndefOr[String] = js.undefined
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DrillDownBackEventArgs {
    
    inline def apply(): DrillDownBackEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrillDownBackEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrillDownBackEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DrillDownClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Clicked point data
      */
    var data: js.UndefOr[String] = js.undefined
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DrillDownClickEventArgs {
    
    inline def apply(): DrillDownClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrillDownClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrillDownClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DrillDownResetEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Drill down reset data
      */
    var data: js.UndefOr[String] = js.undefined
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DrillDownResetEventArgs {
    
    inline def apply(): DrillDownResetEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrillDownResetEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DrillDownResetEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait HighlightSettings extends StObject {
    
    /** Color of the levels/point on highlight.
      * @default {red}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Enables/disables the ability to highlight the levels or point interactively.
      * @default {false}
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether the levels or point has to be highlighted.
      * @default {point. See Mode}
      */
    var mode: js.UndefOr[SunburstHighlightMode | String] = js.undefined
    
    /** Opacity of the levels/point on highlight.
      * @default {0.5}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies whether the levels or data point has to be highlighted.
      * @default {opacity. See Mode}
      */
    var `type`: js.UndefOr[SunburstHighlightType | String] = js.undefined
  }
  object HighlightSettings {
    
    inline def apply(): HighlightSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HighlightSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HighlightSettings] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setMode(value: SunburstHighlightMode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setType(value: SunburstHighlightType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Legend extends StObject {
    
    /** Horizontal alignment of the legend.
      * @default {Center. See Alignment}
      */
    var alignment: js.UndefOr[SunburstAlignment | String] = js.undefined
    
    /** Options for customizing the legend border.
      */
    var border: js.UndefOr[LegendBorder] = js.undefined
    
    /** Interactive action of legend items.
      * @default {toggleSegmentVisibility. See Alignment}
      */
    var clickAction: js.UndefOr[SunburstClickAction | String] = js.undefined
    
    /** Number of columns to arrange the legend items.
      * @default {null}
      */
    var columnCount: js.UndefOr[Double] = js.undefined
    
    /** Options to customize the font used for legend item text.
      */
    var font: js.UndefOr[LegendFont] = js.undefined
    
    /** Gap or padding between the legend items.
      * @default {10}
      */
    var itemPadding: js.UndefOr[Double] = js.undefined
    
    /** Options to customize the style of legend items.
      */
    var itemStyle: js.UndefOr[LegendItemStyle] = js.undefined
    
    /** Options to customize the location of sunburst legend. Legend is placed in provided location only when value of position property is custom
      */
    var location: js.UndefOr[LegendLocation] = js.undefined
    
    /** Places the legend at specified position. Legend can be placed at **left**, **right**, **top** or **bottom** of the chart area. To manually specify the location of legend, set
      * **custom** as value to this property.
      * @default {Bottom. See Position}
      */
    var position: js.UndefOr[SunburstLegendPosition | String] = js.undefined
    
    /** Number of rows to arrange the legend items.
      * @default {null}
      */
    var rowCount: js.UndefOr[Double] = js.undefined
    
    /** Shape of the legend items.
      * @default {None. See Shape}
      */
    var shape: js.UndefOr[SunburstLegendShape | String] = js.undefined
    
    /** Options to customize the size of the legend.
      */
    var size: js.UndefOr[LegendSize] = js.undefined
    
    /** Options to customize the legend title.
      */
    var title: js.UndefOr[LegendTitle] = js.undefined
    
    /** Visibility of the legend.
      * @default {false}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object Legend {
    
    inline def apply(): Legend = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Legend]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Legend] (val x: Self) extends AnyVal {
      
      inline def setAlignment(value: SunburstAlignment | String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setBorder(value: LegendBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setClickAction(value: SunburstClickAction | String): Self = StObject.set(x, "clickAction", value.asInstanceOf[js.Any])
      
      inline def setClickActionUndefined: Self = StObject.set(x, "clickAction", js.undefined)
      
      inline def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      inline def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
      
      inline def setFont(value: LegendFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setItemPadding(value: Double): Self = StObject.set(x, "itemPadding", value.asInstanceOf[js.Any])
      
      inline def setItemPaddingUndefined: Self = StObject.set(x, "itemPadding", js.undefined)
      
      inline def setItemStyle(value: LegendItemStyle): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      inline def setLocation(value: LegendLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setPosition(value: SunburstLegendPosition | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
      
      inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
      
      inline def setShape(value: SunburstLegendShape | String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: LegendSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTitle(value: LegendTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait LegendBorder extends StObject {
    
    /** Border color of the legend.
      * @default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Border width of the legend.
      * @default {1}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object LegendBorder {
    
    inline def apply(): LegendBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LegendBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait LegendFont extends StObject {
    
    /** Font family for legend item text.
      * @default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Font style for legend item text.
      * @default {Normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Font weight for legend item text.
      * @default {Regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
    
    /** Font size for legend item text.
      * @default {12px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object LegendFont {
    
    inline def apply(): LegendFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LegendFont] (val x: Self) extends AnyVal {
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait LegendItemStyle extends StObject {
    
    /** Height of the shape in legend items.
      * @default {10}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Width of the shape in legend items.
      * @default {10}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object LegendItemStyle {
    
    inline def apply(): LegendItemStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendItemStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LegendItemStyle] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait LegendLocation extends StObject {
    
    /** X value or horizontal offset to position the legend in chart.
      * @default {0}
      */
    var x: js.UndefOr[Double] = js.undefined
    
    /** Y value or vertical offset to position the legend.
      * @default {0}
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object LegendLocation {
    
    inline def apply(): LegendLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendLocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LegendLocation] (val x: Self) extends AnyVal {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait LegendSize extends StObject {
    
    /** Height of the legend. Height can be specified in either pixel or percentage.
      * @default {null}
      */
    var height: js.UndefOr[String] = js.undefined
    
    /** Width of the legend. Width can be specified in either pixel or percentage.
      * @default {null}
      */
    var width: js.UndefOr[String] = js.undefined
  }
  object LegendSize {
    
    inline def apply(): LegendSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LegendSize] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait LegendTitle extends StObject {
    
    /** Options to customize the font used for legend title
      */
    var font: js.UndefOr[LegendTitleFont] = js.undefined
    
    /** Text to be displayed in legend title.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Alignment of the legend title.
      * @default {center. See Alignment}
      */
    var textAlignment: js.UndefOr[SunburstAlignment | String] = js.undefined
    
    /** Enables or disables the legend title.
      * @default {true}
      */
    var visible: js.UndefOr[String] = js.undefined
  }
  object LegendTitle {
    
    inline def apply(): LegendTitle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendTitle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LegendTitle] (val x: Self) extends AnyVal {
      
      inline def setFont(value: LegendTitleFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextAlignment(value: SunburstAlignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      inline def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait LegendTitleFont extends StObject {
    
    /** Font family for the text in legend title.
      * @default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Font style for legend title.
      * @default {normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Font weight for legend title.
      * @default {normal. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
    
    /** Font size for legend title.
      * @default {12px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object LegendTitleFont {
    
    inline def apply(): LegendTitleFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendTitleFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LegendTitleFont] (val x: Self) extends AnyVal {
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait Level extends StObject {
    
    /** Specifies the group member path
      * @default {null}
      */
    var groupMemberPath: js.UndefOr[String] = js.undefined
  }
  object Level {
    
    inline def apply(): Level = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Level]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
      
      inline def setGroupMemberPath(value: String): Self = StObject.set(x, "groupMemberPath", value.asInstanceOf[js.Any])
      
      inline def setGroupMemberPathUndefined: Self = StObject.set(x, "groupMemberPath", js.undefined)
    }
  }
  
  trait LoadEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Load event data
      */
    var data: js.UndefOr[String] = js.undefined
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object LoadEventArgs {
    
    inline def apply(): LoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait LoadedEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Loaded event data
      */
    var data: js.UndefOr[String] = js.undefined
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object LoadedEventArgs {
    
    inline def apply(): LoadedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadedEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadedEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Margin extends StObject {
    
    /** Spacing for the bottom margin of the chart area. Setting positive value decreases the height of the chart area from the bottom.
      * @default {10}
      */
    var bottom: js.UndefOr[Double] = js.undefined
    
    /** Spacing for the left margin of chart area. Setting positive value decreases the width of the chart area from left side.
      * @default {10}
      */
    var left: js.UndefOr[Double] = js.undefined
    
    /** Spacing for the right margin of chart area. Setting positive value decreases the width of the chart area from right side.
      * @default {10}
      */
    var right: js.UndefOr[Double] = js.undefined
    
    /** Spacing for the top margin of chart area. Setting positive value decreases the height of the chart area from the top.
      * @default {10}
      */
    var top: js.UndefOr[Double] = js.undefined
  }
  object Margin {
    
    inline def apply(): Margin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Margin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Margin] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Fires, on clicking the sunburst chart.
      */
    var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
    
    /** Animation type of sunburst
      * @default {rotation. See Alignment}
      */
    var animationType: js.UndefOr[typings.ejWebAll.ej.datavisualization.Sunburst.Animation | String] = js.undefined
    
    /** Background color of the plot area.
      * @default {null}
      */
    var background: js.UndefOr[String] = js.undefined
    
    /** Options for customizing the sunburst border.
      */
    var border: js.UndefOr[Border] = js.undefined
    
    /** Fires before rendering the datalabel
      */
    var dataLabelRendering: js.UndefOr[js.Function1[/* e */ DataLabelRenderingEventArgs, Unit]] = js.undefined
    
    /** Options to customize the Sunburst dataLabel.
      */
    var dataLabelSettings: js.UndefOr[DataLabelSettings] = js.undefined
    
    /** Specifies the dataSource to the sunburst.
      * @default {null}
      */
    var dataSource: js.UndefOr[Any] = js.undefined
    
    /** Fires, on double clicking the sunburst chart.
      */
    var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.undefined
    
    /** Fires when resetting drilldown points.
      */
    var drillDownBack: js.UndefOr[js.Function1[/* e */ DrillDownBackEventArgs, Unit]] = js.undefined
    
    /** Fires when clicking the point to perform drilldown.
      */
    var drillDownClick: js.UndefOr[js.Function1[/* e */ DrillDownClickEventArgs, Unit]] = js.undefined
    
    /** Fires after resetting the sunburst points
      */
    var drillDownReset: js.UndefOr[js.Function1[/* e */ DrillDownResetEventArgs, Unit]] = js.undefined
    
    /** Enable/disable the animation for all the levels.
      * @default {false}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** Sunburst rendering will end at the specified value
      * @default {null}
      */
    var endAngle: js.UndefOr[Double] = js.undefined
    
    /** Options for customizing the appearance of the levels or point while highlighting.
      */
    var highlightSettings: js.UndefOr[HighlightSettings] = js.undefined
    
    /** Sunburst inner radius value
      * @default {0.4}
      */
    var innerRadius: js.UndefOr[Double] = js.undefined
    
    /** Controls whether sunburst has to be responsive or not.
      * @default {true}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** Options to customize the legend items and legend title.
      */
    var legend: js.UndefOr[Legend] = js.undefined
    
    /** Specify levels of sunburst for grouped visualization of data
      * @default {[]}
      */
    var levels: js.UndefOr[js.Array[Level]] = js.undefined
    
    /** Fires before loading.
      */
    var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
    
    /** Fires after rendering sunburst.
      */
    var loaded: js.UndefOr[js.Function1[/* e */ LoadedEventArgs, Unit]] = js.undefined
    
    /** Options to customize the left, right, top and bottom margins of sunburst area.
      */
    var margin: js.UndefOr[Margin] = js.undefined
    
    /** Opacity of the levels.
      * @default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Palette color for the data points.
      * @default {null}
      */
    var palette: js.UndefOr[String] = js.undefined
    
    /** Parent node of the data points.
      * @default {null}
      */
    var parentNode: js.UndefOr[String] = js.undefined
    
    /** Fires after clicking the point in sunburst
      */
    var pointRegionClick: js.UndefOr[js.Function1[/* e */ PointRegionClickEventArgs, Unit]] = js.undefined
    
    /** Fires while moving the mouse over sunburst points
      */
    var pointRegionMouseMove: js.UndefOr[js.Function1[/* e */ PointRegionMouseMoveEventArgs, Unit]] = js.undefined
    
    /** Options for customizing sunburst points.
      */
    var points: js.UndefOr[Points] = js.undefined
    
    /** Fires before rendering sunburst.
      */
    var preRender: js.UndefOr[js.Function1[/* e */ PreRenderEventArgs, Unit]] = js.undefined
    
    /** Sunburst outer radius value
      * @default {1}
      */
    var radius: js.UndefOr[Double] = js.undefined
    
    /** Fires, on right clicking the sunburst chart
      */
    var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.undefined
    
    /** Options for customizing the sunburst segment border.
      */
    var segmentBorder: js.UndefOr[SegmentBorder] = js.undefined
    
    /** Fires before rendering each segment
      */
    var segmentRendering: js.UndefOr[js.Function1[/* e */ SegmentRenderingEventArgs, Unit]] = js.undefined
    
    /** Options for customizing the appearance of the levels or data point while selection.
      */
    var selectionSettings: js.UndefOr[SelectionSettings] = js.undefined
    
    /** Options to customize the Sunburst size.
      */
    var size: js.UndefOr[Size] = js.undefined
    
    /** Sunburst rendering will start from the specified value
      * @default {null}
      */
    var startAngle: js.UndefOr[Double] = js.undefined
    
    /** Specifies the theme for Sunburst.
      * @default {Flatlight. See Theme}
      */
    var theme: js.UndefOr[SunburstTheme | String] = js.undefined
    
    /** Options for customizing the title and subtitle of sunburst.
      */
    var title: js.UndefOr[Title] = js.undefined
    
    /** Fires before rendering sunburst title.
      */
    var titleRendering: js.UndefOr[js.Function1[/* e */ TitleRenderingEventArgs, Unit]] = js.undefined
    
    /** Options to customize the Sunburst tooltip.
      */
    var tooltip: js.UndefOr[typings.ejWebAll.ej.SunburstChart.Tooltip] = js.undefined
    
    /** Fires during initialization of tooltip.
      */
    var tooltipInitialize: js.UndefOr[js.Function1[/* e */ TooltipInitializeEventArgs, Unit]] = js.undefined
    
    /** Bind the data field from the data source.
      * @default {null}
      */
    var valueMemberPath: js.UndefOr[String] = js.undefined
    
    /** Controls the visibility of sunburst.
      * @default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /** Name of the property in the datasource that contains x values.
      * @default {null}
      */
    var xName: js.UndefOr[String] = js.undefined
    
    /** Name of the property in the datasource that contains y values.
      * @default {null}
      */
    var yName: js.UndefOr[String] = js.undefined
    
    /** Options for enable zooming feature of chart.
      */
    var zoomSettings: js.UndefOr[ZoomSettings] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.SunburstChart.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.SunburstChart.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.SunburstChart.Model] (val x: Self) extends AnyVal {
      
      inline def setAnimationType(value: typings.ejWebAll.ej.datavisualization.Sunburst.Animation | String): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
      
      inline def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBorder(value: Border): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setClick(value: /* e */ ClickEventArgs => Unit): Self = StObject.set(x, "Click", js.Any.fromFunction1(value))
      
      inline def setClickUndefined: Self = StObject.set(x, "Click", js.undefined)
      
      inline def setDataLabelRendering(value: /* e */ DataLabelRenderingEventArgs => Unit): Self = StObject.set(x, "dataLabelRendering", js.Any.fromFunction1(value))
      
      inline def setDataLabelRenderingUndefined: Self = StObject.set(x, "dataLabelRendering", js.undefined)
      
      inline def setDataLabelSettings(value: DataLabelSettings): Self = StObject.set(x, "dataLabelSettings", value.asInstanceOf[js.Any])
      
      inline def setDataLabelSettingsUndefined: Self = StObject.set(x, "dataLabelSettings", js.undefined)
      
      inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDoubleClick(value: /* e */ DoubleClickEventArgs => Unit): Self = StObject.set(x, "doubleClick", js.Any.fromFunction1(value))
      
      inline def setDoubleClickUndefined: Self = StObject.set(x, "doubleClick", js.undefined)
      
      inline def setDrillDownBack(value: /* e */ DrillDownBackEventArgs => Unit): Self = StObject.set(x, "drillDownBack", js.Any.fromFunction1(value))
      
      inline def setDrillDownBackUndefined: Self = StObject.set(x, "drillDownBack", js.undefined)
      
      inline def setDrillDownClick(value: /* e */ DrillDownClickEventArgs => Unit): Self = StObject.set(x, "drillDownClick", js.Any.fromFunction1(value))
      
      inline def setDrillDownClickUndefined: Self = StObject.set(x, "drillDownClick", js.undefined)
      
      inline def setDrillDownReset(value: /* e */ DrillDownResetEventArgs => Unit): Self = StObject.set(x, "drillDownReset", js.Any.fromFunction1(value))
      
      inline def setDrillDownResetUndefined: Self = StObject.set(x, "drillDownReset", js.undefined)
      
      inline def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      inline def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
      
      inline def setHighlightSettings(value: HighlightSettings): Self = StObject.set(x, "highlightSettings", value.asInstanceOf[js.Any])
      
      inline def setHighlightSettingsUndefined: Self = StObject.set(x, "highlightSettings", js.undefined)
      
      inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
      
      inline def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
      
      inline def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      inline def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      inline def setLegend(value: Legend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setLevels(value: js.Array[Level]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
      
      inline def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
      
      inline def setLevelsVarargs(value: Level*): Self = StObject.set(x, "levels", js.Array(value*))
      
      inline def setLoad(value: /* e */ LoadEventArgs => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setLoaded(value: /* e */ LoadedEventArgs => Unit): Self = StObject.set(x, "loaded", js.Any.fromFunction1(value))
      
      inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
      
      inline def setMargin(value: Margin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setPalette(value: String): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      inline def setParentNode(value: String): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
      
      inline def setParentNodeUndefined: Self = StObject.set(x, "parentNode", js.undefined)
      
      inline def setPointRegionClick(value: /* e */ PointRegionClickEventArgs => Unit): Self = StObject.set(x, "pointRegionClick", js.Any.fromFunction1(value))
      
      inline def setPointRegionClickUndefined: Self = StObject.set(x, "pointRegionClick", js.undefined)
      
      inline def setPointRegionMouseMove(value: /* e */ PointRegionMouseMoveEventArgs => Unit): Self = StObject.set(x, "pointRegionMouseMove", js.Any.fromFunction1(value))
      
      inline def setPointRegionMouseMoveUndefined: Self = StObject.set(x, "pointRegionMouseMove", js.undefined)
      
      inline def setPoints(value: Points): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      inline def setPreRender(value: /* e */ PreRenderEventArgs => Unit): Self = StObject.set(x, "preRender", js.Any.fromFunction1(value))
      
      inline def setPreRenderUndefined: Self = StObject.set(x, "preRender", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setRightClick(value: /* e */ RightClickEventArgs => Unit): Self = StObject.set(x, "rightClick", js.Any.fromFunction1(value))
      
      inline def setRightClickUndefined: Self = StObject.set(x, "rightClick", js.undefined)
      
      inline def setSegmentBorder(value: SegmentBorder): Self = StObject.set(x, "segmentBorder", value.asInstanceOf[js.Any])
      
      inline def setSegmentBorderUndefined: Self = StObject.set(x, "segmentBorder", js.undefined)
      
      inline def setSegmentRendering(value: /* e */ SegmentRenderingEventArgs => Unit): Self = StObject.set(x, "segmentRendering", js.Any.fromFunction1(value))
      
      inline def setSegmentRenderingUndefined: Self = StObject.set(x, "segmentRendering", js.undefined)
      
      inline def setSelectionSettings(value: SelectionSettings): Self = StObject.set(x, "selectionSettings", value.asInstanceOf[js.Any])
      
      inline def setSelectionSettingsUndefined: Self = StObject.set(x, "selectionSettings", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
      
      inline def setTheme(value: SunburstTheme | String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTitle(value: Title): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleRendering(value: /* e */ TitleRenderingEventArgs => Unit): Self = StObject.set(x, "titleRendering", js.Any.fromFunction1(value))
      
      inline def setTitleRenderingUndefined: Self = StObject.set(x, "titleRendering", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTooltip(value: typings.ejWebAll.ej.SunburstChart.Tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipInitialize(value: /* e */ TooltipInitializeEventArgs => Unit): Self = StObject.set(x, "tooltipInitialize", js.Any.fromFunction1(value))
      
      inline def setTooltipInitializeUndefined: Self = StObject.set(x, "tooltipInitialize", js.undefined)
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setValueMemberPath(value: String): Self = StObject.set(x, "valueMemberPath", value.asInstanceOf[js.Any])
      
      inline def setValueMemberPathUndefined: Self = StObject.set(x, "valueMemberPath", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setXName(value: String): Self = StObject.set(x, "xName", value.asInstanceOf[js.Any])
      
      inline def setXNameUndefined: Self = StObject.set(x, "xName", js.undefined)
      
      inline def setYName(value: String): Self = StObject.set(x, "yName", value.asInstanceOf[js.Any])
      
      inline def setYNameUndefined: Self = StObject.set(x, "yName", js.undefined)
      
      inline def setZoomSettings(value: ZoomSettings): Self = StObject.set(x, "zoomSettings", value.asInstanceOf[js.Any])
      
      inline def setZoomSettingsUndefined: Self = StObject.set(x, "zoomSettings", js.undefined)
    }
  }
  
  trait PointRegionClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Includes clicked points region data
      */
    var data: js.UndefOr[String] = js.undefined
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object PointRegionClickEventArgs {
    
    inline def apply(): PointRegionClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointRegionClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PointRegionClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait PointRegionMouseMoveEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Includes data of mouse moved region
      */
    var data: js.UndefOr[String] = js.undefined
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object PointRegionMouseMoveEventArgs {
    
    inline def apply(): PointRegionMouseMoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointRegionMouseMoveEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PointRegionMouseMoveEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Points extends StObject {
    
    /** Points fill color of the sunburst.
      * @default {null}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Points text of the sunburst.
      * @default {null}
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Points x value of the sunburst.
      * @default {null}
      */
    var x: js.UndefOr[String] = js.undefined
    
    /** Points y value of the sunburst.
      * @default {null}
      */
    var y: js.UndefOr[Double] = js.undefined
  }
  object Points {
    
    inline def apply(): Points = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Points]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Points] (val x: Self) extends AnyVal {
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait PreRenderEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** PreRender event data
      */
    var data: js.UndefOr[String] = js.undefined
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object PreRenderEventArgs {
    
    inline def apply(): PreRenderEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreRenderEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreRenderEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RightClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Includes right clicked region data
      */
    var data: js.UndefOr[String] = js.undefined
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RightClickEventArgs {
    
    inline def apply(): RightClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RightClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RightClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SegmentBorder extends StObject {
    
    /** Segment Border color of the sunburst.
      * @default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Width of the Sunburst segment border.
      * @default {2}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object SegmentBorder {
    
    inline def apply(): SegmentBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SegmentBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait SegmentRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Sunburst datalabel data
      */
    var data: js.UndefOr[String] = js.undefined
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SegmentRenderingEventArgs {
    
    inline def apply(): SegmentRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentRenderingEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SegmentRenderingEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SelectionSettings extends StObject {
    
    /** Color of the levels/point on selection.
      * @default {green}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Enables/disables the ability to select the levels or data point interactively.
      * @default {false}
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether the levels or data point has to be selected.
      * @default {point. See Mode}
      */
    var mode: js.UndefOr[SunburstHighlightMode | String] = js.undefined
    
    /** Opacity of the levels/point on selection.
      * @default {0.5}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies whether the levels or data point has to be selected.
      * @default {opacity. See Mode}
      */
    var `type`: js.UndefOr[SunburstHighlightType | String] = js.undefined
  }
  object SelectionSettings {
    
    inline def apply(): SelectionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectionSettings] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setMode(value: SunburstHighlightMode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setType(value: SunburstHighlightType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Size extends StObject {
    
    /** Height of the Sunburst.
      * @default {''}
      */
    var height: js.UndefOr[String] = js.undefined
    
    /** Width of the Sunburst.
      * @default {''}
      */
    var width: js.UndefOr[String] = js.undefined
  }
  object Size {
    
    inline def apply(): Size = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Title extends StObject {
    
    /** Options for customizing the font of sunburst title.
      */
    var font: js.UndefOr[TitleFont] = js.undefined
    
    /** Options to customize the sub title of Sunburst.
      */
    var subtitle: js.UndefOr[TitleSubtitle] = js.undefined
    
    /** Title text for sunburst
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Title text alignment
      * @default {center. See TextAlignment}
      */
    var textAlignment: js.UndefOr[SunburstAlignment | String] = js.undefined
    
    /** Title text visibility for sunburst
      * @default {true}
      */
    var visible: js.UndefOr[String] = js.undefined
  }
  object Title {
    
    inline def apply(): Title = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Title]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Title] (val x: Self) extends AnyVal {
      
      inline def setFont(value: TitleFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setSubtitle(value: TitleSubtitle): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextAlignment(value: SunburstAlignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      inline def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait TitleFont extends StObject {
    
    /** Font family for Sunburst title.
      * @default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Font style for Sunburst title.
      * @default {Normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Font weight for Sunburst title.
      * @default {Regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
    
    /** Opacity of the Sunburst title.
      * @default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Font size for Sunburst title.
      * @default {20px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object TitleFont {
    
    inline def apply(): TitleFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TitleFont] (val x: Self) extends AnyVal {
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait TitleRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Sunburst title data
      */
    var data: js.UndefOr[String] = js.undefined
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object TitleRenderingEventArgs {
    
    inline def apply(): TitleRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleRenderingEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TitleRenderingEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait TitleSubtitle extends StObject {
    
    /** Options for customizing the font of sub title.
      */
    var font: js.UndefOr[TitleSubtitleFont] = js.undefined
    
    /** Subtitle text for sunburst
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Sub title text alignment
      * @default {far. See TextAlignment}
      */
    var textAlignment: js.UndefOr[SunburstAlignment | String] = js.undefined
    
    /** Sub title text visibility for sunburst
      * @default {true}
      */
    var visible: js.UndefOr[String] = js.undefined
  }
  object TitleSubtitle {
    
    inline def apply(): TitleSubtitle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleSubtitle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TitleSubtitle] (val x: Self) extends AnyVal {
      
      inline def setFont(value: TitleSubtitleFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextAlignment(value: SunburstAlignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      inline def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait TitleSubtitleFont extends StObject {
    
    /** Font family of sub title.
      * @default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Font style for sub title.
      * @default {Normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Font weight for sub title.
      * @default {Regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
    
    /** Opacity of the sub title.
      * @default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Font size for sub title.
      * @default {12px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object TitleSubtitleFont {
    
    inline def apply(): TitleSubtitleFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleSubtitleFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TitleSubtitleFont] (val x: Self) extends AnyVal {
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait Tooltip extends StObject {
    
    /** Options for customizing the border of the sunburst tooltip.
      */
    var border: js.UndefOr[TooltipBorder] = js.undefined
    
    /** Fill color for the sunburst tooltip.
      * @default {null}
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** Options for customizing the font of the tooltip.
      */
    var font: js.UndefOr[TooltipFont] = js.undefined
    
    /** Setting the format for the data displayed in the tooltip
      * @default {#point.x# : #point.y#}
      */
    var format: js.UndefOr[String] = js.undefined
    
    /** Sets the opacity of the displayed tooltip
      * @default {0.95}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Custom template to the tooltip.
      * @default {null}
      */
    var template: js.UndefOr[String] = js.undefined
    
    /** tooltip visibility of the Sunburst.
      * @default {true}
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object Tooltip {
    
    inline def apply(): typings.ejWebAll.ej.SunburstChart.Tooltip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.SunburstChart.Tooltip]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.SunburstChart.Tooltip] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: TooltipBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFont(value: TooltipFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait TooltipBorder extends StObject {
    
    /** Border color of the tooltip.
      * @default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Border width of the tooltip.
      * @default {5}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object TooltipBorder {
    
    inline def apply(): TooltipBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait TooltipFont extends StObject {
    
    /** Font color of the text in the tooltip.
      * @default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Font Family for the tooltip.
      * @default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Specifies the font Style for the tooltip.
      * @default {Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.undefined
    
    /** Specifies the font weight for the tooltip.
      * @default {Regular}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.undefined
    
    /** Opacity for text in the tooltip.
      * @default {1}
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Font size for text in the tooltip.
      * @default {12px}
      */
    var size: js.UndefOr[String] = js.undefined
  }
  object TooltipFont {
    
    inline def apply(): TooltipFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipFont]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipFont] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait TooltipInitializeEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Sunburst tooltip data
      */
    var data: js.UndefOr[String] = js.undefined
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object TooltipInitializeEventArgs {
    
    inline def apply(): TooltipInitializeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipInitializeEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipInitializeEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ZoomSettings extends StObject {
    
    /** Enables or disables zooming.
      * @default {false}
      */
    var enable: js.UndefOr[Boolean] = js.undefined
    
    /** Toolbar horizontal alignment
      * @default {right. See Alignment}
      */
    var toolbarHorizontalAlignment: js.UndefOr[SunburstHorizontalAlignment | String] = js.undefined
    
    /** Toolbar vertical alignment
      * @default {top. See Alignment}
      */
    var toolbarVerticalAlignment: js.UndefOr[SunburstVerticalAlignment | String] = js.undefined
  }
  object ZoomSettings {
    
    inline def apply(): ZoomSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZoomSettings] (val x: Self) extends AnyVal {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setToolbarHorizontalAlignment(value: SunburstHorizontalAlignment | String): Self = StObject.set(x, "toolbarHorizontalAlignment", value.asInstanceOf[js.Any])
      
      inline def setToolbarHorizontalAlignmentUndefined: Self = StObject.set(x, "toolbarHorizontalAlignment", js.undefined)
      
      inline def setToolbarVerticalAlignment(value: SunburstVerticalAlignment | String): Self = StObject.set(x, "toolbarVerticalAlignment", value.asInstanceOf[js.Any])
      
      inline def setToolbarVerticalAlignmentUndefined: Self = StObject.set(x, "toolbarVerticalAlignment", js.undefined)
    }
  }
}
