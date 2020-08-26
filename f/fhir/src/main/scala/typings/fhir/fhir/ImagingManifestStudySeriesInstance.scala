package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The selected instance
  */
@js.native
trait ImagingManifestStudySeriesInstance extends BackboneElement {
  /**
    * Contains extended information for property 'sopClass'.
    */
  var _sopClass: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'uid'.
    */
  var _uid: js.UndefOr[Element] = js.native
  /**
    * SOP class UID of instance
    */
  var sopClass: oid = js.native
  /**
    * Selected instance UID
    */
  var uid: oid = js.native
}

object ImagingManifestStudySeriesInstance {
  @scala.inline
  def apply(sopClass: oid, uid: oid): ImagingManifestStudySeriesInstance = {
    val __obj = js.Dynamic.literal(sopClass = sopClass.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingManifestStudySeriesInstance]
  }
  @scala.inline
  implicit class ImagingManifestStudySeriesInstanceOps[Self <: ImagingManifestStudySeriesInstance] (val x: Self) extends AnyVal {
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
    def setSopClass(value: oid): Self = this.set("sopClass", value.asInstanceOf[js.Any])
    @scala.inline
    def setUid(value: oid): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def set_sopClass(value: Element): Self = this.set("_sopClass", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_sopClass: Self = this.set("_sopClass", js.undefined)
    @scala.inline
    def set_uid(value: Element): Self = this.set("_uid", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_uid: Self = this.set("_uid", js.undefined)
  }
  
}

