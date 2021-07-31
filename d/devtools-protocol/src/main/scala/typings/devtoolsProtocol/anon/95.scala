package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.IndexedDB.DeleteDatabaseRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `95` extends StObject {
  
  var paramsType: js.Array[DeleteDatabaseRequest]
  
  var returnType: Unit
}
object `95` {
  
  @scala.inline
  def apply(paramsType: js.Array[DeleteDatabaseRequest], returnType: Unit): `95` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`95`]
  }
  
  @scala.inline
  implicit class `95MutableBuilder`[Self <: `95`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[DeleteDatabaseRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: DeleteDatabaseRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
