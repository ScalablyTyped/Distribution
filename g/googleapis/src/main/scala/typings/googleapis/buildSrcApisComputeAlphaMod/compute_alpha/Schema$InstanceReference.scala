package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InstanceReference extends js.Object {
  /**
    * The URL for a specific instance.
    */
  var instance: js.UndefOr[String] = js.native
}

object Schema$InstanceReference {
  @scala.inline
  def apply(instance: String = null): Schema$InstanceReference = {
    val __obj = js.Dynamic.literal()
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InstanceReference]
  }
}

