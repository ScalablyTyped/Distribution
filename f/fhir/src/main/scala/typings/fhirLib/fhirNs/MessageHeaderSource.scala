package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message source application
  */
trait MessageHeaderSource extends BackboneElement {
  /**
    * Contains extended information for property 'endpoint'.
    */
  var _endpoint: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'software'.
    */
  var _software: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  /**
    * Human contact for problems
    */
  var contact: js.UndefOr[ContactPoint] = js.undefined
  /**
    * Actual message source address or id
    */
  var endpoint: uri
  /**
    * Name of system
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Name of software running the system
    */
  var software: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Version of software running
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object MessageHeaderSource {
  @scala.inline
  def apply(
    endpoint: uri,
    _endpoint: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _name: Element = null,
    _software: Element = null,
    _version: Element = null,
    contact: ContactPoint = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    modifierExtension: js.Array[Extension] = null,
    name: java.lang.String = null,
    software: java.lang.String = null,
    version: java.lang.String = null
  ): MessageHeaderSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endpoint")(endpoint)
    if (_endpoint != null) __obj.updateDynamic("_endpoint")(_endpoint)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_name != null) __obj.updateDynamic("_name")(_name)
    if (_software != null) __obj.updateDynamic("_software")(_software)
    if (_version != null) __obj.updateDynamic("_version")(_version)
    if (contact != null) __obj.updateDynamic("contact")(contact)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (modifierExtension != null) __obj.updateDynamic("modifierExtension")(modifierExtension)
    if (name != null) __obj.updateDynamic("name")(name)
    if (software != null) __obj.updateDynamic("software")(software)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[MessageHeaderSource]
  }
}

