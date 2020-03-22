package typings.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhoneMultiFactorSignInInfoOptions extends PhoneInfoOptions {
  var multiFactorHint: js.UndefOr[MultiFactorInfo] = js.undefined
  var multiFactorUid: js.UndefOr[String] = js.undefined
  var session: MultiFactorSession
}

object PhoneMultiFactorSignInInfoOptions {
  @scala.inline
  def apply(
    session: MultiFactorSession,
    multiFactorHint: MultiFactorInfo = null,
    multiFactorUid: String = null
  ): PhoneMultiFactorSignInInfoOptions = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any])
    if (multiFactorHint != null) __obj.updateDynamic("multiFactorHint")(multiFactorHint.asInstanceOf[js.Any])
    if (multiFactorUid != null) __obj.updateDynamic("multiFactorUid")(multiFactorUid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneMultiFactorSignInInfoOptions]
  }
}

