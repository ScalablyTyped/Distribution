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
  def query(request: gapiDotClientDotDfareportingLib.Anon_AltFieldsKey): gapiDotClientLib.gapiNs.clientNs.Request[CompatibleFields]
}

object CompatibleFieldsResource {
  @scala.inline
  def apply(
    query: js.Function1[
      gapiDotClientDotDfareportingLib.Anon_AltFieldsKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[CompatibleFields]
    ]
  ): CompatibleFieldsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[CompatibleFieldsResource]
  }
}

