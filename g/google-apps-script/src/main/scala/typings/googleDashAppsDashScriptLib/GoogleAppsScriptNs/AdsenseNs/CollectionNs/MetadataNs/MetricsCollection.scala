package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.MetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsCollection extends js.Object {
  // List the metadata for the metrics available to this AdSense account.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.SchemaNs.Metadata
}

object MetricsCollection {
  @scala.inline
  def apply(list: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.SchemaNs.Metadata): MetricsCollection = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction0(list))
  
    __obj.asInstanceOf[MetricsCollection]
  }
}

