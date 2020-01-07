package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$RouterStatusResponse extends js.Object {
  /**
    * Type of resource.
    */
  var kind: js.UndefOr[String] = js.native
  var result: js.UndefOr[Schema$RouterStatus] = js.native
}

object Schema$RouterStatusResponse {
  @scala.inline
  def apply(kind: String = null, result: Schema$RouterStatus = null): Schema$RouterStatusResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RouterStatusResponse]
  }
}

