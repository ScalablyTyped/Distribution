package typings.detox.adapterMod

import typings.detox.mod._Global_.Detox_.Detox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetoxJestAdapter extends js.Object {
  var detox: Detox
  def afterAll(): js.Promise[Unit]
  def beforeEach(): js.Promise[Unit]
  // These are not publicly used, but are defined in order to overlap with the jasmine.CustomReporter interface (which is a weak interface)
  def specDone(): Unit
  def specStarted(): Unit
}

object DetoxJestAdapter {
  @scala.inline
  def apply(
    afterAll: () => js.Promise[Unit],
    beforeEach: () => js.Promise[Unit],
    detox: Detox,
    specDone: () => Unit,
    specStarted: () => Unit
  ): DetoxJestAdapter = {
    val __obj = js.Dynamic.literal(afterAll = js.Any.fromFunction0(afterAll), beforeEach = js.Any.fromFunction0(beforeEach), detox = detox.asInstanceOf[js.Any], specDone = js.Any.fromFunction0(specDone), specStarted = js.Any.fromFunction0(specStarted))
    __obj.asInstanceOf[DetoxJestAdapter]
  }
}

