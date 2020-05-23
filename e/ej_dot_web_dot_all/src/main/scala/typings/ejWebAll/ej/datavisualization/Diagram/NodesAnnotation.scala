package typings.ejWebAll.ej.datavisualization.Diagram

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
    angle: js.UndefOr[Double] = js.undefined,
    direction: BPMNAnnotationDirection | String = null,
    height: js.UndefOr[Double] = js.undefined,
    length: js.UndefOr[Double] = js.undefined,
    text: String = null,
    width: js.UndefOr[Double] = js.undefined
  ): NodesAnnotation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angle)) __obj.updateDynamic("angle")(angle.get.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesAnnotation]
  }
}

