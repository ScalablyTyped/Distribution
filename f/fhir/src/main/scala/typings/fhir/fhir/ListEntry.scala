package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Entries in the list
  */
trait ListEntry extends BackboneElement {
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'deleted'.
    */
  var _deleted: js.UndefOr[Element] = js.undefined
  /**
    * When item added to list
    */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
    * If this item is actually marked as deleted
    */
  var deleted: js.UndefOr[Boolean] = js.undefined
  /**
    * Status/Workflow information about this item
    */
  var flag: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Actual entry
    */
  var item: Reference
}

object ListEntry {
  @scala.inline
  def apply(
    item: Reference,
    _date: Element = null,
    _deleted: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    date: dateTime = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    flag: CodeableConcept = null,
    id: String = null,
    modifierExtension: js.Array[Extension] = null
  ): ListEntry = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    if (_date != null) __obj.updateDynamic("_date")(_date.asInstanceOf[js.Any])
    if (_deleted != null) __obj.updateDynamic("_deleted")(_deleted.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.get.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEntry]
  }
}

