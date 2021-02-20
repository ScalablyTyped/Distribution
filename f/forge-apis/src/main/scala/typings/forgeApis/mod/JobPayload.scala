package typings.forgeApis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobPayload extends StObject {
  
  var input: JobPayloadInput = js.native
  
  var output: JobPayloadOutput = js.native
}
object JobPayload {
  
  @scala.inline
  def apply(input: JobPayloadInput, output: JobPayloadOutput): JobPayload = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobPayload]
  }
  
  @scala.inline
  implicit class JobPayloadMutableBuilder[Self <: JobPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInput(value: JobPayloadInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: JobPayloadOutput): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
  }
}
