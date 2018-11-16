package typings
package findLib.findMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindEachStream extends js.Object {
  /**
       * Detect end in find.eachfile and find.eachdir.
       * @param callback The callback called at the end of find.eachfile and find.eachdir
       */
  def end(callback: js.Function0[scala.Unit]): FindEachStream = js.native
  /**
       * Handling errors in asynchronous interfaces.
       * @param callback The callback that is called upon an error
       */
  def error(callback: js.Function0[scala.Unit]): FindEachStream = js.native
  /**
       * Handling errors in asynchronous interfaces.
       * @param callback The callback that is called upon an error
       */
  def error(callback: js.Function1[/* err */ stdLib.Error, scala.Unit]): FindEachStream = js.native
}

