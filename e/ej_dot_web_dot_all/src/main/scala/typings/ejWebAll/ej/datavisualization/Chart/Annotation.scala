package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Annotation extends js.Object {
  
  /** Angle to rotate the annotation in degrees.
    * @Default {'0'}
    */
  var angle: js.UndefOr[Double] = js.native
  
  /** Text content or id of a HTML element to be displayed as annotation.
    */
  var content: js.UndefOr[String] = js.native
  
  /** Specifies how annotations have to be placed in Chart.
    * @Default {none. See CoordinateUnit}
    */
  var coordinateUnit: js.UndefOr[CoordinateUnit | String] = js.native
  
  /** Specifies the horizontal alignment of the annotation.
    * @Default {middle. See HorizontalAlignment}
    */
  var horizontalAlignment: js.UndefOr[HorizontalAlignment | String] = js.native
  
  /** Options to customize the margin of annotation.
    */
  var margin: js.UndefOr[AnnotationsMargin] = js.native
  
  /** Controls the opacity of the annotation.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /** Specifies whether annotation has to be placed with respect to chart or series.
    * @Default {chart. See Region}
    */
  var region: js.UndefOr[Region | String] = js.native
  
  /** Specifies the vertical alignment of the annotation.
    * @Default {middle. See VerticalAlignment}
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | String] = js.native
  
  /** Controls the visibility of the annotation.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /** Represents the horizontal offset when coordinateUnit is pixels.when coordinateUnit is points, it represents the x-coordinate of axis bounded with xAxisName property or primary X
    * axis when xAxisName is not provided.This property is not applicable when coordinateUnit is none.
    * @Default {0}
    */
  var x: js.UndefOr[Double] = js.native
  
  /** Name of the horizontal axis to be used for positioning the annotation. This property is applicable only when coordinateUnit is points.
    */
  var xAxisName: js.UndefOr[String] = js.native
  
  /** Represents the vertical offset when coordinateUnit is pixels.When coordinateUnit is points, it represents the y-coordinate of axis bounded with yAxisName property or primary Y
    * axis when yAxisName is not provided.This property is not applicable when coordinateUnit is none.
    * @Default {0}
    */
  var y: js.UndefOr[Double] = js.native
  
  /** Name of the vertical axis to be used for positioning the annotation.This property is applicable only when coordinateUnit is points.
    */
  var yAxisName: js.UndefOr[String] = js.native
}
object Annotation {
  
  @scala.inline
  def apply(): Annotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Annotation]
  }
  
  @scala.inline
  implicit class AnnotationOps[Self <: Annotation] (val x: Self) extends AnyVal {
    
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setCoordinateUnit(value: CoordinateUnit | String): Self = this.set("coordinateUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoordinateUnit: Self = this.set("coordinateUnit", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(value: HorizontalAlignment | String): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    
    @scala.inline
    def setMargin(value: AnnotationsMargin): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setRegion(value: Region | String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setVerticalAlignment(value: VerticalAlignment | String): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setXAxisName(value: String): Self = this.set("xAxisName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXAxisName: Self = this.set("xAxisName", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    
    @scala.inline
    def setYAxisName(value: String): Self = this.set("yAxisName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYAxisName: Self = this.set("yAxisName", js.undefined)
  }
}
