package typings.fullcalendarCommon.mod

import typings.std.HTMLElement
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/common", "MountHook")
@js.native
open class MountHook[ContentArg] ()
  extends StObject
     with BaseComponent[MountHookProps[ContentArg], Dictionary] {
  
  def componentDidMount(): Unit = js.native
  
  def componentWillUnmount(): Unit = js.native
  
  /* CompleteClass */
  var context: ViewContext = js.native
  
  /* CompleteClass */
  var debug: Boolean = js.native
  
  /* private */ var handleRootEl: Any = js.native
  
  /* CompleteClass */
  var propEquality: EqualityFuncs[MountHookProps[ContentArg]] = js.native
  
  def render(): Any = js.native
  
  var rootEl: HTMLElement = js.native
  
  /* CompleteClass */
  override def safeSetState(newState: Partial[Dictionary]): Unit = js.native
  
  /* CompleteClass */
  override def shouldComponentUpdate(nextProps: MountHookProps[ContentArg], nextState: Dictionary): Boolean = js.native
  
  /* CompleteClass */
  var stateEquality: EqualityFuncs[Dictionary] = js.native
}
