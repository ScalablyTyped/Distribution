package typings.framerMotion.mod

import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutGroupContextProps extends StObject {
  
  var forceRender: js.UndefOr[VoidFunction] = js.undefined
  
  var group: js.UndefOr[NodeGroup] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
}
object LayoutGroupContextProps {
  
  inline def apply(): LayoutGroupContextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutGroupContextProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayoutGroupContextProps] (val x: Self) extends AnyVal {
    
    inline def setForceRender(value: () => Unit): Self = StObject.set(x, "forceRender", js.Any.fromFunction0(value))
    
    inline def setForceRenderUndefined: Self = StObject.set(x, "forceRender", js.undefined)
    
    inline def setGroup(value: NodeGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
