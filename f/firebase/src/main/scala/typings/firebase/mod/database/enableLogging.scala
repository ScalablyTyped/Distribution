package typings.firebase.mod.database

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("firebase", "database.enableLogging")
@js.native
object enableLogging extends js.Object {
  /**
    * Logs debugging information to the console.
    *
    * @example
    * ```javascript
    * // Enable logging
    * firebase.database.enableLogging(true);
    * ```
    *
    * @example
    * ```javascript
    * // Disable logging
    * firebase.database.enableLogging(false);
    * ```
    *
    * @example
    * ```javascript
    * // Enable logging across page refreshes
    * firebase.database.enableLogging(true, true);
    * ```
    *
    * @example
    * ```javascript
    * // Provide custom logger which prefixes log statements with "[FIREBASE]"
    * firebase.database.enableLogging(function(message) {
    *   console.log("[FIREBASE]", message);
    * });
    * ```
    *
    * @param logger Enables logging if `true`;
    *   disables logging if `false`. You can also provide a custom logger function
    *   to control how things get logged.
    * @param persistent Remembers the logging state between page
    *   refreshes if `true`.
    */
  def apply(): js.Any = js.native
  def apply(logger: js.Function1[/* a */ String, _]): js.Any = js.native
  def apply(logger: js.Function1[/* a */ String, _], persistent: Boolean): js.Any = js.native
  def apply(logger: Boolean): js.Any = js.native
  def apply(logger: Boolean, persistent: Boolean): js.Any = js.native
}

