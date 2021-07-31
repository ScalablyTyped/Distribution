package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Tracing.StartRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `201` extends StObject {
  
  var paramsType: js.Array[js.UndefOr[StartRequest]]
  
  var returnType: Unit
}
object `201` {
  
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[StartRequest]], returnType: Unit): `201` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`201`]
  }
  
  @scala.inline
  implicit class `201MutableBuilder`[Self <: `201`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[StartRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[StartRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
