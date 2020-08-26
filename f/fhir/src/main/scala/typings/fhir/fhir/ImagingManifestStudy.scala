package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Study identity of the selected instances
  */
@js.native
trait ImagingManifestStudy extends BackboneElement {
  /**
    * Contains extended information for property 'uid'.
    */
  var _uid: js.UndefOr[Element] = js.native
  /**
    * Study access service endpoint
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * Reference to ImagingStudy
    */
  var imagingStudy: js.UndefOr[Reference] = js.native
  /**
    * Series identity of the selected instances
    */
  var series: js.Array[ImagingManifestStudySeries] = js.native
  /**
    * Study instance UID
    */
  var uid: oid = js.native
}

object ImagingManifestStudy {
  @scala.inline
  def apply(series: js.Array[ImagingManifestStudySeries], uid: oid): ImagingManifestStudy = {
    val __obj = js.Dynamic.literal(series = series.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingManifestStudy]
  }
  @scala.inline
  implicit class ImagingManifestStudyOps[Self <: ImagingManifestStudy] (val x: Self) extends AnyVal {
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
    def setSeriesVarargs(value: ImagingManifestStudySeries*): Self = this.set("series", js.Array(value :_*))
    @scala.inline
    def setSeries(value: js.Array[ImagingManifestStudySeries]): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def setUid(value: oid): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def set_uid(value: Element): Self = this.set("_uid", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_uid: Self = this.set("_uid", js.undefined)
    @scala.inline
    def setEndpointVarargs(value: Reference*): Self = this.set("endpoint", js.Array(value :_*))
    @scala.inline
    def setEndpoint(value: js.Array[Reference]): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setImagingStudy(value: Reference): Self = this.set("imagingStudy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImagingStudy: Self = this.set("imagingStudy", js.undefined)
  }
  
}

