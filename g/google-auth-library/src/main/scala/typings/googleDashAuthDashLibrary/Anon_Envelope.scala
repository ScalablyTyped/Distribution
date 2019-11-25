package typings.googleDashAuthDashLibrary

import typings.googleDashAuthDashLibrary.buildSrcAuthLoginticketMod.TokenPayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Envelope extends js.Object {
  var envelope: js.UndefOr[String] = js.undefined
  var payload: js.UndefOr[TokenPayload] = js.undefined
}

object Anon_Envelope {
  @scala.inline
  def apply(envelope: String = null, payload: TokenPayload = null): Anon_Envelope = {
    val __obj = js.Dynamic.literal()
    if (envelope != null) __obj.updateDynamic("envelope")(envelope.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Envelope]
  }
}

