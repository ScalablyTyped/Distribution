package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesAnnotation extends js.Object {
  /** Sets the angle between the BPMN shape and the annotation
    * @Default {0}
    */
  var angle: js.UndefOr[scala.Double] = js.undefined
  /** Sets the direction of the text annotation
    * @Default {ej.datavisualization.Diagram.BPMNAnnotationDirections.Left}
    */
  var direction: js.UndefOr[BPMNAnnotationDirection | java.lang.String] = js.undefined
  /** Sets the height of the text annotation
    * @Default {20}
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Sets the distance between the BPMN shape and the annotation
    * @Default {0}
    */
  var length: js.UndefOr[scala.Double] = js.undefined
  /** Defines the additional information about the flow object in a BPMN Process
    */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the  width of the text annotation
    * @Default {20}
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object NodesAnnotation {
  @scala.inline
  def apply(
    angle: scala.Int | scala.Double = null,
    direction: BPMNAnnotationDirection | java.lang.String = null,
    height: scala.Int | scala.Double = null,
    length: scala.Int | scala.Double = null,
    text: java.lang.String = null,
    width: scala.Int | scala.Double = null
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

