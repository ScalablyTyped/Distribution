package typings.expo.anon

import org.scalablytyped.runtime.StringDictionary
import typings.expo.authSessionMod.AuthSessionResult
import typings.expo.expoStrings.error
import typings.expo.expoStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorCode extends AuthSessionResult {
  var errorCode: String | Null
  var params: StringDictionary[String]
  var `type`: error | success
  var url: String
}

object ErrorCode {
  @scala.inline
  def apply(params: StringDictionary[String], `type`: error | success, url: String, errorCode: String = null): ErrorCode = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCode]
  }
}

