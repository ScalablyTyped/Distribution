package typings.googleAppsScript.GoogleAppsScript.Analyticsreporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dimension extends js.Object {
  var histogramBuckets: js.UndefOr[js.Array[String]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object Dimension {
  @scala.inline
  def apply(histogramBuckets: js.Array[String] = null, name: String = null): Dimension = {
    val __obj = js.Dynamic.literal()
    if (histogramBuckets != null) __obj.updateDynamic("histogramBuckets")(histogramBuckets.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimension]
  }
}

