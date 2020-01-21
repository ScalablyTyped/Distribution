package typings.googleAuthLibrary

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonXgoogiamauthorityselector extends js.Object {
  var `x-goog-iam-authority-selector`: String
  var `x-goog-iam-authorization-token`: String
}

object AnonXgoogiamauthorityselector {
  @scala.inline
  def apply(`x-goog-iam-authority-selector`: String, `x-goog-iam-authorization-token`: String): AnonXgoogiamauthorityselector = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x-goog-iam-authority-selector")(`x-goog-iam-authority-selector`.asInstanceOf[js.Any])
    __obj.updateDynamic("x-goog-iam-authorization-token")(`x-goog-iam-authorization-token`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonXgoogiamauthorityselector]
  }
}

