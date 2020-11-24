package typings.fluxxor.mod

import typings.eventemitter3.mod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Store
  extends EventEmitter[String | js.Symbol, js.Any] {
  
  def bindActions(args: (String | js.Function)*): Unit = js.native
  def bindActions(args: js.Array[String | js.Function]): Unit = js.native
  
  def waitFor(stores: js.Array[String], fn: js.Function): Unit = js.native
}
