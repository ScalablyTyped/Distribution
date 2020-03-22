package typings.devextreme.mod.default.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("devextreme", "ui.themes")
@js.native
class themes ()
  extends typings.devextreme.mod.DevExpress.ui.themes

/* static members */
@JSImport("devextreme", "ui.themes")
@js.native
object themes extends js.Object {
  /** Gets the current theme's name. */
  def current(): String = js.native
  /** Sets a theme with a specific name. */
  def current(themeName: String): Unit = js.native
  /** Specifies a function to be executed after the theme is loaded. */
  def ready(callback: js.Function): Unit = js.native
}

