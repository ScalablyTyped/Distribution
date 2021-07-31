package typings.elasticlunr.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("elasticlunr", "EventEmitter")
@js.native
class EventEmitter () extends StObject {
  
  def addListener(e1: EventType, e2: EventType, e3: EventType, fn: EventHandler): Unit = js.native
  def addListener(e1: EventType, e2: EventType, fn: EventHandler): Unit = js.native
  def addListener(e1: EventType, fn: EventHandler): Unit = js.native
  
  def emit(name: EventType, args: js.Any*): Unit = js.native
  
  def hasHandler(name: EventType): Boolean = js.native
  
  def removeListener(name: EventType, fn: EventHandler): Unit = js.native
}
