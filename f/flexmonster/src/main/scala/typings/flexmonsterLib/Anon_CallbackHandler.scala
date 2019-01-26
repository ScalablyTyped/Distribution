package typings
package flexmonsterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackHandler extends js.Object {
  def getData(options: Anon_PrepareDataFunction, callbackHandler: java.lang.String): scala.Unit = js.native
  def getData(
    options: Anon_PrepareDataFunction,
    callbackHandler: java.lang.String,
    updateHandler: java.lang.String
  ): scala.Unit = js.native
  def getData(
    options: Anon_PrepareDataFunction,
    callbackHandler: java.lang.String,
    updateHandler: js.Function1[/* rawData */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def getData(options: Anon_PrepareDataFunction, callbackHandler: js.Function1[/* rawData */ js.Any, scala.Unit]): scala.Unit = js.native
  def getData(
    options: Anon_PrepareDataFunction,
    callbackHandler: js.Function1[/* rawData */ js.Any, scala.Unit],
    updateHandler: java.lang.String
  ): scala.Unit = js.native
  def getData(
    options: Anon_PrepareDataFunction,
    callbackHandler: js.Function1[/* rawData */ js.Any, scala.Unit],
    updateHandler: js.Function1[/* rawData */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def getNumberFormat(format: js.Object): js.Object = js.native
}

