package typings.echarts.echarts.VisualMap

import typings.echarts.anon.InRange
import typings.echarts.echarts.EChartOption.BaseTextStyleWithRich
import typings.echarts.echartsStrings.auto
import typings.echarts.echartsStrings.bottom
import typings.echarts.echartsStrings.continuous
import typings.echarts.echartsStrings.horizontal
import typings.echarts.echartsStrings.left
import typings.echarts.echartsStrings.right
import typings.echarts.echartsStrings.top
import typings.echarts.echartsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Continuous
  extends typings.echarts.echarts.EChartOption.VisualMap {
  
  var align: js.UndefOr[auto | left | right | top | bottom] = js.native
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var borderColor: js.UndefOr[String] = js.native
  
  var borderWidth: js.UndefOr[Double] = js.native
  
  var bottom: js.UndefOr[Double | String] = js.native
  
  var calculable: js.UndefOr[Boolean] = js.native
  
  var color: js.UndefOr[js.Array[String]] = js.native
  
  var controller: js.UndefOr[InRange] = js.native
  
  var dimension: js.UndefOr[String | Double] = js.native
  
  var formatter: js.UndefOr[String | js.Function] = js.native
  
  var hoverLink: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var inRange: js.UndefOr[RangeObject] = js.native
  
  var inverse: js.UndefOr[Boolean] = js.native
  
  var itemHeight: js.UndefOr[Double] = js.native
  
  var itemWidth: js.UndefOr[Double] = js.native
  
  var left: js.UndefOr[Double | String] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var orient: js.UndefOr[vertical | horizontal] = js.native
  
  var outOfRange: js.UndefOr[RangeObject] = js.native
  
  var padding: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var precision: js.UndefOr[Double] = js.native
  
  var range: js.UndefOr[js.Array[Double]] = js.native
  
  var realtime: js.UndefOr[Boolean] = js.native
  
  var right: js.UndefOr[Double | String] = js.native
  
  var seriesIndex: js.UndefOr[Double | js.Array[Double]] = js.native
  
  var show: js.UndefOr[Boolean] = js.native
  
  var text: js.UndefOr[js.Array[String]] = js.native
  
  var textGap: js.UndefOr[Double] = js.native
  
  var textStyle: js.UndefOr[BaseTextStyleWithRich] = js.native
  
  var top: js.UndefOr[Double | String] = js.native
  
  var `type`: js.UndefOr[continuous] = js.native
  
  var z: js.UndefOr[Double] = js.native
  
  var zlevel: js.UndefOr[Double] = js.native
}
object Continuous {
  
  @scala.inline
  def apply(): Continuous = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Continuous]
  }
  
  @scala.inline
  implicit class ContinuousOps[Self <: Continuous] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlign(value: auto | left | right | top | bottom): Self = this.set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setBorderWidth(value: Double): Self = this.set("borderWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderWidth: Self = this.set("borderWidth", js.undefined)
    
    @scala.inline
    def setBottom(value: Double | String): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setCalculable(value: Boolean): Self = this.set("calculable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalculable: Self = this.set("calculable", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: String*): Self = this.set("color", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: js.Array[String]): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setController(value: InRange): Self = this.set("controller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteController: Self = this.set("controller", js.undefined)
    
    @scala.inline
    def setDimension(value: String | Double): Self = this.set("dimension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimension: Self = this.set("dimension", js.undefined)
    
    @scala.inline
    def setFormatter(value: String | js.Function): Self = this.set("formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setHoverLink(value: Boolean): Self = this.set("hoverLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverLink: Self = this.set("hoverLink", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setInRange(value: RangeObject): Self = this.set("inRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInRange: Self = this.set("inRange", js.undefined)
    
    @scala.inline
    def setInverse(value: Boolean): Self = this.set("inverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInverse: Self = this.set("inverse", js.undefined)
    
    @scala.inline
    def setItemHeight(value: Double): Self = this.set("itemHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemHeight: Self = this.set("itemHeight", js.undefined)
    
    @scala.inline
    def setItemWidth(value: Double): Self = this.set("itemWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemWidth: Self = this.set("itemWidth", js.undefined)
    
    @scala.inline
    def setLeft(value: Double | String): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setOrient(value: vertical | horizontal): Self = this.set("orient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrient: Self = this.set("orient", js.undefined)
    
    @scala.inline
    def setOutOfRange(value: RangeObject): Self = this.set("outOfRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutOfRange: Self = this.set("outOfRange", js.undefined)
    
    @scala.inline
    def setPaddingVarargs(value: Double*): Self = this.set("padding", js.Array(value :_*))
    
    @scala.inline
    def setPadding(value: Double | js.Array[Double]): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setRangeVarargs(value: Double*): Self = this.set("range", js.Array(value :_*))
    
    @scala.inline
    def setRange(value: js.Array[Double]): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setRealtime(value: Boolean): Self = this.set("realtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRealtime: Self = this.set("realtime", js.undefined)
    
    @scala.inline
    def setRight(value: Double | String): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setSeriesIndexVarargs(value: Double*): Self = this.set("seriesIndex", js.Array(value :_*))
    
    @scala.inline
    def setSeriesIndex(value: Double | js.Array[Double]): Self = this.set("seriesIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesIndex: Self = this.set("seriesIndex", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setTextVarargs(value: String*): Self = this.set("text", js.Array(value :_*))
    
    @scala.inline
    def setText(value: js.Array[String]): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextGap(value: Double): Self = this.set("textGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextGap: Self = this.set("textGap", js.undefined)
    
    @scala.inline
    def setTextStyle(value: BaseTextStyleWithRich): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextStyle: Self = this.set("textStyle", js.undefined)
    
    @scala.inline
    def setTop(value: Double | String): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
    @scala.inline
    def setType(value: continuous): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
    
    @scala.inline
    def setZlevel(value: Double): Self = this.set("zlevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZlevel: Self = this.set("zlevel", js.undefined)
  }
}
