package typings.find.findMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindEachStream extends js.Object {
  /**
    * Detect end in find.eachfile and find.eachdir.
    * @param callback The callback called at the end of find.eachfile and find.eachdir
    */
  def end(callback: js.Function0[Unit]): FindEachStream = js.native
  /**
    * Handling errors in asynchronous interfaces.
    * @param callback The callback that is called upon an error
    */
  def error(callback: js.Function0[Unit]): FindEachStream = js.native
  def error(callback: js.Function1[/* err */ Error, Unit]): FindEachStream = js.native
}

