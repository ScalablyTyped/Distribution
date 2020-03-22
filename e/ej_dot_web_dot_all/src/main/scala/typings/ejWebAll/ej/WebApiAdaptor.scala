package typings.ejWebAll.ej

import typings.ejWebAll.AnonAccept
import typings.ejWebAll.AnonDataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.WebApiAdaptor")
@js.native
class WebApiAdaptor () extends ODataAdaptor {
  def insert(dm: DataManager, data: js.Any): AnonDataType = js.native
  def remove(dm: DataManager, value: js.Any): AnonDataType = js.native
  def remove(dm: DataManager, value: js.Any, keyField: String): AnonDataType = js.native
  def remove(dm: DataManager, value: js.Any, keyField: String, tableName: String): AnonDataType = js.native
  def update(dm: DataManager, value: js.Any): AnonAccept = js.native
  def update(dm: DataManager, value: js.Any, keyField: String): AnonAccept = js.native
  def update(dm: DataManager, value: js.Any, keyField: String, tableName: String): AnonAccept = js.native
}

