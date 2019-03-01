package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A participant in the test execution, either the execution engine, a client, or a server
  */
trait TestReportParticipant extends BackboneElement {
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'uri'.
    */
  var _uri: js.UndefOr[Element] = js.undefined
  /**
    * The display name of the participant
    */
  var display: js.UndefOr[java.lang.String] = js.undefined
  /**
    * test-engine | client | server
    */
  var `type`: code
  /**
    * The uri of the participant. An absolute URL is preferred
    */
  var uri: uri
}

object TestReportParticipant {
  @scala.inline
  def apply(
    `type`: code,
    uri: uri,
    _display: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _type: Element = null,
    _uri: Element = null,
    display: java.lang.String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null
  ): TestReportParticipant = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("uri")(uri)
    if (_display != null) __obj.updateDynamic("_display")(_display)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_type != null) __obj.updateDynamic("_type")(_type)
    if (_uri != null) __obj.updateDynamic("_uri")(_uri)
    if (display != null) __obj.updateDynamic("display")(display)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    __obj.asInstanceOf[TestReportParticipant]
  }
}

