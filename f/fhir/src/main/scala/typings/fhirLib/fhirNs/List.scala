package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information summarized from a list of other resources
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- fhirLib.fhirNs.Resource because Already inherited */ trait List extends DomainResource {
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'mode'.
    */
  var _mode: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.undefined
  /**
    * What the purpose of this list is
    */
  var code: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * When the list was prepared
    */
  var date: js.UndefOr[dateTime] = js.undefined
  /**
    * Why list is empty
    */
  var emptyReason: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Context in which list created
    */
  var encounter: js.UndefOr[Reference] = js.undefined
  /**
    * Entries in the list
    */
  var entry: js.UndefOr[js.Array[ListEntry]] = js.undefined
  /**
    * Business identifier
    */
  var identifier: js.UndefOr[js.Array[Identifier]] = js.undefined
  /**
    * working | snapshot | changes
    */
  var mode: code
  /**
    * Comments about the list
    */
  var note: js.UndefOr[js.Array[Annotation]] = js.undefined
  /**
    * What order the list has
    */
  var orderedBy: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * Who and/or what defined the list contents (aka Author)
    */
  var source: js.UndefOr[Reference] = js.undefined
  /**
    * current | retired | entered-in-error
    */
  var status: code
  /**
    * If all resources have the same subject
    */
  var subject: js.UndefOr[Reference] = js.undefined
  /**
    * Descriptive name for the list
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object List {
  @scala.inline
  def apply(
    mode: code,
    status: code,
    _date: Element = null,
    _id: Element = null,
    _implicitRules: Element = null,
    _language: Element = null,
    _mode: Element = null,
    _resourceType: Element = null,
    _status: Element = null,
    _title: Element = null,
    code: CodeableConcept = null,
    contained: js.Array[Resource] = null,
    date: dateTime = null,
    emptyReason: CodeableConcept = null,
    encounter: Reference = null,
    entry: js.Array[ListEntry] = null,
    extension: js.Array[Extension] = null,
    id: id = null,
    identifier: js.Array[Identifier] = null,
    implicitRules: uri = null,
    language: code = null,
    meta: Meta = null,
    modifierExtension: js.Array[Extension] = null,
    note: js.Array[Annotation] = null,
    orderedBy: CodeableConcept = null,
    resourceType: code = null,
    source: Reference = null,
    subject: Reference = null,
    text: Narrative = null,
    title: java.lang.String = null
  ): List = {
    val __obj = js.Dynamic.literal(mode = mode, status = status)
    if (_date != null) __obj.updateDynamic("_date")(_date)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_implicitRules != null) __obj.updateDynamic("_implicitRules")(_implicitRules)
    if (_language != null) __obj.updateDynamic("_language")(_language)
    if (_mode != null) __obj.updateDynamic("_mode")(_mode)
    if (_resourceType != null) __obj.updateDynamic("_resourceType")(_resourceType)
    if (_status != null) __obj.updateDynamic("_status")(_status)
    if (_title != null) __obj.updateDynamic("_title")(_title)
    if (code != null) __obj.updateDynamic("code")(code)
    if (contained != null) __obj.updateDynamic("contained")(contained)
    if (date != null) __obj.updateDynamic("date")(date)
    if (emptyReason != null) __obj.updateDynamic("emptyReason")(emptyReason)
    if (encounter != null) __obj.updateDynamic("encounter")(encounter)
    if (entry != null) __obj.updateDynamic("entry")(entry)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (identifier != null) __obj.updateDynamic("identifier")(identifier)
    if (implicitRules != null) __obj.updateDynamic("implicitRules")(implicitRules)
    if (language != null) __obj.updateDynamic("language")(language)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (note != null) __obj.updateDynamic("note")(note)
    if (orderedBy != null) __obj.updateDynamic("orderedBy")(orderedBy)
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType)
    if (source != null) __obj.updateDynamic("source")(source)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    if (text != null) __obj.updateDynamic("text")(text)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[List]
  }
}

