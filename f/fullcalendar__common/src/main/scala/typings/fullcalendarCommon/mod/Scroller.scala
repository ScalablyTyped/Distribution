package typings.fullcalendarCommon.mod

import typings.std.HTMLElement
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/common", "Scroller")
@js.native
open class Scroller ()
  extends StObject
     with BaseComponent[ScrollerProps, Dictionary]
     with ScrollerLike {
  
  /* CompleteClass */
  var context: ViewContext = js.native
  
  /* CompleteClass */
  var debug: Boolean = js.native
  
  /* private */ var el: Any = js.native
  
  def getXScrollbarWidth(): Double = js.native
  
  def getYScrollbarWidth(): Double = js.native
  
  def handleEl(el: HTMLElement): Unit = js.native
  
  /* CompleteClass */
  override def needsXScrolling(): Boolean = js.native
  
  /* CompleteClass */
  override def needsYScrolling(): Boolean = js.native
  
  /* CompleteClass */
  var propEquality: EqualityFuncs[ScrollerProps] = js.native
  
  def render(): Any = js.native
  
  /* CompleteClass */
  override def safeSetState(newState: Partial[Dictionary]): Unit = js.native
  
  /* CompleteClass */
  override def shouldComponentUpdate(nextProps: ScrollerProps, nextState: Dictionary): Boolean = js.native
  
  /* CompleteClass */
  var stateEquality: EqualityFuncs[Dictionary] = js.native
}
