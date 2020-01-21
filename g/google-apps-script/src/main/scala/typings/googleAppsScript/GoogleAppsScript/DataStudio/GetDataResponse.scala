package typings.googleAppsScript.GoogleAppsScript.DataStudio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Builder to create a getData() response for your script project.
  *
  *     function getFields() {...}
  *     function getData() {
  *       var cc = DataStudioApp.createCommunityConnector();
  *
  *       return cc.newGetDataResponse()
  *         .setFields(getFields())
  *         .addRow(['3', 'Foobar.com'])
  *         .addRow(['4', 'Foobaz.com'])
  *         .addRows([
  *           ['5', 'Fizzbuz.com'],
  *           ['6', 'Fizzbaz.com']
  *          ])
  *         .build();
  *     }
  */
trait GetDataResponse extends js.Object {
  def addAllRows(rows: js.Array[js.Array[String]]): GetDataResponse
  def addRow(row: js.Array[String]): GetDataResponse
  def build(): js.Any
  def setFields(fields: Fields): GetDataResponse
  def setFiltersApplied(filtersApplied: Boolean): GetDataResponse
}

object GetDataResponse {
  @scala.inline
  def apply(
    addAllRows: js.Array[js.Array[String]] => GetDataResponse,
    addRow: js.Array[String] => GetDataResponse,
    build: () => js.Any,
    setFields: Fields => GetDataResponse,
    setFiltersApplied: Boolean => GetDataResponse
  ): GetDataResponse = {
    val __obj = js.Dynamic.literal(addAllRows = js.Any.fromFunction1(addAllRows), addRow = js.Any.fromFunction1(addRow), build = js.Any.fromFunction0(build), setFields = js.Any.fromFunction1(setFields), setFiltersApplied = js.Any.fromFunction1(setFiltersApplied))
  
    __obj.asInstanceOf[GetDataResponse]
  }
}

