package typings.ejWebAll.ej.Ribbon

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait QuickAccessMode extends js.Object

@JSGlobal("ej.Ribbon.QuickAccessMode")
@js.native
object QuickAccessMode extends js.Object {
  ///Add controls in menu
  @js.native
  sealed trait Menu extends QuickAccessMode
  
  ///Controls are hidden in Quick Access toolbar
  @js.native
  sealed trait None extends QuickAccessMode
  
  ///Add controls in toolBar
  @js.native
  sealed trait ToolBar extends QuickAccessMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QuickAccessMode with Double] = js.native
  /* 2 */ @js.native
  object Menu extends TopLevel[Menu with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 1 */ @js.native
  object ToolBar extends TopLevel[ToolBar with Double]
  
}

