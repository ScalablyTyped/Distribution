package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesData extends js.Object {
  /** Defines whether the BPMN data object is a collection or not
    * @Default {false}
    */
  var collection: js.UndefOr[Boolean] = js.undefined
  /** Sets the type of the BPMN Data object
    * @Default {ej.datavisualization.Diagram.BPMNDataObjects.None}
    */
  var `type`: js.UndefOr[BPMNDataObjects | String] = js.undefined
}

object NodesData {
  @scala.inline
  def apply(collection: js.UndefOr[Boolean] = js.undefined, `type`: BPMNDataObjects | String = null): NodesData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collection)) __obj.updateDynamic("collection")(collection.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesData]
  }
}

