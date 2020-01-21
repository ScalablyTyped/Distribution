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
    managedZones: Int | Double = null,
    resourceRecordsPerRrset: Int | Double = null,
    rrsetAdditionsPerChange: Int | Double = null,
    rrsetDeletionsPerChange: Int | Double = null,
    rrsetsPerManagedZone: Int | Double = null,
    totalRrdataSizePerChange: Int | Double = null
  ): Quota = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (managedZones != null) __obj.updateDynamic("managedZones")(managedZones.asInstanceOf[js.Any])
    if (resourceRecordsPerRrset != null) __obj.updateDynamic("resourceRecordsPerRrset")(resourceRecordsPerRrset.asInstanceOf[js.Any])
    if (rrsetAdditionsPerChange != null) __obj.updateDynamic("rrsetAdditionsPerChange")(rrsetAdditionsPerChange.asInstanceOf[js.Any])
    if (rrsetDeletionsPerChange != null) __obj.updateDynamic("rrsetDeletionsPerChange")(rrsetDeletionsPerChange.asInstanceOf[js.Any])
    if (rrsetsPerManagedZone != null) __obj.updateDynamic("rrsetsPerManagedZone")(rrsetsPerManagedZone.asInstanceOf[js.Any])
    if (totalRrdataSizePerChange != null) __obj.updateDynamic("totalRrdataSizePerChange")(totalRrdataSizePerChange.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quota]
  }
}

