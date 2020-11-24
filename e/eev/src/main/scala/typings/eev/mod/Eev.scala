package typings.eev.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Eev extends js.Object {
  
  def emit(name: String): Unit = js.native
  def emit(name: String, data: js.Any): Unit = js.native
  
  def off(names: String, fn: CallbackFunction): Unit = js.native
  
  def on(names: String, fn: CallbackFunction): Unit = js.native
}
