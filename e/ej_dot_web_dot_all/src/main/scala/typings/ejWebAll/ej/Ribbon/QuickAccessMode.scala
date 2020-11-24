package typings.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
