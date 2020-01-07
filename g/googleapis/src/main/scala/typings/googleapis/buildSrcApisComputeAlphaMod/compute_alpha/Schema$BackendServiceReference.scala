package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$BackendServiceReference extends js.Object {
  var backendService: js.UndefOr[String] = js.native
}

object Schema$BackendServiceReference {
  @scala.inline
  def apply(backendService: String = null): Schema$BackendServiceReference = {
    val __obj = js.Dynamic.literal()
    if (backendService != null) __obj.updateDynamic("backendService")(backendService.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BackendServiceReference]
  }
}

