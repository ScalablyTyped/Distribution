package typings.firebaseInstallations.errorsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerErrorData extends js.Object {
  var serverCode: Double
  var serverMessage: String
  var serverStatus: String
}

object ServerErrorData {
  @scala.inline
  def apply(serverCode: Double, serverMessage: String, serverStatus: String): ServerErrorData = {
    val __obj = js.Dynamic.literal(serverCode = serverCode.asInstanceOf[js.Any], serverMessage = serverMessage.asInstanceOf[js.Any], serverStatus = serverStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerErrorData]
  }
}

