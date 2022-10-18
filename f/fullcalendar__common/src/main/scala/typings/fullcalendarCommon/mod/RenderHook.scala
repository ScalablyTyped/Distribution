package typings.fullcalendarCommon.mod

import typings.std.HTMLElement
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/common", "RenderHook")
@js.native
open class RenderHook[HookProps] ()
  extends StObject
     with BaseComponent[RenderHookProps[HookProps], Dictionary] {
  
  /* CompleteClass */
  var context: ViewContext = js.native
  
  /* CompleteClass */
  var debug: Boolean = js.native
  
  def handleRootEl(): Unit = js.native
  def handleRootEl(el: HTMLElement): Unit = js.native
  
  /* CompleteClass */
  var propEquality: EqualityFuncs[RenderHookProps[HookProps]] = js.native
  
  def render(): Any = js.native
  
  /* private */ var rootElRef: Any = js.native
  
  /* CompleteClass */
  override def safeSetState(newState: Partial[Dictionary]): Unit = js.native
  
  /* CompleteClass */
  override def shouldComponentUpdate(nextProps: RenderHookProps[HookProps], nextState: Dictionary): Boolean = js.native
  
  /* CompleteClass */
  var stateEquality: EqualityFuncs[Dictionary] = js.native
}
