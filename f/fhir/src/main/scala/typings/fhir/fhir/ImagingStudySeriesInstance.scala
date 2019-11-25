package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single SOP instance from the series
  */
trait ImagingStudySeriesInstance extends BackboneElement {
  /**
    * Contains extended information for property 'number'.
    */
  var _number: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'sopClass'.
    */
  var _sopClass: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'uid'.
    */
  var _uid: js.UndefOr[Element] = js.undefined
  /**
    * The number of this instance in the series
    */
  var number: js.UndefOr[unsignedInt] = js.undefined
  /**
    * DICOM class type
    */
  var sopClass: oid
  /**
    * Description of instance
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Formal DICOM identifier for this instance
    */
  var uid: oid
}

object ImagingStudySeriesInstance {
  @scala.inline
  def apply(
    sopClass: oid,
    uid: oid,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _number: Element = null,
    _sopClass: Element = null,
    _title: Element = null,
    _uid: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null,
    number: Int | Double = null,
    title: String = null
  ): ImagingStudySeriesInstance = {
    val __obj = js.Dynamic.literal(sopClass = sopClass.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_number != null) __obj.updateDynamic("_number")(_number.asInstanceOf[js.Any])
    if (_sopClass != null) __obj.updateDynamic("_sopClass")(_sopClass.asInstanceOf[js.Any])
    if (_title != null) __obj.updateDynamic("_title")(_title.asInstanceOf[js.Any])
    if (_uid != null) __obj.updateDynamic("_uid")(_uid.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingStudySeriesInstance]
  }
}

