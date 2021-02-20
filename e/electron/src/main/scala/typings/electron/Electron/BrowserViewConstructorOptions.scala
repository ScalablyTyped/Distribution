package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserViewConstructorOptions extends StObject {
  
  /**
    * See BrowserWindow.
    */
  var webPreferences: js.UndefOr[WebPreferences] = js.native
}
object BrowserViewConstructorOptions {
  
  @scala.inline
  def apply(): BrowserViewConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserViewConstructorOptions]
  }
  
  @scala.inline
  implicit class BrowserViewConstructorOptionsMutableBuilder[Self <: BrowserViewConstructorOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWebPreferences(value: WebPreferences): Self = StObject.set(x, "webPreferences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPreferencesUndefined: Self = StObject.set(x, "webPreferences", js.undefined)
  }
}
