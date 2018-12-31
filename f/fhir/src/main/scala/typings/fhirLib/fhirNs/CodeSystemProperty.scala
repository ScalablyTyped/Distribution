package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional information supplied about each concept
  */
trait CodeSystemProperty extends BackboneElement {
  /**
    * Contains extended information for property 'code'.
    */
  var _code: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'uri'.
    */
  var _uri: js.UndefOr[Element] = js.undefined
  /**
    * Identifies the property on the concepts, and when referred to in operations
    */
  var code: code
  /**
    * Why the property is defined, and/or what it conveys
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * code | Coding | string | integer | boolean | dateTime
    */
  var `type`: code
  /**
    * Formal identifier for the property
    */
  var uri: js.UndefOr[uri] = js.undefined
}

