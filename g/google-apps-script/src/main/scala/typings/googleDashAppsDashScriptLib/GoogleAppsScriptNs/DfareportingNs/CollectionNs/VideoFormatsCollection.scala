package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.CollectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoFormatsCollection extends js.Object {
  // Gets one video format by ID.
  def get(profileId: java.lang.String, id: scala.Double): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.VideoFormat
  // Lists available video formats.
  def list(profileId: java.lang.String): googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.VideoFormatsListResponse
}

object VideoFormatsCollection {
  @scala.inline
  def apply(
    get: (java.lang.String, scala.Double) => googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.VideoFormat,
    list: java.lang.String => googleDashAppsDashScriptLib.GoogleAppsScriptNs.DfareportingNs.SchemaNs.VideoFormatsListResponse
  ): VideoFormatsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[VideoFormatsCollection]
  }
}

