package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.CollectionNs.MetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsCollection extends js.Object {
  // List the metadata for the metrics available to this AdSense account.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.SchemaNs.Metadata
}

object MetricsCollection {
  @scala.inline
  def apply(
    list: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseUnderscoreV1Underscore4Ns.SchemaNs.Metadata
  ): MetricsCollection = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction0(list))
  
    __obj.asInstanceOf[MetricsCollection]
  }
}

