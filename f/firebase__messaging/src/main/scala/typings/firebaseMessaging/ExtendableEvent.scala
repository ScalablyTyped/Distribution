package typings.firebaseMessaging

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendableEvent extends Event_ {
  def waitUntil(f: js.Promise[_]): Unit = js.native
}

