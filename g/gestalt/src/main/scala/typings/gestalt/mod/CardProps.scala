package typings.gestalt.mod

import typings.gestalt.AnonEventSyntheticEvent
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardProps extends js.Object {
  var active: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var image: js.UndefOr[ReactNode] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* args */ AnonEventSyntheticEvent, Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* args */ AnonEventSyntheticEvent, Unit]] = js.undefined
}

object CardProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    image: ReactNode = null,
    onMouseEnter: /* args */ AnonEventSyntheticEvent => Unit = null,
    onMouseLeave: /* args */ AnonEventSyntheticEvent => Unit = null
  ): CardProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    __obj.asInstanceOf[CardProps]
  }
}

