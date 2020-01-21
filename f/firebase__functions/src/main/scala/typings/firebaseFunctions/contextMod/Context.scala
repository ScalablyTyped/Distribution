package typings.firebaseFunctions.contextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var authToken: js.UndefOr[String] = js.undefined
  var instanceIdToken: js.UndefOr[String] = js.undefined
}

object Context {
  @scala.inline
  def apply(authToken: String = null, instanceIdToken: String = null): Context = {
    val __obj = js.Dynamic.literal()
    if (authToken != null) __obj.updateDynamic("authToken")(authToken.asInstanceOf[js.Any])
    if (instanceIdToken != null) __obj.updateDynamic("instanceIdToken")(instanceIdToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

