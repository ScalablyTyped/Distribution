package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.NavigateToHistoryEntryRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `144` extends StObject {
  
  var paramsType: js.Array[NavigateToHistoryEntryRequest] = js.native
  
  var returnType: Unit = js.native
}
object `144` {
  
  @scala.inline
  def apply(paramsType: js.Array[NavigateToHistoryEntryRequest], returnType: Unit): `144` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`144`]
  }
  
  @scala.inline
  implicit class `144MutableBuilder`[Self <: `144`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[NavigateToHistoryEntryRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: NavigateToHistoryEntryRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
