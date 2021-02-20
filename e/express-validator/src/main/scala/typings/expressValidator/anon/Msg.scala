package typings.expressValidator.anon

import typings.expressValidator.baseMod.ValidationError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Msg extends ValidationError {
  
  var location: typings.expressValidator.baseMod.Location = js.native
  
  var msg: js.Any = js.native
  
  var nestedErrors: js.UndefOr[js.Array[_]] = js.native
  
  var param: String = js.native
  
  var value: js.Any = js.native
}
object Msg {
  
  @scala.inline
  def apply(location: typings.expressValidator.baseMod.Location, msg: js.Any, param: String, value: js.Any): Msg = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], param = param.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Msg]
  }
  
  @scala.inline
  implicit class MsgMutableBuilder[Self <: Msg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocation(value: typings.expressValidator.baseMod.Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsg(value: js.Any): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedErrors(value: js.Array[_]): Self = StObject.set(x, "nestedErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNestedErrorsUndefined: Self = StObject.set(x, "nestedErrors", js.undefined)
    
    @scala.inline
    def setNestedErrorsVarargs(value: js.Any*): Self = StObject.set(x, "nestedErrors", js.Array(value :_*))
    
    @scala.inline
    def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
