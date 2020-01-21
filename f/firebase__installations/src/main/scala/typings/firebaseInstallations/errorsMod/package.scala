package typings.firebaseInstallations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object errorsMod {
  type ServerError = typings.firebaseUtil.mod.FirebaseError with typings.firebaseInstallations.errorsMod.ServerErrorData
}
