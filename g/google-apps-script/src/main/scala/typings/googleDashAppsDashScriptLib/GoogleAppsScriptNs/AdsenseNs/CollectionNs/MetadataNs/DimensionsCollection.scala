package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.CollectionNs.MetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionsCollection extends js.Object {
  // List the metadata for the dimensions available to this AdSense account.
  def list(): googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.SchemaNs.Metadata
}

object DimensionsCollection {
  @scala.inline
  def apply(list: () => googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.SchemaNs.Metadata): DimensionsCollection = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction0(list))
  
    __obj.asInstanceOf[DimensionsCollection]
  }
}

