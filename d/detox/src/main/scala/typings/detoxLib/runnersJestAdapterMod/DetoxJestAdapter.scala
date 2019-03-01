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
    afterAll: js.Function0[js.Promise[scala.Unit]],
    beforeEach: js.Function0[js.Promise[scala.Unit]],
    detox: detoxLib.detoxMod.Global.DetoxNs.Detox,
    specDone: js.Function0[scala.Unit],
    specStarted: js.Function0[scala.Unit]
  ): DetoxJestAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("afterAll")(afterAll)
    __obj.updateDynamic("beforeEach")(beforeEach)
    __obj.updateDynamic("detox")(detox)
    __obj.updateDynamic("specDone")(specDone)
    __obj.updateDynamic("specStarted")(specStarted)
    __obj.asInstanceOf[DetoxJestAdapter]
  }
}

