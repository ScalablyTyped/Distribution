package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Architecture extends StObject {
  
  var architecture: js.UndefOr[String] = js.undefined
  
  var logicalCpus: js.UndefOr[js.Array[CStates]] = js.undefined
  
  var maxClockSpeedKhz: js.UndefOr[Double] = js.undefined
  
  var model: js.UndefOr[String] = js.undefined
}
object Architecture {
  
  inline def apply(): Architecture = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Architecture]
  }
  
  extension [Self <: Architecture](x: Self) {
    
    inline def setArchitecture(value: String): Self = StObject.set(x, "architecture", value.asInstanceOf[js.Any])
    
    inline def setArchitectureUndefined: Self = StObject.set(x, "architecture", js.undefined)
    
    inline def setLogicalCpus(value: js.Array[CStates]): Self = StObject.set(x, "logicalCpus", value.asInstanceOf[js.Any])
    
    inline def setLogicalCpusUndefined: Self = StObject.set(x, "logicalCpus", js.undefined)
    
    inline def setLogicalCpusVarargs(value: CStates*): Self = StObject.set(x, "logicalCpus", js.Array(value*))
    
    inline def setMaxClockSpeedKhz(value: Double): Self = StObject.set(x, "maxClockSpeedKhz", value.asInstanceOf[js.Any])
    
    inline def setMaxClockSpeedKhzUndefined: Self = StObject.set(x, "maxClockSpeedKhz", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
