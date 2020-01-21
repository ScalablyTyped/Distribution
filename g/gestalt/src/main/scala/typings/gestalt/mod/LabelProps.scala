package typings.gestalt.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var htmlFor: String
}

object LabelProps {
  @scala.inline
  def apply(htmlFor: String, children: ReactNode = null): LabelProps = {
    val __obj = js.Dynamic.literal(htmlFor = htmlFor.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelProps]
  }
}

