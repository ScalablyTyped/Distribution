package typings.detox.specReporterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JasmineSpecReporter extends js.Object {
  def specDone(): Unit
  def specStarted(): Unit
  def suiteDone(): Unit
  // These are not publicly used, but are defined in order to overlap with the jasmine.CustomReporter interface (which is a weak interface)
  def suiteStarted(): Unit
}

object JasmineSpecReporter {
  @scala.inline
  def apply(specDone: () => Unit, specStarted: () => Unit, suiteDone: () => Unit, suiteStarted: () => Unit): JasmineSpecReporter = {
    val __obj = js.Dynamic.literal(specDone = js.Any.fromFunction0(specDone), specStarted = js.Any.fromFunction0(specStarted), suiteDone = js.Any.fromFunction0(suiteDone), suiteStarted = js.Any.fromFunction0(suiteStarted))
  
    __obj.asInstanceOf[JasmineSpecReporter]
  }
}

