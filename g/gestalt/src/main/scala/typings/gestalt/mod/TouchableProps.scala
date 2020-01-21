package typings.gestalt.mod

import typings.gestalt.AnonEventHTMLDivElement
import typings.gestalt.AnonEventHTMLDivElementKeyboardEvent
import typings.gestalt.gestaltStrings.circle
import typings.gestalt.gestaltStrings.copy
import typings.gestalt.gestaltStrings.grab
import typings.gestalt.gestaltStrings.grabbing
import typings.gestalt.gestaltStrings.move
import typings.gestalt.gestaltStrings.noDrop
import typings.gestalt.gestaltStrings.pill
import typings.gestalt.gestaltStrings.pointer
import typings.gestalt.gestaltStrings.rounded
import typings.gestalt.gestaltStrings.roundedBottom
import typings.gestalt.gestaltStrings.roundedLeft
import typings.gestalt.gestaltStrings.roundedRight
import typings.gestalt.gestaltStrings.roundedTop
import typings.gestalt.gestaltStrings.square
import typings.gestalt.gestaltStrings.zoomIn
import typings.gestalt.gestaltStrings.zoomOut
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchableProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var fullHeight: js.UndefOr[Boolean] = js.undefined
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  var mouseCursor: js.UndefOr[copy | grab | grabbing | move | noDrop | pointer | zoomIn | zoomOut] = js.undefined
  var onMouseEnter: js.UndefOr[js.Function1[/* args */ AnonEventHTMLDivElement, Unit]] = js.undefined
  var onMouseLeave: js.UndefOr[js.Function1[/* args */ AnonEventHTMLDivElement, Unit]] = js.undefined
  var shape: js.UndefOr[
    square | rounded | pill | circle | roundedTop | roundedBottom | roundedLeft | roundedRight
  ] = js.undefined
  def onTouch(args: AnonEventHTMLDivElementKeyboardEvent): Unit
}

object TouchableProps {
  @scala.inline
  def apply(
    onTouch: AnonEventHTMLDivElementKeyboardEvent => Unit,
    children: ReactNode = null,
    fullHeight: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    mouseCursor: copy | grab | grabbing | move | noDrop | pointer | zoomIn | zoomOut = null,
    onMouseEnter: /* args */ AnonEventHTMLDivElement => Unit = null,
    onMouseLeave: /* args */ AnonEventHTMLDivElement => Unit = null,
    shape: square | rounded | pill | circle | roundedTop | roundedBottom | roundedLeft | roundedRight = null
  ): TouchableProps = {
    val __obj = js.Dynamic.literal(onTouch = js.Any.fromFunction1(onTouch))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(fullHeight)) __obj.updateDynamic("fullHeight")(fullHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (mouseCursor != null) __obj.updateDynamic("mouseCursor")(mouseCursor.asInstanceOf[js.Any])
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchableProps]
  }
}

