package typings
package googleDashAuthDashLibraryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Envelope extends js.Object {
  var envelope: js.UndefOr[java.lang.String]
  var payload: js.UndefOr[googleDashAuthDashLibraryLib.buildSrcAuthLoginticketMod.TokenPayload]
}

object Anon_Envelope {
  @scala.inline
  def apply(
    envelope: java.lang.String = null,
    payload: googleDashAuthDashLibraryLib.buildSrcAuthLoginticketMod.TokenPayload = null
  ): Anon_Envelope = {
    val __obj = js.Dynamic.literal()
    if (envelope != null) __obj.updateDynamic("envelope")(envelope)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    __obj.asInstanceOf[Anon_Envelope]
  }
}

