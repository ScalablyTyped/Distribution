package typings
package firebaseLib.firebaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("firebase", "database")
@js.native
object databaseNs extends js.Object {
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
  def enableLogging(): js.Any = js.native
  def enableLogging(logger: js.Function1[/* a */ java.lang.String, _]): js.Any = js.native
  def enableLogging(logger: js.Function1[/* a */ java.lang.String, _], persistent: scala.Boolean): js.Any = js.native
  def enableLogging(logger: scala.Boolean): js.Any = js.native
  def enableLogging(logger: scala.Boolean, persistent: scala.Boolean): js.Any = js.native
  @JSName("ServerValue")
  @js.native
  object ServerValueNs extends js.Object {
    /**
      * A placeholder value for auto-populating the current timestamp (time
      * since the Unix epoch, in milliseconds) as determined by the Firebase
      * servers.
      *
      * @example
      * ```javascript
      * var sessionsRef = firebase.database().ref("sessions");
      * sessionsRef.push({
      *   startedAt: firebase.database.ServerValue.TIMESTAMP
      * });
      * ```
      */
    var TIMESTAMP: js.Object = js.native
  }
  
}

