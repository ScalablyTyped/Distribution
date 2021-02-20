package typings.gitUsername

import typings.gitUsername.gitUsernameBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("git-username", JSImport.Namespace)
  @js.native
  def apply(): String | Null = js.native
  @JSImport("git-username", JSImport.Namespace)
  @js.native
  def apply(options: String): String | Null = js.native
  @JSImport("git-username", JSImport.Namespace)
  @js.native
  def apply(options: BaseOptions): String | Null = js.native
  @JSImport("git-username", JSImport.Namespace)
  @js.native
  def apply(options: StrictOptions): String = js.native
  
  @js.native
  trait BaseOptions extends StObject {
    
    var cwd: js.UndefOr[String] = js.native
    
    var strict: js.UndefOr[Boolean] = js.native
  }
  object BaseOptions {
    
    @scala.inline
    def apply(): BaseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOptions]
    }
    
    @scala.inline
    implicit class BaseOptionsMutableBuilder[Self <: BaseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  @js.native
  trait StrictOptions extends BaseOptions {
    
    @JSName("strict")
    var strict_StrictOptions: `true` = js.native
  }
  object StrictOptions {
    
    @scala.inline
    def apply(strict: `true`): StrictOptions = {
      val __obj = js.Dynamic.literal(strict = strict.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrictOptions]
    }
    
    @scala.inline
    implicit class StrictOptionsMutableBuilder[Self <: StrictOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStrict(value: `true`): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    }
  }
}
