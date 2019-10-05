package typings.ejDotWebDotAll.ej.Ribbon

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
  
  /* 2 */ val Menu: typings.ejDotWebDotAll.ej.Ribbon.QuickAccessMode.Menu with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ej.Ribbon.QuickAccessMode.None with Double = js.native
  /* 1 */ val ToolBar: typings.ejDotWebDotAll.ej.Ribbon.QuickAccessMode.ToolBar with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[QuickAccessMode with Double] = js.native
}

