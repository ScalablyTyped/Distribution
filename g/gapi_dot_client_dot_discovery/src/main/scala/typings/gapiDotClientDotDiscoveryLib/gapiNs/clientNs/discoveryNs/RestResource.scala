package typings
package gapiDotClientDotDiscoveryLib.gapiNs.clientNs.discoveryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestResource extends js.Object {
  /** Methods on this resource. */
  var methods: js.UndefOr[stdLib.Record[java.lang.String, RestMethod]] = js.undefined
  /** Sub-resources on this resource. */
  var resources: js.UndefOr[stdLib.Record[java.lang.String, RestResource]] = js.undefined
}

object RestResource {
  @scala.inline
  def apply(
    methods: stdLib.Record[java.lang.String, RestMethod] = null,
    resources: stdLib.Record[java.lang.String, RestResource] = null
  ): RestResource = {
    val __obj = js.Dynamic.literal()
    if (methods != null) __obj.updateDynamic("methods")(methods)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    __obj.asInstanceOf[RestResource]
  }
}

