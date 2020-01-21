package typings.expressUnless

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMethod extends js.Object {
  var method: js.UndefOr[String | js.Array[String]] = js.undefined
  var methods: js.UndefOr[js.Array[String]] = js.undefined
  var url: String | RegExp
}

object AnonMethod {
  @scala.inline
  def apply(url: String | RegExp, method: String | js.Array[String] = null, methods: js.Array[String] = null): AnonMethod = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMethod]
  }
}

