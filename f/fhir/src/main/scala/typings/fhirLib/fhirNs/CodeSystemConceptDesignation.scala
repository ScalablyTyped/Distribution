package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Additional representations for the concept
  */
trait CodeSystemConceptDesignation extends BackboneElement {
  /**
    * Contains extended information for property 'language'.
    */
  var _language: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'value'.
    */
  var _value: js.UndefOr[Element] = js.undefined
  /**
    * Human language of the designation
    */
  var language: js.UndefOr[code] = js.undefined
  /**
    * Details how this designation would be used
    */
  var use: js.UndefOr[Coding] = js.undefined
  /**
    * The text value for this designation
    */
  var value: java.lang.String
}

