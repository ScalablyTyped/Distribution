package typings.echarts.echarts

import typings.echarts.anon.InRange
import typings.echarts.echarts.EChartOption.BaseTextStyleWithRich
import typings.echarts.echarts.EChartOption.TextStyle
import typings.echarts.echartsStrings.auto
import typings.echarts.echartsStrings.bottom
import typings.echarts.echartsStrings.continuous
import typings.echarts.echartsStrings.horizontal
import typings.echarts.echartsStrings.left
import typings.echarts.echartsStrings.multiple
import typings.echarts.echartsStrings.piecewise
import typings.echarts.echartsStrings.right
import typings.echarts.echartsStrings.single
import typings.echarts.echartsStrings.top
import typings.echarts.echartsStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VisualMap {
  
  trait Continuous
    extends StObject
       with typings.echarts.echarts.EChartOption.VisualMap {
    
    var align: js.UndefOr[auto | left | right | top | bottom] = js.undefined
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var borderColor: js.UndefOr[String] = js.undefined
    
    var borderWidth: js.UndefOr[Double] = js.undefined
    
    var bottom: js.UndefOr[Double | String] = js.undefined
    
    var calculable: js.UndefOr[Boolean] = js.undefined
    
    var color: js.UndefOr[js.Array[String]] = js.undefined
    
    var controller: js.UndefOr[InRange] = js.undefined
    
    var dimension: js.UndefOr[String | Double] = js.undefined
    
    var formatter: js.UndefOr[String | js.Function] = js.undefined
    
    var hoverLink: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inRange: js.UndefOr[RangeObject] = js.undefined
    
    var inverse: js.UndefOr[Boolean] = js.undefined
    
    var itemHeight: js.UndefOr[Double] = js.undefined
    
    var itemWidth: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double | String] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var orient: js.UndefOr[vertical | horizontal] = js.undefined
    
    var outOfRange: js.UndefOr[RangeObject] = js.undefined
    
    var padding: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
    
    var range: js.UndefOr[js.Array[Double]] = js.undefined
    
    var realtime: js.UndefOr[Boolean] = js.undefined
    
    var right: js.UndefOr[Double | String] = js.undefined
    
    var seriesIndex: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var text: js.UndefOr[js.Array[String]] = js.undefined
    
    var textGap: js.UndefOr[Double] = js.undefined
    
    var textStyle: js.UndefOr[BaseTextStyleWithRich] = js.undefined
    
    var top: js.UndefOr[Double | String] = js.undefined
    
    var `type`: js.UndefOr[continuous] = js.undefined
    
    var z: js.UndefOr[Double] = js.undefined
    
    var zlevel: js.UndefOr[Double] = js.undefined
  }
  object Continuous {
    
    inline def apply(): Continuous = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Continuous]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Continuous] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: auto | left | right | top | bottom): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setBottom(value: Double | String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setCalculable(value: Boolean): Self = StObject.set(x, "calculable", value.asInstanceOf[js.Any])
      
      inline def setCalculableUndefined: Self = StObject.set(x, "calculable", js.undefined)
      
      inline def setColor(value: js.Array[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: String*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setController(value: InRange): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
      
      inline def setDimension(value: String | Double): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
      
      inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
      
      inline def setFormatter(value: String | js.Function): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setHoverLink(value: Boolean): Self = StObject.set(x, "hoverLink", value.asInstanceOf[js.Any])
      
      inline def setHoverLinkUndefined: Self = StObject.set(x, "hoverLink", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInRange(value: RangeObject): Self = StObject.set(x, "inRange", value.asInstanceOf[js.Any])
      
      inline def setInRangeUndefined: Self = StObject.set(x, "inRange", js.undefined)
      
      inline def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      inline def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      inline def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
      
      inline def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
      
      inline def setItemWidth(value: Double): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
      
      inline def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
      
      inline def setLeft(value: Double | String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOrient(value: vertical | horizontal): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      inline def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      inline def setOutOfRange(value: RangeObject): Self = StObject.set(x, "outOfRange", value.asInstanceOf[js.Any])
      
      inline def setOutOfRangeUndefined: Self = StObject.set(x, "outOfRange", js.undefined)
      
      inline def setPadding(value: Double | js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setRange(value: js.Array[Double]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setRangeVarargs(value: Double*): Self = StObject.set(x, "range", js.Array(value*))
      
      inline def setRealtime(value: Boolean): Self = StObject.set(x, "realtime", value.asInstanceOf[js.Any])
      
      inline def setRealtimeUndefined: Self = StObject.set(x, "realtime", js.undefined)
      
      inline def setRight(value: Double | String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setSeriesIndex(value: Double | js.Array[Double]): Self = StObject.set(x, "seriesIndex", value.asInstanceOf[js.Any])
      
      inline def setSeriesIndexUndefined: Self = StObject.set(x, "seriesIndex", js.undefined)
      
      inline def setSeriesIndexVarargs(value: Double*): Self = StObject.set(x, "seriesIndex", js.Array(value*))
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setText(value: js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextGap(value: Double): Self = StObject.set(x, "textGap", value.asInstanceOf[js.Any])
      
      inline def setTextGapUndefined: Self = StObject.set(x, "textGap", js.undefined)
      
      inline def setTextStyle(value: BaseTextStyleWithRich): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
      
      inline def setTop(value: Double | String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setType(value: continuous): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
      
      inline def setZlevel(value: Double): Self = StObject.set(x, "zlevel", value.asInstanceOf[js.Any])
      
      inline def setZlevelUndefined: Self = StObject.set(x, "zlevel", js.undefined)
    }
  }
  
  trait PiecesObject extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object PiecesObject {
    
    inline def apply(): PiecesObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PiecesObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PiecesObject] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Piecewise
    extends StObject
       with typings.echarts.echarts.EChartOption.VisualMap {
    
    var align: js.UndefOr[auto | left | right] = js.undefined
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var borderColor: js.UndefOr[String] = js.undefined
    
    var borderWidth: js.UndefOr[Double] = js.undefined
    
    var bottom: js.UndefOr[Double | String] = js.undefined
    
    var categories: js.UndefOr[js.Array[String]] = js.undefined
    
    var color: js.UndefOr[js.Array[String]] = js.undefined
    
    var controller: js.UndefOr[InRange] = js.undefined
    
    var dimension: js.UndefOr[String | Double] = js.undefined
    
    var formatter: js.UndefOr[String | js.Function] = js.undefined
    
    var hoverLink: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inRange: js.UndefOr[RangeObject] = js.undefined
    
    var inverse: js.UndefOr[Boolean] = js.undefined
    
    var itemGap: js.UndefOr[Double] = js.undefined
    
    var itemHeight: js.UndefOr[Double] = js.undefined
    
    var itemSymbol: js.UndefOr[String] = js.undefined
    
    var itemWidth: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double | String] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var maxOpen: js.UndefOr[Boolean] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var minOpen: js.UndefOr[Boolean] = js.undefined
    
    var orient: js.UndefOr[vertical | horizontal] = js.undefined
    
    var outOfRange: js.UndefOr[RangeObject] = js.undefined
    
    var padding: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var pieces: js.UndefOr[js.Array[PiecesObject]] = js.undefined
    
    var precision: js.UndefOr[Double] = js.undefined
    
    var right: js.UndefOr[Double | String] = js.undefined
    
    var selectedMode: js.UndefOr[multiple | single] = js.undefined
    
    var seriesIndex: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var showLabel: js.UndefOr[Boolean] = js.undefined
    
    var splitNumber: js.UndefOr[Double] = js.undefined
    
    var text: js.UndefOr[js.Array[String]] = js.undefined
    
    var textGap: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var textStyle: js.UndefOr[TextStyle] = js.undefined
    
    var top: js.UndefOr[Double | String] = js.undefined
    
    var `type`: js.UndefOr[piecewise] = js.undefined
    
    var z: js.UndefOr[Double] = js.undefined
    
    var zlevel: js.UndefOr[Double] = js.undefined
  }
  object Piecewise {
    
    inline def apply(): Piecewise = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Piecewise]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Piecewise] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: auto | left | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
      
      inline def setBottom(value: Double | String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
      
      inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
      
      inline def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value*))
      
      inline def setColor(value: js.Array[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: String*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setController(value: InRange): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      inline def setControllerUndefined: Self = StObject.set(x, "controller", js.undefined)
      
      inline def setDimension(value: String | Double): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
      
      inline def setDimensionUndefined: Self = StObject.set(x, "dimension", js.undefined)
      
      inline def setFormatter(value: String | js.Function): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setHoverLink(value: Boolean): Self = StObject.set(x, "hoverLink", value.asInstanceOf[js.Any])
      
      inline def setHoverLinkUndefined: Self = StObject.set(x, "hoverLink", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInRange(value: RangeObject): Self = StObject.set(x, "inRange", value.asInstanceOf[js.Any])
      
      inline def setInRangeUndefined: Self = StObject.set(x, "inRange", js.undefined)
      
      inline def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      inline def setInverseUndefined: Self = StObject.set(x, "inverse", js.undefined)
      
      inline def setItemGap(value: Double): Self = StObject.set(x, "itemGap", value.asInstanceOf[js.Any])
      
      inline def setItemGapUndefined: Self = StObject.set(x, "itemGap", js.undefined)
      
      inline def setItemHeight(value: Double): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
      
      inline def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
      
      inline def setItemSymbol(value: String): Self = StObject.set(x, "itemSymbol", value.asInstanceOf[js.Any])
      
      inline def setItemSymbolUndefined: Self = StObject.set(x, "itemSymbol", js.undefined)
      
      inline def setItemWidth(value: Double): Self = StObject.set(x, "itemWidth", value.asInstanceOf[js.Any])
      
      inline def setItemWidthUndefined: Self = StObject.set(x, "itemWidth", js.undefined)
      
      inline def setLeft(value: Double | String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxOpen(value: Boolean): Self = StObject.set(x, "maxOpen", value.asInstanceOf[js.Any])
      
      inline def setMaxOpenUndefined: Self = StObject.set(x, "maxOpen", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinOpen(value: Boolean): Self = StObject.set(x, "minOpen", value.asInstanceOf[js.Any])
      
      inline def setMinOpenUndefined: Self = StObject.set(x, "minOpen", js.undefined)
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOrient(value: vertical | horizontal): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      inline def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      inline def setOutOfRange(value: RangeObject): Self = StObject.set(x, "outOfRange", value.asInstanceOf[js.Any])
      
      inline def setOutOfRangeUndefined: Self = StObject.set(x, "outOfRange", js.undefined)
      
      inline def setPadding(value: Double | js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
      
      inline def setPieces(value: js.Array[PiecesObject]): Self = StObject.set(x, "pieces", value.asInstanceOf[js.Any])
      
      inline def setPiecesUndefined: Self = StObject.set(x, "pieces", js.undefined)
      
      inline def setPiecesVarargs(value: PiecesObject*): Self = StObject.set(x, "pieces", js.Array(value*))
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setRight(value: Double | String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setSelectedMode(value: multiple | single): Self = StObject.set(x, "selectedMode", value.asInstanceOf[js.Any])
      
      inline def setSelectedModeUndefined: Self = StObject.set(x, "selectedMode", js.undefined)
      
      inline def setSeriesIndex(value: Double | js.Array[Double]): Self = StObject.set(x, "seriesIndex", value.asInstanceOf[js.Any])
      
      inline def setSeriesIndexUndefined: Self = StObject.set(x, "seriesIndex", js.undefined)
      
      inline def setSeriesIndexVarargs(value: Double*): Self = StObject.set(x, "seriesIndex", js.Array(value*))
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowLabel(value: Boolean): Self = StObject.set(x, "showLabel", value.asInstanceOf[js.Any])
      
      inline def setShowLabelUndefined: Self = StObject.set(x, "showLabel", js.undefined)
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setSplitNumber(value: Double): Self = StObject.set(x, "splitNumber", value.asInstanceOf[js.Any])
      
      inline def setSplitNumberUndefined: Self = StObject.set(x, "splitNumber", js.undefined)
      
      inline def setText(value: js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextGap(value: Double | js.Array[Double]): Self = StObject.set(x, "textGap", value.asInstanceOf[js.Any])
      
      inline def setTextGapUndefined: Self = StObject.set(x, "textGap", js.undefined)
      
      inline def setTextGapVarargs(value: Double*): Self = StObject.set(x, "textGap", js.Array(value*))
      
      inline def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      inline def setTextStyleUndefined: Self = StObject.set(x, "textStyle", js.undefined)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value*))
      
      inline def setTop(value: Double | String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setType(value: piecewise): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
      
      inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
      
      inline def setZlevel(value: Double): Self = StObject.set(x, "zlevel", value.asInstanceOf[js.Any])
      
      inline def setZlevelUndefined: Self = StObject.set(x, "zlevel", js.undefined)
    }
  }
  
  trait RangeObject extends StObject {
    
    var color: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var colorAlpha: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var colorHue: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var colorLightness: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var colorSaturation: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var opacity: js.UndefOr[Double | js.Array[Double]] = js.undefined
    
    var symbol: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var symbolSize: js.UndefOr[Double | js.Array[Double]] = js.undefined
  }
  object RangeObject {
    
    inline def apply(): RangeObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RangeObject] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String | js.Array[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorAlpha(value: Double | js.Array[Double]): Self = StObject.set(x, "colorAlpha", value.asInstanceOf[js.Any])
      
      inline def setColorAlphaUndefined: Self = StObject.set(x, "colorAlpha", js.undefined)
      
      inline def setColorAlphaVarargs(value: Double*): Self = StObject.set(x, "colorAlpha", js.Array(value*))
      
      inline def setColorHue(value: Double | js.Array[Double]): Self = StObject.set(x, "colorHue", value.asInstanceOf[js.Any])
      
      inline def setColorHueUndefined: Self = StObject.set(x, "colorHue", js.undefined)
      
      inline def setColorHueVarargs(value: Double*): Self = StObject.set(x, "colorHue", js.Array(value*))
      
      inline def setColorLightness(value: Double | js.Array[Double]): Self = StObject.set(x, "colorLightness", value.asInstanceOf[js.Any])
      
      inline def setColorLightnessUndefined: Self = StObject.set(x, "colorLightness", js.undefined)
      
      inline def setColorLightnessVarargs(value: Double*): Self = StObject.set(x, "colorLightness", js.Array(value*))
      
      inline def setColorSaturation(value: Double | js.Array[Double]): Self = StObject.set(x, "colorSaturation", value.asInstanceOf[js.Any])
      
      inline def setColorSaturationUndefined: Self = StObject.set(x, "colorSaturation", js.undefined)
      
      inline def setColorSaturationVarargs(value: Double*): Self = StObject.set(x, "colorSaturation", js.Array(value*))
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setColorVarargs(value: String*): Self = StObject.set(x, "color", js.Array(value*))
      
      inline def setOpacity(value: Double | js.Array[Double]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setOpacityVarargs(value: Double*): Self = StObject.set(x, "opacity", js.Array(value*))
      
      inline def setSymbol(value: String | js.Array[String]): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
      
      inline def setSymbolSize(value: Double | js.Array[Double]): Self = StObject.set(x, "symbolSize", value.asInstanceOf[js.Any])
      
      inline def setSymbolSizeUndefined: Self = StObject.set(x, "symbolSize", js.undefined)
      
      inline def setSymbolSizeVarargs(value: Double*): Self = StObject.set(x, "symbolSize", js.Array(value*))
      
      inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
      
      inline def setSymbolVarargs(value: String*): Self = StObject.set(x, "symbol", js.Array(value*))
    }
  }
}
