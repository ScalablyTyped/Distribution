package typings
package detoxLib.runnersJestAdaptersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DetoxJestAdapter extends js.Object {
  var detox: detoxLib.detoxMod.Global.DetoxNs.Detox
  def afterAll(): stdLib.Promise[scala.Unit]
  def beforeEach(): stdLib.Promise[scala.Unit]
}

