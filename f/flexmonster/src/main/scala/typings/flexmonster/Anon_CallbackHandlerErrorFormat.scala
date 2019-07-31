package typings.flexmonster

import typings.flexmonster.flexmonsterMod.GetDataErrorObject
import typings.flexmonster.flexmonsterMod.GetDataValueObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackHandlerErrorFormat extends js.Object {
  def getAxisFormat(format: js.Object): String = js.native
  def getData(options: Anon_PrepareDataFunctionRawDataSlice, callbackHandler: String): Unit = js.native
  def getData(options: Anon_PrepareDataFunctionRawDataSlice, callbackHandler: String, updateHandler: String): Unit = js.native
  def getData(
    options: Anon_PrepareDataFunctionRawDataSlice,
    callbackHandler: String,
    updateHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit]
  ): Unit = js.native
  def getData(
    options: Anon_PrepareDataFunctionRawDataSlice,
    callbackHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit]
  ): Unit = js.native
  def getData(
    options: Anon_PrepareDataFunctionRawDataSlice,
    callbackHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit],
    updateHandler: String
  ): Unit = js.native
  def getData(
    options: Anon_PrepareDataFunctionRawDataSlice,
    callbackHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit],
    updateHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit]
  ): Unit = js.native
  def getPointXFormat(format: js.Object): String = js.native
  def getPointYFormat(format: js.Object): String = js.native
  def getPointZFormat(format: js.Object): String = js.native
}

