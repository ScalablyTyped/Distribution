package typings.flexmonster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackHandlerFormat extends js.Object {
  def getData(options: Anon_PrepareDataFunctionRawData, callbackHandler: String): Unit = js.native
  def getData(options: Anon_PrepareDataFunctionRawData, callbackHandler: String, updateHandler: String): Unit = js.native
  def getData(
    options: Anon_PrepareDataFunctionRawData,
    callbackHandler: String,
    updateHandler: js.Function1[/* rawData */ js.Any, Unit]
  ): Unit = js.native
  def getData(
    options: Anon_PrepareDataFunctionRawData,
    callbackHandler: js.Function1[/* rawData */ js.Any, Unit]
  ): Unit = js.native
  def getData(
    options: Anon_PrepareDataFunctionRawData,
    callbackHandler: js.Function1[/* rawData */ js.Any, Unit],
    updateHandler: String
  ): Unit = js.native
  def getData(
    options: Anon_PrepareDataFunctionRawData,
    callbackHandler: js.Function1[/* rawData */ js.Any, Unit],
    updateHandler: js.Function1[/* rawData */ js.Any, Unit]
  ): Unit = js.native
  def getNumberFormat(format: js.Object): js.Object = js.native
  def getNumberFormatPattern(format: js.Object): String = js.native
}

