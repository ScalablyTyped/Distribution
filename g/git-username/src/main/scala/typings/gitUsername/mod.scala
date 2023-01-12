package typings.gitUsername

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): String | Null = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String | Null]
  inline def apply(cwd: String): String | Null = ^.asInstanceOf[js.Dynamic].apply(cwd.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def apply(cwd: String, options: OptionsWithoutCwd): String | Null = (^.asInstanceOf[js.Dynamic].apply(cwd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(cwd: Unit, options: OptionsWithoutCwd): String | Null = (^.asInstanceOf[js.Dynamic].apply(cwd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def apply(options: Options): String | Null = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  
  @JSImport("git-username", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  /* Inlined std.Omit<git-username.git-username.Options, 'cwd'> */
  trait OptionsWithoutCwd extends StObject {
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object OptionsWithoutCwd {
    
    inline def apply(): OptionsWithoutCwd = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsWithoutCwd]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsWithoutCwd] (val x: Self) extends AnyVal {
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
