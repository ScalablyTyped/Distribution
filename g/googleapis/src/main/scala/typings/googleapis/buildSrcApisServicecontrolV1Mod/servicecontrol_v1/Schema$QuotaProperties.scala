package typings.googleapis.buildSrcApisServicecontrolV1Mod.servicecontrol_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the properties needed for quota operations.
  */
@js.native
trait Schema$QuotaProperties extends js.Object {
  /**
    * Quota mode for this operation.
    */
  var quotaMode: js.UndefOr[String] = js.native
}

object Schema$QuotaProperties {
  @scala.inline
  def apply(quotaMode: String = null): Schema$QuotaProperties = {
    val __obj = js.Dynamic.literal()
    if (quotaMode != null) __obj.updateDynamic("quotaMode")(quotaMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$QuotaProperties]
  }
}

