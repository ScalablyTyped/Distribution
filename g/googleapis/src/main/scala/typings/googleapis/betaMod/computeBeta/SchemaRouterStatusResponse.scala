package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRouterStatusResponse extends js.Object {
  /**
    * Type of resource.
    */
  var kind: js.UndefOr[String] = js.native
  var result: js.UndefOr[SchemaRouterStatus] = js.native
}

object SchemaRouterStatusResponse {
  @scala.inline
  def apply(kind: String = null, result: SchemaRouterStatus = null): SchemaRouterStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRouterStatusResponse]
  }
}

