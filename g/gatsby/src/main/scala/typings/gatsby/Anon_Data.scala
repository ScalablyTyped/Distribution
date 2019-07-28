package typings.gatsby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data[TData] extends js.Object {
  var data: js.UndefOr[TData] = js.undefined
  var errors: js.UndefOr[js.Any] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply[TData](data: TData = null, errors: js.Any = null): Anon_Data[TData] = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[Anon_Data[TData]]
  }
}

