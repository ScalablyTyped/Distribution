package typings
package gapiDotClientDotAdexchangebuyerLib.gapiNs.clientNs.adexchangebuyerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateData extends js.Object {
  var referenceId: js.UndefOr[java.lang.String] = js.undefined
  var referencePayload: js.UndefOr[java.lang.String] = js.undefined
}

object PrivateData {
  @scala.inline
  def apply(referenceId: java.lang.String = null, referencePayload: java.lang.String = null): PrivateData = {
    val __obj = js.Dynamic.literal()
    if (referenceId != null) __obj.updateDynamic("referenceId")(referenceId)
    if (referencePayload != null) __obj.updateDynamic("referencePayload")(referencePayload)
    __obj.asInstanceOf[PrivateData]
  }
}

