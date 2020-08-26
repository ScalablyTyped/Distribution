package typings.fhirJsClient.FHIR.SMART

import typings.fhirJsClient.anon.DictpropName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonQueryFilters extends js.Object {
  /**
    * Number of return records requested. The server is not bound to return the number requested, but cannot return more
    */
  var count: js.UndefOr[Double] = js.native
  /**
    * Addition filters to be applied on the history query. The object will be converted into query string parameters.
    */
  var params: js.UndefOr[DictpropName] = js.native
  /**
    * Only include resource versions that were created at or after the given instant in time
    *
    * Type: instant An instant in time - known at least to the second and always includes a time zone.
    * Note: This is intended for precisely observed times (typically system logs etc.), and not human-reported times - for them,
    * use date and dateTime. instant is a more constrained dateTime xs:dateTime A JSON string - an xs:dateTime
    * Note: This type is for system times, not human times (see date and dateTime below).
    */
  var since: js.UndefOr[String] = js.native
}

object CommonQueryFilters {
  @scala.inline
  def apply(): CommonQueryFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonQueryFilters]
  }
  @scala.inline
  implicit class CommonQueryFiltersOps[Self <: CommonQueryFilters] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setParams(value: DictpropName): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setSince(value: String): Self = this.set("since", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSince: Self = this.set("since", js.undefined)
  }
  
}

