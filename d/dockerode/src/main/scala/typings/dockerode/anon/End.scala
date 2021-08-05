package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait End extends StObject {
  
  var End: String
  
  var ExitCode: Double
  
  var Output: String
  
  var Start: String
}
object End {
  
  inline def apply(End: String, ExitCode: Double, Output: String, Start: String): End = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], ExitCode = ExitCode.asInstanceOf[js.Any], Output = Output.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any])
    __obj.asInstanceOf[End]
  }
  
  extension [Self <: End](x: Self) {
    
    inline def setEnd(value: String): Self = StObject.set(x, "End", value.asInstanceOf[js.Any])
    
    inline def setExitCode(value: Double): Self = StObject.set(x, "ExitCode", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: String): Self = StObject.set(x, "Output", value.asInstanceOf[js.Any])
    
    inline def setStart(value: String): Self = StObject.set(x, "Start", value.asInstanceOf[js.Any])
  }
}
