package typings.fullcalendarInteraction.mod

import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/interaction", "ThirdPartyDraggable")
@js.native
open class ThirdPartyDraggable () extends StObject {
  def this(containerOrSettings: ThirdPartyDraggableSettings) = this()
  def this(containerOrSettings: EventTarget) = this()
  def this(containerOrSettings: Unit, settings: ThirdPartyDraggableSettings) = this()
  def this(containerOrSettings: ThirdPartyDraggableSettings, settings: ThirdPartyDraggableSettings) = this()
  def this(containerOrSettings: EventTarget, settings: ThirdPartyDraggableSettings) = this()
  
  def destroy(): Unit = js.native
  
  var dragging: InferredElementDragging = js.native
}
