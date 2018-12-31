package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The channel on which to report matches to the criteria
  */
trait SubscriptionChannel extends BackboneElement {
  /**
    * Contains extended information for property 'endpoint'.
    */
  var _endpoint: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'header'.
    */
  var _header: js.UndefOr[js.Array[Element]] = js.undefined
  /**
    * Contains extended information for property 'payload'.
    */
  var _payload: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.undefined
  /**
    * Where the channel points to
    */
  var endpoint: js.UndefOr[uri] = js.undefined
  /**
    * Usage depends on the channel type
    */
  var header: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Mimetype to send, or omit for no payload
    */
  var payload: js.UndefOr[java.lang.String] = js.undefined
  /**
    * rest-hook | websocket | email | sms | message
    */
  var `type`: code
}

