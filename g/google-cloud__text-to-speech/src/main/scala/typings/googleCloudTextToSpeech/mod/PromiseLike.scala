package typings.googleCloudTextToSpeech.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseLike[T]
  extends js.Promise[T] {
  /**
    * Cancel the ongoing promise
    */
  def cancel(): Unit = js.native
}

