package typings.gapiClientResourceviews.gapi.client.resourceviews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceEndpoint extends js.Object {
  /** The name of the service endpoint. */
  var name: js.UndefOr[String] = js.undefined
  /** The port of the service endpoint. */
  var port: js.UndefOr[Double] = js.undefined
}

object ServiceEndpoint {
  @scala.inline
  def apply(name: String = null, port: js.UndefOr[Double] = js.undefined): ServiceEndpoint = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceEndpoint]
  }
}

