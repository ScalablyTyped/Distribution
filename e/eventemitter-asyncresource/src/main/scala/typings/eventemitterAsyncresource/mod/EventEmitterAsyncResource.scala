package typings.eventemitterAsyncresource.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventEmitterAsyncResource extends EventEmitter {
  
  def asyncId(): Double = js.native
  
  def asyncResource: EventEmitterReferencingAsyncResource = js.native
  
  def emitDestroy(): Unit = js.native
  
  def triggerAsyncId(): Double = js.native
}
