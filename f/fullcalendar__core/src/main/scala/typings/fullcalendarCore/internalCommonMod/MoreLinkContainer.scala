package typings.fullcalendarCore.internalCommonMod

import typings.fullcalendarCore.anon.IsPopoverOpen
import typings.std.HTMLElement
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoreLinkContainer extends BaseComponent[MoreLinkContainerProps, MoreLinkContainerState] {
  
  @JSName("componentDidMount")
  def componentDidMount_MMoreLinkContainer(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MMoreLinkContainer(): Unit = js.native
  
  def handleClick(ev: MouseEvent): Unit = js.native
  
  def handleLinkEl(): Unit = js.native
  def handleLinkEl(linkEl: HTMLElement): Unit = js.native
  
  def handlePopoverClose(): Unit = js.native
  
  /* private */ var linkEl: Any = js.native
  
  /* private */ var parentEl: Any = js.native
  
  @JSName("state")
  var state_MoreLinkContainer: IsPopoverOpen = js.native
  
  def updateParentEl(): Unit = js.native
}
