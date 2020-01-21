package typings.googleCloudFirestore.FirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FirebaseFirestore.setLogFunction")
@js.native
object setLogFunction extends js.Object {
  def apply(): Unit = js.native
  /**
    * Sets or disables the log function for all active Firestore instances.
    * 
    * @param logger A log function that takes a message (such as `console.log`) or
    * `null` to turn off logging.
    */
  def apply(logger: js.Function1[/* msg */ String, Unit]): Unit = js.native
}

