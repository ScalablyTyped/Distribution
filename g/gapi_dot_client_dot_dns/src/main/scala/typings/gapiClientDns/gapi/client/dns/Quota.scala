package typings.gapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Quota extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dns#quota". */
  var kind: js.UndefOr[String] = js.undefined
  /** Maximum allowed number of managed zones in the project. */
  var managedZones: js.UndefOr[Double] = js.undefined
  /** Maximum allowed number of ResourceRecords per ResourceRecordSet. */
  var resourceRecordsPerRrset: js.UndefOr[Double] = js.undefined
  /** Maximum allowed number of ResourceRecordSets to add per ChangesCreateRequest. */
  var rrsetAdditionsPerChange: js.UndefOr[Double] = js.undefined
  /** Maximum allowed number of ResourceRecordSets to delete per ChangesCreateRequest. */
  var rrsetDeletionsPerChange: js.UndefOr[Double] = js.undefined
  /** Maximum allowed number of ResourceRecordSets per zone in the project. */
  var rrsetsPerManagedZone: js.UndefOr[Double] = js.undefined
  /** Maximum allowed size for total rrdata in one ChangesCreateRequest in bytes. */
  var totalRrdataSizePerChange: js.UndefOr[Double] = js.undefined
}

object Quota {
  @scala.inline
  def apply(
    kind: String = null,
    managedZones: js.UndefOr[Double] = js.undefined,
    resourceRecordsPerRrset: js.UndefOr[Double] = js.undefined,
    rrsetAdditionsPerChange: js.UndefOr[Double] = js.undefined,
    rrsetDeletionsPerChange: js.UndefOr[Double] = js.undefined,
    rrsetsPerManagedZone: js.UndefOr[Double] = js.undefined,
    totalRrdataSizePerChange: js.UndefOr[Double] = js.undefined
  ): Quota = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (!js.isUndefined(managedZones)) __obj.updateDynamic("managedZones")(managedZones.get.asInstanceOf[js.Any])
    if (!js.isUndefined(resourceRecordsPerRrset)) __obj.updateDynamic("resourceRecordsPerRrset")(resourceRecordsPerRrset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rrsetAdditionsPerChange)) __obj.updateDynamic("rrsetAdditionsPerChange")(rrsetAdditionsPerChange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rrsetDeletionsPerChange)) __obj.updateDynamic("rrsetDeletionsPerChange")(rrsetDeletionsPerChange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rrsetsPerManagedZone)) __obj.updateDynamic("rrsetsPerManagedZone")(rrsetsPerManagedZone.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalRrdataSizePerChange)) __obj.updateDynamic("totalRrdataSizePerChange")(totalRrdataSizePerChange.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quota]
  }
}

