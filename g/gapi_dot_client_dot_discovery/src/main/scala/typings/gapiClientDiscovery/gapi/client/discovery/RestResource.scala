package typings.gapiClientDiscovery.gapi.client.discovery

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestResource extends js.Object {
  /** Methods on this resource. */
  var methods: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: gapi.client.discovery.gapi.client.discovery.RestMethod}
    */ typings.gapiClientDiscovery.gapiClientDiscoveryStrings.RestResource with TopLevel[js.Any]
  ] = js.native
  /** Sub-resources on this resource. */
  var resources: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: gapi.client.discovery.gapi.client.discovery.RestResource}
    */ typings.gapiClientDiscovery.gapiClientDiscoveryStrings.RestResource with TopLevel[js.Any]
  ] = js.native
}

object RestResource {
  @scala.inline
  def apply(): RestResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestResource]
  }
  @scala.inline
  implicit class RestResourceOps[Self <: RestResource] (val x: Self) extends AnyVal {
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
    def setMethods(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: gapi.client.discovery.gapi.client.discovery.RestMethod}
      */ typings.gapiClientDiscovery.gapiClientDiscoveryStrings.RestResource with TopLevel[js.Any]
    ): Self = this.set("methods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    @scala.inline
    def setResources(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: gapi.client.discovery.gapi.client.discovery.RestResource}
      */ typings.gapiClientDiscovery.gapiClientDiscoveryStrings.RestResource with TopLevel[js.Any]
    ): Self = this.set("resources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
  }
  
}

