package typings.flexmonster

import typings.flexmonster.mod.GetDataErrorObject
import typings.flexmonster.mod.GetDataValueObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetNumberFormat extends js.Object {
  def getData(options: AnonType, callbackHandler: String): Unit = js.native
  def getData(options: AnonType, callbackHandler: String, updateHandler: String): Unit = js.native
  def getData(
    options: AnonType,
    callbackHandler: String,
    updateHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit]
  ): Unit = js.native
  def getData(
    options: AnonType,
    callbackHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit]
  ): Unit = js.native
  def getData(
    options: AnonType,
    callbackHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit],
    updateHandler: String
  ): Unit = js.native
  def getData(
    options: AnonType,
    callbackHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit],
    updateHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit]
  ): Unit = js.native
  def getNumberFormat(format: js.Object): js.Object = js.native
  def getNumberFormatPattern(format: js.Object): String = js.native
}

