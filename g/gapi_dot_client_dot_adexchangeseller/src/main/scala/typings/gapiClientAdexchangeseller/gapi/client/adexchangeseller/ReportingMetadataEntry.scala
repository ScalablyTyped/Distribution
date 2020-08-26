package typings.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReportingMetadataEntry extends js.Object {
  /**
    * For metrics this is a list of dimension IDs which the metric is compatible with, for dimensions it is a list of compatibility groups the dimension
    * belongs to.
    */
  var compatibleDimensions: js.UndefOr[js.Array[String]] = js.native
  /** The names of the metrics the dimension or metric this reporting metadata entry describes is compatible with. */
  var compatibleMetrics: js.UndefOr[js.Array[String]] = js.native
  /** Unique identifier of this reporting metadata entry, corresponding to the name of the appropriate dimension or metric. */
  var id: js.UndefOr[String] = js.native
  /** Kind of resource this is, in this case adexchangeseller#reportingMetadataEntry. */
  var kind: js.UndefOr[String] = js.native
  /**
    * The names of the dimensions which the dimension or metric this reporting metadata entry describes requires to also be present in order for the report
    * to be valid. Omitting these will not cause an error or warning, but may result in data which cannot be correctly interpreted.
    */
  var requiredDimensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * The names of the metrics which the dimension or metric this reporting metadata entry describes requires to also be present in order for the report to
    * be valid. Omitting these will not cause an error or warning, but may result in data which cannot be correctly interpreted.
    */
  var requiredMetrics: js.UndefOr[js.Array[String]] = js.native
  /** The codes of the projects supported by the dimension or metric this reporting metadata entry describes. */
  var supportedProducts: js.UndefOr[js.Array[String]] = js.native
}

object ReportingMetadataEntry {
  @scala.inline
  def apply(): ReportingMetadataEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportingMetadataEntry]
  }
  @scala.inline
  implicit class ReportingMetadataEntryOps[Self <: ReportingMetadataEntry] (val x: Self) extends AnyVal {
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
    def setCompatibleDimensionsVarargs(value: String*): Self = this.set("compatibleDimensions", js.Array(value :_*))
    @scala.inline
    def setCompatibleDimensions(value: js.Array[String]): Self = this.set("compatibleDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompatibleDimensions: Self = this.set("compatibleDimensions", js.undefined)
    @scala.inline
    def setCompatibleMetricsVarargs(value: String*): Self = this.set("compatibleMetrics", js.Array(value :_*))
    @scala.inline
    def setCompatibleMetrics(value: js.Array[String]): Self = this.set("compatibleMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompatibleMetrics: Self = this.set("compatibleMetrics", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setRequiredDimensionsVarargs(value: String*): Self = this.set("requiredDimensions", js.Array(value :_*))
    @scala.inline
    def setRequiredDimensions(value: js.Array[String]): Self = this.set("requiredDimensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiredDimensions: Self = this.set("requiredDimensions", js.undefined)
    @scala.inline
    def setRequiredMetricsVarargs(value: String*): Self = this.set("requiredMetrics", js.Array(value :_*))
    @scala.inline
    def setRequiredMetrics(value: js.Array[String]): Self = this.set("requiredMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiredMetrics: Self = this.set("requiredMetrics", js.undefined)
    @scala.inline
    def setSupportedProductsVarargs(value: String*): Self = this.set("supportedProducts", js.Array(value :_*))
    @scala.inline
    def setSupportedProducts(value: js.Array[String]): Self = this.set("supportedProducts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedProducts: Self = this.set("supportedProducts", js.undefined)
  }
  
}

