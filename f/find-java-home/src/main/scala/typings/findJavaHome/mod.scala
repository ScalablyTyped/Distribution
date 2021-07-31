package typings.findJavaHome

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(cb: Callback): Unit = ^.asInstanceOf[js.Dynamic].apply(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def apply(options: IOptions, cb: Callback): Unit = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("find-java-home", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback = js.Function2[/* err */ Error, /* res */ js.Any, Unit]
  
  trait IOptions extends StObject {
    
    var allowJre: Boolean
    
    var registry: js.UndefOr[RegArch] = js.undefined
  }
  object IOptions {
    
    @scala.inline
    def apply(allowJre: Boolean): IOptions = {
      val __obj = js.Dynamic.literal(allowJre = allowJre.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowJre(value: Boolean): Self = StObject.set(x, "allowJre", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistry(value: RegArch): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.findJavaHome.findJavaHomeStrings.x86
    - typings.findJavaHome.findJavaHomeStrings.x64
  */
  trait RegArch extends StObject
  object RegArch {
    
    @scala.inline
    def x64: typings.findJavaHome.findJavaHomeStrings.x64 = "x64".asInstanceOf[typings.findJavaHome.findJavaHomeStrings.x64]
    
    @scala.inline
    def x86: typings.findJavaHome.findJavaHomeStrings.x86 = "x86".asInstanceOf[typings.findJavaHome.findJavaHomeStrings.x86]
  }
}
