package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An identifier intended for computation
  */
trait Identifier extends Element {
  /**
    * Contains extended information for property 'system'.
    */
  var _system: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'use'.
    */
  var _use: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.undefined
  /**
    * Organization that issued id (may be just text)
    */
  var assigner: js.UndefOr[Reference] = js.undefined
  /**
    * Time period when id is/was valid for use
    */
  var period: js.UndefOr[Period] = js.undefined
  /**
    * The namespace for the identifier value
    */
  var system: js.UndefOr[uri] = js.undefined
  /**
    * Description of identifier
    */
  var `type`: js.UndefOr[CodeableConcept] = js.undefined
  /**
    * usual | official | temp | secondary (If known)
    */
  var use: js.UndefOr[code] = js.undefined
  /**
    * The value that is unique
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

