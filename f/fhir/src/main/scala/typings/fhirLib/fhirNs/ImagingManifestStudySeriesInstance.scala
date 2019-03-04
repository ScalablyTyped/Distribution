package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The selected instance
  */
trait ImagingManifestStudySeriesInstance extends BackboneElement {
  /**
    * Contains extended information for property 'sopClass'.
    */
  var _sopClass: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'uid'.
    */
  var _uid: js.UndefOr[Element] = js.undefined
  /**
    * SOP class UID of instance
    */
  var sopClass: oid
  /**
    * Selected instance UID
    */
  var uid: oid
}

object ImagingManifestStudySeriesInstance {
  @scala.inline
  def apply(
    sopClass: oid,
    uid: oid,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _sopClass: Element = null,
    _uid: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null
  ): ImagingManifestStudySeriesInstance = {
    val __obj = js.Dynamic.literal(sopClass = sopClass, uid = uid)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_sopClass != null) __obj.updateDynamic("_sopClass")(_sopClass)
    if (_uid != null) __obj.updateDynamic("_uid")(_uid)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[ImagingManifestStudySeriesInstance]
  }
}

