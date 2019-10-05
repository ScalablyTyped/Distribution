package typings.googleDashAppsDashScript.GoogleAppsScript.Charts

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chart extends js.Object {
  def getAs(contentType: String): Blob
  def getBlob(): Blob
  def getId(): String
  def getOptions(): ChartOptions
  def getType(): String
  def setId(id: String): Chart
}

object Chart {
  @scala.inline
  def apply(
    getAs: String => Blob,
    getBlob: () => Blob,
    getId: () => String,
    getOptions: () => ChartOptions,
    getType: () => String,
    setId: String => Chart
  ): Chart = {
    val __obj = js.Dynamic.literal(getAs = js.Any.fromFunction1(getAs), getBlob = js.Any.fromFunction0(getBlob), getId = js.Any.fromFunction0(getId), getOptions = js.Any.fromFunction0(getOptions), getType = js.Any.fromFunction0(getType), setId = js.Any.fromFunction1(setId))
  
    __obj.asInstanceOf[Chart]
  }
}

