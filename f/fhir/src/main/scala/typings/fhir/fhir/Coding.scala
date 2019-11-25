package typings.fhir.fhir

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
  var code: js.UndefOr[typings.fhir.fhir.code] = js.undefined
  /**
    * Representation defined by the system
    */
  var display: js.UndefOr[String] = js.undefined
  /**
    * Identity of the terminology system
    */
  var system: js.UndefOr[uri] = js.undefined
  /**
    * If this coding was chosen directly by the user
    */
  var userSelected: js.UndefOr[Boolean] = js.undefined
  /**
    * Version of the system - if relevant
    */
  var version: js.UndefOr[String] = js.undefined
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
    display: String = null,
    extension: js.Array[Extension] = null,
    fhir_comments: js.Array[String] = null,
    id: String = null,
    system: uri = null,
    userSelected: js.UndefOr[Boolean] = js.undefined,
    version: String = null
  ): Coding = {
    val __obj = js.Dynamic.literal()
    if (_code != null) __obj.updateDynamic("_code")(_code.asInstanceOf[js.Any])
    if (_display != null) __obj.updateDynamic("_display")(_display.asInstanceOf[js.Any])
    if (_fhir_comments != null) __obj.updateDynamic("_fhir_comments")(_fhir_comments.asInstanceOf[js.Any])
    if (_id != null) __obj.updateDynamic("_id")(_id.asInstanceOf[js.Any])
    if (_system != null) __obj.updateDynamic("_system")(_system.asInstanceOf[js.Any])
    if (_userSelected != null) __obj.updateDynamic("_userSelected")(_userSelected.asInstanceOf[js.Any])
    if (_version != null) __obj.updateDynamic("_version")(_version.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (extension != null) __obj.updateDynamic("extension")(extension.asInstanceOf[js.Any])
    if (fhir_comments != null) __obj.updateDynamic("fhir_comments")(fhir_comments.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (system != null) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    if (!js.isUndefined(userSelected)) __obj.updateDynamic("userSelected")(userSelected.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coding]
  }
}

