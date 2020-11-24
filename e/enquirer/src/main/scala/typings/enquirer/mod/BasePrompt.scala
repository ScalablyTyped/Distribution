package typings.enquirer.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasePrompt extends EventEmitter {
  
  def render(): Unit = js.native
  
  def run(): js.Promise[_] = js.native
}
