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

