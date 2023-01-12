package typings.fullcalendarCore.vdomMod.global.FullCalendarVDom.createElement.JSX

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAttributes extends StObject {
  
  var d: String
}
object PathAttributes {
  
  inline def apply(d: String): PathAttributes = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathAttributes] (val x: Self) extends AnyVal {
    
    inline def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
  }
}
