package typings.feathersjsExpress.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var error: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
}

object Error {
  @scala.inline
  def apply(error: /* msg */ String => Unit = null): Error = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    __obj.asInstanceOf[Error]
  }
}

