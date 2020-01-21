package typings.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedLocation extends js.Object {
  /** The name of the failed location. */
  var name: js.UndefOr[String] = js.undefined
}

object FailedLocation {
  @scala.inline
  def apply(name: String = null): FailedLocation = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedLocation]
  }
}

