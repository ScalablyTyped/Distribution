package typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Collection.Metadata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DimensionsCollection extends js.Object {
  // List the metadata for the dimensions available to this AdSense account.
  def list(): typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Schema.Metadata
}

object DimensionsCollection {
  @scala.inline
  def apply(list: () => typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Schema.Metadata): DimensionsCollection = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction0(list))
  
    __obj.asInstanceOf[DimensionsCollection]
  }
}

