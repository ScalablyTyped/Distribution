package typings.googleapis.buildSrcApisGenomicsV2alpha1Mod.genomics_v2alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when a container is forcibly terminated by the worker.
  * Currently, this only occurs when the container outlives the timeout
  * specified by the user.
  */
@js.native
trait Schema$ContainerKilledEvent extends js.Object {
  /**
    * The numeric ID of the action that started the container.
    */
  var actionId: js.UndefOr[Double] = js.native
}

object Schema$ContainerKilledEvent {
  @scala.inline
  def apply(actionId: Int | Double = null): Schema$ContainerKilledEvent = {
    val __obj = js.Dynamic.literal()
    if (actionId != null) __obj.updateDynamic("actionId")(actionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ContainerKilledEvent]
  }
}

