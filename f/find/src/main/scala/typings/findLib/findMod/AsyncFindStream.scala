package typings
package findLib.findMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncFindStream extends js.Object {
  /**
       * Handling errors in asynchronous interfaces.
       * @param callback The callback that is called upon an error
       */
  def error(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
       * Handling errors in asynchronous interfaces.
       * @param callback The callback that is called upon an error
       */
  def error(callback: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
}

