package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Node Affinity: the configuration of desired nodes onto which this Instance
  * could be scheduled.
  */
@js.native
trait Schema$SchedulingNodeAffinity extends js.Object {
  /**
    * Corresponds to the label key of Node resource.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Defines the operation of node selection.
    */
  var operator: js.UndefOr[String] = js.native
  /**
    * Corresponds to the label values of Node resource.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object Schema$SchedulingNodeAffinity {
  @scala.inline
  def apply(key: String = null, operator: String = null, values: js.Array[String] = null): Schema$SchedulingNodeAffinity = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SchedulingNodeAffinity]
  }
}

