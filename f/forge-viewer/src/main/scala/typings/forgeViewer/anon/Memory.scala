package typings.forgeViewer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Memory extends StObject {
  
  var memory: Textures
  
  var programs: Double
  
  var render: Calls
}
object Memory {
  
  inline def apply(memory: Textures, programs: Double, render: Calls): Memory = {
    val __obj = js.Dynamic.literal(memory = memory.asInstanceOf[js.Any], programs = programs.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any])
    __obj.asInstanceOf[Memory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Memory] (val x: Self) extends AnyVal {
    
    inline def setMemory(value: Textures): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setPrograms(value: Double): Self = StObject.set(x, "programs", value.asInstanceOf[js.Any])
    
    inline def setRender(value: Calls): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
  }
}
