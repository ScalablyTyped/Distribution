package typings.durandal

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallback extends js.Object {
  var routePattern: RegExp
  def callback(fragment: String): Unit
}

object AnonCallback {
  @scala.inline
  def apply(callback: String => Unit, routePattern: RegExp): AnonCallback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), routePattern = routePattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCallback]
  }
}

