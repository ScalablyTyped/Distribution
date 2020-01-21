package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentTransform extends js.Object {
  /** Dataflow service generated name for this source. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * User name for the original user transform with which this transform is
    * most closely associated.
    */
  var originalTransform: js.UndefOr[String] = js.undefined
  /** Human-readable name for this transform; may be user or system generated. */
  var userName: js.UndefOr[String] = js.undefined
}

object ComponentTransform {
  @scala.inline
  def apply(name: String = null, originalTransform: String = null, userName: String = null): ComponentTransform = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (originalTransform != null) __obj.updateDynamic("originalTransform")(originalTransform.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentTransform]
  }
}

