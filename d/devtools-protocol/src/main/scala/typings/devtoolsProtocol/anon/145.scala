package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.ReloadRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `145` extends StObject {
  
  var paramsType: js.Array[js.UndefOr[ReloadRequest]] = js.native
  
  var returnType: Unit = js.native
}
object `145` {
  
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[ReloadRequest]], returnType: Unit): `145` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`145`]
  }
  
  @scala.inline
  implicit class `145MutableBuilder`[Self <: `145`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[ReloadRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: js.UndefOr[ReloadRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
