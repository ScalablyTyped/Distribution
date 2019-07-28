package typings.fhir.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Who or what is in group
  */
trait GroupMember extends BackboneElement {
  /**
    * Contains extended information for property 'inactive'.
    */
  var _inactive: js.UndefOr[Element] = js.undefined
  /**
    * Reference to the group member
    */
  var entity: Reference
  /**
    * If member is no longer in group
    */
  var inactive: js.UndefOr[Boolean] = js.undefined
  /**
    * Period member belonged to the group
    */
  var period: js.UndefOr[Period] = js.undefined
}

object GroupMember {
  @scala.inline
  def apply(
    entity: Reference,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _inactive: Element = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    inactive: js.UndefOr[Boolean] = js.undefined,
    modifierExtension: js.Array[Extension] = null,
    period: Period = null
  ): GroupMember = {
    val __obj = js.Dynamic.literal(entity = entity)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_inactive != null) __obj.updateDynamic("_inactive")(_inactive)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(inactive)) __obj.updateDynamic("inactive")(inactive)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (period != null) __obj.updateDynamic("period")(period)
    __obj.asInstanceOf[GroupMember]
  }
}

