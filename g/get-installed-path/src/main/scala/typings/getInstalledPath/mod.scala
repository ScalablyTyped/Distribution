package typings.getInstalledPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("get-installed-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getInstalledPath(name: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstalledPath")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  @scala.inline
  def getInstalledPath(name: String, opts: Options): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstalledPath")(name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  @scala.inline
  def getInstalledPathSync(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstalledPathSync")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def getInstalledPathSync(name: String, opts: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstalledPathSync")(name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Options extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var local: js.UndefOr[Boolean] = js.undefined
    
    var paths: js.UndefOr[js.Array[String]] = js.undefined
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
      def setLocal(value: Boolean): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
      
      @scala.inline
      def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      @scala.inline
      def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value :_*))
    }
  }
}
