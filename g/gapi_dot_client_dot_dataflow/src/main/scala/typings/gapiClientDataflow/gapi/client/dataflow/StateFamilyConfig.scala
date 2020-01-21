package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateFamilyConfig extends js.Object {
  /** If true, this family corresponds to a read operation. */
  var isRead: js.UndefOr[Boolean] = js.undefined
  /** The state family value. */
  var stateFamily: js.UndefOr[String] = js.undefined
}

object StateFamilyConfig {
  @scala.inline
  def apply(isRead: js.UndefOr[Boolean] = js.undefined, stateFamily: String = null): StateFamilyConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isRead)) __obj.updateDynamic("isRead")(isRead.asInstanceOf[js.Any])
    if (stateFamily != null) __obj.updateDynamic("stateFamily")(stateFamily.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateFamilyConfig]
  }
}

