package typings.evernote

import typings.evernote.mod.Evernote.EDAMErrorCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorCode extends js.Object {
  var errorCode: EDAMErrorCode
  var parameter: js.UndefOr[String] = js.undefined
}

object AnonErrorCode {
  @scala.inline
  def apply(errorCode: EDAMErrorCode, parameter: String = null): AnonErrorCode = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    if (parameter != null) __obj.updateDynamic("parameter")(parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrorCode]
  }
}

