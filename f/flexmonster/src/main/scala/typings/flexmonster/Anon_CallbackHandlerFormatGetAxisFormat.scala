package typings.flexmonster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackHandlerFormatGetAxisFormat extends js.Object {
  def getAxisFormat(format: js.Object): String = js.native
  def getData(options: Anon_PrepareDataFunctionRawDataSlice, callbackHandler: String): Unit = js.native
  def getData(options: Anon_PrepareDataFunctionRawDataSlice, callbackHandler: String, updateHandler: String): Unit = js.native
  def getData(
    options: Anon_PrepareDataFunctionRawDataSlice,
    callbackHandler: String,
    updateHandler: js.Function1[/* rawData */ js.Any, Unit]
  ): Unit = js.native
  def getData(
    options: Anon_PrepareDataFunctionRawDataSlice,
    callbackHandler: js.Function1[/* rawData */ js.Any, Unit]
  ): Unit = js.native
  def getData(
    options: Anon_PrepareDataFunctionRawDataSlice,
    callbackHandler: js.Function1[/* rawData */ js.Any, Unit],
    updateHandler: String
  ): Unit = js.native
  def getData(
    options: Anon_PrepareDataFunctionRawDataSlice,
    callbackHandler: js.Function1[/* rawData */ js.Any, Unit],
    updateHandler: js.Function1[/* rawData */ js.Any, Unit]
  ): Unit = js.native
  def getPointXFormat(format: js.Object): String = js.native
  def getPointYFormat(format: js.Object): String = js.native
  def getPointZFormat(format: js.Object): String = js.native
}

