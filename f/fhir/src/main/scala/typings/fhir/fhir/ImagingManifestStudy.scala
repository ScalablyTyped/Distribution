package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Study identity of the selected instances
  */
trait ImagingManifestStudy extends BackboneElement {
  /**
    * Contains extended information for property 'uid'.
    */
  var _uid: js.UndefOr[Element] = js.undefined
  /**
    * Study access service endpoint
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * Reference to ImagingStudy
    */
  var imagingStudy: js.UndefOr[Reference] = js.undefined
  /**
    * Series identity of the selected instances
    */
  var series: js.Array[ImagingManifestStudySeries]
  /**
    * Study instance UID
    */
  var uid: oid
}

object ImagingManifestStudy {
  @scala.inline
  def apply(
    series: js.Array[ImagingManifestStudySeries],
    uid: oid,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _uid: Element = null,
    endpoint: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    imagingStudy: Reference = null,
    modifierExtension: js.Array[Extension] = null
  ): ImagingManifestStudy = {
    val __obj = js.Dynamic.literal(series = series.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_uid != null) __obj.updateDynamic("_uid")(_uid.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (imagingStudy != null) __obj.updateDynamic("imagingStudy")(imagingStudy.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingManifestStudy]
  }
}

