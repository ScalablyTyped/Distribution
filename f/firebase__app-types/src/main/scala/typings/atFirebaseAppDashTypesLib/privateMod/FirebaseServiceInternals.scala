package typings
package atFirebaseAppDashTypesLib.privateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseServiceInternals extends js.Object {
  /**
    * Delete the service and free it's resources - called from
    * app.delete().
    */
  def delete(): js.Promise[scala.Unit]
}

object FirebaseServiceInternals {
  @scala.inline
  def apply(delete: () => js.Promise[scala.Unit]): FirebaseServiceInternals = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete))
  
    __obj.asInstanceOf[FirebaseServiceInternals]
  }
}

