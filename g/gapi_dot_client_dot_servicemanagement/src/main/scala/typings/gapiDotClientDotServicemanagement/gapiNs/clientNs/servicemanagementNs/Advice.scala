package typings.gapiDotClientDotServicemanagement.gapiNs.clientNs.servicemanagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Advice extends js.Object {
  /**
    * Useful description for why this advice was applied and what actions should
    * be taken to mitigate any implied risks.
    */
  var description: js.UndefOr[String] = js.undefined
}

object Advice {
  @scala.inline
  def apply(description: String = null): Advice = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[Advice]
  }
}

