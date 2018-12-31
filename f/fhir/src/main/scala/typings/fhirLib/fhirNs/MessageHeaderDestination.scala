package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message destination application(s)
  */
trait MessageHeaderDestination extends BackboneElement {
  /**
    * Contains extended information for property 'endpoint'.
    */
  var _endpoint: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  /**
    * Actual destination address or id
    */
  var endpoint: uri
  /**
    * Name of system
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Particular delivery destination within the destination
    */
  var target: js.UndefOr[Reference] = js.undefined
}

