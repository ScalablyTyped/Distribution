package typings.googleapis.betaMod.computeBeta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaBackendServiceReference extends js.Object {
  var backendService: js.UndefOr[String] = js.native
}

object SchemaBackendServiceReference {
  @scala.inline
  def apply(backendService: String = null): SchemaBackendServiceReference = {
    val __obj = js.Dynamic.literal()
    if (backendService != null) __obj.updateDynamic("backendService")(backendService.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBackendServiceReference]
  }
}

