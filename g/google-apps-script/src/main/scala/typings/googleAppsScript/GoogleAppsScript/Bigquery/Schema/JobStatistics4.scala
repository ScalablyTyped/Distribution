package typings.googleAppsScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobStatistics4 extends js.Object {
  var destinationUriFileCounts: js.UndefOr[js.Array[String]] = js.undefined
  var inputBytes: js.UndefOr[String] = js.undefined
}

object JobStatistics4 {
  @scala.inline
  def apply(destinationUriFileCounts: js.Array[String] = null, inputBytes: String = null): JobStatistics4 = {
    val __obj = js.Dynamic.literal()
    if (destinationUriFileCounts != null) __obj.updateDynamic("destinationUriFileCounts")(destinationUriFileCounts.asInstanceOf[js.Any])
    if (inputBytes != null) __obj.updateDynamic("inputBytes")(inputBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobStatistics4]
  }
}

