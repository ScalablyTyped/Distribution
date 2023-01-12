package typings.dndCore.distInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeginDragOptions extends StObject {
  
  var clientOffset: js.UndefOr[XYCoord] = js.undefined
  
  var getSourceClientOffset: js.UndefOr[js.Function1[/* sourceId */ js.UndefOr[Identifier], XYCoord]] = js.undefined
  
  var publishSource: js.UndefOr[Boolean] = js.undefined
}
object BeginDragOptions {
  
  inline def apply(): BeginDragOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeginDragOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BeginDragOptions] (val x: Self) extends AnyVal {
    
    inline def setClientOffset(value: XYCoord): Self = StObject.set(x, "clientOffset", value.asInstanceOf[js.Any])
    
    inline def setClientOffsetUndefined: Self = StObject.set(x, "clientOffset", js.undefined)
    
    inline def setGetSourceClientOffset(value: /* sourceId */ js.UndefOr[Identifier] => XYCoord): Self = StObject.set(x, "getSourceClientOffset", js.Any.fromFunction1(value))
    
    inline def setGetSourceClientOffsetUndefined: Self = StObject.set(x, "getSourceClientOffset", js.undefined)
    
    inline def setPublishSource(value: Boolean): Self = StObject.set(x, "publishSource", value.asInstanceOf[js.Any])
    
    inline def setPublishSourceUndefined: Self = StObject.set(x, "publishSource", js.undefined)
  }
}
