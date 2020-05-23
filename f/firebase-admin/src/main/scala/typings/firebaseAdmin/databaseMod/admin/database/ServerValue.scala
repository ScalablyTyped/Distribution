package typings.firebaseAdmin.databaseMod.admin.database

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("firebase-admin/lib/database", "admin.database.ServerValue")
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
  val TIMESTAMP: js.Object = js.native
  /**
    * Returns a placeholder value that can be used to atomically increment the
    * current database value by the provided delta.
    *
    * @param delta the amount to modify the current value atomically.
    * @return a placeholder value for modifying data atomically server-side.
    */
  def increment(delta: Double): js.Object = js.native
}

