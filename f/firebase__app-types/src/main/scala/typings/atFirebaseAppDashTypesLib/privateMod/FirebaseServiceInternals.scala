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

