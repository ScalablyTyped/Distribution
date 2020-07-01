package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Index extends js.Object {
  var index: js.UndefOr[Double] = js.native
  var message: js.UndefOr[String] = js.native
}

object Index {
  @scala.inline
  def apply(index: js.UndefOr[Double] = js.undefined, message: String = null): Index = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Index]
  }
}

