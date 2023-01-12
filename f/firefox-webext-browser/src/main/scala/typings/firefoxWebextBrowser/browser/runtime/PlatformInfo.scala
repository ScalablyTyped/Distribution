package typings.firefoxWebextBrowser.browser.runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object containing information about the current platform. */
trait PlatformInfo extends StObject {
  
  /** The machine's processor architecture. */
  var arch: PlatformArch
  
  /**
    * The native client architecture. This may be different from arch on some platforms.
    * @deprecated Unsupported on Firefox at this time.
    */
  var nacl_arch: js.UndefOr[PlatformNaclArch] = js.undefined
  
  /** The operating system the browser is running on. */
  var os: PlatformOs
}
object PlatformInfo {
  
  inline def apply(arch: PlatformArch, os: PlatformOs): PlatformInfo = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlatformInfo] (val x: Self) extends AnyVal {
    
    inline def setArch(value: PlatformArch): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
    
    inline def setNacl_arch(value: PlatformNaclArch): Self = StObject.set(x, "nacl_arch", value.asInstanceOf[js.Any])
    
    inline def setNacl_archUndefined: Self = StObject.set(x, "nacl_arch", js.undefined)
    
    inline def setOs(value: PlatformOs): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
  }
}
