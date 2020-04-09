package typings.devextreme.mod.DevExpress

import typings.devextreme.AnonComponent
import typings.devextreme.AnonElement
import typings.devextreme.AnonFullName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentOptions[T] extends js.Object {
  /** @name Component.Options.onDisposing */
  var onDisposing: js.UndefOr[js.Function1[/* e */ AnonComponent[T], _]] = js.undefined
  /** @name Component.Options.onInitialized */
  var onInitialized: js.UndefOr[js.Function1[/* e */ AnonElement[T], _]] = js.undefined
  /** @name Component.Options.onOptionChanged */
  var onOptionChanged: js.UndefOr[js.Function1[/* e */ AnonFullName[T], _]] = js.undefined
}

object ComponentOptions {
  @scala.inline
  def apply[T](
    onDisposing: /* e */ AnonComponent[T] => _ = null,
    onInitialized: /* e */ AnonElement[T] => _ = null,
    onOptionChanged: /* e */ AnonFullName[T] => _ = null
  ): ComponentOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    __obj.asInstanceOf[ComponentOptions[T]]
  }
}

