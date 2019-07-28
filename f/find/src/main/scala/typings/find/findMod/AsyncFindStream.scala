package typings.find.findMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncFindStream extends js.Object {
  /**
    * Handling errors in asynchronous interfaces.
    * @param callback The callback that is called upon an error
    */
  def error(callback: js.Function0[Unit]): Unit = js.native
  def error(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

