package typings.googleAuthLibrary

import typings.googleAuthLibrary.loginticketMod.TokenPayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnvelope extends js.Object {
  var envelope: js.UndefOr[String] = js.undefined
  var payload: js.UndefOr[TokenPayload] = js.undefined
}

object AnonEnvelope {
  @scala.inline
  def apply(envelope: String = null, payload: TokenPayload = null): AnonEnvelope = {
    val __obj = js.Dynamic.literal()
    if (envelope != null) __obj.updateDynamic("envelope")(envelope.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEnvelope]
  }
}

