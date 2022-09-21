package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<NowTimerProps, NowTimerState> * / any
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<NowTimerProps, NowTimerState> * / any */ @JSImport("@fullcalendar/common", "NowTimer")
@js.native
open class NowTimer protected () extends StObject {
  def this(props: NowTimerProps, context: ViewContext) = this()
  
  /* private */ var clearTimeout: Any = js.native
  
  def componentDidMount(): Unit = js.native
  
  def componentDidUpdate(prevProps: NowTimerProps): Unit = js.native
  
  def componentWillUnmount(): Unit = js.native
  
  /* private */ var computeTiming: Any = js.native
  
  var context: ViewContext = js.native
  
  var initialNowDate: js.Date = js.native
  
  var initialNowQueriedMs: Double = js.native
  
  def render(): Any = js.native
  
  /* private */ var setTimeout: Any = js.native
  
  var timeoutId: Any = js.native
}
object NowTimer {
  
  @JSImport("@fullcalendar/common", "NowTimer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("@fullcalendar/common", "NowTimer.contextType")
  @js.native
  def contextType: Any = js.native
  inline def contextType_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
}
