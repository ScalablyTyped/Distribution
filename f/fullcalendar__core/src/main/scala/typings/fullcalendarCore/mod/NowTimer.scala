package typings.fullcalendarCore.mod

import typings.fullcalendarCommon.mod.NowTimerProps
import typings.fullcalendarCommon.mod.ViewContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<NowTimerProps, NowTimerState> * / any
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<NowTimerProps, NowTimerState> * / any */ @JSImport("@fullcalendar/core", "NowTimer")
@js.native
open class NowTimer protected ()
  extends typings.fullcalendarCommon.mod.NowTimer {
  def this(props: NowTimerProps, context: ViewContext) = this()
}
object NowTimer {
  
  @JSImport("@fullcalendar/core", "NowTimer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("@fullcalendar/core", "NowTimer.contextType")
  @js.native
  def contextType: Any = js.native
  inline def contextType_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
}
