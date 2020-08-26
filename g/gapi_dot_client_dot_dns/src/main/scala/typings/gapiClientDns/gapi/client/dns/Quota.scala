package typings.gapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Quota extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dns#quota". */
  var kind: js.UndefOr[String] = js.native
  /** Maximum allowed number of managed zones in the project. */
  var managedZones: js.UndefOr[Double] = js.native
  /** Maximum allowed number of ResourceRecords per ResourceRecordSet. */
  var resourceRecordsPerRrset: js.UndefOr[Double] = js.native
  /** Maximum allowed number of ResourceRecordSets to add per ChangesCreateRequest. */
  var rrsetAdditionsPerChange: js.UndefOr[Double] = js.native
  /** Maximum allowed number of ResourceRecordSets to delete per ChangesCreateRequest. */
  var rrsetDeletionsPerChange: js.UndefOr[Double] = js.native
  /** Maximum allowed number of ResourceRecordSets per zone in the project. */
  var rrsetsPerManagedZone: js.UndefOr[Double] = js.native
  /** Maximum allowed size for total rrdata in one ChangesCreateRequest in bytes. */
  var totalRrdataSizePerChange: js.UndefOr[Double] = js.native
}

object Quota {
  @scala.inline
  def apply(): Quota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Quota]
  }
  @scala.inline
  implicit class QuotaOps[Self <: Quota] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setManagedZones(value: Double): Self = this.set("managedZones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManagedZones: Self = this.set("managedZones", js.undefined)
    @scala.inline
    def setResourceRecordsPerRrset(value: Double): Self = this.set("resourceRecordsPerRrset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceRecordsPerRrset: Self = this.set("resourceRecordsPerRrset", js.undefined)
    @scala.inline
    def setRrsetAdditionsPerChange(value: Double): Self = this.set("rrsetAdditionsPerChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRrsetAdditionsPerChange: Self = this.set("rrsetAdditionsPerChange", js.undefined)
    @scala.inline
    def setRrsetDeletionsPerChange(value: Double): Self = this.set("rrsetDeletionsPerChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRrsetDeletionsPerChange: Self = this.set("rrsetDeletionsPerChange", js.undefined)
    @scala.inline
    def setRrsetsPerManagedZone(value: Double): Self = this.set("rrsetsPerManagedZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRrsetsPerManagedZone: Self = this.set("rrsetsPerManagedZone", js.undefined)
    @scala.inline
    def setTotalRrdataSizePerChange(value: Double): Self = this.set("totalRrdataSizePerChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalRrdataSizePerChange: Self = this.set("totalRrdataSizePerChange", js.undefined)
  }
  
}

