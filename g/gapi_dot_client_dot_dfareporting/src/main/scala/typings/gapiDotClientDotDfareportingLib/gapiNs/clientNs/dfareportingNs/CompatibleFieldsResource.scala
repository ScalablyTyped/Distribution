package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CompatibleFieldsResource extends js.Object {
  /**
               * Returns the fields that are compatible to be selected in the respective sections of a report criteria, given the fields already selected in the input
               * report and user permissions.
               */
  def query(request: gapiDotClientDotDfareportingLib.Anon_ProfileId): gapiDotClientLib.gapiNs.clientNs.Request[CompatibleFields]
}

