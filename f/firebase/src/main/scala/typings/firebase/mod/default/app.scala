package typings.firebase.mod.default

import typings.firebase.mod.firebase.app.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object app {
  
  /**
    * Retrieves a Firebase {@link firebase.app.App app} instance.
    *
    * When called with no arguments, the default app is returned. When an app name
    * is provided, the app corresponding to that name is returned.
    *
    * An exception is thrown if the app being retrieved has not yet been
    * initialized.
    *
    * @example
    * ```javascript
    * // Return the default app
    * var app = firebase.app();
    * ```
    *
    * @example
    * ```javascript
    * // Return a named app
    * var otherApp = firebase.app("otherApp");
    * ```
    *
    * @param name Optional name of the app to return. If no name is
    *   provided, the default is `"[DEFAULT]"`.
    *
    * @return The app corresponding to the provided app name.
    *   If no app name is provided, the default app is returned.
    */
  @JSImport("firebase", "default.app")
  @js.native
  def apply(): App = js.native
  @JSImport("firebase", "default.app")
  @js.native
  def apply(name: String): App = js.native
}
