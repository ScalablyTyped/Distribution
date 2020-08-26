package typings.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerformanceReportList extends js.Object {
  /** Resource type. */
  var kind: js.UndefOr[String] = js.native
  /** A list of performance reports relevant for the account. */
  var performanceReport: js.UndefOr[js.Array[PerformanceReport]] = js.native
}

object PerformanceReportList {
  @scala.inline
  def apply(): PerformanceReportList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceReportList]
  }
  @scala.inline
  implicit class PerformanceReportListOps[Self <: PerformanceReportList] (val x: Self) extends AnyVal {
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
    def setPerformanceReportVarargs(value: PerformanceReport*): Self = this.set("performanceReport", js.Array(value :_*))
    @scala.inline
    def setPerformanceReport(value: js.Array[PerformanceReport]): Self = this.set("performanceReport", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePerformanceReport: Self = this.set("performanceReport", js.undefined)
  }
  
}

