package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrimaryYAxisStripLine extends js.Object {
  
  /** Border color of the strip line.
    * @Default {gray}
    */
  var borderColor: js.UndefOr[String] = js.native
  
  /** Background color of the strip line.
    * @Default {gray}
    */
  var color: js.UndefOr[String] = js.native
  
  /** End value of the strip line.
    * @Default {null}
    */
  var end: js.UndefOr[Double] = js.native
  
  /** Options for customizing the font of the text.
    */
  var font: js.UndefOr[PrimaryYAxisStripLineFont] = js.native
  
  /** Start value of the strip line.
    * @Default {null}
    */
  var start: js.UndefOr[Double] = js.native
  
  /** Indicates whether to render the strip line from the minimum/start value of the axis. This property wonâ€™t work when start property is set.
    * @Default {false}
    */
  var startFromAxis: js.UndefOr[Boolean] = js.native
  
  /** Specifies text to be displayed inside the strip line.
    * @Default {stripLine}
    */
  var text: js.UndefOr[String] = js.native
  
  /** Specifies the alignment of the text inside the strip line.
    * @Default {middlecenter. See TextAlignment}
    */
  var textAlignment: js.UndefOr[TextAlignment | String] = js.native
  
  /** Show/hides the strip line.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /** Width of the strip line.
    * @Default {0}
    */
  var width: js.UndefOr[Double] = js.native
  
  /** Specifies the order in which strip line and the series have to be rendered. When Z-order is â€œbehindâ€, strip line is rendered below the series and when it is â€œoverâ€, it is
    * rendered above the series.
    * @Default {over. See ZIndex}
    */
  var zIndex: js.UndefOr[ZIndex | String] = js.native
}
object PrimaryYAxisStripLine {
  
  @scala.inline
  def apply(): PrimaryYAxisStripLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimaryYAxisStripLine]
  }
  
  @scala.inline
  implicit class PrimaryYAxisStripLineOps[Self <: PrimaryYAxisStripLine] (val x: Self) extends AnyVal {
    
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
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    
    @scala.inline
    def setFont(value: PrimaryYAxisStripLineFont): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setStartFromAxis(value: Boolean): Self = this.set("startFromAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartFromAxis: Self = this.set("startFromAxis", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextAlignment(value: TextAlignment | String): Self = this.set("textAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlignment: Self = this.set("textAlignment", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setZIndex(value: ZIndex | String): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
}
