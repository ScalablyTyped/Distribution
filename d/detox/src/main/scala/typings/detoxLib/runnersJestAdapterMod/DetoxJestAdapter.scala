package typings
package detoxLib.runnersJestAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetoxJestAdapter extends js.Object {
  var detox: detoxLib.detoxMod.Global.DetoxNs.Detox
  def afterAll(): js.Promise[scala.Unit]
  def beforeEach(): js.Promise[scala.Unit]
  // These are not publicly used, but are defined in order to overlap with the jasmine.CustomReporter interface (which is a weak interface)
  def specDone(): scala.Unit
  def specStarted(): scala.Unit
}

object DetoxJestAdapter {
  @scala.inline
  def apply(
    afterAll: () => js.Promise[scala.Unit],
    beforeEach: () => js.Promise[scala.Unit],
    detox: detoxLib.detoxMod.Global.DetoxNs.Detox,
    specDone: () => scala.Unit,
    specStarted: () => scala.Unit
  ): DetoxJestAdapter = {
    val __obj = js.Dynamic.literal(afterAll = js.Any.fromFunction0(afterAll), beforeEach = js.Any.fromFunction0(beforeEach), detox = detox, specDone = js.Any.fromFunction0(specDone), specStarted = js.Any.fromFunction0(specStarted))
  
    __obj.asInstanceOf[DetoxJestAdapter]
  }
}

