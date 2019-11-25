package typings.evernote

import typings.evernote.evernoteMod.Evernote.EDAMErrorCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorCode extends js.Object {
  var errorCode: EDAMErrorCode
  var parameter: js.UndefOr[String] = js.undefined
}

object Anon_ErrorCode {
  @scala.inline
  def apply(errorCode: EDAMErrorCode, parameter: String = null): Anon_ErrorCode = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    if (parameter != null) __obj.updateDynamic("parameter")(parameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ErrorCode]
  }
}

