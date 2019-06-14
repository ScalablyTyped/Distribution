package typings
package ejDotWebDotAllLib.ejNs.RibbonNs

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
  sealed trait Menu
    extends ejDotWebDotAllLib.ejNs.RibbonNs.QuickAccessMode
  
  ///Controls are hidden in Quick Access toolbar
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.RibbonNs.QuickAccessMode
  
  ///Add controls in toolBar
  @js.native
  sealed trait ToolBar
    extends ejDotWebDotAllLib.ejNs.RibbonNs.QuickAccessMode
  
  /* 2 */ val Menu: Menu with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val ToolBar: ToolBar with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.RibbonNs.QuickAccessMode with scala.Double] = js.native
}

