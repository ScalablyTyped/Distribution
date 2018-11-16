package typings
package gapiDotClientDotDnsLib.gapiNs.clientNs.dnsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Quota extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dns#quota". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum allowed number of managed zones in the project. */
  var managedZones: js.UndefOr[scala.Double] = js.undefined
  /** Maximum allowed number of ResourceRecords per ResourceRecordSet. */
  var resourceRecordsPerRrset: js.UndefOr[scala.Double] = js.undefined
  /** Maximum allowed number of ResourceRecordSets to add per ChangesCreateRequest. */
  var rrsetAdditionsPerChange: js.UndefOr[scala.Double] = js.undefined
  /** Maximum allowed number of ResourceRecordSets to delete per ChangesCreateRequest. */
  var rrsetDeletionsPerChange: js.UndefOr[scala.Double] = js.undefined
  /** Maximum allowed number of ResourceRecordSets per zone in the project. */
  var rrsetsPerManagedZone: js.UndefOr[scala.Double] = js.undefined
  /** Maximum allowed size for total rrdata in one ChangesCreateRequest in bytes. */
  var totalRrdataSizePerChange: js.UndefOr[scala.Double] = js.undefined
}

