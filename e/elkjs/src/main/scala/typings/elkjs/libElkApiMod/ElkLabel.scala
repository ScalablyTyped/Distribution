package typings.elkjs.libElkApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElkLabel
  extends StObject
     with ElkShape {
  
  var text: js.UndefOr[String] = js.undefined
}
object ElkLabel {
  
  inline def apply(): ElkLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElkLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElkLabel] (val x: Self) extends AnyVal {
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
