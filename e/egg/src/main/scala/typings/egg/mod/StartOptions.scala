package typings.egg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartOptions extends StObject {
  
  /** directory of application, default to `process.cwd()` */
  var baseDir: js.UndefOr[String] = js.native
  
  /** specify framework that can be absolute path or npm package */
  var framework: js.UndefOr[String] = js.native
  
  /** ignore single process mode warning */
  var ignoreWarning: js.UndefOr[Boolean] = js.native
}
object StartOptions {
  
  @scala.inline
  def apply(): StartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartOptions]
  }
  
  @scala.inline
  implicit class StartOptionsMutableBuilder[Self <: StartOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseDir(value: String): Self = StObject.set(x, "baseDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseDirUndefined: Self = StObject.set(x, "baseDir", js.undefined)
    
    @scala.inline
    def setFramework(value: String): Self = StObject.set(x, "framework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameworkUndefined: Self = StObject.set(x, "framework", js.undefined)
    
    @scala.inline
    def setIgnoreWarning(value: Boolean): Self = StObject.set(x, "ignoreWarning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreWarningUndefined: Self = StObject.set(x, "ignoreWarning", js.undefined)
  }
}
