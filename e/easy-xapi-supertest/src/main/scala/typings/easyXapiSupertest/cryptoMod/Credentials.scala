package typings.easyXapiSupertest.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
}

object Credentials {
  @scala.inline
  def apply(context: js.Any = null): Credentials = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
}

