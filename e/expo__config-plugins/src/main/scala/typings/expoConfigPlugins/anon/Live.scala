package typings.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Live extends StObject {
  
  var live: js.UndefOr[String] = js.undefined
}
object Live {
  
  inline def apply(): Live = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Live]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Live] (val x: Self) extends AnyVal {
    
    inline def setLive(value: String): Self = StObject.set(x, "live", value.asInstanceOf[js.Any])
    
    inline def setLiveUndefined: Self = StObject.set(x, "live", js.undefined)
  }
}
