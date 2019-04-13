package typings
package fluxxorLib.fluxxorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluxxor", "Flux")
@js.native
class Flux protected ()
  extends eventemitter3Lib.eventemitter3Mod.EventEmitter[java.lang.String | js.Symbol] {
  def this(stores: js.Any, actions: js.Any) = this()
  var actions: js.Any = js.native
  var stores: js.Any = js.native
  def addAction(args: (java.lang.String | js.Function)*): scala.Unit = js.native
  def addAction(names: js.Array[java.lang.String], action: js.Function): scala.Unit = js.native
  def addActions(actions: js.Any): scala.Unit = js.native
  def addStore(name: java.lang.String, store: Store): scala.Unit = js.native
  def addStores(stores: js.Any): scala.Unit = js.native
  def store(name: java.lang.String): js.Any = js.native
}

