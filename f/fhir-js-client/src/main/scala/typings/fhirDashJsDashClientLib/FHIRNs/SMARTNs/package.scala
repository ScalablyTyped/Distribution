package typings
package fhirDashJsDashClientLib.FHIRNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SMARTNs {
  /**
           * Funtion type returned by the fetchAllWithReferences method
           */
  type ResolveFn = js.Function2[/* resource */ Resource, /* reference */ Reference, Resource]
}
