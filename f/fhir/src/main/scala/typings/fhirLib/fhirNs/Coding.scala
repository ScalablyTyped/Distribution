package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A reference to a code defined by a terminology system
  */
trait Coding extends Element {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'userSelected'.
    */
  var _userSelected: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  /**
    * Symbol in syntax defined by the system
    */
  var code: js.UndefOr[code] = js.undefined
  /**
    * Representation defined by the system
    */
  var display: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Identity of the terminology system
    */
  var system: js.UndefOr[uri] = js.undefined
  /**
    * If this coding was chosen directly by the user
    */
  var userSelected: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Version of the system - if relevant
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Coding {
  @scala.inline
  def apply(
    _code: Element = null,
    _display: Element = null,
    _fhir_comments: js.Array[Element] = null,
    _id: Element = null,
    _system: Element = null,
    _userSelected: Element = null,
    _version: Element = null,
    code: code = null,
    display: java.lang.String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[java.lang.String] = null,
    id: java.lang.String = null,
    system: uri = null,
    userSelected: js.UndefOr[scala.Boolean] = js.undefined,
    version: java.lang.String = null
  ): Coding = {
    val __obj = js.Dynamic.literal()
    if (_code != null) __obj.updateDynamic("_code")(_code)
    if (_display != null) __obj.updateDynamic("_display")(_display)
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments)
    if (_id != null) __obj.updateDynamic("_id")(_id)
    if (_system != null) __obj.updateDynamic("_system")(_system)
    if (_userSelected != null) __obj.updateDynamic("_userSelected")(_userSelected)
    if (_version != null) __obj.updateDynamic("_version")(_version)
    if (code != null) __obj.updateDynamic("code")(code)
    if (display != null) __obj.updateDynamic("display")(display)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (system != null) __obj.updateDynamic("system")(system)
    if (!js.isUndefined(userSelected)) __obj.updateDynamic("userSelected")(userSelected)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Coding]
  }
}

