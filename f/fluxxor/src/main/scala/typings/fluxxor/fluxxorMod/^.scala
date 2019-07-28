package typings.fluxxor.fluxxorMod

import typings.fluxxor.TypeofReact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluxxor", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var version: String = js.native
  def FluxChildMixin(react: TypeofReact): typings.fluxxor.fluxxorMod.FluxChildMixin = js.native
  def FluxMixin(react: TypeofReact): typings.fluxxor.fluxxorMod.FluxMixin = js.native
  def StoreWatchMixin[StoreState](storeNames: String*): typings.fluxxor.fluxxorMod.StoreWatchMixin[StoreState] = js.native
  def createStore(spec: StoreSpec): StoreClass = js.native
}

