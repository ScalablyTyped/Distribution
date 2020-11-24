package typings.devextreme.mod.default.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devextreme", "ui.themes")
@js.native
class themes ()
  extends typings.devextreme.mod.DevExpress.ui.themes
/* static members */
@JSImport("devextreme", "ui.themes")
@js.native
object themes extends js.Object {
  
  /**
    * [descr:ui.themes.current()]
    */
  def current(): String = js.native
  /**
    * [descr:ui.themes.current(themeName)]
    */
  def current(themeName: String): Unit = js.native
  
  /**
    * [descr:ui.themes.initialized(callback)]
    */
  def initialized(callback: js.Function): Unit = js.native
  
  /**
    * [descr:ui.themes.ready(callback)]
    */
  def ready(callback: js.Function): Unit = js.native
}
