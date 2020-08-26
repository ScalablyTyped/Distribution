package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Series identity of the selected instances
  */
@js.native
trait ImagingManifestStudySeries extends BackboneElement {
  /**
    * Contains extended information for property 'uid'.
    */
  var _uid: js.UndefOr[Element] = js.native
  /**
    * Series access endpoint
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.native
  /**
    * The selected instance
    */
  var instance: js.Array[ImagingManifestStudySeriesInstance] = js.native
  /**
    * Series instance UID
    */
  var uid: oid = js.native
}

object ImagingManifestStudySeries {
  @scala.inline
  def apply(instance: js.Array[ImagingManifestStudySeriesInstance], uid: oid): ImagingManifestStudySeries = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingManifestStudySeries]
  }
  @scala.inline
  implicit class ImagingManifestStudySeriesOps[Self <: ImagingManifestStudySeries] (val x: Self) extends AnyVal {
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
    def setInstanceVarargs(value: ImagingManifestStudySeriesInstance*): Self = this.set("instance", js.Array(value :_*))
    @scala.inline
    def setInstance(value: js.Array[ImagingManifestStudySeriesInstance]): Self = this.set("instance", value.asInstanceOf[js.Any])
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
  }
  
}

