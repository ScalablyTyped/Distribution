package typings
package fluxxorLib.fluxxorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluxxor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var version: java.lang.String = js.native
  def FluxChildMixin(react: fluxxorLib.Anon_A): fluxxorLib.fluxxorMod.FluxChildMixin = js.native
  def FluxMixin(react: fluxxorLib.Anon_A): fluxxorLib.fluxxorMod.FluxMixin = js.native
  def StoreWatchMixin[StoreState](storeNames: java.lang.String*): fluxxorLib.fluxxorMod.StoreWatchMixin[StoreState] = js.native
  def createStore(spec: StoreSpec): StoreClass = js.native
}

