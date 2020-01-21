package typings.firebaseRemoteConfig.errorsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/remote-config/dist/src/errors", "hasErrorCode")
@js.native
object hasErrorCode extends js.Object {
  def apply(e: Error, errorCode: ErrorCode): Boolean = js.native
}

