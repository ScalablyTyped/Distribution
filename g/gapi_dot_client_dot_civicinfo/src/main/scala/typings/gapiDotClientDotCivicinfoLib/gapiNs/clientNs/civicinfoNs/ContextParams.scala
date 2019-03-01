package typings
package gapiDotClientDotCivicinfoLib.gapiNs.clientNs.civicinfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextParams extends js.Object {
  var clientProfile: js.UndefOr[java.lang.String] = js.undefined
}

object ContextParams {
  @scala.inline
  def apply(clientProfile: java.lang.String = null): ContextParams = {
    val __obj = js.Dynamic.literal()
    if (clientProfile != null) __obj.updateDynamic("clientProfile")(clientProfile)
    __obj.asInstanceOf[ContextParams]
  }
}

