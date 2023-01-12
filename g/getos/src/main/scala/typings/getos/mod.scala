package typings.getos

import typings.getos.getosStrings.aix
import typings.getos.getosStrings.android
import typings.getos.getosStrings.cygwin
import typings.getos.getosStrings.darwin
import typings.getos.getosStrings.freebsd
import typings.getos.getosStrings.linux
import typings.getos.getosStrings.openbsd
import typings.getos.getosStrings.sunos
import typings.getos.getosStrings.win32
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(cb: js.Function2[/* error */ js.Error | Null, /* os */ Os, Unit]): String = ^.asInstanceOf[js.Dynamic].apply(cb.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("getos", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait LinuxOs
    extends StObject
       with Os {
    
    var codename: js.UndefOr[String] = js.undefined
    
    var dist: String
    
    var os: linux
    
    var release: String
  }
  object LinuxOs {
    
    inline def apply(dist: String, release: String): LinuxOs = {
      val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], os = "linux", release = release.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinuxOs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinuxOs] (val x: Self) extends AnyVal {
      
      inline def setCodename(value: String): Self = StObject.set(x, "codename", value.asInstanceOf[js.Any])
      
      inline def setCodenameUndefined: Self = StObject.set(x, "codename", js.undefined)
      
      inline def setDist(value: String): Self = StObject.set(x, "dist", value.asInstanceOf[js.Any])
      
      inline def setOs(value: linux): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      inline def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.getos.mod.OtherOs
    - typings.getos.mod.LinuxOs
  */
  trait Os extends StObject
  object Os {
    
    inline def LinuxOs(dist: String, release: String): typings.getos.mod.LinuxOs = {
      val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], os = "linux", release = release.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.getos.mod.LinuxOs]
    }
    
    inline def OtherOs(os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin): typings.getos.mod.OtherOs = {
      val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.getos.mod.OtherOs]
    }
  }
  
  trait OtherOs
    extends StObject
       with Os {
    
    var os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin
  }
  object OtherOs {
    
    inline def apply(os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin): OtherOs = {
      val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
      __obj.asInstanceOf[OtherOs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OtherOs] (val x: Self) extends AnyVal {
      
      inline def setOs(value: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    }
  }
}
