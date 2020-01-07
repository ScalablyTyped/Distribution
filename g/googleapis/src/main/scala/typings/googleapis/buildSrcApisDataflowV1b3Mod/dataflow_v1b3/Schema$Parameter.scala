package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Structured data associated with this message.
  */
@js.native
trait Schema$Parameter extends js.Object {
  /**
    * Key or name for this parameter.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * Value for this parameter.
    */
  var value: js.UndefOr[js.Any] = js.native
}

object Schema$Parameter {
  @scala.inline
  def apply(key: String = null, value: js.Any = null): Schema$Parameter = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Parameter]
  }
}

