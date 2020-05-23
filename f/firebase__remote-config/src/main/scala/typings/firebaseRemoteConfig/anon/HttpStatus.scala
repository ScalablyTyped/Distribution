package typings.firebaseRemoteConfig.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpStatus extends js.Object {
  var httpStatus: Double
}

object HttpStatus {
  @scala.inline
  def apply(httpStatus: Double): HttpStatus = {
    val __obj = js.Dynamic.literal(httpStatus = httpStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpStatus]
  }
}

