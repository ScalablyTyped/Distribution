package typings.gatsby.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Errors[TData] extends js.Object {
  var data: js.UndefOr[TData] = js.undefined
  var errors: js.UndefOr[js.Any] = js.undefined
}

object Errors {
  @scala.inline
  def apply[TData](data: TData = null, errors: js.Any = null): Errors[TData] = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors[TData]]
  }
}

