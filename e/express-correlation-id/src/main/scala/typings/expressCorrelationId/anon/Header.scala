package typings.expressCorrelationId.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Header extends js.Object {
  var header: js.UndefOr[String] = js.undefined
}

object Header {
  @scala.inline
  def apply(header: String = null): Header = {
    val __obj = js.Dynamic.literal()
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    __obj.asInstanceOf[Header]
  }
}

