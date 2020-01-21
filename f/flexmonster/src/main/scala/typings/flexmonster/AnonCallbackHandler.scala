package typings.flexmonster

import typings.flexmonster.mod.GetDataErrorObject
import typings.flexmonster.mod.GetDataValueObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCallbackHandler extends js.Object {
  def getData(options: AnonPrepareDataFunction, callbackHandler: String): Unit = js.native
  def getData(options: AnonPrepareDataFunction, callbackHandler: String, updateHandler: String): Unit = js.native
  def getData(
    options: AnonPrepareDataFunction,
    callbackHandler: String,
    updateHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit]
  ): Unit = js.native
  def getData(
    options: AnonPrepareDataFunction,
    callbackHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit]
  ): Unit = js.native
  def getData(
    options: AnonPrepareDataFunction,
    callbackHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit],
    updateHandler: String
  ): Unit = js.native
  def getData(
    options: AnonPrepareDataFunction,
    callbackHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit],
    updateHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit]
  ): Unit = js.native
  def getNumberFormat(format: js.Object): js.Object = js.native
}

