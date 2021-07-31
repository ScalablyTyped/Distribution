package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.SetGeolocationOverrideRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `157` extends StObject {
  
  var paramsType: js.Array[js.UndefOr[SetGeolocationOverrideRequest]]
  
  var returnType: Unit
}
object `157` {
  
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[SetGeolocationOverrideRequest]], returnType: Unit): `157` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`157`]
  }
  
  @scala.inline
  implicit class `157MutableBuilder`[Self <: `157`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[SetGeolocationOverrideRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[SetGeolocationOverrideRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
