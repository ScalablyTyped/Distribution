package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CacheStorage.DeleteEntryRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `44` extends StObject {
  
  var paramsType: js.Array[DeleteEntryRequest] = js.native
  
  var returnType: Unit = js.native
}
object `44` {
  
  @scala.inline
  def apply(paramsType: js.Array[DeleteEntryRequest], returnType: Unit): `44` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`44`]
  }
  
  @scala.inline
  implicit class `44MutableBuilder`[Self <: `44`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[DeleteEntryRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: DeleteEntryRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
