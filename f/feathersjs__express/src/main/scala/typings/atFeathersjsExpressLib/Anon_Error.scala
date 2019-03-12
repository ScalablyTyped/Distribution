package typings
package atFeathersjsExpressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: js.UndefOr[js.Function1[/* msg */ java.lang.String, scala.Unit]] = js.undefined
}

object Anon_Error {
  @scala.inline
  def apply(error: /* msg */ java.lang.String => scala.Unit = null): Anon_Error = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    __obj.asInstanceOf[Anon_Error]
  }
}

