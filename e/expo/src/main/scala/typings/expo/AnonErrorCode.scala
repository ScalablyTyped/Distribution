package typings.expo

import org.scalablytyped.runtime.StringDictionary
import typings.expo.authSessionMod.AuthSessionResult
import typings.expo.expoStrings.error
import typings.expo.expoStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErrorCode extends AuthSessionResult {
  var errorCode: String | Null
  var params: StringDictionary[String]
  var `type`: error | success
  var url: String
}

object AnonErrorCode {
  @scala.inline
  def apply(params: StringDictionary[String], `type`: error | success, url: String, errorCode: String = null): AnonErrorCode = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErrorCode]
  }
}

