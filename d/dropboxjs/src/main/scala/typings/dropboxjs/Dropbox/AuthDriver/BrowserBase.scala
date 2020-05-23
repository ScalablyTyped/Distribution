package typings.dropboxjs.Dropbox.AuthDriver

import typings.dropboxjs.Dropbox.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowserBase extends js.Object {
  def authType(): String
  def locationStateParam(url: String): String
  def onAuthStepChange(client: Client, callback: js.Function0[Unit]): Unit
}

object BrowserBase {
  @scala.inline
  def apply(
    authType: () => String,
    locationStateParam: String => String,
    onAuthStepChange: (Client, js.Function0[Unit]) => Unit
  ): BrowserBase = {
    val __obj = js.Dynamic.literal(authType = js.Any.fromFunction0(authType), locationStateParam = js.Any.fromFunction1(locationStateParam), onAuthStepChange = js.Any.fromFunction2(onAuthStepChange))
    __obj.asInstanceOf[BrowserBase]
  }
}

