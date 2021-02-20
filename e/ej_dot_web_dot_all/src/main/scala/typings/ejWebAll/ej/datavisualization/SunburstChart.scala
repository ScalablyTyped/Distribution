package typings.ejWebAll.ej.datavisualization

import typings.ejWebAll.ej.SunburstChart.Model
import typings.ejWebAll.ej.Widget_
import typings.ejWebAll.ej.datavisualization.Sunburst.Animation
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SunburstChart extends Widget_ {
  
  var defaults: Model = js.native
  
  @JSName("model")
  var model_SunburstChart: Model = js.native
  
  /** Redraws the entire sunburst. You can call this method whenever you update, add or remove points from the data source or whenever you want to refresh the UI.
    * @returns {void}
    */
  def redraw(): Unit = js.native
}
object SunburstChart {
  
  @js.native
  trait Border extends StObject {
    
    /** Border color of the sunburst.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Width of the Sunburst border.
      * @Default {2}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object Border {
    
    @scala.inline
    def apply(): Border = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Border]
    }
    
    @scala.inline
    implicit class BorderMutableBuilder[Self <: Border] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait ClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Includes clicked region data
      */
    var data: js.UndefOr[String] = js.native
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ClickEventArgs {
    
    @scala.inline
    def apply(): ClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClickEventArgs]
    }
    
    @scala.inline
    implicit class ClickEventArgsMutableBuilder[Self <: ClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DataLabelRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Sunburst datalabel data
      */
    var data: js.UndefOr[String] = js.native
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DataLabelRenderingEventArgs {
    
    @scala.inline
    def apply(): DataLabelRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataLabelRenderingEventArgs]
    }
    
