package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ManagedInstanceVersion extends js.Object {
  /**
    * [Output Only] The intended template of the instance. This field is empty
    * when current_action is one of { DELETING, ABANDONING }.
    */
  var instanceTemplate: js.UndefOr[String] = js.native
  /**
    * [Output Only] Name of the version.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$ManagedInstanceVersion {
  @scala.inline
  def apply(instanceTemplate: String = null, name: String = null): Schema$ManagedInstanceVersion = {
    val __obj = js.Dynamic.literal()
    if (instanceTemplate != null) __obj.updateDynamic("instanceTemplate")(instanceTemplate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ManagedInstanceVersion]
  }
}

