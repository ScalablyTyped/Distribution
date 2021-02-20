package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration for an always-on VPN connection.
  */
@js.native
trait SchemaAlwaysOnVpnPackage extends StObject {
  
  /**
    * Disallows networking when the VPN is not connected.
    */
  var lockdownEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The package name of the VPN app.
    */
  var packageName: js.UndefOr[String] = js.native
}
object SchemaAlwaysOnVpnPackage {
  
  @scala.inline
  def apply(): SchemaAlwaysOnVpnPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAlwaysOnVpnPackage]
  }
  
  @scala.inline
  implicit class SchemaAlwaysOnVpnPackageMutableBuilder[Self <: SchemaAlwaysOnVpnPackage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLockdownEnabled(value: Boolean): Self = StObject.set(x, "lockdownEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockdownEnabledUndefined: Self = StObject.set(x, "lockdownEnabled", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
  }
}
