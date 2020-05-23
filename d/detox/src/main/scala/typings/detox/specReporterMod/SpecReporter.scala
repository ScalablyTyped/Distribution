package typings.detox.specReporterMod

import typings.detox.mod.global.Detox_.CircusTestEventListenerBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecReporter extends CircusTestEventListenerBase {
  def specDone(): Unit
  def specStarted(): Unit
  def suiteDone(): Unit
  // These are not publicly used, but are defined in order to overlap with the jasmine.CustomReporter interface (which is a weak interface)
  def suiteStarted(): Unit
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
}

