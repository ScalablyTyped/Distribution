package typings.googleapis.buildSrcApisServicemanagementV1Mod.servicemanagement_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generated advice about this change, used for providing more information
  * about how a change will affect the existing service.
  */
@js.native
trait Schema$Advice extends js.Object {
  /**
    * Useful description for why this advice was applied and what actions
    * should be taken to mitigate any implied risks.
    */
  var description: js.UndefOr[String] = js.native
}

object Schema$Advice {
  @scala.inline
  def apply(description: String = null): Schema$Advice = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Advice]
  }
}

