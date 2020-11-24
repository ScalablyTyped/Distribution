package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodesAnnotation extends js.Object {
  
  /** Sets the angle between the BPMN shape and the annotation
    * @Default {0}
    */
  var angle: js.UndefOr[Double] = js.native
  
  /** Sets the direction of the text annotation
    * @Default {ej.datavisualization.Diagram.BPMNAnnotationDirections.Left}
    */
  var direction: js.UndefOr[BPMNAnnotationDirection | String] = js.native
  
  /** Sets the height of the text annotation
    * @Default {20}
    */
  var height: js.UndefOr[Double] = js.native
  
  /** Sets the distance between the BPMN shape and the annotation
    * @Default {0}
    */
  var length: js.UndefOr[Double] = js.native
  
  /** Defines the additional information about the flow object in a BPMN Process
    */
  var text: js.UndefOr[String] = js.native
  
  /** Sets the  width of the text annotation
    * @Default {20}
    */
  var width: js.UndefOr[Double] = js.native
}
object NodesAnnotation {
  
  @scala.inline
  def apply(): NodesAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesAnnotation]
  }
  
  @scala.inline
  implicit class NodesAnnotationOps[Self <: NodesAnnotation] (val x: Self) extends AnyVal {
    
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
    def setDirection(value: BPMNAnnotationDirection | String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
