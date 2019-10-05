package typings.firebase.firebaseMod.database

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("firebase", "database.ServerValue")
@js.native
object ServerValue extends js.Object {
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

