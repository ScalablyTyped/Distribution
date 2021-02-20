package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnixSystemFunctionResult extends SystemFunctionResult {
  
  var errno: Double = js.native
  
  var value: NativeReturnValue = js.native
}
object UnixSystemFunctionResult {
  
  @scala.inline
  def apply(errno: Double, value: NativeReturnValue): UnixSystemFunctionResult = {
    val __obj = js.Dynamic.literal(errno = errno.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnixSystemFunctionResult]
  }
  
  @scala.inline
  implicit class UnixSystemFunctionResultMutableBuilder[Self <: UnixSystemFunctionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrno(value: Double): Self = StObject.set(x, "errno", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: NativeReturnValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueVarargs(value: js.Any*): Self = StObject.set(x, "value", js.Array(value :_*))
  }
}
