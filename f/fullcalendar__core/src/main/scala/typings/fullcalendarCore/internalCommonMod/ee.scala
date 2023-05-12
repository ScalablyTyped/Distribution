package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/core/internal-common", "ee")
@js.native
open class ee protected ()
  extends StObject
     with ScrollResponder {
  def this(
    execFunc: ScrollRequestHandler,
    emitter: Emitter[CalendarListeners],
    scrollTime: Duration,
    scrollTimeReset: Boolean
  ) = this()
  
  /* CompleteClass */
  override def detach(): Unit = js.native
  
  /* private */ /* CompleteClass */
  var drain: Any = js.native
  
  /* private */ /* CompleteClass */
  var emitter: Any = js.native
  
  /* private */ /* CompleteClass */
  var execFunc: Any = js.native
  
  /* private */ /* CompleteClass */
  var fireInitialScroll: Any = js.native
  
  /* private */ /* CompleteClass */
  var handleScrollRequest: Any = js.native
  
  /* CompleteClass */
  var queuedRequest: ScrollRequest = js.native
  
  /* private */ /* CompleteClass */
  var scrollTime: Any = js.native
  
  /* private */ /* CompleteClass */
  var scrollTimeReset: Any = js.native
  
  /* CompleteClass */
  override def update(isDatesNew: Boolean): Unit = js.native
}
