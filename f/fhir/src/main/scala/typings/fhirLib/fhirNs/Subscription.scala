package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A server push subscription criteria
  */
trait Subscription extends DomainResource {
  /**
    * Contains extended information for property 'criteria'.
    */
  var _criteria: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'end'.
    */
  var _end: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'error'.
    */
  var _error: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'reason'.
    */
  var _reason: js.UndefOr[Element] = js.undefined
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  /**
    * The channel on which to report matches to the criteria
    */
  var channel: SubscriptionChannel
  /**
    * Contact details for source (e.g. troubleshooting)
    */
  var contact: js.UndefOr[js.Array[ContactPoint]] = js.undefined
  /**
    * Rule for server push criteria
    */
  var criteria: java.lang.String
  /**
    * When to automatically delete the subscription
    */
  var end: js.UndefOr[instant] = js.undefined
  /**
    * Latest error note
    */
  var error: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Description of why this subscription was created
    */
  var reason: java.lang.String
  /**
    * requested | active | error | off
    */
  var status: code
  /**
    * A tag to add to matching resources
    */
  var tag: js.UndefOr[js.Array[Coding]] = js.undefined
}

