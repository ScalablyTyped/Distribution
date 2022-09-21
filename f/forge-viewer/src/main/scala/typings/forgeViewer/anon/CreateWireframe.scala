package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWireframe extends StObject {
  
  var conserveMemory: js.UndefOr[Boolean] = js.undefined
  
  var createWireframe: js.UndefOr[Boolean] = js.undefined
}
object CreateWireframe {
  
  inline def apply(): CreateWireframe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWireframe]
  }
  
  extension [Self <: CreateWireframe](x: Self) {
    
    inline def setConserveMemory(value: Boolean): Self = StObject.set(x, "conserveMemory", value.asInstanceOf[js.Any])
    
    inline def setConserveMemoryUndefined: Self = StObject.set(x, "conserveMemory", js.undefined)
    
    inline def setCreateWireframe(value: Boolean): Self = StObject.set(x, "createWireframe", value.asInstanceOf[js.Any])
    
    inline def setCreateWireframeUndefined: Self = StObject.set(x, "createWireframe", js.undefined)
  }
}
