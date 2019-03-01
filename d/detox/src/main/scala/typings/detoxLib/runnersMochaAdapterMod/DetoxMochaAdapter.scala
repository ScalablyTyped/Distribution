package typings
package detoxLib.runnersMochaAdapterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetoxMochaAdapter extends js.Object {
  var detox: detoxLib.detoxMod.Global.DetoxNs.Detox
  def afterEach(context: js.Any): js.Promise[scala.Unit]
  def beforeEach(context: js.Any): js.Promise[scala.Unit]
}

object DetoxMochaAdapter {
  @scala.inline
  def apply(
    afterEach: js.Function1[js.Any, js.Promise[scala.Unit]],
    beforeEach: js.Function1[js.Any, js.Promise[scala.Unit]],
    detox: detoxLib.detoxMod.Global.DetoxNs.Detox
  ): DetoxMochaAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("afterEach")(afterEach)
    __obj.updateDynamic("beforeEach")(beforeEach)
    __obj.updateDynamic("detox")(detox)
    __obj.asInstanceOf[DetoxMochaAdapter]
  }
}

