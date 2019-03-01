package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GcmSenderId extends js.Object {
  var gcmSenderId: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_GcmSenderId {
  @scala.inline
  def apply(gcmSenderId: java.lang.String = null): Anon_GcmSenderId = {
    val __obj = js.Dynamic.literal()
    if (gcmSenderId != null) __obj.updateDynamic("gcmSenderId")(gcmSenderId)
    __obj.asInstanceOf[Anon_GcmSenderId]
  }
}

