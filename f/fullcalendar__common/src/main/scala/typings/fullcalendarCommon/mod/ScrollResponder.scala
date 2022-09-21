package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/common", "ScrollResponder")
@js.native
open class ScrollResponder protected () extends StObject {
  def this(
    execFunc: ScrollRequestHandler,
    emitter: Emitter[CalendarListeners],
    scrollTime: Duration,
    scrollTimeReset: Boolean
  ) = this()
  
  def detach(): Unit = js.native
  
  /* private */ var drain: Any = js.native
  
  /* private */ var emitter: Any = js.native
  
  /* private */ var execFunc: Any = js.native
  
  /* private */ var fireInitialScroll: Any = js.native
  
  /* private */ var handleScrollRequest: Any = js.native
  
  var queuedRequest: ScrollRequest = js.native
  
  /* private */ var scrollTime: Any = js.native
  
  /* private */ var scrollTimeReset: Any = js.native
  
  def update(isDatesNew: Boolean): Unit = js.native
}
