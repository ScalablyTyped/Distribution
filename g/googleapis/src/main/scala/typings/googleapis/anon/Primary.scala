package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Primary extends js.Object {
  var primary: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[String] = js.native
}

object Primary {
  @scala.inline
  def apply(primary: js.UndefOr[Boolean] = js.undefined, value: String = null): Primary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(primary)) __obj.updateDynamic("primary")(primary.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Primary]
  }
}

