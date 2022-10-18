package typings.fullcalendarCommon.mod

import typings.fullcalendarCommon.anon.IsPopoverOpen
import typings.std.MouseEvent
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/common", "MoreLinkRoot")
@js.native
open class MoreLinkRoot ()
  extends StObject
     with BaseComponent[MoreLinkRootProps, MoreLinkRootState] {
  
  def componentDidMount(): Unit = js.native
  
  def componentDidUpdate(): Unit = js.native
  
  /* CompleteClass */
  var context: ViewContext = js.native
  
  /* CompleteClass */
  var debug: Boolean = js.native
  
  def handleClick(ev: MouseEvent): Unit = js.native
  
  def handlePopoverClose(): Unit = js.native
  
  /* private */ var linkElRef: Any = js.native
  
  /* private */ var parentEl: Any = js.native
  
  /* CompleteClass */
  var propEquality: EqualityFuncs[MoreLinkRootProps] = js.native
  
  def render(): Any = js.native
  
  /* CompleteClass */
  override def safeSetState(newState: Partial[MoreLinkRootState]): Unit = js.native
  
  /* CompleteClass */
  override def shouldComponentUpdate(nextProps: MoreLinkRootProps, nextState: MoreLinkRootState): Boolean = js.native
  
  var state: IsPopoverOpen = js.native
  
  /* CompleteClass */
  var stateEquality: EqualityFuncs[MoreLinkRootState] = js.native
  
  def updateParentEl(): Unit = js.native
}
