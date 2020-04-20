package typings.firebaseMessaging

import typings.std.ArrayBuffer
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushMessageData extends js.Object {
  def arrayBuffer(): ArrayBuffer
  def blob(): Blob
  def json(): js.Any
  def text(): String
}

object PushMessageData {
  @scala.inline
  def apply(arrayBuffer: () => ArrayBuffer, blob: () => Blob, json: () => js.Any, text: () => String): PushMessageData = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), json = js.Any.fromFunction0(json), text = js.Any.fromFunction0(text))
    __obj.asInstanceOf[PushMessageData]
  }
}

