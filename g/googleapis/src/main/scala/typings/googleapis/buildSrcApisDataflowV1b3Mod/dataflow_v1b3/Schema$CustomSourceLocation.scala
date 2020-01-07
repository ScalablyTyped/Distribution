package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifies the location of a custom souce.
  */
@js.native
trait Schema$CustomSourceLocation extends js.Object {
  /**
    * Whether this source is stateful.
    */
  var stateful: js.UndefOr[Boolean] = js.native
}

object Schema$CustomSourceLocation {
  @scala.inline
  def apply(stateful: js.UndefOr[Boolean] = js.undefined): Schema$CustomSourceLocation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(stateful)) __obj.updateDynamic("stateful")(stateful.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomSourceLocation]
  }
}

