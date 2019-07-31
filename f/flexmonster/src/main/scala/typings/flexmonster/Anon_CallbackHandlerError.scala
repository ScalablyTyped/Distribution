package typings.flexmonster

import typings.flexmonster.flexmonsterMod.GetDataErrorObject
import typings.flexmonster.flexmonsterMod.GetDataValueObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackHandlerError extends js.Object {
  def getData(options: Anon_PrepareDataFunctionRawData, callbackHandler: String): Unit = js.native
  def getData(options: Anon_PrepareDataFunctionRawData, callbackHandler: String, updateHandler: String): Unit = js.native
  def getData(
    options: Anon_PrepareDataFunctionRawData,
    callbackHandler: String,
    updateHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit]
  ): Unit = js.native
  def getData(
    options: Anon_PrepareDataFunctionRawData,
    callbackHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit]
  ): Unit = js.native
  def getData(
    options: Anon_PrepareDataFunctionRawData,
    callbackHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit],
    updateHandler: String
  ): Unit = js.native
  def getData(
    options: Anon_PrepareDataFunctionRawData,
    callbackHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit],
    updateHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit]
  ): Unit = js.native
  def getNumberFormat(format: js.Object): js.Object = js.native
  def getNumberFormatPattern(format: js.Object): String = js.native
}

