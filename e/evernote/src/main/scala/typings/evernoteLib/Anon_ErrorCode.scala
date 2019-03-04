package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ErrorCode extends js.Object {
  var errorCode: evernoteLib.evernoteMod.EvernoteNs.EDAMErrorCode
  var parameter: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ErrorCode {
  @scala.inline
  def apply(errorCode: evernoteLib.evernoteMod.EvernoteNs.EDAMErrorCode, parameter: java.lang.String = null): Anon_ErrorCode = {
    val __obj = js.Dynamic.literal(errorCode = errorCode)
    if (parameter != null) __obj.updateDynamic("parameter")(parameter)
    __obj.asInstanceOf[Anon_ErrorCode]
  }
}

