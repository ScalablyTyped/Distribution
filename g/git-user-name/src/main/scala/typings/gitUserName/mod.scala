package typings.gitUserName

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("git-user-name", JSImport.Namespace)
  @js.native
  def apply(): String | Null = js.native
  @JSImport("git-user-name", JSImport.Namespace)
  @js.native
  def apply(options: Options): String | Null = js.native
  
  @js.native
  trait Options extends StObject {
    
    var cwd: js.UndefOr[String] = js.native
    
    var gitconfig: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      @scala.inline
      def setGitconfig(value: String): Self = StObject.set(x, "gitconfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGitconfigUndefined: Self = StObject.set(x, "gitconfig", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
}
