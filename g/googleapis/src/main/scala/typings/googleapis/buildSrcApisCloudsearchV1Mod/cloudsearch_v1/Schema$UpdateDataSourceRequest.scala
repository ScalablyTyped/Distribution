package typings.googleapis.buildSrcApisCloudsearchV1Mod.cloudsearch_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$UpdateDataSourceRequest extends js.Object {
  /**
    * Common debug options.
    */
  var debugOptions: js.UndefOr[Schema$DebugOptions] = js.native
  var source: js.UndefOr[Schema$DataSource] = js.native
}

object Schema$UpdateDataSourceRequest {
  @scala.inline
  def apply(debugOptions: Schema$DebugOptions = null, source: Schema$DataSource = null): Schema$UpdateDataSourceRequest = {
    val __obj = js.Dynamic.literal()
    if (debugOptions != null) __obj.updateDynamic("debugOptions")(debugOptions.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UpdateDataSourceRequest]
  }
}

