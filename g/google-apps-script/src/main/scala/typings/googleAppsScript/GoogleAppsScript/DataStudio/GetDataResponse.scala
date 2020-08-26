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
@js.native
trait GetDataResponse extends js.Object {
  def addAllRows(rows: js.Array[js.Array[String]]): GetDataResponse = js.native
  def addRow(row: js.Array[String]): GetDataResponse = js.native
  def build(): js.Any = js.native
  def setFields(fields: Fields): GetDataResponse = js.native
  def setFiltersApplied(filtersApplied: Boolean): GetDataResponse = js.native
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
  @scala.inline
  implicit class GetDataResponseOps[Self <: GetDataResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddAllRows(value: js.Array[js.Array[String]] => GetDataResponse): Self = this.set("addAllRows", js.Any.fromFunction1(value))
    @scala.inline
    def setAddRow(value: js.Array[String] => GetDataResponse): Self = this.set("addRow", js.Any.fromFunction1(value))
    @scala.inline
    def setBuild(value: () => js.Any): Self = this.set("build", js.Any.fromFunction0(value))
    @scala.inline
    def setSetFields(value: Fields => GetDataResponse): Self = this.set("setFields", js.Any.fromFunction1(value))
    @scala.inline
    def setSetFiltersApplied(value: Boolean => GetDataResponse): Self = this.set("setFiltersApplied", js.Any.fromFunction1(value))
  }
  
}

