package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkConfiguration extends js.Object {
  /** The emulation rule applying to the download traffic */
  var downRule: js.UndefOr[TrafficRule] = js.undefined
  /**
    * The unique opaque id for this network traffic configuration
    * @OutputOnly
    */
  var id: js.UndefOr[String] = js.undefined
  /** The emulation rule applying to the upload traffic */
  var upRule: js.UndefOr[TrafficRule] = js.undefined
}

object NetworkConfiguration {
  @scala.inline
  def apply(downRule: TrafficRule = null, id: String = null, upRule: TrafficRule = null): NetworkConfiguration = {
    val __obj = js.Dynamic.literal()
    if (downRule != null) __obj.updateDynamic("downRule")(downRule.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (upRule != null) __obj.updateDynamic("upRule")(upRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkConfiguration]
  }
}

