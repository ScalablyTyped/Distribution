package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Overlay.HighlightNodeRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `126` extends StObject {
  
  var paramsType: js.Array[HighlightNodeRequest] = js.native
  
  var returnType: Unit = js.native
}
object `126` {
  
  @scala.inline
  def apply(paramsType: js.Array[HighlightNodeRequest], returnType: Unit): `126` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`126`]
  }
  
  @scala.inline
  implicit class `126MutableBuilder`[Self <: `126`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[HighlightNodeRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: HighlightNodeRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
