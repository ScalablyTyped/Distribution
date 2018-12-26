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

