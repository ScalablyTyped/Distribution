package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Who, What, When for a set of resources
     */

trait Provenance extends DomainResource {
  /**
           * Contains extended information for property 'policy'.
           */
  var _policy: js.UndefOr[js.Array[Element]] = js.undefined
  /**
           * Contains extended information for property 'recorded'.
           */
  var _recorded: js.UndefOr[Element] = js.undefined
  /**
           * Activity that occurred
           */
  var activity: js.UndefOr[Coding] = js.undefined
  /**
           * Actor involved
           */
  var agent: js.Array[ProvenanceAgent]
  /**
           * An entity used in this activity
           */
  var entity: js.UndefOr[js.Array[ProvenanceEntity]] = js.undefined
  /**
           * Where the activity occurred, if relevant
           */
  var location: js.UndefOr[Reference] = js.undefined
  /**
           * When the activity occurred
           */
  var period: js.UndefOr[Period] = js.undefined
  /**
           * Policy or plan the activity was defined by
           */
  var policy: js.UndefOr[js.Array[uri]] = js.undefined
  /**
           * Reason the activity is occurring
           */
  var reason: js.UndefOr[js.Array[Coding]] = js.undefined
  /**
           * When the activity was recorded / updated
           */
  var recorded: instant
  /**
           * Signature on target
           */
  var signature: js.UndefOr[js.Array[Signature]] = js.undefined
  /**
           * Target Reference(s) (usually version specific)
           */
  var target: js.Array[Reference]
}

