package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkConfiguration extends js.Object {
  /** The emulation rule applying to the download traffic */
  var downRule: js.UndefOr[TrafficRule] = js.native
  /**
    * The unique opaque id for this network traffic configuration
    * @OutputOnly
    */
  var id: js.UndefOr[String] = js.native
  /** The emulation rule applying to the upload traffic */
  var upRule: js.UndefOr[TrafficRule] = js.native
}

object NetworkConfiguration {
  @scala.inline
  def apply(): NetworkConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConfiguration]
  }
  @scala.inline
  implicit class NetworkConfigurationOps[Self <: NetworkConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDownRule(value: TrafficRule): Self = this.set("downRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDownRule: Self = this.set("downRule", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setUpRule(value: TrafficRule): Self = this.set("upRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpRule: Self = this.set("upRule", js.undefined)
  }
  
}

