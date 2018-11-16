package typings
package fluxxorLib.fluxxorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluxxor", JSImport.Namespace)
@js.native
object fluxxorModMembers extends js.Object {
  var version: java.lang.String = js.native
  def FluxChildMixin(react: js.Any): fluxxorLib.fluxxorMod.FluxxorNs.FluxChildMixin = js.native
  def FluxMixin(react: js.Any): fluxxorLib.fluxxorMod.FluxxorNs.FluxMixin = js.native
  def StoreWatchMixin[StoreState](storeNames: java.lang.String*): fluxxorLib.fluxxorMod.FluxxorNs.StoreWatchMixin[StoreState] = js.native
  def createStore(spec: fluxxorLib.fluxxorMod.FluxxorNs.StoreSpec): fluxxorLib.fluxxorMod.FluxxorNs.StoreClass = js.native
}

