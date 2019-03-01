package typings
package gapiDotClientDotDnsLib.gapiNs.clientNs.dnsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManagedZonesListResponse extends js.Object {
  /** Type of resource. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The managed zone resources. */
  var managedZones: js.UndefOr[js.Array[ManagedZone]] = js.undefined
  /**
    * The presence of this field indicates that there exist more results following your last page of results in pagination order. To fetch them, make another
    * list request using this value as your page token.
    *
    * In this way you can retrieve the complete contents of even very large collections one page at a time. However, if the contents of the collection change
    * between the first and last paginated list request, the set of all elements returned will be an inconsistent view of the collection. There is no way to
    * retrieve a consistent snapshot of a collection larger than the maximum page size.
    */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ManagedZonesListResponse {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    managedZones: js.Array[ManagedZone] = null,
    nextPageToken: java.lang.String = null
  ): ManagedZonesListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (managedZones != null) __obj.updateDynamic("managedZones")(managedZones)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ManagedZonesListResponse]
  }
}

