package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Series identity of the selected instances
  */
trait ImagingManifestStudySeries extends BackboneElement {
  /**
    * Contains extended information for property 'uid'.
    */
  var _uid: js.UndefOr[Element] = js.undefined
  /**
    * Series access endpoint
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
    * The selected instance
    */
  var instance: js.Array[ImagingManifestStudySeriesInstance]
  /**
    * Series instance UID
    */
  var uid: oid
}

object ImagingManifestStudySeries {
  @scala.inline
  def apply(
    instance: js.Array[ImagingManifestStudySeriesInstance],
    uid: oid,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _uid: Element = null,
    endpoint: js.Array[Reference] = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null
  ): ImagingManifestStudySeries = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("instance")(instance)
    __obj.updateDynamic("uid")(uid)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_uid != null) __obj.updateDynamic("_uid")(_uid)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[ImagingManifestStudySeries]
  }
}

