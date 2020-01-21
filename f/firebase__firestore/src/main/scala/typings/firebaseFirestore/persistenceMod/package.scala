package typings.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object persistenceMod {
  type PrimaryStateListener = js.Function1[/* isPrimary */ scala.Boolean, js.Promise[scala.Unit]]
}
