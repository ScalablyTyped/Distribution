package typings.firebase.firebaseMod

import typings.firebase.firebaseMod.app.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("firebase", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * The current SDK version.
    */
  var SDK_VERSION: String = js.native
  /**
    * A (read-only) array of all initialized apps.
    */
  var apps: js.Array[App] = js.native
}

