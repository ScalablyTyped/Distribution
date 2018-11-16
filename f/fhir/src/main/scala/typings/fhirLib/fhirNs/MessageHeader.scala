package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * A resource that describes a message that is exchanged between systems
     */

trait MessageHeader extends DomainResource {
  /**
           * Contains extended information for property 'timestamp'.
           */
  var _timestamp: js.UndefOr[Element] = js.undefined
  /**
           * The source of the decision
           */
  var author: js.UndefOr[Reference] = js.undefined
  /**
           * Message destination application(s)
           */
  var destination: js.UndefOr[js.Array[MessageHeaderDestination]] = js.undefined
  /**
           * The source of the data entry
           */
  var enterer: js.UndefOr[Reference] = js.undefined
  /**
           * Code for the event this message represents
           */
  var event: Coding
  /**
           * The actual content of the message
           */
  var focus: js.UndefOr[js.Array[Reference]] = js.undefined
  /**
           * Cause of event
           */
  var reason: js.UndefOr[CodeableConcept] = js.undefined
  /**
           * Intended "real-world" recipient for the data
           */
  var receiver: js.UndefOr[Reference] = js.undefined
  /**
           * If this is a reply to prior message
           */
  var response: js.UndefOr[MessageHeaderResponse] = js.undefined
  /**
           * Final responsibility for event
           */
  var responsible: js.UndefOr[Reference] = js.undefined
  /**
           * Real world sender of the message
           */
  var sender: js.UndefOr[Reference] = js.undefined
  /**
           * Message source application
           */
  var source: MessageHeaderSource
  /**
           * Time that the message was sent
           */
  var timestamp: instant
}

