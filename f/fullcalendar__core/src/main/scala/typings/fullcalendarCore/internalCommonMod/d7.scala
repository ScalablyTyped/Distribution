package typings.fullcalendarCore.internalCommonMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@fullcalendar/core/internal-common", "d7")
@js.native
open class d7 protected ()
  extends StObject
     with ElementDragging {
  def this(el: HTMLElement) = this()
  def this(el: HTMLElement, selector: String) = this()
  
  /* CompleteClass */
  override def destroy(): Unit = js.native
  
  /* CompleteClass */
  var emitter: Emitter[Any] = js.native
  
  /* CompleteClass */
  override def setAutoScrollEnabled(bool: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def setIgnoreMove(bool: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def setMirrorIsVisible(bool: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def setMirrorNeedsRevert(bool: Boolean): Unit = js.native
}
