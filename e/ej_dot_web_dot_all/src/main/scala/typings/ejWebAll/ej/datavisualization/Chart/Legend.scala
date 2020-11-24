package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Legend extends js.Object {
  
  /** Horizontal alignment of the legend.
    * @Default {Center. See Alignment}
    */
  var alignment: js.UndefOr[Alignment | String] = js.native
  
  /** Background for the legend. Use this property to add a background image or background color for the legend.
    */
  var background: js.UndefOr[String] = js.native
  
  /** Options for customizing the legend border.
    */
  var border: js.UndefOr[LegendBorder] = js.native
  
  /** Number of columns to arrange the legend items.
    * @Default {null}
    */
  var columnCount: js.UndefOr[Double] = js.native
  
  /** Controls whether legend has to use scrollbar or not. When enabled, scroll bar appears depending upon size and position properties of legend.
    * @Default {true}
    */
  var enableScrollbar: js.UndefOr[Boolean] = js.native
  
  /** Fill color for the legend items. By using this property, it displays all legend item shapes in same color.Legend items representing invisible series is displayed in gray color.
    * @Default {null}
    */
  var fill: js.UndefOr[String] = js.native
  
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
  
  /** Options to customize the location of chart legend. Legend is placed in provided location only when value of position property is custom
    */
  var location: js.UndefOr[LegendLocation] = js.native
  
  /** Opacity of the legend.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /** Places the legend at specified position. Legend can be placed at **left**, **right**, **top** or **bottom** of the chart area. To manually specify the location of legend, set
    * **custom** as value to this property.
    * @Default {Bottom. See Position}
    */
  var position: js.UndefOr[Position | String] = js.native
  
  /** Number of rows to arrange the legend items.
    * @Default {null}
    */
  var rowCount: js.UndefOr[Double] = js.native
  
  /** Shape of the legend items. Default shape for pie and doughnut series is circle and all other series uses rectangle.
    * @Default {None. See Shape}
    */
  var shape: js.UndefOr[Shape | String] = js.native
  
  /** Options to customize the size of the legend.
    */
  var size: js.UndefOr[LegendSize] = js.native
  
  /** Specifies the action taken when the legend width is more than the textWidth.
    * @Default {none. See textOverflow}
    */
  var textOverflow: js.UndefOr[TextOverflow | String] = js.native
  
  /** Text width for legend item.
    * @Default {34}
    */
  var textWidth: js.UndefOr[Double] = js.native
  
  /** Options to customize the legend title.
    */
  var title: js.UndefOr[LegendTitle] = js.native
  
  /** Controls the selection through the legend.
    * @Default {true}
    */
  var toggleSeriesVisibility: js.UndefOr[Boolean] = js.native
  
  /** Controls the visibility of the legend.
    * @Default {true}
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
  implicit class LegendOps[Self <: Legend] (val x: Self) extends AnyVal {
    
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
    def setAlignment(value: Alignment | String): Self = this.set("alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    
    @scala.inline
    def setBackground(value: String): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBorder(value: LegendBorder): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setColumnCount(value: Double): Self = this.set("columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnCount: Self = this.set("columnCount", js.undefined)
    
    @scala.inline
    def setEnableScrollbar(value: Boolean): Self = this.set("enableScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableScrollbar: Self = this.set("enableScrollbar", js.undefined)
    
    @scala.inline
    def setFill(value: String): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setFont(value: LegendFont): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setItemPadding(value: Double): Self = this.set("itemPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemPadding: Self = this.set("itemPadding", js.undefined)
    
    @scala.inline
    def setItemStyle(value: LegendItemStyle): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    
    @scala.inline
    def setLocation(value: LegendLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPosition(value: Position | String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowCount: Self = this.set("rowCount", js.undefined)
    
    @scala.inline
    def setShape(value: Shape | String): Self = this.set("shape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShape: Self = this.set("shape", js.undefined)
    
    @scala.inline
    def setSize(value: LegendSize): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTextOverflow(value: TextOverflow | String): Self = this.set("textOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextOverflow: Self = this.set("textOverflow", js.undefined)
    
    @scala.inline
    def setTextWidth(value: Double): Self = this.set("textWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextWidth: Self = this.set("textWidth", js.undefined)
    
    @scala.inline
    def setTitle(value: LegendTitle): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setToggleSeriesVisibility(value: Boolean): Self = this.set("toggleSeriesVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleSeriesVisibility: Self = this.set("toggleSeriesVisibility", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
