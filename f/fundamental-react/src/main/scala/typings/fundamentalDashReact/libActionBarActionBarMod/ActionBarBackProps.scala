package typings.fundamentalDashReact.libActionBarActionBarMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.MouseEvent
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionBarBackProps
  extends /* x */ StringDictionary[js.Any] {
  var buttonProps: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[
    js.Function1[/* event */ MouseEvent[HTMLButtonElement, typings.std.MouseEvent], Unit]
  ] = js.undefined
}

object ActionBarBackProps {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    buttonProps: StringDictionary[js.Any] = null,
    className: String = null,
    onClick: /* event */ MouseEvent[HTMLButtonElement, typings.std.MouseEvent] => Unit = null
  ): ActionBarBackProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps)
    if (className != null) __obj.updateDynamic("className")(className)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    __obj.asInstanceOf[ActionBarBackProps]
  }
}

