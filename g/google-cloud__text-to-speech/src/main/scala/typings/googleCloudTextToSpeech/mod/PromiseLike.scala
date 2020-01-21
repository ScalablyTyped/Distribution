package typings.googleCloudTextToSpeech.mod

import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseLike[T] extends Promise[T] {
  /**
    * Cancel the ongoing promise
    */
  def cancel(): Unit = js.native
}

