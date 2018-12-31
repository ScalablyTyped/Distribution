package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Codes in the value set
  */
trait ValueSetExpansionContains extends BackboneElement {
  /**
    * Contains extended information for property 'abstract'.
    */
  var _abstract: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'display'.
    */
  var _display: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'inactive'.
    */
  var _inactive: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  /**
    * If user cannot select this entry
    */
  var `abstract`: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Code - if blank, this is not a selectable code
    */
  var code: js.UndefOr[code] = js.undefined
  /**
    * Codes contained under this entry
    */
  var contains: js.UndefOr[js.Array[ValueSetExpansionContains]] = js.undefined
  /**
    * Additional representations for this item
    */
  var designation: js.UndefOr[js.Array[ValueSetComposeIncludeConceptDesignation]] = js.undefined
  /**
    * User display for the concept
    */
  var display: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If concept is inactive in the code system
    */
  var inactive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * System value for the code
    */
  var system: js.UndefOr[uri] = js.undefined
  /**
    * Version in which this code/display is defined
    */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

