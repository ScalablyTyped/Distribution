package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description of a transform executed as part of an execution stage.
  */
@js.native
trait Schema$ComponentTransform extends js.Object {
  /**
    * Dataflow service generated name for this source.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * User name for the original user transform with which this transform is
    * most closely associated.
    */
  var originalTransform: js.UndefOr[String] = js.native
  /**
    * Human-readable name for this transform; may be user or system generated.
    */
  var userName: js.UndefOr[String] = js.native
}

object Schema$ComponentTransform {
  @scala.inline
  def apply(name: String = null, originalTransform: String = null, userName: String = null): Schema$ComponentTransform = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (originalTransform != null) __obj.updateDynamic("originalTransform")(originalTransform.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ComponentTransform]
  }
}

