package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNfsExport extends StObject {
  
  /**
    * Allow dev flag in NfsShare AllowedClientsRequest.
    */
  var allowDev: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Allow the setuid flag.
    */
  var allowSuid: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A CIDR range.
    */
  var cidr: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Either a single machine, identified by an ID, or a comma-separated list of machine IDs.
    */
  var machineId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Network to use to publish the export.
    */
  var networkId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Disable root squashing, which is a feature of NFS. Root squash is a special mapping of the remote superuser (root) identity when using identity authentication.
    */
  var noRootSquash: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Export permissions.
    */
  var permissions: js.UndefOr[String | Null] = js.undefined
}
object SchemaNfsExport {
  
  inline def apply(): SchemaNfsExport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNfsExport]
  }
  
  extension [Self <: SchemaNfsExport](x: Self) {
    
    inline def setAllowDev(value: Boolean): Self = StObject.set(x, "allowDev", value.asInstanceOf[js.Any])
    
    inline def setAllowDevNull: Self = StObject.set(x, "allowDev", null)
    
    inline def setAllowDevUndefined: Self = StObject.set(x, "allowDev", js.undefined)
    
    inline def setAllowSuid(value: Boolean): Self = StObject.set(x, "allowSuid", value.asInstanceOf[js.Any])
    
    inline def setAllowSuidNull: Self = StObject.set(x, "allowSuid", null)
    
    inline def setAllowSuidUndefined: Self = StObject.set(x, "allowSuid", js.undefined)
    
    inline def setCidr(value: String): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
    
    inline def setCidrNull: Self = StObject.set(x, "cidr", null)
    
    inline def setCidrUndefined: Self = StObject.set(x, "cidr", js.undefined)
    
    inline def setMachineId(value: String): Self = StObject.set(x, "machineId", value.asInstanceOf[js.Any])
    
    inline def setMachineIdNull: Self = StObject.set(x, "machineId", null)
    
    inline def setMachineIdUndefined: Self = StObject.set(x, "machineId", js.undefined)
    
    inline def setNetworkId(value: String): Self = StObject.set(x, "networkId", value.asInstanceOf[js.Any])
    
    inline def setNetworkIdNull: Self = StObject.set(x, "networkId", null)
    
    inline def setNetworkIdUndefined: Self = StObject.set(x, "networkId", js.undefined)
    
    inline def setNoRootSquash(value: Boolean): Self = StObject.set(x, "noRootSquash", value.asInstanceOf[js.Any])
    
    inline def setNoRootSquashNull: Self = StObject.set(x, "noRootSquash", null)
    
    inline def setNoRootSquashUndefined: Self = StObject.set(x, "noRootSquash", js.undefined)
    
    inline def setPermissions(value: String): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsNull: Self = StObject.set(x, "permissions", null)
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
  }
}
