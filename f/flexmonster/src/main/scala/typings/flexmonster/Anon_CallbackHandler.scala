package typings.flexmonster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackHandler extends js.Object {
  def getData(options: Anon_PrepareDataFunction, callbackHandler: String): Unit = js.native
  def getData(options: Anon_PrepareDataFunction, callbackHandler: String, updateHandler: String): Unit = js.native
  def getData(
    options: Anon_PrepareDataFunction,
    callbackHandler: String,
    updateHandler: js.Function1[/* rawData */ js.Any, Unit]
  ): Unit = js.native
  def getData(options: Anon_PrepareDataFunction, callbackHandler: js.Function1[/* rawData */ js.Any, Unit]): Unit = js.native
  def getData(
    options: Anon_PrepareDataFunction,
    callbackHandler: js.Function1[/* rawData */ js.Any, Unit],
    updateHandler: String
  ): Unit = js.native
  def getData(
    options: Anon_PrepareDataFunction,
    callbackHandler: js.Function1[/* rawData */ js.Any, Unit],
    updateHandler: js.Function1[/* rawData */ js.Any, Unit]
  ): Unit = js.native
  def getNumberFormat(format: js.Object): js.Object = js.native
}

