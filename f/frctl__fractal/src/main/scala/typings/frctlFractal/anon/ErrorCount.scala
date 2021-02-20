package typings.frctlFractal.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorCount extends StObject {
  
  var errorCount: Double = js.native
}
object ErrorCount {
  
  @scala.inline
  def apply(errorCount: Double): ErrorCount = {
    val __obj = js.Dynamic.literal(errorCount = errorCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCount]
  }
  
  @scala.inline
  implicit class ErrorCountMutableBuilder[Self <: ErrorCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCount(value: Double): Self = StObject.set(x, "errorCount", value.asInstanceOf[js.Any])
  }
}
