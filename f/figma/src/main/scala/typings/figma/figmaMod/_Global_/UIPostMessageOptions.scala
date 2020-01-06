package typings.figma.figmaMod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIPostMessageOptions extends js.Object {
  var origin: js.UndefOr[String] = js.undefined
}

object UIPostMessageOptions {
  @scala.inline
  def apply(origin: String = null): UIPostMessageOptions = {
    val __obj = js.Dynamic.literal()
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIPostMessageOptions]
  }
}

