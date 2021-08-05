package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for an always-on VPN connection.
  */
trait SchemaAlwaysOnVpnPackage extends StObject {
  
  /**
    * Disallows networking when the VPN is not connected.
    */
  var lockdownEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The package name of the VPN app.
    */
  var packageName: js.UndefOr[String] = js.undefined
}
object SchemaAlwaysOnVpnPackage {
  
  inline def apply(): SchemaAlwaysOnVpnPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAlwaysOnVpnPackage]
  }
  
  extension [Self <: SchemaAlwaysOnVpnPackage](x: Self) {
    
    inline def setLockdownEnabled(value: Boolean): Self = StObject.set(x, "lockdownEnabled", value.asInstanceOf[js.Any])
    
    inline def setLockdownEnabledUndefined: Self = StObject.set(x, "lockdownEnabled", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}
