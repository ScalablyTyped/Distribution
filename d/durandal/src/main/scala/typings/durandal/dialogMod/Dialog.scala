package typings.durandal.dialogMod

import typings.durandal.DurandalActivator
import typings.durandal.DurandalPromise
import typings.durandal.compositionMod.CompositionContext
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dialog extends js.Object {
  var activator: DurandalActivator[_] = js.native
  var context: DialogContext = js.native
  var host: HTMLElement = js.native
  var owner: js.Any = js.native
  var settings: CompositionContext = js.native
  def close(): DurandalPromise[_] = js.native
}

object Dialog {
  @scala.inline
  def apply(
    activator: DurandalActivator[_],
    close: () => DurandalPromise[_],
    context: DialogContext,
    host: HTMLElement,
    owner: js.Any,
    settings: CompositionContext
  ): Dialog = {
    val __obj = js.Dynamic.literal(activator = activator.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), context = context.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dialog]
  }
  @scala.inline
  implicit class DialogOps[Self <: Dialog] (val x: Self) extends AnyVal {
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
    def setActivator(value: DurandalActivator[_]): Self = this.set("activator", value.asInstanceOf[js.Any])
    @scala.inline
    def setClose(value: () => DurandalPromise[_]): Self = this.set("close", js.Any.fromFunction0(value))
    @scala.inline
    def setContext(value: DialogContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setHost(value: HTMLElement): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwner(value: js.Any): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def setSettings(value: CompositionContext): Self = this.set("settings", value.asInstanceOf[js.Any])
  }
  
}

