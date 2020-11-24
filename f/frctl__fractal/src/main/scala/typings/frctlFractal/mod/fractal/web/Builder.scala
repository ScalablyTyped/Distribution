package typings.frctlFractal.mod.fractal.web

import typings.frctlFractal.anon.ErrorCount
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@frctl/fractal", "fractal.web.Builder")
@js.native
class Builder () extends EventEmitter {
  
  /**
    * @deprecated Use start() instead.
    */
  def build(): js.Promise[ErrorCount] = js.native
  
  def start(): js.Promise[ErrorCount] = js.native
  
  def stop(): Unit = js.native
  
  def use(): Unit = js.native
}
