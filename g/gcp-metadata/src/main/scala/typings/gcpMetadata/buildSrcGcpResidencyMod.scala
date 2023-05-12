package typings.gcpMetadata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcGcpResidencyMod {
  
  @JSImport("gcp-metadata/build/src/gcp-residency", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object GCE_LINUX_BIOS_PATHS {
    
    @JSImport("gcp-metadata/build/src/gcp-residency", "GCE_LINUX_BIOS_PATHS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("gcp-metadata/build/src/gcp-residency", "GCE_LINUX_BIOS_PATHS.BIOS_DATE")
    @js.native
    def BIOS_DATE: String = js.native
    inline def BIOS_DATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BIOS_DATE")(x.asInstanceOf[js.Any])
    
    @JSImport("gcp-metadata/build/src/gcp-residency", "GCE_LINUX_BIOS_PATHS.BIOS_VENDOR")
    @js.native
    def BIOS_VENDOR: String = js.native
    inline def BIOS_VENDOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BIOS_VENDOR")(x.asInstanceOf[js.Any])
  }
  
  inline def detectGCPResidency(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("detectGCPResidency")().asInstanceOf[Boolean]
  
  inline def isGoogleCloudServerless(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGoogleCloudServerless")().asInstanceOf[Boolean]
  
  inline def isGoogleComputeEngine(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGoogleComputeEngine")().asInstanceOf[Boolean]
  
  inline def isGoogleComputeEngineLinux(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGoogleComputeEngineLinux")().asInstanceOf[Boolean]
  
  inline def isGoogleComputeEngineMACAddress(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGoogleComputeEngineMACAddress")().asInstanceOf[Boolean]
}
