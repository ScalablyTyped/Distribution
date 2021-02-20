package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Overlay.HighlightQuadRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `127` extends StObject {
  
  var paramsType: js.Array[HighlightQuadRequest] = js.native
  
  var returnType: Unit = js.native
}
object `127` {
  
  @scala.inline
  def apply(paramsType: js.Array[HighlightQuadRequest], returnType: Unit): `127` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`127`]
  }
  
  @scala.inline
  implicit class `127MutableBuilder`[Self <: `127`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[HighlightQuadRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: HighlightQuadRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
