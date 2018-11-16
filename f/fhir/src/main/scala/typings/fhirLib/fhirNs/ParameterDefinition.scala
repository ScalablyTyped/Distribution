package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Definition of a parameter to a module
     */

trait ParameterDefinition extends Element {
  /**
           * Contains extended information for property 'documentation'.
           */
  var _documentation: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'max'.
           */
  var _max: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'min'.
           */
  var _min: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'name'.
           */
  var _name: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'type'.
           */
  var _type: js.UndefOr[Element] = js.undefined
  /**
           * Contains extended information for property 'use'.
           */
  var _use: js.UndefOr[Element] = js.undefined
  /**
           * A brief description of the parameter
           */
  var documentation: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Maximum cardinality (a number of *)
           */
  var max: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Minimum cardinality
           */
  var min: js.UndefOr[integer] = js.undefined
  /**
           * Name used to access the parameter value
           */
  var name: js.UndefOr[code] = js.undefined
  /**
           * What profile the value is expected to be
           */
  var profile: js.UndefOr[Reference] = js.undefined
  /**
           * What type of value
           */
  var `type`: code
  /**
           * in | out
           */
  var use: code
}

