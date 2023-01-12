package typings.djangoBananas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TranslateProps extends StObject {
  
  var children: String
  
  var params: Any
}
object TranslateProps {
  
  inline def apply(children: String, params: Any): TranslateProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranslateProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TranslateProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setParams(value: Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
