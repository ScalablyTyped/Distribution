package typings.framebus.framebusMod

import typings.framebus.typesMod.FramebusOnHandler
import typings.framebus.typesMod.FramebusReplyHandler
import typings.framebus.typesMod.FramebusSubscriberArg
import typings.framebus.typesMod.global.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("framebus/dist/framebus", "Framebus")
@js.native
class Framebus () extends js.Object {
  def this(options: FramebusOptions) = this()
  
  var channel: String = js.native
  
  var checkOrigin: js.Any = js.native
  
  def emit(eventName: String): Boolean = js.native
  def emit(eventName: String, data: js.UndefOr[scala.Nothing], reply: FramebusReplyHandler): Boolean = js.native
  def emit(eventName: String, data: FramebusReplyHandler): Boolean = js.native
  def emit(eventName: String, data: FramebusReplyHandler, reply: FramebusReplyHandler): Boolean = js.native
  def emit(eventName: String, data: FramebusSubscriberArg): Boolean = js.native
  def emit(eventName: String, data: FramebusSubscriberArg, reply: FramebusReplyHandler): Boolean = js.native
  
  def include(childWindow: Window): Boolean = js.native
  
  var isDestroyed: js.Any = js.native
  
  var listeners: js.Any = js.native
  
  var namespaceEvent: js.Any = js.native
  
  def off(eventName: String, originalHandler: FramebusOnHandler): Boolean = js.native
  
  def on(eventName: String, originalHandler: FramebusOnHandler): Boolean = js.native
  
  var origin: String = js.native
  
  def target(): Framebus = js.native
  def target(options: FramebusOptions): Framebus = js.native
  
  def teardown(): Unit = js.native
  
  var verifyDomain: js.Any = js.native
}
/* static members */
@JSImport("framebus/dist/framebus", "Framebus")
@js.native
object Framebus extends js.Object {
  
  def target(): Framebus = js.native
  def target(options: FramebusOptions): Framebus = js.native
}
