package typings
package atGoogleDashCloudTasksLib.atGoogleDashCloudTasksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseLike[T]
  extends stdLib.Promise[T] {
  /**
    * Cancel the ongoing promise
    */
  def cancel(): scala.Unit = js.native
}

