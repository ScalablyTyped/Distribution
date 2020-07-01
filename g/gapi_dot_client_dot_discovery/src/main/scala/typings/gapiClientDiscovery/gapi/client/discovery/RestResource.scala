package typings.gapiClientDiscovery.gapi.client.discovery

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestResource extends js.Object {
  /** Methods on this resource. */
  var methods: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: gapi.client.discovery.gapi.client.discovery.RestMethod}
    */ typings.gapiClientDiscovery.gapiClientDiscoveryStrings.RestResource with TopLevel[js.Any]
  ] = js.undefined
  /** Sub-resources on this resource. */
  var resources: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: gapi.client.discovery.gapi.client.discovery.RestResource}
    */ typings.gapiClientDiscovery.gapiClientDiscoveryStrings.RestResource with TopLevel[js.Any]
  ] = js.undefined
}

object RestResource {
  @scala.inline
  def apply(
    methods: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: gapi.client.discovery.gapi.client.discovery.RestMethod}
    */ typings.gapiClientDiscovery.gapiClientDiscoveryStrings.RestResource with TopLevel[js.Any] = null,
    resources: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: gapi.client.discovery.gapi.client.discovery.RestResource}
    */ typings.gapiClientDiscovery.gapiClientDiscoveryStrings.RestResource with TopLevel[js.Any] = null
  ): RestResource = {
    val __obj = js.Dynamic.literal()
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestResource]
  }
}

