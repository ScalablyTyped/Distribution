package typings.gitUsername

import typings.gitUsername.gitUsernameBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): String | Null = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String | Null]
  @scala.inline
  def apply(options: String): String | Null = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  @scala.inline
  def apply(options: BaseOptions): String | Null = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  @scala.inline
  def apply(options: StrictOptions): String = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("git-username", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait BaseOptions extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
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
  
  trait StrictOptions
    extends StObject
       with BaseOptions {
    
    @JSName("strict")
    var strict_StrictOptions: `true`
  }
  object StrictOptions {
    
    @scala.inline
    def apply(): StrictOptions = {
      val __obj = js.Dynamic.literal(strict = true)
      __obj.asInstanceOf[StrictOptions]
    }
    
    @scala.inline
    implicit class StrictOptionsMutableBuilder[Self <: StrictOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStrict(value: `true`): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    }
  }
}
