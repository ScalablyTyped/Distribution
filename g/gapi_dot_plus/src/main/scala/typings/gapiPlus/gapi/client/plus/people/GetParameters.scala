package typings.gapiPlus.gapi.client.plus.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetParameters extends js.Object {
  var userId: String
}

object GetParameters {
  @scala.inline
  def apply(userId: String): GetParameters = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters]
  }
}

