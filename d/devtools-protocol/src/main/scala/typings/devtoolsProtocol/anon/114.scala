package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.EnableRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `114` extends StObject {
  
  var paramsType: js.Array[js.UndefOr[EnableRequest]] = js.native
  
  var returnType: Unit = js.native
}
object `114` {
  
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[EnableRequest]], returnType: Unit): `114` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`114`]
  }
  
  @scala.inline
  implicit class `114MutableBuilder`[Self <: `114`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[EnableRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[EnableRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
