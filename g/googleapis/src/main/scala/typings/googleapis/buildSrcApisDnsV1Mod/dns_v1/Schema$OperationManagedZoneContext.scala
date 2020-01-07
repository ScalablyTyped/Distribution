package typings.googleapis.buildSrcApisDnsV1Mod.dns_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OperationManagedZoneContext extends js.Object {
  var newValue: js.UndefOr[Schema$ManagedZone] = js.native
  var oldValue: js.UndefOr[Schema$ManagedZone] = js.native
}

object Schema$OperationManagedZoneContext {
  @scala.inline
  def apply(newValue: Schema$ManagedZone = null, oldValue: Schema$ManagedZone = null): Schema$OperationManagedZoneContext = {
    val __obj = js.Dynamic.literal()
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OperationManagedZoneContext]
  }
}

