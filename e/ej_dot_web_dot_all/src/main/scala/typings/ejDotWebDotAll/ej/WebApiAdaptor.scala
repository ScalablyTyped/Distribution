package typings.ejDotWebDotAll.ej

import typings.ejDotWebDotAll.Anon_Accept
import typings.ejDotWebDotAll.Anon_DataTypeUrlAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.WebApiAdaptor")
@js.native
class WebApiAdaptor () extends ODataAdaptor {
  def insert(dm: DataManager, data: js.Any): Anon_DataTypeUrlAny = js.native
  def remove(dm: DataManager, value: js.Any): Anon_DataTypeUrlAny = js.native
  def remove(dm: DataManager, value: js.Any, keyField: String): Anon_DataTypeUrlAny = js.native
  def remove(dm: DataManager, value: js.Any, keyField: String, tableName: String): Anon_DataTypeUrlAny = js.native
  def update(dm: DataManager, value: js.Any): Anon_Accept = js.native
  def update(dm: DataManager, value: js.Any, keyField: String): Anon_Accept = js.native
  def update(dm: DataManager, value: js.Any, keyField: String, tableName: String): Anon_Accept = js.native
}

