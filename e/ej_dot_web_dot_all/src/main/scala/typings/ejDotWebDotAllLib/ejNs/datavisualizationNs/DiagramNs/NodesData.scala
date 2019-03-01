package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesData extends js.Object {
  /** Defines whether the BPMN data object is a collection or not
    * @Default {false}
    */
  var collection: js.UndefOr[scala.Boolean] = js.undefined
  /** Sets the type of the BPMN Data object
    * @Default {ej.datavisualization.Diagram.BPMNDataObjects.None}
    */
  var `type`: js.UndefOr[BPMNDataObjects | java.lang.String] = js.undefined
}

object NodesData {
  @scala.inline
  def apply(
    collection: js.UndefOr[scala.Boolean] = js.undefined,
    `type`: BPMNDataObjects | java.lang.String = null
  ): NodesData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collection)) __obj.updateDynamic("collection")(collection)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesData]
  }
}

