package typings.googleapis.cloudassetV1Mod.cloudassetV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOsInfo extends StObject {
  
  /**
    * The system architecture of the operating system.
    */
  var architecture: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The VM hostname.
    */
  var hostname: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The kernel release of the operating system.
    */
  var kernelRelease: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The kernel version of the operating system.
    */
  var kernelVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The operating system long name. For example 'Debian GNU/Linux 9' or 'Microsoft Window Server 2019 Datacenter'.
    */
  var longName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The current version of the OS Config agent running on the VM.
    */
  var osconfigAgentVersion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The operating system short name. For example, 'windows' or 'debian'.
    */
  var shortName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The version of the operating system.
    */
  var version: js.UndefOr[String | Null] = js.undefined
}
object SchemaOsInfo {
  
  inline def apply(): SchemaOsInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOsInfo]
  }
  
  extension [Self <: SchemaOsInfo](x: Self) {
    
    inline def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureNull: Self = StObject.set(x, "architecture", null)
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameNull: Self = StObject.set(x, "hostname", null)
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setKernelRelease(value: String): Self = StObject.set(x, "kernelRelease", value.asInstanceOf[js.Any])
    
    inline def setKernelReleaseNull: Self = StObject.set(x, "kernelRelease", null)
    
    inline def setKernelReleaseUndefined: Self = StObject.set(x, "kernelRelease", js.undefined)
    
    inline def setKernelVersion(value: String): Self = StObject.set(x, "kernelVersion", value.asInstanceOf[js.Any])
    
    inline def setKernelVersionNull: Self = StObject.set(x, "kernelVersion", null)
    
    inline def setKernelVersionUndefined: Self = StObject.set(x, "kernelVersion", js.undefined)
    
    inline def setLongName(value: String): Self = StObject.set(x, "longName", value.asInstanceOf[js.Any])
    
    inline def setLongNameNull: Self = StObject.set(x, "longName", null)
    
    inline def setLongNameUndefined: Self = StObject.set(x, "longName", js.undefined)
    
    inline def setOsconfigAgentVersion(value: String): Self = StObject.set(x, "osconfigAgentVersion", value.asInstanceOf[js.Any])
    
    inline def setOsconfigAgentVersionNull: Self = StObject.set(x, "osconfigAgentVersion", null)
    
    inline def setOsconfigAgentVersionUndefined: Self = StObject.set(x, "osconfigAgentVersion", js.undefined)
    
    inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
    
    inline def setShortNameNull: Self = StObject.set(x, "shortName", null)
    
    inline def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionNull: Self = StObject.set(x, "version", null)
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
