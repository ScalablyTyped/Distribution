package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationResponseDetails extends js.Object {
  var url: String
}

object AuthenticationResponseDetails {
  @scala.inline
  def apply(url: String): AuthenticationResponseDetails = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationResponseDetails]
  }
}

