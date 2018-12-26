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

