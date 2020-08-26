package typings.devextreme.mod.DevExpress

import typings.devextreme.anon.Element
import typings.devextreme.anon.FullName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentOptions[T] extends js.Object {
  /** @name Component.Options.onDisposing */
  var onDisposing: js.UndefOr[js.Function1[/* e */ typings.devextreme.anon.Component[T], _]] = js.native
  /** @name Component.Options.onInitialized */
  var onInitialized: js.UndefOr[js.Function1[/* e */ Element[T], _]] = js.native
  /** @name Component.Options.onOptionChanged */
  var onOptionChanged: js.UndefOr[js.Function1[/* e */ FullName[T], _]] = js.native
}

object ComponentOptions {
  @scala.inline
  def apply[T](): ComponentOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentOptions[T]]
  }
  @scala.inline
  implicit class ComponentOptionsOps[Self <: ComponentOptions[_], T] (val x: Self with ComponentOptions[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnDisposing(value: /* e */ typings.devextreme.anon.Component[T] => _): Self = this.set("onDisposing", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnDisposing: Self = this.set("onDisposing", js.undefined)
    @scala.inline
    def setOnInitialized(value: /* e */ Element[T] => _): Self = this.set("onInitialized", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnInitialized: Self = this.set("onInitialized", js.undefined)
    @scala.inline
    def setOnOptionChanged(value: /* e */ FullName[T] => _): Self = this.set("onOptionChanged", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnOptionChanged: Self = this.set("onOptionChanged", js.undefined)
  }
  
}

