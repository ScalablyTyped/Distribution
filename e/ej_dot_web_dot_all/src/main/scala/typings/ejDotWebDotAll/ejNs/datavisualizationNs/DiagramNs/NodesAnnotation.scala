package typings.ejDotWebDotAll.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesAnnotation extends js.Object {
  /** Sets the angle between the BPMN shape and the annotation
    * @Default {0}
    */
  var angle: js.UndefOr[Double] = js.undefined
  /** Sets the direction of the text annotation
    * @Default {ej.datavisualization.Diagram.BPMNAnnotationDirections.Left}
    */
  var direction: js.UndefOr[BPMNAnnotationDirection | String] = js.undefined
  /** Sets the height of the text annotation
    * @Default {20}
    */
  var height: js.UndefOr[Double] = js.undefined
  /** Sets the distance between the BPMN shape and the annotation
    * @Default {0}
    */
  var length: js.UndefOr[Double] = js.undefined
  /** Defines the additional information about the flow object in a BPMN Process
    */
  var text: js.UndefOr[String] = js.undefined
  /** Sets the  width of the text annotation
    * @Default {20}
    */
  var width: js.UndefOr[Double] = js.undefined
}

object NodesAnnotation {
  @scala.inline
  def apply(
    angle: Int | Double = null,
    direction: BPMNAnnotationDirection | String = null,
    height: Int | Double = null,
    length: Int | Double = null,
    text: String = null,
    width: Int | Double = null
  ): NodesAnnotation = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesAnnotation]
  }
}

