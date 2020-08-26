package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestEnvironmentCatalog extends js.Object {
  /** Android devices suitable for running Android Instrumentation Tests. */
  var androidDeviceCatalog: js.UndefOr[AndroidDeviceCatalog] = js.native
  /** Supported network configurations */
  var networkConfigurationCatalog: js.UndefOr[NetworkConfigurationCatalog] = js.native
}

object TestEnvironmentCatalog {
  @scala.inline
  def apply(): TestEnvironmentCatalog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestEnvironmentCatalog]
  }
  @scala.inline
  implicit class TestEnvironmentCatalogOps[Self <: TestEnvironmentCatalog] (val x: Self) extends AnyVal {
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
    def setAndroidDeviceCatalog(value: AndroidDeviceCatalog): Self = this.set("androidDeviceCatalog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidDeviceCatalog: Self = this.set("androidDeviceCatalog", js.undefined)
    @scala.inline
    def setNetworkConfigurationCatalog(value: NetworkConfigurationCatalog): Self = this.set("networkConfigurationCatalog", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkConfigurationCatalog: Self = this.set("networkConfigurationCatalog", js.undefined)
  }
  
}

