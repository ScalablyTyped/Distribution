package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ResourceGroupReference extends js.Object {
  /**
    * A URI referencing one of the instance groups or network endpoint groups
    * listed in the backend service.
    */
  var group: js.UndefOr[String] = js.native
}

object Schema$ResourceGroupReference {
  @scala.inline
  def apply(group: String = null): Schema$ResourceGroupReference = {
    val __obj = js.Dynamic.literal()
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResourceGroupReference]
  }
}

