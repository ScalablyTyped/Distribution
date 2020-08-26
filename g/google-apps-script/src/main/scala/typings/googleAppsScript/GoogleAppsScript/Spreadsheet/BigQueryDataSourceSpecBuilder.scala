package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The builder for BigQueryDataSourceSpecBuilder.
  */
@js.native
trait BigQueryDataSourceSpecBuilder extends js.Object {
  def build(): DataSourceSpec = js.native
  def copy(): DataSourceSpecBuilder = js.native
  def getParameters(): js.Array[DataSourceParameter] = js.native
  def getProjectId(): String = js.native
  def getRawQuery(): String = js.native
  def getType(): DataSourceType = js.native
  def removeAllParameters(): BigQueryDataSourceSpecBuilder = js.native
  def removeParameter(parameterName: String): BigQueryDataSourceSpecBuilder = js.native
  def setParameterFromCell(parameterName: String, sourceCell: String): BigQueryDataSourceSpecBuilder = js.native
  def setProjectId(projectId: String): BigQueryDataSourceSpecBuilder = js.native
  def setRawQuery(rawQuery: String): BigQueryDataSourceSpecBuilder = js.native
}

object BigQueryDataSourceSpecBuilder {
  @scala.inline
  def apply(
    build: () => DataSourceSpec,
    copy: () => DataSourceSpecBuilder,
    getParameters: () => js.Array[DataSourceParameter],
    getProjectId: () => String,
    getRawQuery: () => String,
    getType: () => DataSourceType,
    removeAllParameters: () => BigQueryDataSourceSpecBuilder,
    removeParameter: String => BigQueryDataSourceSpecBuilder,
    setParameterFromCell: (String, String) => BigQueryDataSourceSpecBuilder,
    setProjectId: String => BigQueryDataSourceSpecBuilder,
    setRawQuery: String => BigQueryDataSourceSpecBuilder
  ): BigQueryDataSourceSpecBuilder = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), copy = js.Any.fromFunction0(copy), getParameters = js.Any.fromFunction0(getParameters), getProjectId = js.Any.fromFunction0(getProjectId), getRawQuery = js.Any.fromFunction0(getRawQuery), getType = js.Any.fromFunction0(getType), removeAllParameters = js.Any.fromFunction0(removeAllParameters), removeParameter = js.Any.fromFunction1(removeParameter), setParameterFromCell = js.Any.fromFunction2(setParameterFromCell), setProjectId = js.Any.fromFunction1(setProjectId), setRawQuery = js.Any.fromFunction1(setRawQuery))
    __obj.asInstanceOf[BigQueryDataSourceSpecBuilder]
  }
  @scala.inline
  implicit class BigQueryDataSourceSpecBuilderOps[Self <: BigQueryDataSourceSpecBuilder] (val x: Self) extends AnyVal {
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
    def setBuild(value: () => DataSourceSpec): Self = this.set("build", js.Any.fromFunction0(value))
    @scala.inline
    def setCopy(value: () => DataSourceSpecBuilder): Self = this.set("copy", js.Any.fromFunction0(value))
    @scala.inline
    def setGetParameters(value: () => js.Array[DataSourceParameter]): Self = this.set("getParameters", js.Any.fromFunction0(value))
    @scala.inline
    def setGetProjectId(value: () => String): Self = this.set("getProjectId", js.Any.fromFunction0(value))
    @scala.inline
    def setGetRawQuery(value: () => String): Self = this.set("getRawQuery", js.Any.fromFunction0(value))
    @scala.inline
    def setGetType(value: () => DataSourceType): Self = this.set("getType", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveAllParameters(value: () => BigQueryDataSourceSpecBuilder): Self = this.set("removeAllParameters", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveParameter(value: String => BigQueryDataSourceSpecBuilder): Self = this.set("removeParameter", js.Any.fromFunction1(value))
    @scala.inline
    def setSetParameterFromCell(value: (String, String) => BigQueryDataSourceSpecBuilder): Self = this.set("setParameterFromCell", js.Any.fromFunction2(value))
    @scala.inline
    def setSetProjectId(value: String => BigQueryDataSourceSpecBuilder): Self = this.set("setProjectId", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRawQuery(value: String => BigQueryDataSourceSpecBuilder): Self = this.set("setRawQuery", js.Any.fromFunction1(value))
  }
  
}

