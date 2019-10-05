package typings.gapiDotClientDotAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  /** Relative name of the service within the application. Example: default.@OutputOnly */
  var id: js.UndefOr[String] = js.undefined
  /** Full path to the Service resource in the API. Example: apps/myapp/services/default.@OutputOnly */
  var name: js.UndefOr[String] = js.undefined
  /** Mapping that defines fractional HTTP traffic diversion to different versions within the service. */
  var split: js.UndefOr[TrafficSplit] = js.undefined
}

object Service {
  @scala.inline
  def apply(id: String = null, name: String = null, split: TrafficSplit = null): Service = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (split != null) __obj.updateDynamic("split")(split)
    __obj.asInstanceOf[Service]
  }
}

