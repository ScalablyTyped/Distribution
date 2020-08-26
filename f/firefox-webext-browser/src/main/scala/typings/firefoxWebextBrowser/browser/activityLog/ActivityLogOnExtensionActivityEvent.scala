package typings.firefoxWebextBrowser.browser.activityLog

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityLogOnExtensionActivityEvent[TCallback] extends js.Object {
  def addListener(cb: TCallback, id: String): Unit = js.native
  def hasListener(cb: TCallback): Boolean = js.native
  def removeListener(cb: TCallback): Unit = js.native
}

object ActivityLogOnExtensionActivityEvent {
  @scala.inline
  def apply[TCallback](
    addListener: (TCallback, String) => Unit,
    hasListener: TCallback => Boolean,
    removeListener: TCallback => Unit
  ): ActivityLogOnExtensionActivityEvent[TCallback] = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), hasListener = js.Any.fromFunction1(hasListener), removeListener = js.Any.fromFunction1(removeListener))
    __obj.asInstanceOf[ActivityLogOnExtensionActivityEvent[TCallback]]
  }
  @scala.inline
  implicit class ActivityLogOnExtensionActivityEventOps[Self <: ActivityLogOnExtensionActivityEvent[_], TCallback] (val x: Self with ActivityLogOnExtensionActivityEvent[TCallback]) extends AnyVal {
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
    def setAddListener(value: (TCallback, String) => Unit): Self = this.set("addListener", js.Any.fromFunction2(value))
    @scala.inline
    def setHasListener(value: TCallback => Boolean): Self = this.set("hasListener", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveListener(value: TCallback => Unit): Self = this.set("removeListener", js.Any.fromFunction1(value))
  }
  
}

