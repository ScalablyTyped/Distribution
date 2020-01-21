package typings.ejWebAll.ej

import typings.ejWebAll.AnonAccept
import typings.ejWebAll.AnonDataTypeUrlAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.WebApiAdaptor")
@js.native
class WebApiAdaptor () extends ODataAdaptor {
  def insert(dm: DataManager, data: js.Any): AnonDataTypeUrlAny = js.native
  def remove(dm: DataManager, value: js.Any): AnonDataTypeUrlAny = js.native
  def remove(dm: DataManager, value: js.Any, keyField: String): AnonDataTypeUrlAny = js.native
  def remove(dm: DataManager, value: js.Any, keyField: String, tableName: String): AnonDataTypeUrlAny = js.native
  def update(dm: DataManager, value: js.Any): AnonAccept = js.native
  def update(dm: DataManager, value: js.Any, keyField: String): AnonAccept = js.native
  def update(dm: DataManager, value: js.Any, keyField: String, tableName: String): AnonAccept = js.native
}

