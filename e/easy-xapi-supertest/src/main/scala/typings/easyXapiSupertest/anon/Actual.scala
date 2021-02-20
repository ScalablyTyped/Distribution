package typings.easyXapiSupertest.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Actual extends StObject {
  
  var actual: js.UndefOr[js.Any] = js.native
  
  var expected: js.UndefOr[js.Any] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var operator: js.UndefOr[String] = js.native
  
  var stackStartFunction: js.UndefOr[js.Function] = js.native
}
object Actual {
  
  @scala.inline
  def apply(): Actual = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Actual]
  }
  
  @scala.inline
  implicit class ActualMutableBuilder[Self <: Actual] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActual(value: js.Any): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualUndefined: Self = StObject.set(x, "actual", js.undefined)
    
    @scala.inline
    def setExpected(value: js.Any): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedUndefined: Self = StObject.set(x, "expected", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setStackStartFunction(value: js.Function): Self = StObject.set(x, "stackStartFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackStartFunctionUndefined: Self = StObject.set(x, "stackStartFunction", js.undefined)
  }
}
