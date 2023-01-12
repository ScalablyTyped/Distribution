package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container extends StObject {
  
  var container: Any
  
  var model: js.UndefOr[js.Object] = js.undefined
  
  var transclude: js.UndefOr[Boolean] = js.undefined
}
object Container {
  
  inline def apply(container: Any): Container = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Container] (val x: Self) extends AnyVal {
    
    inline def setContainer(value: Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setModel(value: js.Object): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setTransclude(value: Boolean): Self = StObject.set(x, "transclude", value.asInstanceOf[js.Any])
    
    inline def setTranscludeUndefined: Self = StObject.set(x, "transclude", js.undefined)
  }
}
