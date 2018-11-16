package typings
package fhirLib.fhirNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Audit Event Reporter
     */

trait AuditEventSource extends BackboneElement {
  /**
           * Contains extended information for property 'site'.
           */
  var _site: js.UndefOr[Element] = js.undefined
  /**
           * The identity of source detecting the event
           */
  var identifier: Identifier
  /**
           * Logical source location within the enterprise
           */
  var site: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The type of source where event originated
           */
  var `type`: js.UndefOr[js.Array[Coding]] = js.undefined
}

