package typings.detox.specReporterMod

import typings.detox.mod.global.Detox_.CircusTestEventListenerBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecReporter extends CircusTestEventListenerBase {
  def specDone(): Unit = js.native
  def specStarted(): Unit = js.native
  def suiteDone(): Unit = js.native
  // These are not publicly used, but are defined in order to overlap with the jasmine.CustomReporter interface (which is a weak interface)
  def suiteStarted(): Unit = js.native
}

object SpecReporter {
  @scala.inline
  def apply(
    handleTestEvent: (js.Any, js.Any) => js.Promise[Unit],
    specDone: () => Unit,
    specStarted: () => Unit,
    suiteDone: () => Unit,
    suiteStarted: () => Unit
  ): SpecReporter = {
    val __obj = js.Dynamic.literal(handleTestEvent = js.Any.fromFunction2(handleTestEvent), specDone = js.Any.fromFunction0(specDone), specStarted = js.Any.fromFunction0(specStarted), suiteDone = js.Any.fromFunction0(suiteDone), suiteStarted = js.Any.fromFunction0(suiteStarted))
    __obj.asInstanceOf[SpecReporter]
  }
  @scala.inline
  implicit class SpecReporterOps[Self <: SpecReporter] (val x: Self) extends AnyVal {
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
    def setSpecDone(value: () => Unit): Self = this.set("specDone", js.Any.fromFunction0(value))
    @scala.inline
    def setSpecStarted(value: () => Unit): Self = this.set("specStarted", js.Any.fromFunction0(value))
    @scala.inline
    def setSuiteDone(value: () => Unit): Self = this.set("suiteDone", js.Any.fromFunction0(value))
    @scala.inline
    def setSuiteStarted(value: () => Unit): Self = this.set("suiteStarted", js.Any.fromFunction0(value))
  }
  
}

