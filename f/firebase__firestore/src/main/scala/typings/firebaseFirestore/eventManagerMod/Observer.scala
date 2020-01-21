package typings.firebaseFirestore.eventManagerMod

import typings.firebaseFirestore.miscMod.EventHandler
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observer[T] extends js.Object {
  @JSName("error")
  var error_Original: EventHandler[Error] = js.native
  @JSName("next")
  var next_Original: EventHandler[T] = js.native
  def error(value: Error): Unit = js.native
  def next(value: T): Unit = js.native
}

