package typings.expoConfigTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SilentLaunch extends StObject {
  
  /**
    * If true, the app will launch in a development client with no additional dialogs or progress indicators, just like in a standalone app.
    */
  var silentLaunch: js.UndefOr[Boolean] = js.undefined
}
object SilentLaunch {
  
  inline def apply(): SilentLaunch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SilentLaunch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SilentLaunch] (val x: Self) extends AnyVal {
    
    inline def setSilentLaunch(value: Boolean): Self = StObject.set(x, "silentLaunch", value.asInstanceOf[js.Any])
    
    inline def setSilentLaunchUndefined: Self = StObject.set(x, "silentLaunch", js.undefined)
  }
}
