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
  
  val Menu: Menu with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val ToolBar: ToolBar with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.RibbonNs.QuickAccessMode with java.lang.String] = js.native
}

