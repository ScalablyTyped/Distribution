package typings.gitRepoName

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[String]]
  @scala.inline
  def apply(callback: js.Function2[/* err */ Error | Null, /* repoName */ String, Unit]): Unit = ^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def apply(options: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def apply(options: String, callback: js.Function2[/* err */ Error | Null, /* repoName */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(options: Options): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def apply(options: Options, callback: js.Function2[/* err */ Error | Null, /* repoName */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("git-repo-name", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def promise(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("promise")().asInstanceOf[js.Promise[String]]
  @scala.inline
  def promise(options: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("promise")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def promise(options: Options): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("promise")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def sync(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")().asInstanceOf[String]
  @scala.inline
  def sync(options: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def sync(options: Options): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait Options extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var path: js.UndefOr[String] = js.undefined
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
