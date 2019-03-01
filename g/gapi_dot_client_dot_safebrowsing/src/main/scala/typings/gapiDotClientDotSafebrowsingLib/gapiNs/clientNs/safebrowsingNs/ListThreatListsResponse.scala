package typings
package gapiDotClientDotSafebrowsingLib.gapiNs.clientNs.safebrowsingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListThreatListsResponse extends js.Object {
  /** The lists available for download by the client. */
  var threatLists: js.UndefOr[js.Array[ThreatListDescriptor]] = js.undefined
}

object ListThreatListsResponse {
  @scala.inline
  def apply(threatLists: js.Array[ThreatListDescriptor] = null): ListThreatListsResponse = {
    val __obj = js.Dynamic.literal()
    if (threatLists != null) __obj.updateDynamic("threatLists")(threatLists)
    __obj.asInstanceOf[ListThreatListsResponse]
  }
}

