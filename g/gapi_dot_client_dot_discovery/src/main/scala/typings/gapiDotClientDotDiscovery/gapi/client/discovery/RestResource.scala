package typings.gapiDotClientDotDiscovery.gapi.client.discovery

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestResource extends js.Object {
  /** Methods on this resource. */
  var methods: js.UndefOr[Record[String, RestMethod]] = js.undefined
  /** Sub-resources on this resource. */
  var resources: js.UndefOr[Record[String, RestResource]] = js.undefined
}

object RestResource {
  @scala.inline
  def apply(methods: Record[String, RestMethod] = null, resources: Record[String, RestResource] = null): RestResource = {
    val __obj = js.Dynamic.literal()
    if (methods != null) __obj.updateDynamic("methods")(methods)
    if (resources != null) __obj.updateDynamic("resources")(resources)
    __obj.asInstanceOf[RestResource]
  }
}

