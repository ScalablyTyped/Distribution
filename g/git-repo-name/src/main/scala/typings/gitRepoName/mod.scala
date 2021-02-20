package typings.gitRepoName

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("git-repo-name", JSImport.Namespace)
  @js.native
  def apply(): js.Promise[String] = js.native
  @JSImport("git-repo-name", JSImport.Namespace)
  @js.native
  def apply(callback: js.Function2[/* err */ Error | Null, /* repoName */ String, Unit]): Unit = js.native
  @JSImport("git-repo-name", JSImport.Namespace)
  @js.native
  def apply(options: String): js.Promise[String] = js.native
  @JSImport("git-repo-name", JSImport.Namespace)
  @js.native
  def apply(options: String, callback: js.Function2[/* err */ Error | Null, /* repoName */ String, Unit]): Unit = js.native
  @JSImport("git-repo-name", JSImport.Namespace)
  @js.native
  def apply(options: Options): js.Promise[String] = js.native
  @JSImport("git-repo-name", JSImport.Namespace)
  @js.native
  def apply(options: Options, callback: js.Function2[/* err */ Error | Null, /* repoName */ String, Unit]): Unit = js.native
  
  @JSImport("git-repo-name", "promise")
  @js.native
  def promise(): js.Promise[String] = js.native
  @JSImport("git-repo-name", "promise")
  @js.native
  def promise(options: String): js.Promise[String] = js.native
  @JSImport("git-repo-name", "promise")
  @js.native
  def promise(options: Options): js.Promise[String] = js.native
  
  @JSImport("git-repo-name", "sync")
  @js.native
  def sync(): String = js.native
  @JSImport("git-repo-name", "sync")
  @js.native
  def sync(options: String): String = js.native
  @JSImport("git-repo-name", "sync")
  @js.native
  def sync(options: Options): String = js.native
  
  @js.native
  trait Options extends StObject {
    
    var cwd: js.UndefOr[String] = js.native
    
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
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
}
