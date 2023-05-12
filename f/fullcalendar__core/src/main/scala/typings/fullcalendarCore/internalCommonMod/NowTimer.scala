package typings.fullcalendarCore.internalCommonMod

import typings.fullcalendarCore.preactMod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NowTimer extends Component[NowTimerProps, NowTimerState] {
  
  /* private */ var clearTimeout: Any = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MNowTimer(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MNowTimer(prevProps: NowTimerProps): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MNowTimer(): Unit = js.native
  
  /* private */ var computeTiming: Any = js.native
  
  @JSName("context")
  var context_NowTimer: ViewContext = js.native
  
  var initialNowDate: js.Date = js.native
  
  var initialNowQueriedMs: Double = js.native
  
  /* private */ var setTimeout: Any = js.native
  
  var timeoutId: Any = js.native
}
