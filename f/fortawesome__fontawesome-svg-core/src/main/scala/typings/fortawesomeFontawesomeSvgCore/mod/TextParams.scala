package typings.fortawesomeFontawesomeSvgCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextParams
  extends StObject
     with Params {
  
  var transform: js.UndefOr[Transform] = js.undefined
}
object TextParams {
  
  inline def apply(): TextParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextParams] (val x: Self) extends AnyVal {
    
    inline def setTransform(value: Transform): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
