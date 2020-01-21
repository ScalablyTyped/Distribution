package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceGroupManagerStatusVersionTarget extends js.Object {
  /**
    * [Output Only] A bit indicating whether version target has been reached in
    * this managed instance group, i.e. all instances are in their target
    * version. Instances&#39; target version are specified by version field on
    * Instance Group Manager.
    */
  var isReached: js.UndefOr[Boolean] = js.native
}

object SchemaInstanceGroupManagerStatusVersionTarget {
  @scala.inline
  def apply(isReached: js.UndefOr[Boolean] = js.undefined): SchemaInstanceGroupManagerStatusVersionTarget = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isReached)) __obj.updateDynamic("isReached")(isReached.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstanceGroupManagerStatusVersionTarget]
  }
}

