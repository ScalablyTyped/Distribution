package typings.emittery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	The data provided as `eventData` when listening for `Emittery.listenerAdded` or `Emittery.listenerRemoved`.
	*/
@js.native
trait ListenerChangedData extends js.Object {
  
  /**
  		The name of the event that was added or removed if `.on()` or `.off()` was used, or `undefined` if `.onAny()` or `.offAny()` was used.
  		*/
  var eventName: js.UndefOr[EventName] = js.native
  
  /**
  		The listener that was added or removed.
  		*/
  def listener(): Unit = js.native
  def listener(eventData: js.Any): Unit = js.native
}
