package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConserveMemory extends StObject {
  
  var conserveMemory: js.UndefOr[Boolean] = js.undefined
  
  var createWireFrame: js.UndefOr[Boolean] = js.undefined
}
object ConserveMemory {
  
  inline def apply(): ConserveMemory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConserveMemory]
  }
  
  extension [Self <: ConserveMemory](x: Self) {
    
    inline def setConserveMemory(value: Boolean): Self = StObject.set(x, "conserveMemory", value.asInstanceOf[js.Any])
    
    inline def setConserveMemoryUndefined: Self = StObject.set(x, "conserveMemory", js.undefined)
    
    inline def setCreateWireFrame(value: Boolean): Self = StObject.set(x, "createWireFrame", value.asInstanceOf[js.Any])
    
    inline def setCreateWireFrameUndefined: Self = StObject.set(x, "createWireFrame", js.undefined)
  }
}
