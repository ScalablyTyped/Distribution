package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Emulation.SetDefaultBackgroundColorOverrideRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `76` extends StObject {
  
  var paramsType: js.Array[js.UndefOr[SetDefaultBackgroundColorOverrideRequest]]
  
  var returnType: Unit
}
object `76` {
  
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[SetDefaultBackgroundColorOverrideRequest]], returnType: Unit): `76` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`76`]
  }
  
  @scala.inline
  implicit class `76MutableBuilder`[Self <: `76`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[SetDefaultBackgroundColorOverrideRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[SetDefaultBackgroundColorOverrideRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
