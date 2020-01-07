package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ResetSearchApplicationRequest extends js.Object {
  /**
    * Common debug options.
    */
  var debugOptions: js.UndefOr[Schema$DebugOptions] = js.native
}

object Schema$ResetSearchApplicationRequest {
  @scala.inline
  def apply(debugOptions: Schema$DebugOptions = null): Schema$ResetSearchApplicationRequest = {
    val __obj = js.Dynamic.literal()
    if (debugOptions != null) __obj.updateDynamic("debugOptions")(debugOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ResetSearchApplicationRequest]
  }
}

