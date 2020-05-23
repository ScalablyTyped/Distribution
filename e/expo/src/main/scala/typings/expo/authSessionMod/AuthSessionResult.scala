package typings.expo.authSessionMod

import org.scalablytyped.runtime.StringDictionary
import typings.expo.expoStrings.cancel
import typings.expo.expoStrings.dismiss
import typings.expo.expoStrings.error
import typings.expo.expoStrings.locked
import typings.expo.expoStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.expo.anon.Type
  - typings.expo.anon.ErrorCode
*/
trait AuthSessionResult extends js.Object

object AuthSessionResult {
  @scala.inline
  def Type(`type`: cancel | dismiss | locked): AuthSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSessionResult]
  }
  @scala.inline
  def ErrorCode(params: StringDictionary[String], `type`: error | success, url: String, errorCode: String = null): AuthSessionResult = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthSessionResult]
  }
}

