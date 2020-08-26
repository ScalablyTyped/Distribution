package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkConfigurationCatalog extends js.Object {
  var configurations: js.UndefOr[js.Array[NetworkConfiguration]] = js.native
}

object NetworkConfigurationCatalog {
  @scala.inline
  def apply(): NetworkConfigurationCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConfigurationCatalog]
  }
  @scala.inline
  implicit class NetworkConfigurationCatalogOps[Self <: NetworkConfigurationCatalog] (val x: Self) extends AnyVal {
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
    def setConfigurationsVarargs(value: NetworkConfiguration*): Self = this.set("configurations", js.Array(value :_*))
    @scala.inline
    def setConfigurations(value: js.Array[NetworkConfiguration]): Self = this.set("configurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfigurations: Self = this.set("configurations", js.undefined)
  }
  
}

