package typings.googleapis.buildSrcApisRuntimeconfigV1beta1Mod.runtimeconfig_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the `WatchVariable()` method.
  */
@js.native
trait Schema$WatchVariableRequest extends js.Object {
  /**
    * If specified, checks the current timestamp of the variable and if the
    * current timestamp is newer than `newerThan` timestamp, the method returns
    * immediately.  If not specified or the variable has an older timestamp,
    * the watcher waits for a the value to change before returning.
    */
  var newerThan: js.UndefOr[String] = js.native
}

object Schema$WatchVariableRequest {
  @scala.inline
  def apply(newerThan: String = null): Schema$WatchVariableRequest = {
    val __obj = js.Dynamic.literal()
    if (newerThan != null) __obj.updateDynamic("newerThan")(newerThan.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$WatchVariableRequest]
  }
}

