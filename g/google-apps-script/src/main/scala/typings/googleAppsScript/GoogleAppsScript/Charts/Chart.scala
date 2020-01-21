package typings.googleAppsScript.GoogleAppsScript.Charts

import typings.googleAppsScript.GoogleAppsScript.Base.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Chart object, which can be converted to a static image. For charts embedded in spreadsheets,
  * see EmbeddedChart.
  */
trait Chart extends js.Object {
  def getAs(contentType: String): Blob
  def getBlob(): Blob
  def getOptions(): ChartOptions
}

object Chart {
  @scala.inline
  def apply(getAs: String => Blob, getBlob: () => Blob, getOptions: () => ChartOptions): Chart = {
    val __obj = js.Dynamic.literal(getAs = js.Any.fromFunction1(getAs), getBlob = js.Any.fromFunction0(getBlob), getOptions = js.Any.fromFunction0(getOptions))
  
    __obj.asInstanceOf[Chart]
  }
}

