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
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("getos", JSImport.Namespace)
  @js.native
  def apply(cb: js.Function2[/* error */ Error | Null, /* os */ Os, Unit]): String = js.native
  
  @js.native
  trait LinuxOs extends Os {
    
    var codename: js.UndefOr[String] = js.native
    
    var dist: String = js.native
    
    var os: linux = js.native
    
    var release: String = js.native
  }
  object LinuxOs {
    
    @scala.inline
    def apply(dist: String, os: linux, release: String): LinuxOs = {
      val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinuxOs]
    }
    
    @scala.inline
    implicit class LinuxOsMutableBuilder[Self <: LinuxOs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCodename(value: String): Self = StObject.set(x, "codename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodenameUndefined: Self = StObject.set(x, "codename", js.undefined)
      
      @scala.inline
      def setDist(value: String): Self = StObject.set(x, "dist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOs(value: linux): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.getos.mod.OtherOs
    - typings.getos.mod.LinuxOs
  */
  trait Os extends StObject
  object Os {
    
    @scala.inline
    def LinuxOs(dist: String, os: linux, release: String): typings.getos.mod.LinuxOs = {
      val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.getos.mod.LinuxOs]
    }
    
    @scala.inline
    def OtherOs(os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin): typings.getos.mod.OtherOs = {
      val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.getos.mod.OtherOs]
    }
  }
  
  @js.native
  trait OtherOs extends Os {
    
    var os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin = js.native
  }
  object OtherOs {
    
    @scala.inline
    def apply(os: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin): OtherOs = {
      val __obj = js.Dynamic.literal(os = os.asInstanceOf[js.Any])
      __obj.asInstanceOf[OtherOs]
    }
    
    @scala.inline
    implicit class OtherOsMutableBuilder[Self <: OtherOs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOs(value: aix | android | darwin | freebsd | openbsd | sunos | win32 | cygwin): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
    }
  }
}
