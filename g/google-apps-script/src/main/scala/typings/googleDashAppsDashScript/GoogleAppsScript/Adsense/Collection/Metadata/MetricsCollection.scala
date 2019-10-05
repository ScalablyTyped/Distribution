package typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Collection.Metadata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsCollection extends js.Object {
  // List the metadata for the metrics available to this AdSense account.
  def list(): typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Schema.Metadata
}

object MetricsCollection {
  @scala.inline
  def apply(list: () => typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Schema.Metadata): MetricsCollection = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction0(list))
  
    __obj.asInstanceOf[MetricsCollection]
  }
}

