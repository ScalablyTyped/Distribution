package typings.fullcalendarCommon.mod

import typings.fullcalendarCommon.anon.ViewLabelId
import typings.std.Partial
import typings.std.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/common", "CalendarContent")
@js.native
open class CalendarContent ()
  extends StObject
     with PureComponent[CalendarContentProps, Dictionary] {
  
  def buildAppendContent(): Any = js.native
  
  /* private */ var buildToolbarProps: Any = js.native
  
  /* private */ var buildViewContext: Any = js.native
  
  /* private */ var buildViewPropTransformers: Any = js.native
  
  /* private */ var calendarInteractions: Any = js.native
  
  def componentDidMount(): Unit = js.native
  
  def componentDidUpdate(prevProps: CalendarContentProps): Unit = js.native
  
  def componentWillUnmount(): Unit = js.native
  
  /* CompleteClass */
  var context: ViewContext = js.native
  
  /* CompleteClass */
  var debug: Boolean = js.native
  
  /* private */ var footerRef: Any = js.native
  
  def handleWindowResize(ev: UIEvent): Unit = js.native
  
  /* private */ var headerRef: Any = js.native
  
  /* private */ var interactionsStore: Any = js.native
  
  /* CompleteClass */
  var propEquality: EqualityFuncs[CalendarContentProps] = js.native
  
  def registerInteractiveComponent(component: DateComponent[Any, Dictionary], settingsInput: InteractionSettingsInput): Unit = js.native
  
  def render(): Any = js.native
  
  def renderView(props: CalendarContentProps): Any = js.native
  
  var resizeRunner: DelayedRunner = js.native
  
  /* CompleteClass */
  override def safeSetState(newState: Partial[Dictionary]): Unit = js.native
  
  /* CompleteClass */
  override def shouldComponentUpdate(nextProps: CalendarContentProps, nextState: Dictionary): Boolean = js.native
  
  var state: ViewLabelId = js.native
  
  /* CompleteClass */
  var stateEquality: EqualityFuncs[Dictionary] = js.native
  
  def unregisterInteractiveComponent(component: DateComponent[Any, Dictionary]): Unit = js.native
}
