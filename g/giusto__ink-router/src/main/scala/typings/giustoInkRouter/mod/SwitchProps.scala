package typings.giustoInkRouter.mod

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchProps extends js.Object {
  var children: js.UndefOr[ReactElement | js.Array[ReactElement]] = js.undefined
  var notFound: js.UndefOr[js.Function0[_] | ComponentType[_]] = js.undefined
}

object SwitchProps {
  @scala.inline
  def apply(
    children: ReactElement | js.Array[ReactElement] = null,
    notFound: js.Function0[_] | ComponentType[_] = null
  ): SwitchProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (notFound != null) __obj.updateDynamic("notFound")(notFound.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchProps]
  }
}

