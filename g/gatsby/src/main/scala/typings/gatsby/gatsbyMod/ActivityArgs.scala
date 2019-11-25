package typings.gatsby.gatsbyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityArgs extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var parentSpan: js.UndefOr[js.Object] = js.undefined
}

object ActivityArgs {
  @scala.inline
  def apply(id: String = null, parentSpan: js.Object = null): ActivityArgs = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (parentSpan != null) __obj.updateDynamic("parentSpan")(parentSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityArgs]
  }
}

