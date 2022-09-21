package typings.devextreme.mod.default.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devextreme", "default.ui.themes")
@js.native
open class themes ()
  extends StObject
     with typings.devextreme.mod.DevExpress.ui.themes
/* static members */
object themes {
  
  @JSImport("devextreme", "default.ui.themes")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets the current theme&apos;s name.
    */
  inline def current(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("current")().asInstanceOf[String]
  /**
    * Sets a theme with a specific name.
    */
  inline def current(themeName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("current")(themeName.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Specifies a function to be executed after a theme is loaded.
    */
  inline def initialized(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initialized")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def isMaterial(theme: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMaterial")(theme.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Specifies a function to be executed each time a theme is switched.
    */
  inline def ready(callback: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
