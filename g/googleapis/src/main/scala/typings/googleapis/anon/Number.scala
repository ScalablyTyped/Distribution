package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Number extends js.Object {
  var name: js.UndefOr[String] = js.native
  var number: js.UndefOr[Double] = js.native
  var url: js.UndefOr[String] = js.native
}

object Number {
  @scala.inline
  def apply(name: String = null, number: js.UndefOr[Double] = js.undefined, url: String = null): Number = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Number]
  }
}

