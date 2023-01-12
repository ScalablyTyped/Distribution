package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserViewConstructorOptions extends StObject {
  
  /**
    * See BrowserWindow.
    */
  var webPreferences: js.UndefOr[WebPreferences] = js.undefined
}
object BrowserViewConstructorOptions {
  
  inline def apply(): BrowserViewConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserViewConstructorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrowserViewConstructorOptions] (val x: Self) extends AnyVal {
    
    inline def setWebPreferences(value: WebPreferences): Self = StObject.set(x, "webPreferences", value.asInstanceOf[js.Any])
    
    inline def setWebPreferencesUndefined: Self = StObject.set(x, "webPreferences", js.undefined)
  }
}
