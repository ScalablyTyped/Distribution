package typings.durandal.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Callback extends js.Object {
  var routePattern: RegExp
  def callback(fragment: String): Unit
}

object Callback {
  @scala.inline
  def apply(callback: String => Unit, routePattern: RegExp): Callback = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), routePattern = routePattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Callback]
  }
}

