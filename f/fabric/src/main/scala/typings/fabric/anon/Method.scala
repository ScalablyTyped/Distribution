package typings.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Method extends StObject {
  
  /** @default "GET" */
  var method: js.UndefOr[String] = js.native
  
  /** Callback to invoke when request is completed */
  var onComplete: js.Function = js.native
}
object Method {
  
  @scala.inline
  def apply(onComplete: js.Function): Method = {
    val __obj = js.Dynamic.literal(onComplete = onComplete.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method]
  }
  
  @scala.inline
  implicit class MethodMutableBuilder[Self <: Method] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setOnComplete(value: js.Function): Self = StObject.set(x, "onComplete", value.asInstanceOf[js.Any])
  }
}
