package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFirebaseapp extends js.Object {
  @JSName("@firebase/app")
  var `@firebaseSlashapp`: String
  @JSName("@firebase/app-types")
  var `@firebaseSlashapp-types`: String
}

object AnonFirebaseapp {
  @scala.inline
  def apply(`@firebaseSlashapp`: String, `@firebaseSlashapp-types`: String): AnonFirebaseapp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@firebase/app")(`@firebaseSlashapp`.asInstanceOf[js.Any])
    __obj.updateDynamic("@firebase/app-types")(`@firebaseSlashapp-types`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFirebaseapp]
  }
}

