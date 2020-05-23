package typings.gapiAuth2.gapi.auth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SigninOptionsBuilder extends js.Object {
  def setAppPackageName(name: String): js.Any
  def setFetchBasicProfile(fetch: Boolean): js.Any
  def setLoginHint(hint: String): js.Any
  def setPrompt(prompt: String): js.Any
  def setScope(scope: String): js.Any
}

object SigninOptionsBuilder {
  @scala.inline
  def apply(
    setAppPackageName: String => js.Any,
    setFetchBasicProfile: Boolean => js.Any,
    setLoginHint: String => js.Any,
    setPrompt: String => js.Any,
    setScope: String => js.Any
  ): SigninOptionsBuilder = {
    val __obj = js.Dynamic.literal(setAppPackageName = js.Any.fromFunction1(setAppPackageName), setFetchBasicProfile = js.Any.fromFunction1(setFetchBasicProfile), setLoginHint = js.Any.fromFunction1(setLoginHint), setPrompt = js.Any.fromFunction1(setPrompt), setScope = js.Any.fromFunction1(setScope))
    __obj.asInstanceOf[SigninOptionsBuilder]
  }
}

