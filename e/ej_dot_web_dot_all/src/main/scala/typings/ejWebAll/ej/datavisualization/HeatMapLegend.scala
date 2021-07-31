package typings.ejWebAll.ej.datavisualization

import typings.ejWebAll.ej.Model
import typings.ejWebAll.ej.Widget_
import typings.ejWebAll.ej.datavisualization.HeatMap.LegendMode
import typings.ejWebAll.ej.datavisualization.HeatMap.LegendOrientation
import typings.ejWebAll.ej.datavisualization.HeatMap.TextDecoration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeatMapLegend
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  @JSName("model")
  var model_HeatMapLegend: Model = js.native
}
object HeatMapLegend {
  
  trait ColorMappingCollection extends StObject {
    
    /** Specifies the color of the heatmap legend data.
      * @Default {white}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the label properties of the heatmap legend color.
      * @Default {null}
      */
    var label: js.UndefOr[ColorMappingCollectionLabel] = js.undefined
    
    /** Specifies the color values of the heatmap legend column data.
      * @Default {0}
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object ColorMappingCollection {
    
    @scala.inline
    def apply(): ColorMappingCollection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorMappingCollection]
    }
    
    @scala.inline
    implicit class ColorMappingCollectionMutableBuilder[Self <: ColorMappingCollection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setLabel(value: ColorMappingCollectionLabel): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ColorMappingCollectionLabel extends StObject {
    
    /** Enables/disables the bold style of the heatmap legend label.
      * @Default {false}
      */
    var bold: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the font color of the heatmap legend label.
      * @Default {black}
      */
    var fontColor: js.UndefOr[String] = js.undefined
    
    /** Specifies the font family of the heatmap legend label.
      * @Default {Arial}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /** Specifies the font size of the heatmap legend label.
      * @Default {10}
      */
    var fontSize: js.UndefOr[Double] = js.undefined
    
    /** Enables/disables the italic style of the heatmap legend label.
      * @Default {false}
      */
    var italic: js.UndefOr[Boolean] = js.undefined
    
    /** specifies the text value of the heatmap legend label.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Specifies the text style of the heatmap legend label.
      * @Default {ej.HeatMap.TextDecoration.None}
      */
    var textDecoration: js.UndefOr[TextDecoration | String] = js.undefined
  }
  object ColorMappingCollectionLabel {
    
    @scala.inline
    def apply(): ColorMappingCollectionLabel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorMappingCollectionLabel]
    }
    
    @scala.inline
    implicit class ColorMappingCollectionLabelMutableBuilder[Self <: ColorMappingCollectionLabel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBold(value: Boolean): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
      
      @scala.inline
      def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setItalic(value: Boolean): Self = StObject.set(x, "italic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItalicUndefined: Self = StObject.set(x, "italic", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextDecoration(value: TextDecoration | String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Specifies the color values of the column data.
      * @Default {[]}
      */
    var colorMappingCollection: js.UndefOr[js.Array[ColorMappingCollection]] = js.undefined
    
    /** Specifies the height of the heatmap legend.
      * @Default {null}
      */
    var height: js.UndefOr[js.Any] = js.undefined
    
    /** Specifies can enable responsive mode or not for heatmap legend.
      * @Default {false}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the legend mode as gradient or list.
      * @Default {ej.HeatMap.LegendMode.Gradient}
      */
    var legendMode: js.UndefOr[LegendMode | String] = js.undefined
    
    /** Specifies the orientation of the heatmap legend
      * @Default {ej.HeatMap.LegendOrientation.Horizontal}
      */
    var orientation: js.UndefOr[LegendOrientation | String] = js.undefined
    
    /** Specifies whether the cell label can be shown or not.
      * @Default {false}
      */
    var showLabel: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the width of the heatmap legend.
      * @Default {null}
      */
    var width: js.UndefOr[js.Any] = js.undefined
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.datavisualization.HeatMapLegend.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.datavisualization.HeatMapLegend.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.datavisualization.HeatMapLegend.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColorMappingCollection(value: js.Array[ColorMappingCollection]): Self = StObject.set(x, "colorMappingCollection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorMappingCollectionUndefined: Self = StObject.set(x, "colorMappingCollection", js.undefined)
      
      @scala.inline
      def setColorMappingCollectionVarargs(value: ColorMappingCollection*): Self = StObject.set(x, "colorMappingCollection", js.Array(value :_*))
      
      @scala.inline
      def setHeight(value: js.Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      @scala.inline
      def setLegendMode(value: LegendMode | String): Self = StObject.set(x, "legendMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendModeUndefined: Self = StObject.set(x, "legendMode", js.undefined)
      
      @scala.inline
      def setOrientation(value: LegendOrientation | String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setShowLabel(value: Boolean): Self = StObject.set(x, "showLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLabelUndefined: Self = StObject.set(x, "showLabel", js.undefined)
      
      @scala.inline
      def setWidth(value: js.Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
