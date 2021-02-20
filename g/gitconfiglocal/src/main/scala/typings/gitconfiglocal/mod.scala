package typings.gitconfiglocal

import org.scalablytyped.runtime.StringDictionary
import typings.gitconfiglocal.gitconfiglocalBooleans.`false`
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gitconfiglocal", JSImport.Namespace)
  @js.native
  def apply(dir: String, cb: callback): Unit = js.native
  @JSImport("gitconfiglocal", JSImport.Namespace)
  @js.native
  def apply(dir: String, options: Options, cb: callback): Unit = js.native
  
  type GitConfig = StringDictionary[js.Any]
  
  @js.native
  trait Options extends StObject {
    
    var gitDir: js.UndefOr[String] = js.native
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
      def setGitDir(value: String): Self = StObject.set(x, "gitDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGitDirUndefined: Self = StObject.set(x, "gitDir", js.undefined)
    }
  }
  
  type callback = js.Function2[/* error */ Error | `false`, /* config */ GitConfig, Unit]
}
