package typings.dndCore.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeginDragOptions extends StObject {
  
  var clientOffset: js.UndefOr[XYCoord] = js.undefined
  
  var getSourceClientOffset: js.UndefOr[js.Function1[/* sourceId */ Identifier, XYCoord]] = js.undefined
  
  var publishSource: js.UndefOr[Boolean] = js.undefined
}
object BeginDragOptions {
  
  @scala.inline
  def apply(): BeginDragOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BeginDragOptions]
  }
  
  @scala.inline
  implicit class BeginDragOptionsMutableBuilder[Self <: BeginDragOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientOffset(value: XYCoord): Self = StObject.set(x, "clientOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientOffsetUndefined: Self = StObject.set(x, "clientOffset", js.undefined)
    
    @scala.inline
    def setGetSourceClientOffset(value: /* sourceId */ Identifier => XYCoord): Self = StObject.set(x, "getSourceClientOffset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSourceClientOffsetUndefined: Self = StObject.set(x, "getSourceClientOffset", js.undefined)
    
    @scala.inline
    def setPublishSource(value: Boolean): Self = StObject.set(x, "publishSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishSourceUndefined: Self = StObject.set(x, "publishSource", js.undefined)
  }
}
