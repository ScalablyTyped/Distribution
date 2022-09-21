package typings.googleapis.baremetalsolutionV2Mod.baremetalsolutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAllowedClient extends StObject {
  
  /**
    * Allow dev flag. Which controls whether to allow creation of devices.
    */
  var allowDev: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Allow the setuid flag.
    */
  var allowSuid: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The subnet of IP addresses permitted to access the share.
    */
  var allowedClientsCidr: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Mount permissions.
    */
  var mountPermissions: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The network the access point sits on.
    */
  var network: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The path to access NFS, in format shareIP:/InstanceID InstanceID is the generated ID instead of customer provided name. example like "10.0.0.0:/g123456789-nfs001"
    */
  var nfsPath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Disable root squashing, which is a feature of NFS. Root squash is a special mapping of the remote superuser (root) identity when using identity authentication.
    */
  var noRootSquash: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The IP address of the share on this network.
    */
  var shareIp: js.UndefOr[String | Null] = js.undefined
}
object SchemaAllowedClient {
  
  inline def apply(): SchemaAllowedClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAllowedClient]
  }
  
  extension [Self <: SchemaAllowedClient](x: Self) {
    
    inline def setAllowDev(value: Boolean): Self = StObject.set(x, "allowDev", value.asInstanceOf[js.Any])
    
    inline def setAllowDevNull: Self = StObject.set(x, "allowDev", null)
    
    inline def setAllowDevUndefined: Self = StObject.set(x, "allowDev", js.undefined)
    
    inline def setAllowSuid(value: Boolean): Self = StObject.set(x, "allowSuid", value.asInstanceOf[js.Any])
    
    inline def setAllowSuidNull: Self = StObject.set(x, "allowSuid", null)
    
    inline def setAllowSuidUndefined: Self = StObject.set(x, "allowSuid", js.undefined)
    
    inline def setAllowedClientsCidr(value: String): Self = StObject.set(x, "allowedClientsCidr", value.asInstanceOf[js.Any])
    
    inline def setAllowedClientsCidrNull: Self = StObject.set(x, "allowedClientsCidr", null)
    
    inline def setAllowedClientsCidrUndefined: Self = StObject.set(x, "allowedClientsCidr", js.undefined)
    
    inline def setMountPermissions(value: String): Self = StObject.set(x, "mountPermissions", value.asInstanceOf[js.Any])
    
    inline def setMountPermissionsNull: Self = StObject.set(x, "mountPermissions", null)
    
    inline def setMountPermissionsUndefined: Self = StObject.set(x, "mountPermissions", js.undefined)
    
    inline def setNetwork(value: String): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkNull: Self = StObject.set(x, "network", null)
    
    inline def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    inline def setNfsPath(value: String): Self = StObject.set(x, "nfsPath", value.asInstanceOf[js.Any])
    
    inline def setNfsPathNull: Self = StObject.set(x, "nfsPath", null)
    
    inline def setNfsPathUndefined: Self = StObject.set(x, "nfsPath", js.undefined)
    
    inline def setNoRootSquash(value: Boolean): Self = StObject.set(x, "noRootSquash", value.asInstanceOf[js.Any])
    
    inline def setNoRootSquashNull: Self = StObject.set(x, "noRootSquash", null)
    
    inline def setNoRootSquashUndefined: Self = StObject.set(x, "noRootSquash", js.undefined)
    
    inline def setShareIp(value: String): Self = StObject.set(x, "shareIp", value.asInstanceOf[js.Any])
    
    inline def setShareIpNull: Self = StObject.set(x, "shareIp", null)
    
    inline def setShareIpUndefined: Self = StObject.set(x, "shareIp", js.undefined)
  }
}
