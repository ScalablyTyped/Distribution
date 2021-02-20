package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SizeBytes extends StObject {
  
  var Mode: Double = js.native
  
  var SizeBytes: Double = js.native
}
object SizeBytes {
  
  @scala.inline
  def apply(Mode: Double, SizeBytes: Double): SizeBytes = {
    val __obj = js.Dynamic.literal(Mode = Mode.asInstanceOf[js.Any], SizeBytes = SizeBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeBytes]
  }
  
  @scala.inline
  implicit class SizeBytesMutableBuilder[Self <: SizeBytes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: Double): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeBytes(value: Double): Self = StObject.set(x, "SizeBytes", value.asInstanceOf[js.Any])
  }
}
