package typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ListThreatListsResponse extends js.Object {
  /**
    * The lists available for download by the client.
    */
  var threatLists: js.UndefOr[js.Array[Schema$ThreatListDescriptor]] = js.native
}

object Schema$ListThreatListsResponse {
  @scala.inline
  def apply(threatLists: js.Array[Schema$ThreatListDescriptor] = null): Schema$ListThreatListsResponse = {
    val __obj = js.Dynamic.literal()
    if (threatLists != null) __obj.updateDynamic("threatLists")(threatLists.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ListThreatListsResponse]
  }
}

