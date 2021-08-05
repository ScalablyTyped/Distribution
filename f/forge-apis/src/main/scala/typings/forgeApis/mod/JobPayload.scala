package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobPayload extends StObject {
  
  var input: JobPayloadInput
  
  var output: JobPayloadOutput
}
object JobPayload {
  
  inline def apply(input: JobPayloadInput, output: JobPayloadOutput): JobPayload = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobPayload]
  }
  
  extension [Self <: JobPayload](x: Self) {
    
    inline def setInput(value: JobPayloadInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setOutput(value: JobPayloadOutput): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
  }
}
