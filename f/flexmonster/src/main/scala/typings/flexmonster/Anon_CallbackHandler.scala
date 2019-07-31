package typings.flexmonster

import typings.flexmonster.flexmonsterMod.GetDataErrorObject
import typings.flexmonster.flexmonsterMod.GetDataValueObject
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
    updateHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit]
  ): Unit = js.native
  def getData(
    options: Anon_PrepareDataFunction,
    callbackHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit]
  ): Unit = js.native
  def getData(
    options: Anon_PrepareDataFunction,
    callbackHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit],
    updateHandler: String
  ): Unit = js.native
  def getData(
    options: Anon_PrepareDataFunction,
    callbackHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit],
    updateHandler: js.Function2[/* rawData */ GetDataValueObject, /* error */ js.UndefOr[GetDataErrorObject], Unit]
  ): Unit = js.native
  def getNumberFormat(format: js.Object): js.Object = js.native
}

