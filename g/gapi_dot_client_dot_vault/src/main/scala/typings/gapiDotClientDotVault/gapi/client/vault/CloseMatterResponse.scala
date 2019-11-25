package typings.gapiDotClientDotVault.gapi.client.vault

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseMatterResponse extends js.Object {
  /** The updated matter, with state CLOSED. */
  var matter: js.UndefOr[Matter] = js.undefined
}

object CloseMatterResponse {
  @scala.inline
  def apply(matter: Matter = null): CloseMatterResponse = {
    val __obj = js.Dynamic.literal()
    if (matter != null) __obj.updateDynamic("matter")(matter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseMatterResponse]
  }
}

