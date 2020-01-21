package typings.expressCorrelationId

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeader extends js.Object {
  var header: js.UndefOr[String] = js.undefined
}

object AnonHeader {
  @scala.inline
  def apply(header: String = null): AnonHeader = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeader]
  }
}

