package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single SOP instance from the series
  */
@js.native
trait ImagingStudySeriesInstance extends BackboneElement {
  /**
    * Contains extended information for property 'number'.
    */
  var _number: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'sopClass'.
    */
  var _sopClass: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'uid'.
    */
  var _uid: js.UndefOr[Element] = js.native
  /**
    * The number of this instance in the series
    */
  var number: js.UndefOr[unsignedInt] = js.native
  /**
    * DICOM class type
    */
  var sopClass: oid = js.native
  /**
    * Description of instance
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Formal DICOM identifier for this instance
    */
  var uid: oid = js.native
}

object ImagingStudySeriesInstance {
  @scala.inline
  def apply(sopClass: oid, uid: oid): ImagingStudySeriesInstance = {
    val __obj = js.Dynamic.literal(sopClass = sopClass.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingStudySeriesInstance]
  }
  @scala.inline
  implicit class ImagingStudySeriesInstanceOps[Self <: ImagingStudySeriesInstance] (val x: Self) extends AnyVal {
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
    def set_number(value: Element): Self = this.set("_number", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_number: Self = this.set("_number", js.undefined)
    @scala.inline
    def set_sopClass(value: Element): Self = this.set("_sopClass", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_sopClass: Self = this.set("_sopClass", js.undefined)
    @scala.inline
    def set_title(value: Element): Self = this.set("_title", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_title: Self = this.set("_title", js.undefined)
    @scala.inline
    def set_uid(value: Element): Self = this.set("_uid", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_uid: Self = this.set("_uid", js.undefined)
    @scala.inline
    def setNumber(value: unsignedInt): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

