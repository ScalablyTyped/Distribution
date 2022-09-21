package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNodeTemplateNodeTypeFlexibility extends StObject {
  
  var cpus: js.UndefOr[String | Null] = js.undefined
  
  var localSsd: js.UndefOr[String | Null] = js.undefined
  
  var memory: js.UndefOr[String | Null] = js.undefined
}
object SchemaNodeTemplateNodeTypeFlexibility {
  
  inline def apply(): SchemaNodeTemplateNodeTypeFlexibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeTemplateNodeTypeFlexibility]
  }
  
  extension [Self <: SchemaNodeTemplateNodeTypeFlexibility](x: Self) {
    
    inline def setCpus(value: String): Self = StObject.set(x, "cpus", value.asInstanceOf[js.Any])
    
    inline def setCpusNull: Self = StObject.set(x, "cpus", null)
    
    inline def setCpusUndefined: Self = StObject.set(x, "cpus", js.undefined)
    
    inline def setLocalSsd(value: String): Self = StObject.set(x, "localSsd", value.asInstanceOf[js.Any])
    
    inline def setLocalSsdNull: Self = StObject.set(x, "localSsd", null)
    
    inline def setLocalSsdUndefined: Self = StObject.set(x, "localSsd", js.undefined)
    
    inline def setMemory(value: String): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryNull: Self = StObject.set(x, "memory", null)
    
    inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
  }
}
