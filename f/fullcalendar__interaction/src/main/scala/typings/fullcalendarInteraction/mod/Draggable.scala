package typings.fullcalendarInteraction.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/interaction", "Draggable")
@js.native
open class Draggable protected ()
  extends StObject
     with ExternalDraggable {
  def this(el: HTMLElement) = this()
  def this(el: HTMLElement, settings: ExternalDraggableSettings) = this()
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /* CompleteClass */
  var dragging: FeaturefulElementDragging = js.native
  
  /* CompleteClass */
  override def handleDragStart(
    ev: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any
  ): Unit = js.native
  
  /* CompleteClass */
  override def handlePointerDown(
    ev: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PointerDragEvent */ Any
  ): Unit = js.native
  
  /* CompleteClass */
  var settings: ExternalDraggableSettings = js.native
}
