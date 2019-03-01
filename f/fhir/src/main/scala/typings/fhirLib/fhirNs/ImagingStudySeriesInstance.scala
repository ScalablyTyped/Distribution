package typings
package fhirLib.fhirNs

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
  var title: js.UndefOr[java.lang.String] = js.undefined
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
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    number: js.UndefOr[unsignedInt] = js.undefined,
    title: java.lang.String = null
  ): ImagingStudySeriesInstance = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sopClass")(sopClass)
    __obj.updateDynamic("uid")(uid)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_number != null) __obj.updateDynamic("_number")(_number)
    if (_sopClass != null) __obj.updateDynamic("_sopClass")(_sopClass)
    if (_title != null) __obj.updateDynamic("_title")(_title)
    if (_uid != null) __obj.updateDynamic("_uid")(_uid)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ImagingStudySeriesInstance]
  }
}