    @scala.inline
    implicit class DataLabelRenderingEventArgsMutableBuilder[Self <: DataLabelRenderingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DataLabelSettings extends StObject {
    
    /** Fill color for the datalabel
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Options for customizing the data label font.
      */
    var font: js.UndefOr[DataLabelSettingsFont] = js.native
    
    /** Datalabel overflow mode
      * @Default {Trim. See LabelOverflowMode}
      */
    var labelOverflowMode: js.UndefOr[SunburstLabelOverflowMode | String] = js.native
    
    /** Alignment of sunburst datalabel
      * @Default {Angle. See DatalabelAlignment}
      */
    var labelRotationMode: js.UndefOr[SunburstLabelRotationMode | String] = js.native
    
    /** Custom template for datalabel
      * @Default {null}
      */
    var template: js.UndefOr[String] = js.native
    
    /** Datalabel visibility of the Sunburst.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object DataLabelSettings {
    
    @scala.inline
    def apply(): DataLabelSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataLabelSettings]
    }
    
    @scala.inline
    implicit class DataLabelSettingsMutableBuilder[Self <: DataLabelSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFont(value: DataLabelSettingsFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setLabelOverflowMode(value: SunburstLabelOverflowMode | String): Self = StObject.set(x, "labelOverflowMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelOverflowModeUndefined: Self = StObject.set(x, "labelOverflowMode", js.undefined)
      
      @scala.inline
      def setLabelRotationMode(value: SunburstLabelRotationMode | String): Self = StObject.set(x, "labelRotationMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelRotationModeUndefined: Self = StObject.set(x, "labelRotationMode", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait DataLabelSettingsFont extends StObject {
    
    /** Font color of the data label text.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Font family of the data label.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Font style of the data label.
      * @Default {normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Font weight of the data label.
      * @Default {regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.native
    
    /** Opacity of the text.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Font size of the data label.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object DataLabelSettingsFont {
    
    @scala.inline
    def apply(): DataLabelSettingsFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataLabelSettingsFont]
    }
    
    @scala.inline
    implicit class DataLabelSettingsFontMutableBuilder[Self <: DataLabelSettingsFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait DoubleClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Includes double clicked region data
      */
    var data: js.UndefOr[String] = js.native
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DoubleClickEventArgs {
    
    @scala.inline
    def apply(): DoubleClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DoubleClickEventArgs]
    }
    
    @scala.inline
    implicit class DoubleClickEventArgsMutableBuilder[Self <: DoubleClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DrillDownBackEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Drill down data of points
      */
    var data: js.UndefOr[String] = js.native
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DrillDownBackEventArgs {
    
    @scala.inline
    def apply(): DrillDownBackEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrillDownBackEventArgs]
    }
    
    @scala.inline
    implicit class DrillDownBackEventArgsMutableBuilder[Self <: DrillDownBackEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DrillDownClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Clicked point data
      */
    var data: js.UndefOr[String] = js.native
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DrillDownClickEventArgs {
    
    @scala.inline
    def apply(): DrillDownClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrillDownClickEventArgs]
    }
    
    @scala.inline
    implicit class DrillDownClickEventArgsMutableBuilder[Self <: DrillDownClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DrillDownResetEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Drill down reset data
      */
    var data: js.UndefOr[String] = js.native
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DrillDownResetEventArgs {
    
    @scala.inline
    def apply(): DrillDownResetEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrillDownResetEventArgs]
    }
    
    @scala.inline
    implicit class DrillDownResetEventArgsMutableBuilder[Self <: DrillDownResetEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait HighlightSettings extends StObject {
    
    /** Color of the levels/point on highlight.
      * @Default {red}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Enables/disables the ability to highlight the levels or point interactively.
      * @Default {false}
      */
    var enable: js.UndefOr[Boolean] = js.native
    
    /** Specifies whether the levels or point has to be highlighted.
      * @Default {point. See Mode}
      */
    var mode: js.UndefOr[SunburstHighlightMode | String] = js.native
    
    /** Opacity of the levels/point on highlight.
      * @Default {0.5}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Specifies whether the levels or data point has to be highlighted.
      * @Default {opacity. See Mode}
      */
    var `type`: js.UndefOr[SunburstHighlightType | String] = js.native
  }
  object HighlightSettings {
    
    @scala.inline
    def apply(): HighlightSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HighlightSettings]
    }
    
    @scala.inline
    implicit class HighlightSettingsMutableBuilder[Self <: HighlightSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      @scala.inline
      def setMode(value: SunburstHighlightMode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setType(value: SunburstHighlightType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Legend extends StObject {
    
    /** Horizontal alignment of the legend.
      * @Default {Center. See Alignment}
      */
    var alignment: js.UndefOr[SunburstAlignment | String] = js.native
    
    /** Options for customizing the legend border.
      */
    var border: js.UndefOr[LegendBorder] = js.native
    
    /** Interactive action of legend items.
      * @Default {toggleSegmentVisibility. See Alignment}
      */
    var clickAction: js.UndefOr[SunburstClickAction | String] = js.native
    
    /** Number of columns to arrange the legend items.
      * @Default {null}
      */
    var columnCount: js.UndefOr[Double] = js.native
    
    /** Options to customize the font used for legend item text.
      */
    var font: js.UndefOr[LegendFont] = js.native
    
    /** Gap or padding between the legend items.
      * @Default {10}
      */
    var itemPadding: js.UndefOr[Double] = js.native
    
    /** Options to customize the style of legend items.
      */
    var itemStyle: js.UndefOr[LegendItemStyle] = js.native
    
    /** Options to customize the location of sunburst legend. Legend is placed in provided location only when value of position property is custom
      */
    var location: js.UndefOr[LegendLocation] = js.native
    
    /** Places the legend at specified position. Legend can be placed at **left**, **right**, **top** or **bottom** of the chart area. To manually specify the location of legend, set
      * **custom** as value to this property.
      * @Default {Bottom. See Position}
      */
    var position: js.UndefOr[SunburstLegendPosition | String] = js.native
    
    /** Number of rows to arrange the legend items.
      * @Default {null}
      */
    var rowCount: js.UndefOr[Double] = js.native
    
    /** Shape of the legend items.
      * @Default {None. See Shape}
      */
    var shape: js.UndefOr[SunburstLegendShape | String] = js.native
    
    /** Options to customize the size of the legend.
      */
    var size: js.UndefOr[LegendSize] = js.native
    
    /** Options to customize the legend title.
      */
    var title: js.UndefOr[LegendTitle] = js.native
    
    /** Visibility of the legend.
      * @Default {false}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object Legend {
    
    @scala.inline
    def apply(): Legend = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Legend]
    }
    
    @scala.inline
    implicit class LegendMutableBuilder[Self <: Legend] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignment(value: SunburstAlignment | String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setBorder(value: LegendBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setClickAction(value: SunburstClickAction | String): Self = StObject.set(x, "clickAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickActionUndefined: Self = StObject.set(x, "clickAction", js.undefined)
      
      @scala.inline
      def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
      
      @scala.inline
      def setFont(value: LegendFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setItemPadding(value: Double): Self = StObject.set(x, "itemPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPaddingUndefined: Self = StObject.set(x, "itemPadding", js.undefined)
      
      @scala.inline
      def setItemStyle(value: LegendItemStyle): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      @scala.inline
      def setLocation(value: LegendLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setPosition(value: SunburstLegendPosition | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
      
      @scala.inline
      def setShape(value: SunburstLegendShape | String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: LegendSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTitle(value: LegendTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait LegendBorder extends StObject {
    
    /** Border color of the legend.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Border width of the legend.
      * @Default {1}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object LegendBorder {
    
    @scala.inline
    def apply(): LegendBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendBorder]
    }
    
    @scala.inline
    implicit class LegendBorderMutableBuilder[Self <: LegendBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait LegendFont extends StObject {
    
    /** Font family for legend item text.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Font style for legend item text.
      * @Default {Normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Font weight for legend item text.
      * @Default {Regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.native
    
    /** Font size for legend item text.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object LegendFont {
    
    @scala.inline
    def apply(): LegendFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendFont]
    }
    
    @scala.inline
    implicit class LegendFontMutableBuilder[Self <: LegendFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait LegendItemStyle extends StObject {
    
    /** Height of the shape in legend items.
      * @Default {10}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Width of the shape in legend items.
      * @Default {10}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object LegendItemStyle {
    
    @scala.inline
    def apply(): LegendItemStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendItemStyle]
    }
    
    @scala.inline
    implicit class LegendItemStyleMutableBuilder[Self <: LegendItemStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait LegendLocation extends StObject {
    
    /** X value or horizontal offset to position the legend in chart.
      * @Default {0}
      */
    var x: js.UndefOr[Double] = js.native
    
    /** Y value or vertical offset to position the legend.
      * @Default {0}
      */
    var y: js.UndefOr[Double] = js.native
  }
  object LegendLocation {
    
    @scala.inline
    def apply(): LegendLocation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendLocation]
    }
    
    @scala.inline
    implicit class LegendLocationMutableBuilder[Self <: LegendLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait LegendSize extends StObject {
    
    /** Height of the legend. Height can be specified in either pixel or percentage.
      * @Default {null}
      */
    var height: js.UndefOr[String] = js.native
    
    /** Width of the legend. Width can be specified in either pixel or percentage.
      * @Default {null}
      */
    var width: js.UndefOr[String] = js.native
  }
  object LegendSize {
    
    @scala.inline
    def apply(): LegendSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendSize]
    }
    
    @scala.inline
    implicit class LegendSizeMutableBuilder[Self <: LegendSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait LegendTitle extends StObject {
    
    /** Options to customize the font used for legend title
      */
    var font: js.UndefOr[LegendTitleFont] = js.native
    
    /** Text to be displayed in legend title.
      */
    var text: js.UndefOr[String] = js.native
    
    /** Alignment of the legend title.
      * @Default {center. See Alignment}
      */
    var textAlignment: js.UndefOr[SunburstAlignment | String] = js.native
    
    /** Enables or disables the legend title.
      * @Default {true}
      */
    var visible: js.UndefOr[String] = js.native
  }
  object LegendTitle {
    
    @scala.inline
    def apply(): LegendTitle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendTitle]
    }
    
    @scala.inline
    implicit class LegendTitleMutableBuilder[Self <: LegendTitle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFont(value: LegendTitleFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignment(value: SunburstAlignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait LegendTitleFont extends StObject {
    
    /** Font family for the text in legend title.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Font style for legend title.
      * @Default {normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Font weight for legend title.
      * @Default {normal. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.native
    
    /** Font size for legend title.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object LegendTitleFont {
    
    @scala.inline
    def apply(): LegendTitleFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendTitleFont]
    }
    
    @scala.inline
    implicit class LegendTitleFontMutableBuilder[Self <: LegendTitleFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait Level extends StObject {
    
    /** Specifies the group member path
      * @Default {null}
      */
    var groupMemberPath: js.UndefOr[String] = js.native
  }
  object Level {
    
    @scala.inline
    def apply(): Level = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Level]
    }
    
    @scala.inline
    implicit class LevelMutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroupMemberPath(value: String): Self = StObject.set(x, "groupMemberPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupMemberPathUndefined: Self = StObject.set(x, "groupMemberPath", js.undefined)
    }
  }
  
  @js.native
  trait LoadEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Load event data
      */
    var data: js.UndefOr[String] = js.native
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object LoadEventArgs {
    
    @scala.inline
    def apply(): LoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadEventArgs]
    }
    
    @scala.inline
    implicit class LoadEventArgsMutableBuilder[Self <: LoadEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait LoadedEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Loaded event data
      */
    var data: js.UndefOr[String] = js.native
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object LoadedEventArgs {
    
    @scala.inline
    def apply(): LoadedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadedEventArgs]
    }
    
    @scala.inline
    implicit class LoadedEventArgsMutableBuilder[Self <: LoadedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Margin extends StObject {
    
    /** Spacing for the bottom margin of the chart area. Setting positive value decreases the height of the chart area from the bottom.
      * @Default {10}
      */
    var bottom: js.UndefOr[Double] = js.native
    
    /** Spacing for the left margin of chart area. Setting positive value decreases the width of the chart area from left side.
      * @Default {10}
      */
    var left: js.UndefOr[Double] = js.native
    
    /** Spacing for the right margin of chart area. Setting positive value decreases the width of the chart area from right side.
      * @Default {10}
      */
    var right: js.UndefOr[Double] = js.native
    
    /** Spacing for the top margin of chart area. Setting positive value decreases the height of the chart area from the top.
      * @Default {10}
      */
    var top: js.UndefOr[Double] = js.native
  }
  object Margin {
    
    @scala.inline
    def apply(): Margin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Margin]
    }
    
    @scala.inline
    implicit class MarginMutableBuilder[Self <: Margin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
    /** Fires, on clicking the sunburst chart.
      */
    var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
    
    /** Animation type of sunburst
      * @Default {rotation. See Alignment}
      */
    var animationType: js.UndefOr[Animation | String] = js.native
    
    /** Background color of the plot area.
      * @Default {null}
      */
    var background: js.UndefOr[String] = js.native
    
    /** Options for customizing the sunburst border.
      */
    var border: js.UndefOr[Border] = js.native
    
    /** Fires before rendering the datalabel
      */
    var dataLabelRendering: js.UndefOr[js.Function1[/* e */ DataLabelRenderingEventArgs, Unit]] = js.native
    
    /** Options to customize the Sunburst dataLabel.
      */
    var dataLabelSettings: js.UndefOr[DataLabelSettings] = js.native
    
    /** Specifies the dataSource to the sunburst.
      * @Default {null}
      */
    var dataSource: js.UndefOr[js.Any] = js.native
    
    /** Fires, on double clicking the sunburst chart.
      */
    var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.native
    
    /** Fires when resetting drilldown points.
      */
    var drillDownBack: js.UndefOr[js.Function1[/* e */ DrillDownBackEventArgs, Unit]] = js.native
    
    /** Fires when clicking the point to perform drilldown.
      */
    var drillDownClick: js.UndefOr[js.Function1[/* e */ DrillDownClickEventArgs, Unit]] = js.native
    
    /** Fires after resetting the sunburst points
      */
    var drillDownReset: js.UndefOr[js.Function1[/* e */ DrillDownResetEventArgs, Unit]] = js.native
    
    /** Enable/disable the animation for all the levels.
      * @Default {false}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.native
    
    /** Sunburst rendering will end at the specified value
      * @Default {null}
      */
    var endAngle: js.UndefOr[Double] = js.native
    
    /** Options for customizing the appearance of the levels or point while highlighting.
      */
    var highlightSettings: js.UndefOr[HighlightSettings] = js.native
    
    /** Sunburst inner radius value
      * @Default {0.4}
      */
    var innerRadius: js.UndefOr[Double] = js.native
    
    /** Controls whether sunburst has to be responsive or not.
      * @Default {true}
      */
    var isResponsive: js.UndefOr[Boolean] = js.native
    
    /** Options to customize the legend items and legend title.
      */
    var legend: js.UndefOr[Legend] = js.native
    
    /** Specify levels of sunburst for grouped visualization of data
      * @Default {[]}
      */
    var levels: js.UndefOr[js.Array[Level]] = js.native
    
    /** Fires before loading.
      */
    var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
    
    /** Fires after rendering sunburst.
      */
    var loaded: js.UndefOr[js.Function1[/* e */ LoadedEventArgs, Unit]] = js.native
    
    /** Options to customize the left, right, top and bottom margins of sunburst area.
      */
    var margin: js.UndefOr[Margin] = js.native
    
    /** Opacity of the levels.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Palette color for the data points.
      * @Default {null}
      */
    var palette: js.UndefOr[String] = js.native
    
    /** Parent node of the data points.
      * @Default {null}
      */
    var parentNode: js.UndefOr[String] = js.native
    
    /** Fires after clicking the point in sunburst
      */
    var pointRegionClick: js.UndefOr[js.Function1[/* e */ PointRegionClickEventArgs, Unit]] = js.native
    
    /** Fires while moving the mouse over sunburst points
      */
    var pointRegionMouseMove: js.UndefOr[js.Function1[/* e */ PointRegionMouseMoveEventArgs, Unit]] = js.native
    
    /** Options for customizing sunburst points.
      */
    var points: js.UndefOr[Points] = js.native
    
    /** Fires before rendering sunburst.
      */
    var preRender: js.UndefOr[js.Function1[/* e */ PreRenderEventArgs, Unit]] = js.native
    
    /** Sunburst outer radius value
      * @Default {1}
      */
    var radius: js.UndefOr[Double] = js.native
    
    /** Fires, on right clicking the sunburst chart
      */
    var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.native
    
    /** Options for customizing the sunburst segment border.
      */
    var segmentBorder: js.UndefOr[SegmentBorder] = js.native
    
    /** Fires before rendering each segment
      */
    var segmentRendering: js.UndefOr[js.Function1[/* e */ SegmentRenderingEventArgs, Unit]] = js.native
    
    /** Options for customizing the appearance of the levels or data point while selection.
      */
    var selectionSettings: js.UndefOr[SelectionSettings] = js.native
    
    /** Options to customize the Sunburst size.
      */
    var size: js.UndefOr[Size] = js.native
    
    /** Sunburst rendering will start from the specified value
      * @Default {null}
      */
    var startAngle: js.UndefOr[Double] = js.native
    
    /** Specifies the theme for Sunburst.
      * @Default {Flatlight. See Theme}
      */
    var theme: js.UndefOr[SunburstTheme | String] = js.native
    
    /** Options for customizing the title and subtitle of sunburst.
      */
    var title: js.UndefOr[Title] = js.native
    
    /** Fires before rendering sunburst title.
      */
    var titleRendering: js.UndefOr[js.Function1[/* e */ TitleRenderingEventArgs, Unit]] = js.native
    
    /** Options to customize the Sunburst tooltip.
      */
    var tooltip: js.UndefOr[Tooltip] = js.native
    
    /** Fires during initialization of tooltip.
      */
    var tooltipInitialize: js.UndefOr[js.Function1[/* e */ TooltipInitializeEventArgs, Unit]] = js.native
    
    /** Bind the data field from the data source.
      * @Default {null}
      */
    var valueMemberPath: js.UndefOr[String] = js.native
    
    /** Controls the visibility of sunburst.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /** Name of the property in the datasource that contains x values.
      * @Default {null}
      */
    var xName: js.UndefOr[String] = js.native
    
    /** Name of the property in the datasource that contains y values.
      * @Default {null}
      */
    var yName: js.UndefOr[String] = js.native
    
    /** Options for enable zooming feature of chart.
      */
    var zoomSettings: js.UndefOr[ZoomSettings] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.datavisualization.SunburstChart.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.datavisualization.SunburstChart.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.datavisualization.SunburstChart.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationType(value: Animation | String): Self = StObject.set(x, "animationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationTypeUndefined: Self = StObject.set(x, "animationType", js.undefined)
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBorder(value: Border): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setClick(value: /* e */ ClickEventArgs => Unit): Self = StObject.set(x, "Click", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClickUndefined: Self = StObject.set(x, "Click", js.undefined)
      
      @scala.inline
      def setDataLabelRendering(value: /* e */ DataLabelRenderingEventArgs => Unit): Self = StObject.set(x, "dataLabelRendering", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDataLabelRenderingUndefined: Self = StObject.set(x, "dataLabelRendering", js.undefined)
      
      @scala.inline
      def setDataLabelSettings(value: DataLabelSettings): Self = StObject.set(x, "dataLabelSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataLabelSettingsUndefined: Self = StObject.set(x, "dataLabelSettings", js.undefined)
      
      @scala.inline
      def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setDoubleClick(value: /* e */ DoubleClickEventArgs => Unit): Self = StObject.set(x, "doubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDoubleClickUndefined: Self = StObject.set(x, "doubleClick", js.undefined)
      
      @scala.inline
      def setDrillDownBack(value: /* e */ DrillDownBackEventArgs => Unit): Self = StObject.set(x, "drillDownBack", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrillDownBackUndefined: Self = StObject.set(x, "drillDownBack", js.undefined)
      
      @scala.inline
      def setDrillDownClick(value: /* e */ DrillDownClickEventArgs => Unit): Self = StObject.set(x, "drillDownClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrillDownClickUndefined: Self = StObject.set(x, "drillDownClick", js.undefined)
      
      @scala.inline
      def setDrillDownReset(value: /* e */ DrillDownResetEventArgs => Unit): Self = StObject.set(x, "drillDownReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrillDownResetUndefined: Self = StObject.set(x, "drillDownReset", js.undefined)
      
      @scala.inline
      def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      @scala.inline
      def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
      
      @scala.inline
      def setHighlightSettings(value: HighlightSettings): Self = StObject.set(x, "highlightSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightSettingsUndefined: Self = StObject.set(x, "highlightSettings", js.undefined)
      
      @scala.inline
      def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
      
      @scala.inline
      def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      @scala.inline
      def setLegend(value: Legend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      @scala.inline
      def setLevels(value: js.Array[Level]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
      
      @scala.inline
      def setLevelsVarargs(value: Level*): Self = StObject.set(x, "levels", js.Array(value :_*))
      
      @scala.inline
      def setLoad(value: /* e */ LoadEventArgs => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      @scala.inline
      def setLoaded(value: /* e */ LoadedEventArgs => Unit): Self = StObject.set(x, "loaded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
      
      @scala.inline
      def setMargin(value: Margin): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPalette(value: String): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      @scala.inline
      def setParentNode(value: String): Self = StObject.set(x, "parentNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentNodeUndefined: Self = StObject.set(x, "parentNode", js.undefined)
      
      @scala.inline
      def setPointRegionClick(value: /* e */ PointRegionClickEventArgs => Unit): Self = StObject.set(x, "pointRegionClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPointRegionClickUndefined: Self = StObject.set(x, "pointRegionClick", js.undefined)
      
      @scala.inline
      def setPointRegionMouseMove(value: /* e */ PointRegionMouseMoveEventArgs => Unit): Self = StObject.set(x, "pointRegionMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPointRegionMouseMoveUndefined: Self = StObject.set(x, "pointRegionMouseMove", js.undefined)
      
      @scala.inline
      def setPoints(value: Points): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
      
      @scala.inline
      def setPreRender(value: /* e */ PreRenderEventArgs => Unit): Self = StObject.set(x, "preRender", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPreRenderUndefined: Self = StObject.set(x, "preRender", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setRightClick(value: /* e */ RightClickEventArgs => Unit): Self = StObject.set(x, "rightClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRightClickUndefined: Self = StObject.set(x, "rightClick", js.undefined)
      
      @scala.inline
      def setSegmentBorder(value: SegmentBorder): Self = StObject.set(x, "segmentBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentBorderUndefined: Self = StObject.set(x, "segmentBorder", js.undefined)
      
      @scala.inline
      def setSegmentRendering(value: /* e */ SegmentRenderingEventArgs => Unit): Self = StObject.set(x, "segmentRendering", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSegmentRenderingUndefined: Self = StObject.set(x, "segmentRendering", js.undefined)
      
      @scala.inline
      def setSelectionSettings(value: SelectionSettings): Self = StObject.set(x, "selectionSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionSettingsUndefined: Self = StObject.set(x, "selectionSettings", js.undefined)
      
      @scala.inline
      def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
      
      @scala.inline
      def setTheme(value: SunburstTheme | String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTitle(value: Title): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleRendering(value: /* e */ TitleRenderingEventArgs => Unit): Self = StObject.set(x, "titleRendering", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTitleRenderingUndefined: Self = StObject.set(x, "titleRendering", js.undefined)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTooltip(value: Tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipInitialize(value: /* e */ TooltipInitializeEventArgs => Unit): Self = StObject.set(x, "tooltipInitialize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTooltipInitializeUndefined: Self = StObject.set(x, "tooltipInitialize", js.undefined)
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setValueMemberPath(value: String): Self = StObject.set(x, "valueMemberPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueMemberPathUndefined: Self = StObject.set(x, "valueMemberPath", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setXName(value: String): Self = StObject.set(x, "xName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXNameUndefined: Self = StObject.set(x, "xName", js.undefined)
      
      @scala.inline
      def setYName(value: String): Self = StObject.set(x, "yName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYNameUndefined: Self = StObject.set(x, "yName", js.undefined)
      
      @scala.inline
      def setZoomSettings(value: ZoomSettings): Self = StObject.set(x, "zoomSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomSettingsUndefined: Self = StObject.set(x, "zoomSettings", js.undefined)
    }
  }
  
  @js.native
  trait PointRegionClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Includes clicked points region data
      */
    var data: js.UndefOr[String] = js.native
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object PointRegionClickEventArgs {
    
    @scala.inline
    def apply(): PointRegionClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointRegionClickEventArgs]
    }
    
    @scala.inline
    implicit class PointRegionClickEventArgsMutableBuilder[Self <: PointRegionClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait PointRegionMouseMoveEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Includes data of mouse moved region
      */
    var data: js.UndefOr[String] = js.native
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object PointRegionMouseMoveEventArgs {
    
    @scala.inline
    def apply(): PointRegionMouseMoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointRegionMouseMoveEventArgs]
    }
    
    @scala.inline
    implicit class PointRegionMouseMoveEventArgsMutableBuilder[Self <: PointRegionMouseMoveEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Points extends StObject {
    
    /** Points fill color of the sunburst.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Points text of the sunburst.
      * @Default {null}
      */
    var text: js.UndefOr[String] = js.native
    
    /** Points x value of the sunburst.
      * @Default {null}
      */
    var x: js.UndefOr[String] = js.native
    
    /** Points y value of the sunburst.
      * @Default {null}
      */
    var y: js.UndefOr[Double] = js.native
  }
  object Points {
    
    @scala.inline
    def apply(): Points = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Points]
    }
    
    @scala.inline
    implicit class PointsMutableBuilder[Self <: Points] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait PreRenderEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** PreRender event data
      */
    var data: js.UndefOr[String] = js.native
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object PreRenderEventArgs {
    
    @scala.inline
    def apply(): PreRenderEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreRenderEventArgs]
    }
    
    @scala.inline
    implicit class PreRenderEventArgsMutableBuilder[Self <: PreRenderEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait RightClickEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Includes right clicked region data
      */
    var data: js.UndefOr[String] = js.native
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object RightClickEventArgs {
    
    @scala.inline
    def apply(): RightClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RightClickEventArgs]
    }
    
    @scala.inline
    implicit class RightClickEventArgsMutableBuilder[Self <: RightClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait SegmentBorder extends StObject {
    
    /** Segment Border color of the sunburst.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Width of the Sunburst segment border.
      * @Default {2}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object SegmentBorder {
    
    @scala.inline
    def apply(): SegmentBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentBorder]
    }
    
    @scala.inline
    implicit class SegmentBorderMutableBuilder[Self <: SegmentBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait SegmentRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Sunburst datalabel data
      */
    var data: js.UndefOr[String] = js.native
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object SegmentRenderingEventArgs {
    
    @scala.inline
    def apply(): SegmentRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SegmentRenderingEventArgs]
    }
    
    @scala.inline
    implicit class SegmentRenderingEventArgsMutableBuilder[Self <: SegmentRenderingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait SelectionSettings extends StObject {
    
    /** Color of the levels/point on selection.
      * @Default {green}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Enables/disables the ability to select the levels or data point interactively.
      * @Default {false}
      */
    var enable: js.UndefOr[Boolean] = js.native
    
    /** Specifies whether the levels or data point has to be selected.
      * @Default {point. See Mode}
      */
    var mode: js.UndefOr[SunburstHighlightMode | String] = js.native
    
    /** Opacity of the levels/point on selection.
      * @Default {0.5}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Specifies whether the levels or data point has to be selected.
      * @Default {opacity. See Mode}
      */
    var `type`: js.UndefOr[SunburstHighlightType | String] = js.native
  }
  object SelectionSettings {
    
    @scala.inline
    def apply(): SelectionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionSettings]
    }
    
    @scala.inline
    implicit class SelectionSettingsMutableBuilder[Self <: SelectionSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      @scala.inline
      def setMode(value: SunburstHighlightMode | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setType(value: SunburstHighlightType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Size extends StObject {
    
    /** Height of the Sunburst.
      * @Default {''}
      */
    var height: js.UndefOr[String] = js.native
    
    /** Width of the Sunburst.
      * @Default {''}
      */
    var width: js.UndefOr[String] = js.native
  }
  object Size {
    
    @scala.inline
    def apply(): Size = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait Title extends StObject {
    
    /** Options for customizing the font of sunburst title.
      */
    var font: js.UndefOr[TitleFont] = js.native
    
    /** Options to customize the sub title of Sunburst.
      */
    var subtitle: js.UndefOr[TitleSubtitle] = js.native
    
    /** Title text for sunburst
      */
    var text: js.UndefOr[String] = js.native
    
    /** Title text alignment
      * @Default {center. See TextAlignment}
      */
    var textAlignment: js.UndefOr[SunburstAlignment | String] = js.native
    
    /** Title text visibility for sunburst
      * @Default {true}
      */
    var visible: js.UndefOr[String] = js.native
  }
  object Title {
    
    @scala.inline
    def apply(): Title = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Title]
    }
    
    @scala.inline
    implicit class TitleMutableBuilder[Self <: Title] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFont(value: TitleFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setSubtitle(value: TitleSubtitle): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignment(value: SunburstAlignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait TitleFont extends StObject {
    
    /** Font family for Sunburst title.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Font style for Sunburst title.
      * @Default {Normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Font weight for Sunburst title.
      * @Default {Regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.native
    
    /** Opacity of the Sunburst title.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Font size for Sunburst title.
      * @Default {20px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object TitleFont {
    
    @scala.inline
    def apply(): TitleFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleFont]
    }
    
    @scala.inline
    implicit class TitleFontMutableBuilder[Self <: TitleFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait TitleRenderingEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Sunburst title data
      */
    var data: js.UndefOr[String] = js.native
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object TitleRenderingEventArgs {
    
    @scala.inline
    def apply(): TitleRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleRenderingEventArgs]
    }
    
    @scala.inline
    implicit class TitleRenderingEventArgsMutableBuilder[Self <: TitleRenderingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait TitleSubtitle extends StObject {
    
    /** Options for customizing the font of sub title.
      */
    var font: js.UndefOr[TitleSubtitleFont] = js.native
    
    /** Subtitle text for sunburst
      */
    var text: js.UndefOr[String] = js.native
    
    /** Sub title text alignment
      * @Default {far. See TextAlignment}
      */
    var textAlignment: js.UndefOr[SunburstAlignment | String] = js.native
    
    /** Sub title text visibility for sunburst
      * @Default {true}
      */
    var visible: js.UndefOr[String] = js.native
  }
  object TitleSubtitle {
    
    @scala.inline
    def apply(): TitleSubtitle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleSubtitle]
    }
    
    @scala.inline
    implicit class TitleSubtitleMutableBuilder[Self <: TitleSubtitle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFont(value: TitleSubtitleFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignment(value: SunburstAlignment | String): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait TitleSubtitleFont extends StObject {
    
    /** Font family of sub title.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Font style for sub title.
      * @Default {Normal. See FontStyle}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Font weight for sub title.
      * @Default {Regular. See FontWeight}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.native
    
    /** Opacity of the sub title.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Font size for sub title.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object TitleSubtitleFont {
    
    @scala.inline
    def apply(): TitleSubtitleFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TitleSubtitleFont]
    }
    
    @scala.inline
    implicit class TitleSubtitleFontMutableBuilder[Self <: TitleSubtitleFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait Tooltip extends StObject {
    
    /** Options for customizing the border of the sunburst tooltip.
      */
    var border: js.UndefOr[TooltipBorder] = js.native
    
    /** Fill color for the sunburst tooltip.
      * @Default {null}
      */
    var fill: js.UndefOr[String] = js.native
    
    /** Options for customizing the font of the tooltip.
      */
    var font: js.UndefOr[TooltipFont] = js.native
    
    /** Setting the format for the data displayed in the tooltip
      * @Default {#point.x# : #point.y#}
      */
    var format: js.UndefOr[String] = js.native
    
    /** Sets the opacity of the displayed tooltip
      * @Default {0.95}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Custom template to the tooltip.
      * @Default {null}
      */
    var template: js.UndefOr[String] = js.native
    
    /** tooltip visibility of the Sunburst.
      * @Default {true}
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object Tooltip {
    
    @scala.inline
    def apply(): Tooltip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tooltip]
    }
    
    @scala.inline
    implicit class TooltipMutableBuilder[Self <: Tooltip] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorder(value: TooltipBorder): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFont(value: TooltipFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait TooltipBorder extends StObject {
    
    /** Border color of the tooltip.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Border width of the tooltip.
      * @Default {5}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object TooltipBorder {
    
    @scala.inline
    def apply(): TooltipBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipBorder]
    }
    
    @scala.inline
    implicit class TooltipBorderMutableBuilder[Self <: TooltipBorder] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait TooltipFont extends StObject {
    
    /** Font color of the text in the tooltip.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.native
    
    /** Font Family for the tooltip.
      * @Default {Segoe UI}
      */
    var fontFamily: js.UndefOr[String] = js.native
    
    /** Specifies the font Style for the tooltip.
      * @Default {Normal}
      */
    var fontStyle: js.UndefOr[FontStyle | String] = js.native
    
    /** Specifies the font weight for the tooltip.
      * @Default {Regular}
      */
    var fontWeight: js.UndefOr[FontWeight | String] = js.native
    
    /** Opacity for text in the tooltip.
      * @Default {1}
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Font size for text in the tooltip.
      * @Default {12px}
      */
    var size: js.UndefOr[String] = js.native
  }
  object TooltipFont {
    
    @scala.inline
    def apply(): TooltipFont = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipFont]
    }
    
    @scala.inline
    implicit class TooltipFontMutableBuilder[Self <: TooltipFont] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontStyle(value: FontStyle | String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontWeight(value: FontWeight | String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait TooltipInitializeEventArgs extends StObject {
    
    /** Set this option to true to cancel the event
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Sunburst tooltip data
      */
    var data: js.UndefOr[String] = js.native
    
    /** Instance of the sunburst model object
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object TooltipInitializeEventArgs {
    
    @scala.inline
    def apply(): TooltipInitializeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipInitializeEventArgs]
    }
    
    @scala.inline
    implicit class TooltipInitializeEventArgsMutableBuilder[Self <: TooltipInitializeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ZoomSettings extends StObject {
    
    /** Enables or disables zooming.
      * @Default {false}
      */
    var enable: js.UndefOr[Boolean] = js.native
    
    /** Toolbar horizontal alignment
      * @Default {right. See Alignment}
      */
    var toolbarHorizontalAlignment: js.UndefOr[SunburstHorizontalAlignment | String] = js.native
    
    /** Toolbar vertical alignment
      * @Default {top. See Alignment}
      */
    var toolbarVerticalAlignment: js.UndefOr[SunburstVerticalAlignment | String] = js.native
  }
  object ZoomSettings {
    
    @scala.inline
    def apply(): ZoomSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomSettings]
    }
    
    @scala.inline
    implicit class ZoomSettingsMutableBuilder[Self <: ZoomSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      @scala.inline
      def setToolbarHorizontalAlignment(value: SunburstHorizontalAlignment | String): Self = StObject.set(x, "toolbarHorizontalAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarHorizontalAlignmentUndefined: Self = StObject.set(x, "toolbarHorizontalAlignment", js.undefined)
      
      @scala.inline
      def setToolbarVerticalAlignment(value: SunburstVerticalAlignment | String): Self = StObject.set(x, "toolbarVerticalAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarVerticalAlignmentUndefined: Self = StObject.set(x, "toolbarVerticalAlignment", js.undefined)
    }
  }
}
