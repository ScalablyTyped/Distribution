package typings
package dispatchrLib.addonsBaseStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseStore[S]
  extends dispatchrLib.dispatchrMod.Store[S] {
  var initialize: js.UndefOr[js.Function0[scala.Unit]] = js.native
  def addChangeListener(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  def getContext(): dispatchrLib.dispatchrMod.DispatcherContext = js.native
  def removeChangeListener(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("shouldDehydrate")
  def shouldDehydrate_MBaseStore(): scala.Boolean = js.native
}

