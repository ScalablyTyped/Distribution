package typings.googleDashAppsDashScript.GoogleAppsScript.Bigquery.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Clustering extends js.Object {
  var fields: js.UndefOr[js.Array[String]] = js.undefined
}

object Clustering {
  @scala.inline
  def apply(fields: js.Array[String] = null): Clustering = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    __obj.asInstanceOf[Clustering]
  }
}

