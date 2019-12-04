package typings.atFirebaseMessaging

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendableEvent extends Event {
  def waitUntil(f: js.Promise[_]): Unit = js.native
}

