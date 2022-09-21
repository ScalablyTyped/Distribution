package typings.gitconfiglocal

import org.scalablytyped.runtime.StringDictionary
import typings.gitconfiglocal.gitconfiglocalBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(dir: String, cb: callback): Unit = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(dir: String, options: Options, cb: callback): Unit = (^.asInstanceOf[js.Dynamic].apply(dir.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("gitconfiglocal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type GitConfig = StringDictionary[Any]
  
  trait Options extends StObject {
    
    var gitDir: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setGitDir(value: String): Self = StObject.set(x, "gitDir", value.asInstanceOf[js.Any])
      
      inline def setGitDirUndefined: Self = StObject.set(x, "gitDir", js.undefined)
    }
  }
  
  type callback = js.Function2[/* error */ js.Error | `false`, /* config */ GitConfig, Unit]
}
